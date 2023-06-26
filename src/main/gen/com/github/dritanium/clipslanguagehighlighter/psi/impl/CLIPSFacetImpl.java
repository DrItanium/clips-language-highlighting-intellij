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

public class CLIPSFacetImpl extends ASTWrapperPsiElement implements CLIPSFacet {

  public CLIPSFacetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitFacet(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CLIPSAccessFacet getAccessFacet() {
    return findChildByClass(CLIPSAccessFacet.class);
  }

  @Override
  @Nullable
  public CLIPSConstraintAttribute getConstraintAttribute() {
    return findChildByClass(CLIPSConstraintAttribute.class);
  }

  @Override
  @Nullable
  public CLIPSCreateAccessorFacet getCreateAccessorFacet() {
    return findChildByClass(CLIPSCreateAccessorFacet.class);
  }

  @Override
  @Nullable
  public CLIPSDefaultFacet getDefaultFacet() {
    return findChildByClass(CLIPSDefaultFacet.class);
  }

  @Override
  @Nullable
  public CLIPSOverrideMessageFacet getOverrideMessageFacet() {
    return findChildByClass(CLIPSOverrideMessageFacet.class);
  }

  @Override
  @Nullable
  public CLIPSPatternMatchFacet getPatternMatchFacet() {
    return findChildByClass(CLIPSPatternMatchFacet.class);
  }

  @Override
  @Nullable
  public CLIPSPropagationFacet getPropagationFacet() {
    return findChildByClass(CLIPSPropagationFacet.class);
  }

  @Override
  @Nullable
  public CLIPSSourceFacet getSourceFacet() {
    return findChildByClass(CLIPSSourceFacet.class);
  }

  @Override
  @Nullable
  public CLIPSStorageFacet getStorageFacet() {
    return findChildByClass(CLIPSStorageFacet.class);
  }

  @Override
  @Nullable
  public CLIPSVisibilityFacet getVisibilityFacet() {
    return findChildByClass(CLIPSVisibilityFacet.class);
  }

}
