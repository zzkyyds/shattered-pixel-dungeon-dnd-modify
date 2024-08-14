package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.DndSepllSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils.RandomUtil;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic.Metamagic;

import java.util.List;

public class MagicMissile extends DndSpell {
    protected DndSepllSchoolEnum school = DndSepllSchoolEnum.EVOCATION;
    protected int level = 1;
    protected double cost = 1;


    private static final int maxCount = 5;
    //damage=1d4+2


    @Override
    public void castSpell(final Hero user, final int dst, List<Metamagic> metamagicList) {
        String act = AC_CAST;

    }

    public void castSpell(int castLevel, List<Metamagic> metamagicList, int dst) {
        int count = Math.min(maxCount, (castLevel + 1) / 2);
    }


    public int getDamage(int castLevel, List<Metamagic> metamagicList) {
        int damage = 2 + RandomUtil.getRandomInt(1, 4);
        for (Metamagic metamagic : metamagicList) {
            damage = metamagic.modifyDamage(damage);
        }

        return damage;
    }
}
