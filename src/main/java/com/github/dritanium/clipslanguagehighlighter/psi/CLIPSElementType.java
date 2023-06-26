package com.github.dritanium.clipslanguagehighlighter.psi;

import com.github.dritanium.clipslanguagehighlighter.CLIPSLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CLIPSElementType extends IElementType {
    public CLIPSElementType(@NotNull @NonNls String debugName) {
        super(debugName, CLIPSLanguage.INSTANCE);
    }
}
