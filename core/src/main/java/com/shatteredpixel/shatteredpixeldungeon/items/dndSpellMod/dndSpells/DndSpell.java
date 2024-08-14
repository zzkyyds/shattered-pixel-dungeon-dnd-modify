package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.DndSepllSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic.Metamagic;

import java.util.List;

/**
 * 施法时间
 * 施法范围
 * 施法目标
 * 法术环位
 * 法术消耗
 * 法术效果
 */
public class DndSpell extends Item {

    public static final String AC_CAST = "CAST";

    protected DndSepllSchoolEnum school=DndSepllSchoolEnum.UNKNOWN;
    protected int level = 0;
    protected double cost = 0;


    public void castSpell(final Hero user, final int dst, List<Metamagic> metamagicList) {
    }
}
