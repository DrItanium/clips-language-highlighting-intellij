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

public class CLIPSDeffunctionConstructImpl extends ASTWrapperPsiElement implements CLIPSDeffunctionConstruct {

  public CLIPSDeffunctionConstructImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitDeffunctionConstruct(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CLIPSAction> getActionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSAction.class);
  }

  @Override
  @Nullable
  public CLIPSComment getComment() {
    return findChildByClass(CLIPSComment.class);
  }

  @Override
  @NotNull
  public List<CLIPSRegularParameter> getRegularParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSRegularParameter.class);
  }

  @Override
  @Nullable
  public CLIPSWildcardParameter getWildcardParameter() {
    return findChildByClass(CLIPSWildcardParameter.class);
  }

}
