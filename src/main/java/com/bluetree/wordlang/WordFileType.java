package com.bluetree.wordlang;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.Charset;

public class WordFileType extends LanguageFileType {

    public static final WordFileType INSTANCE = new WordFileType();

    private WordFileType() {
        super(WordLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Word File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Word language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "word";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return WordIcons.FILE;
    }

}
