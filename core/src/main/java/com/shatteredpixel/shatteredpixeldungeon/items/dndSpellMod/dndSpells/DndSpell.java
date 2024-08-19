package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SepllInfluenceEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellShapeEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellTargetEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic.Metamagic;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Casting time
 * Casting range
 * Casting target
 * Spell level
 * Spell cost
 * Spell damage
 * Spell effects: 豁免决定效果,多阶段,持续伤害,持续效果
 */
@NoArgsConstructor
@Getter
@Setter
public class DndSpell extends Item {

    public static final String AC_CAST = "CAST";

    public double castTime = 1;
    public double duration = 1;

    public SpellSchoolEnum school = SpellSchoolEnum.COMMON;
    public int spellLevel = 0;
    public double cost = 0;

    //施法范围
    public SpellTargetEnum target = SpellTargetEnum.SELF;
    public SepllInfluenceEnum influence = SepllInfluenceEnum.ALL_CHAR;
    public SpellShapeEnum shape = SpellShapeEnum.CIRCLE;
    public int range = 3;

    //可应用超魔和已应用超魔
    public List<Metamagic> canMetamagicList;
    public List<Metamagic> applyMetamagicList;


    public DndSpellInstance createInstance() {


        return new DndSpellInstance();
    }

}
