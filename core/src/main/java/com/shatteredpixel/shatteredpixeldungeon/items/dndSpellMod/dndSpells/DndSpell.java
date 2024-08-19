package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SepllInfluenceEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellShapeEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellTargetEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 施法时间
 * 施法范围
 * 施法目标
 * 法术环位
 * 法术消耗
 * 法术效果
 * 法术伤害
 */
@NoArgsConstructor
@Getter
@Setter
public class DndSpell extends Item {

    public static final String AC_CAST = "CAST";

    public SpellSchoolEnum school= SpellSchoolEnum.COMMON;
    public int spellLevel = 0;
    public double cost = 0;

    //施法范围
    public SpellTargetEnum target= SpellTargetEnum.SELF;
    public SepllInfluenceEnum influence= SepllInfluenceEnum.SELF;
    public SpellShapeEnum shape= SpellShapeEnum.POINT;



}
