package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dice;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public enum DiceEnum {
    D0(0),
    D1(1),
    D2(2),
    D3(3),
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20);

    private final int dice;

    DiceEnum(int dice) {
        this.dice = dice;
    }

    public int getDiceSize() {
        return dice;
    }

    public int getDiceRandom() {
        if (dice == 0)
            return 0;
        return RandomUtil.getRandomInt(1, dice);
    }

    public List<Integer> getDiceRandomList(int n) {
        if (dice == 0) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                res.add(0);
            }
            return res;
        }
        return RandomUtil.getRandomIntList(1, dice, n);

    }

    /**
     * 骰子去高/低
     * count>0 n取高
     * count<0 n取低
     */
    public int getMultiDiceRandom(int count) {
        if (count == 0)
            return getDiceRandom();
        boolean isMax = count > 0;
        int n = Math.abs(count) + 1;
        return getDiceRandomList(n).stream().mapToInt(x -> x).reduce(isMax ? Integer::max : Integer::min).orElse(0);

    }
}
