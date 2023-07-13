package com.bluetree.wordlang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class WordFile extends PsiFileBase {

    public WordFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WordLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WordFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Word";
    }

}