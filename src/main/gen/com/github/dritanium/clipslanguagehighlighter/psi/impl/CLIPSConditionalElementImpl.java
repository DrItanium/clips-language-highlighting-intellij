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

public class CLIPSConditionalElementImpl extends ASTWrapperPsiElement implements CLIPSConditionalElement {

  public CLIPSConditionalElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitConditionalElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CLIPSAndCE getAndCE() {
    return findChildByClass(CLIPSAndCE.class);
  }

  @Override
  @Nullable
  public CLIPSAssignedPatternCE getAssignedPatternCE() {
    return findChildByClass(CLIPSAssignedPatternCE.class);
  }

  @Override
  @Nullable
  public CLIPSExistsCE getExistsCE() {
    return findChildByClass(CLIPSExistsCE.class);
  }

  @Override
  @Nullable
  public CLIPSForallCE getForallCE() {
    return findChildByClass(CLIPSForallCE.class);
  }

  @Override
  @Nullable
  public CLIPSLogicalCE getLogicalCE() {
    return findChildByClass(CLIPSLogicalCE.class);
  }

  @Override
  @Nullable
  public CLIPSNotCE getNotCE() {
    return findChildByClass(CLIPSNotCE.class);
  }

  @Override
  @Nullable
  public CLIPSOrCE getOrCE() {
    return findChildByClass(CLIPSOrCE.class);
  }

  @Override
  @Nullable
  public CLIPSPatternCE getPatternCE() {
    return findChildByClass(CLIPSPatternCE.class);
  }

  @Override
  @Nullable
  public CLIPSTestCE getTestCE() {
    return findChildByClass(CLIPSTestCE.class);
  }

}
