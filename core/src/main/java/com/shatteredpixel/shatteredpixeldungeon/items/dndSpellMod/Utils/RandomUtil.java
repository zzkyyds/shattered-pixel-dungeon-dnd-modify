package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils;

import java.util.ArrayList;
import java.util.List;

public class RandomUtil {

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static List<Integer> getRandomIntList(int min, int max, int count) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(getRandomInt(min, max));
        }
        return list;
    }
}
