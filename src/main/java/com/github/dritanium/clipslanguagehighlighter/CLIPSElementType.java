package com.github.dritanium.clipslanguagehighlighter;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CLIPSElementType extends IElementType {
    public CLIPSElementType(@NotNull @NonNls String debugName) {
        super(debugName, CLIPSLanguage.INSTANCE);
    }
}
