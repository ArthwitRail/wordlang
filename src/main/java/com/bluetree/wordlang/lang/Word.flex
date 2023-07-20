// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.bluetree.wordlang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.bluetree.wordlang.AdditionalWordTypes;
import com.bluetree.wordlang.psi.WordTypes;
import com.intellij.psi.TokenType;

%%

%class WordLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
WORD_CHARACTER=[A-Za-z]
START_COMMENT="/*"
END_COMMENT="*/"
EOL_COMMENT="//".*

%state IN_COMMENT

%{

    private int commentLevel = 0;

    private void startComment() {
        commentLevel = 1;
        yybegin(IN_COMMENT);
    }

%}

%%

<YYINITIAL> {
    {WORD_CHARACTER}+           { return WordTypes.WORD; }

    {START_COMMENT}             { startComment(); return AdditionalWordTypes.START_COMMENT; }

    ({CRLF}|{WHITE_SPACE})+     {
                                  System.out.println("Swapping back to initial");
                                  yybegin(YYINITIAL);
                                  return TokenType.WHITE_SPACE;
                                }

    [^]                         { return TokenType.BAD_CHARACTER; }
}

<IN_COMMENT> {

    {START_COMMENT}
      {
        commentLevel++;
        System.out.println("Increment comment Level "+commentLevel);
        return AdditionalWordTypes.COMMENT_CONTENT;
      }
    {END_COMMENT}
      {
        commentLevel--;
        System.out.println("Decrementing comment Level to "+commentLevel);
        if (commentLevel == 0) {
            System.out.println("Swapping back to initial end of nested comment");
            yybegin(YYINITIAL);
            return AdditionalWordTypes.END_COMMENT;
        }
        return AdditionalWordTypes.COMMENT_CONTENT;
      }
    [^*/]+       { return AdditionalWordTypes.COMMENT_CONTENT; }
    [^]         { return AdditionalWordTypes.COMMENT_CONTENT; }
}

