package com.bluetree.wordlang;

import com.bluetree.wordlang.psi.WordTypes;
import com.intellij.psi.tree.TokenSet;

public interface WordTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(WordTypes.WORD);

    TokenSet COMMENTS = TokenSet.create( WordTypes.COMMENT, WordTypes.COMMENT_CONTENT, WordTypes.END_COMMENT );

}