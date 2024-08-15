package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils.RandomUtil;

public enum DiceEnum {
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

    public int getDice() {
        return RandomUtil.getRandomInt(1, dice);
    }
}
