package com.github.dritanium.clipslanguagehighlighter.psi;

import com.github.dritanium.clipslanguagehighlighter.CLIPSLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CLIPSTokenType extends IElementType {
   public CLIPSTokenType(@NotNull @NonNls String debugName) {
       super(debugName, CLIPSLanguage.INSTANCE);
   }

   @Override
    public String toString() {
       return "CLIPSTokenType." + super.toString();
   }
}
