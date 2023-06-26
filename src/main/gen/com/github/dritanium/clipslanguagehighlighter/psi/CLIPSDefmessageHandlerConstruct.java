// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CLIPSDefmessageHandlerConstruct extends PsiElement {

  @NotNull
  List<CLIPSAction> getActionList();

  @NotNull
  CLIPSClassName getClassName();

  @Nullable
  CLIPSComment getComment();

  @Nullable
  CLIPSHandlerType getHandlerType();

  @NotNull
  CLIPSMessageName getMessageName();

  @NotNull
  List<CLIPSParameter> getParameterList();

  @Nullable
  CLIPSWildcardParameter getWildcardParameter();

}
