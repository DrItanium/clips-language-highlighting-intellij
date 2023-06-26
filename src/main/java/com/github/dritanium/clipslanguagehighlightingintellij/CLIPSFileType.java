package com.github.dritanium.clipslanguagehighlightingintellij;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CLIPSFileType extends LanguageFileType {
    public static final CLIPSFileType INSTANCE = new CLIPSFileType();
    private CLIPSFileType() {
        super(CLIPSLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "CLIPS File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "CLIPS Language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "clp";
    }

    @Override
    public Icon getIcon() {
        return CLIPSIcons.FILE;
    }
}
