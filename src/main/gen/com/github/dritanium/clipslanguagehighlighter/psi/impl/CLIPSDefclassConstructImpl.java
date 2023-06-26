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

public class CLIPSDefclassConstructImpl extends ASTWrapperPsiElement implements CLIPSDefclassConstruct {

  public CLIPSDefclassConstructImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CLIPSVisitor visitor) {
    visitor.visitDefclassConstruct(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CLIPSVisitor) accept((CLIPSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CLIPSComment getComment() {
    return findChildByClass(CLIPSComment.class);
  }

  @Override
  @NotNull
  public List<CLIPSHandlerDocumentation> getHandlerDocumentationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSHandlerDocumentation.class);
  }

  @Override
  @Nullable
  public CLIPSPatternMatchRole getPatternMatchRole() {
    return findChildByClass(CLIPSPatternMatchRole.class);
  }

  @Override
  @Nullable
  public CLIPSRole getRole() {
    return findChildByClass(CLIPSRole.class);
  }

  @Override
  @NotNull
  public List<CLIPSSlot> getSlotList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSSlot.class);
  }

  @Override
  @NotNull
  public List<CLIPSSuperclassName> getSuperclassNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CLIPSSuperclassName.class);
  }

}
