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

public class CLIPSAttributeConstraintImpl extends ASTWrapperPsiElement implements CLIPSAttributeConstraint {

  public CLIPSAttributeConstraintImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitAttributeConstraint(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CLIPSConstraint> getConstraintList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSConstraint.class);
  }

  @Override
  @Nullable
  public CLIPSSlotName getSlotName() {
    return findChildByClass(CLIPSSlotName.class);
  }

}
