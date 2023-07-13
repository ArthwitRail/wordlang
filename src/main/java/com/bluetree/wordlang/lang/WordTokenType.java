package com.bluetree.wordlang.lang;

import com.bluetree.wordlang.WordLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class WordTokenType extends IElementType {

    public WordTokenType(@NotNull @NonNls String debugName) {
        super(debugName, WordLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "WordTokenType."+ super.toString();
    }
}
