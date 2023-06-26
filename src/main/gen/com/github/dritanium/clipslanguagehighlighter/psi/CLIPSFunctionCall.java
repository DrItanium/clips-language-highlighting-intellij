// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CLIPSFunctionCall extends PsiElement {

  @NotNull
  List<CLIPSExpression> getExpressionList();

  @NotNull
  CLIPSFunctionName getFunctionName();

}
