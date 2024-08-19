package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic;


import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dice.DiceDamage;

/**
 * 超魔-增效
 */
public class EnhanceMetamagic extends Metamagic{

    public int add = 2;

    public DiceDamage modifyDamage(DiceDamage diceDamage) {
        diceDamage.getDiceVoList().forEach(x -> x.setDiceAdd(x.getDiceAdd() + add));
        return diceDamage;
    }
}
