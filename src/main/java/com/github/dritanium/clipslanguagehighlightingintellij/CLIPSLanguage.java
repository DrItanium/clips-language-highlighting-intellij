package com.github.dritanium.clipslanguagehighlightingintellij;

import com.intellij.lang.Language;
public class CLIPSLanguage extends Language {
    public static final CLIPSLanguage INSTANCE = new CLIPSLanguage();

    private CLIPSLanguage() {
        super("CLIPS");
    }
}
