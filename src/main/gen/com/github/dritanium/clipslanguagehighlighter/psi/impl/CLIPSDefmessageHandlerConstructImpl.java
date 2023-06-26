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

public class CLIPSDefmessageHandlerConstructImpl extends ASTWrapperPsiElement implements CLIPSDefmessageHandlerConstruct {

  public CLIPSDefmessageHandlerConstructImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitDefmessageHandlerConstruct(this);
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
  @NotNull
  public CLIPSClassName getClassName() {
    return findNotNullChildByClass(CLIPSClassName.class);
  }

  @Override
  @Nullable
  public CLIPSComment getComment() {
    return findChildByClass(CLIPSComment.class);
  }

  @Override
  @Nullable
  public CLIPSHandlerType getHandlerType() {
    return findChildByClass(CLIPSHandlerType.class);
  }

  @Override
  @NotNull
  public CLIPSMessageName getMessageName() {
    return findNotNullChildByClass(CLIPSMessageName.class);
  }

  @Override
  @NotNull
  public List<CLIPSParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSParameter.class);
  }

  @Override
  @Nullable
  public CLIPSWildcardParameter getWildcardParameter() {
    return findChildByClass(CLIPSWildcardParameter.class);
  }

}
