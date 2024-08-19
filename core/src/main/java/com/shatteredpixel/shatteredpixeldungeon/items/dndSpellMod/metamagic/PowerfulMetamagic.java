package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dice.DiceDamage;

/**
 * 超魔-强效
 */
public class PowerfulMetamagic extends Metamagic{
    public double damageRate = 1.5;

    public DiceDamage modifyDamage(DiceDamage diceDamage) {
        diceDamage.getDiceVoList().forEach(x->x.setDiceRate(x.getDiceRate()*damageRate));

        return diceDamage;
    }

}
