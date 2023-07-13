package com.bluetree.wordlang.lang;

import com.bluetree.wordlang.WordLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class WordElementType extends IElementType {

    public WordElementType(@NotNull @NonNls String debugName) {
        super(debugName, WordLanguage.INSTANCE);
    }
}
