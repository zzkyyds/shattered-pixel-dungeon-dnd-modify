package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dice.DiceDamage;

public class MaximizedMetamagic extends Metamagic{

    public DiceDamage modifyDamage(DiceDamage diceDamage) {
        diceDamage.getDiceVoList().forEach(x -> x.setMax(true));
        return diceDamage;
    }
}
