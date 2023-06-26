// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CLIPSDefclassConstruct extends PsiElement {

  @Nullable
  CLIPSComment getComment();

  @NotNull
  List<CLIPSHandlerDocumentation> getHandlerDocumentationList();

  @Nullable
  CLIPSPatternMatchRole getPatternMatchRole();

  @Nullable
  CLIPSRole getRole();

  @NotNull
  List<CLIPSSlot> getSlotList();

  @NotNull
  List<CLIPSSuperclassName> getSuperclassNameList();

}
