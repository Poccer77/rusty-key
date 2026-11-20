package org.key_project.rusty.parser.hir.item;

import org.key_project.rusty.parser.hir.HirAdapter;
import org.key_project.rusty.parser.hir.item.ImplItem;

public interface ImplItemKind {

    record Fn(FnSig sig, Body body) {}

    class Adapter extends HirAdapter<ImplItemKind> {

        @Override 
        public @Nullable Class <? extends ImplItemKind> getType(String tag) {
            return switch (tag) {
                case "Fn" -> Fn.class;
                default -> null;
            };
        }

    }

}
