// This is a generated file. Not intended for manual editing.
package dev.blachut.svelte.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SvelteScope extends PsiElement {

  @NotNull
  List<SvelteAwaitBlock> getAwaitBlockList();

  @NotNull
  List<SvelteEachBlock> getEachBlockList();

  @NotNull
  List<SvelteIfBlock> getIfBlockList();

  @NotNull
  List<SvelteInterpolation> getInterpolationList();

}
