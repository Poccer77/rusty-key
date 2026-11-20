/* This file is part of KeY - https://key-project.org
 * KeY is licensed under the GNU General Public License Version 2, 
 * or (at your option) any later version.
 * SPDX-License-Identifier: GPL-2.0-or-later */
package org.key_project.rusty.ast.fn;

import org.key_project.logic.Name;
import org.key_project.rusty.ast.expr.BlockExpression;
import org.key_project.rusty.ast.ty.RustType;
import org.key_project.util.collection.ImmutableList;

public class ImplFunction extends Function {
    public ImplFunction(Name name, ImplicitSelfKind selfKind, ImmutableList<FunctionParam> params,
            RustType returnType, BlockExpression body) {
        super(name, selfKind, params, returnType, body);
    }
}
