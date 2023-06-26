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

public class CLIPSAllowedConstantAttributeImpl extends ASTWrapperPsiElement implements CLIPSAllowedConstantAttribute {

  public CLIPSAllowedConstantAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitAllowedConstantAttribute(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CLIPSClassNameList getClassNameList() {
    return findChildByClass(CLIPSClassNameList.class);
  }

  @Override
  @Nullable
  public CLIPSFloatList getFloatList() {
    return findChildByClass(CLIPSFloatList.class);
  }

  @Override
  @Nullable
  public CLIPSInstanceNameList getInstanceNameList() {
    return findChildByClass(CLIPSInstanceNameList.class);
  }

  @Override
  @Nullable
  public CLIPSIntegerList getIntegerList() {
    return findChildByClass(CLIPSIntegerList.class);
  }

  @Override
  @Nullable
  public CLIPSLexemeList getLexemeList() {
    return findChildByClass(CLIPSLexemeList.class);
  }

  @Override
  @Nullable
  public CLIPSNumberList getNumberList() {
    return findChildByClass(CLIPSNumberList.class);
  }

  @Override
  @Nullable
  public CLIPSStringList getStringList() {
    return findChildByClass(CLIPSStringList.class);
  }

  @Override
  @Nullable
  public CLIPSSymbolList getSymbolList() {
    return findChildByClass(CLIPSSymbolList.class);
  }

  @Override
  @Nullable
  public CLIPSValueList getValueList() {
    return findChildByClass(CLIPSValueList.class);
  }

}
