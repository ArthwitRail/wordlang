package com.bluetree.wordlang;

import com.intellij.lang.Language;

public class WordLanguage extends Language {

    public static final WordLanguage INSTANCE = new WordLanguage();

    private WordLanguage() {
        super("Word");
    }

}