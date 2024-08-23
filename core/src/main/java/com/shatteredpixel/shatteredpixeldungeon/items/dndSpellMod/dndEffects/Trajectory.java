package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndEffects;

import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import com.shatteredpixel.shatteredpixeldungeon.actors.Actor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 弹道
 */
@Getter
@Setter
public class Trajectory {
    public int start;
    public int end;
    public int firstCollision;

    public List<Integer> path = new ArrayList<>();
    public List<Integer> collisions = new ArrayList<>();


    //collision type
    public static final int NOT_STOP = 1;
    public static final int STOP_POS = 2;
    public static final int STOP_CHAR = 4;
    public static final int STOP_SOLID = 8;
    public static final int STOP_SOFT = 16;

    //common collision type
    public static final int STOP_ALL = STOP_POS | STOP_CHAR | STOP_SOLID | STOP_SOFT;
    public static final int MAGIC_BOLT = STOP_CHAR | STOP_SOLID;


    public Trajectory(int from, int to, int collisionParams) {
        build(from, to,
                (collisionParams & NOT_STOP) > 0,
                (collisionParams & STOP_POS) > 0,
                (collisionParams & STOP_CHAR) > 0,
                (collisionParams & STOP_SOLID) > 0,
                (collisionParams & STOP_SOFT) > 0);
    }


    /**
     * generate Trajectory
     * 不接受from=to
     */
    public void build(int from, int to, boolean isNotStop, boolean isStopPos, boolean isStopChar, boolean isStopSolid, boolean isStopSoft) {
        start = from;
        end = to;
        int w = Dungeon.level.width();

        int x0 = from % w;
        int x1 = to % w;
        int y0 = from / w;
        int y1 = to / w;

        int dx = x1 - x0;
        int dy = y1 - y0;

        int stepX = dx > 0 ? +1 : -1;
        int stepY = dy > 0 ? +1 : -1;

        dx = Math.abs(dx);
        dy = Math.abs(dy);

        int stepA;
        int stepB;
        int dA;
        int dB;

        if (dx > dy) {

            stepA = stepX;
            stepB = stepY * w;
            dA = dx;
            dB = dy;

        } else {

            stepA = stepY * w;
            stepB = stepX;
            dA = dy;
            dB = dx;

        }

        int cell = from;

        int err = dA / 2;
        while (Dungeon.level.insideMap(cell)) {
            cell += stepA;

            err += dB;
            if (err >= dA) {
                err = err - dA;
                cell = cell + stepB;
            }
        }
        if (!isNotStop) {
            for (int i = 1; i < path.size(); i++) {
                int c = path.get(i);
                if (isStopPos) {
                    if (c == to) {
                        collisions.add(c);
                        continue;
                    }
                }
                if (isStopChar) {
                    if (Actor.findChar(c) != null) {
                        collisions.add(c);
                        continue;
                    }
                }
                if (isStopSolid) {
                    if (Dungeon.level.solid[c]) {
                        collisions.add(c);
                        continue;
                    }
                }
                if (isStopSoft) {
                    if (Dungeon.level.passable[c]) {
                        collisions.add(c);
                        continue;
                    }
                }
            }
        }
        if (!collisions.isEmpty()) {
            firstCollision = collisions.get(0);
        }
    }

}
