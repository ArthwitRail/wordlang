package com.bluetree.wordlang.parser;

import com.bluetree.wordlang.parser.WordLexer;
import com.intellij.lexer.FlexAdapter;

public class WordLexerAdapter  extends FlexAdapter {

    public WordLexerAdapter() {
        super(new WordLexer(null));
    }

}