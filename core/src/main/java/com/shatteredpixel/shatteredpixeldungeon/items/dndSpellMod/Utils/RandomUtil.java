package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils;

public class RandomUtil {

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
