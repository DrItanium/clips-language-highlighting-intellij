// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CLIPSDeffunctionConstruct extends PsiElement {

  @NotNull
  List<CLIPSAction> getActionList();

  @Nullable
  CLIPSComment getComment();

  @NotNull
  List<CLIPSRegularParameter> getRegularParameterList();

  @Nullable
  CLIPSWildcardParameter getWildcardParameter();

}
