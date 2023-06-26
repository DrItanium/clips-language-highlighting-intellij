// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CLIPSDefruleConstruct extends PsiElement {

  @NotNull
  List<CLIPSAction> getActionList();

  @Nullable
  CLIPSComment getComment();

  @NotNull
  List<CLIPSConditionalElement> getConditionalElementList();

  @Nullable
  CLIPSDeclaration getDeclaration();

  @NotNull
  CLIPSRuleName getRuleName();

}
