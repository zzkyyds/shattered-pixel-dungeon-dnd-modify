package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic;

/**
 * 超魔-延时
 */
public class ExtendMetamagic extends Metamagic{

    public double extendRate = 2.0;

    public double extendSpell(double duration) {
        return duration * extendRate;
    }
}
