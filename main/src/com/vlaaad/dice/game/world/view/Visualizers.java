/*
 * Dice heroes is a turn based rpg-strategy game where characters are dice.
 * Copyright (C) 2016 Vladislav Protsenko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.vlaaad.dice.game.world.view;

import com.vlaaad.common.util.futures.Future;
import com.vlaaad.common.util.futures.IFuture;

public class Visualizers {
    private static final IVisualizer emptyVisualizer = new IVisualizer() {
        @Override public IFuture<Void> visualize(Object o) {
            return Future.completed();
        }
    };

    @SuppressWarnings("unchecked")
    public static <T> IVisualizer<T> empty() {
        return emptyVisualizer;
    }
}
