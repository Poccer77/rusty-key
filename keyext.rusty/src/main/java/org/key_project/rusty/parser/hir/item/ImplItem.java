package org.key_project.rusty.parser.hir.item;

public record ImplItem(
    Ident ident,
    OwnerId ownerId,
    Generics generics,
    ImplItemKind kind,
    Span span
) {

}
