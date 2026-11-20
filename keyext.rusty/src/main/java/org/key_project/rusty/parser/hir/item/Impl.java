package org.key_project.rusty.parser.hir.item;

public record Impl(
    Generics generics, 
    @Nullable TraitImplHeader ofTrait,
    Ty selfTy,
    ImplItem[] items
) {

}
