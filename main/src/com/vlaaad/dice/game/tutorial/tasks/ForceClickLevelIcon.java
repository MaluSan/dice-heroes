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

package com.vlaaad.dice.game.tutorial.tasks;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.vlaaad.common.tutorial.tasks.ForceClickActor;
import com.vlaaad.dice.Config;
import com.vlaaad.dice.game.config.levels.BaseLevelDescription;
import com.vlaaad.dice.game.config.levels.LevelDescription;
import com.vlaaad.dice.states.GameMapState;

/**
 * Created 15.11.13 by vlaaad
 */
public class ForceClickLevelIcon extends ForceClickActor {
    private final String levelName;

    public ForceClickLevelIcon(String levelName) {super();
        this.levelName = levelName;
    }

    @Override protected Actor getTargetActor() {
        BaseLevelDescription level = Config.levels.get(levelName);
        GameMapState mapState = resources.get("map");
        return mapState.getLevelIcon(level);
    }
}
