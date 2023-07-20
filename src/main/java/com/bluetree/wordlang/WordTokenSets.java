package com.bluetree.wordlang;

import com.bluetree.wordlang.AdditionalWordTypes;
import com.bluetree.wordlang.psi.WordTypes;
import com.intellij.psi.tree.TokenSet;

public interface WordTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(WordTypes.WORD);

    TokenSet COMMENTS = TokenSet.create( AdditionalWordTypes.START_COMMENT, AdditionalWordTypes.COMMENT, AdditionalWordTypes.COMMENT_CONTENT, AdditionalWordTypes.END_COMMENT );

}