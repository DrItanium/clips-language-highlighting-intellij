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

public class CLIPSConstraintAttributeImpl extends ASTWrapperPsiElement implements CLIPSConstraintAttribute {

  public CLIPSConstraintAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitConstraintAttribute(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CLIPSAllowedConstantAttribute getAllowedConstantAttribute() {
    return findChildByClass(CLIPSAllowedConstantAttribute.class);
  }

  @Override
  @Nullable
  public CLIPSCardinalityAttribute getCardinalityAttribute() {
    return findChildByClass(CLIPSCardinalityAttribute.class);
  }

  @Override
  @Nullable
  public CLIPSRangeAttribute getRangeAttribute() {
    return findChildByClass(CLIPSRangeAttribute.class);
  }

  @Override
  @Nullable
  public CLIPSTypeAttribute getTypeAttribute() {
    return findChildByClass(CLIPSTypeAttribute.class);
  }

}
