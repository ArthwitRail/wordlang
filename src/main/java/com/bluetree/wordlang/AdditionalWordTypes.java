package com.bluetree.wordlang;

import com.bluetree.wordlang.lang.WordTokenType;
import com.bluetree.wordlang.psi.WordTypes;
import com.intellij.psi.tree.IElementType;

public interface AdditionalWordTypes extends WordTypes {

    IElementType COMMENT = new WordTokenType("COMMENT");
    IElementType COMMENT_CONTENT = new WordTokenType("COMMENT_CONTENT");
    IElementType END_COMMENT = new WordTokenType("END_COMMENT");
    IElementType START_COMMENT = new WordTokenType("START_COMMENT");

}

