/* This file is part of KeY - https://key-project.org
 * KeY is licensed under the GNU General Public License Version 2, 
 * or (at your option) any later version.
 * SPDX-License-Identifier: GPL-2.0-or-later */
package org.key_project.rusty.parser.hir.item;

import org.key_project.rusty.parser.hir.HirAdapter;

public interface ImplItemKind {

    record Fn(FnSig sig, Body body) {
    }

    class Adapter extends HirAdapter<ImplItemKind> {

        @Override
        public @Nullable Class<? extends ImplItemKind> getType(String tag) {
            return switch (tag) {
                case "Fn" -> Fn.class;
                default -> null;
            };
        }

    }

}
