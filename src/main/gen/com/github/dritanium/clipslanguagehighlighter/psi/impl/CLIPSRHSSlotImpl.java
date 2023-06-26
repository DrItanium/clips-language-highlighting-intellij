// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.dritanium.clipslanguagehighlighter.psi.CLIPSTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.dritanium.clipslanguagehighlighter.psi.*;

public class CLIPSRHSSlotImpl extends ASTWrapperPsiElement implements CLIPSRHSSlot {

  public CLIPSRHSSlotImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitRHSSlot(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CLIPSMultifieldRHSSlot getMultifieldRHSSlot() {
    return findChildByClass(CLIPSMultifieldRHSSlot.class);
  }

  @Override
  @Nullable
  public CLIPSSingleFieldRHSSlot getSingleFieldRHSSlot() {
    return findChildByClass(CLIPSSingleFieldRHSSlot.class);
  }

}
