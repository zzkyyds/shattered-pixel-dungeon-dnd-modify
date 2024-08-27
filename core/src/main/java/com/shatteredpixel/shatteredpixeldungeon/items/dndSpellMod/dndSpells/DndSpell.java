package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellInfluenceEnum;
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
    public SpellInfluenceEnum influence = SpellInfluenceEnum.ALL_CHAR;
    public SpellShapeEnum shape = SpellShapeEnum.CIRCLE;
    public int range = 3;
    public int targetNum = 1;

    //可应用超魔和已应用超魔
    public List<Metamagic> canMetamagicList;
    public List<Metamagic> applyMetamagicList;


    public DndSpellInstance createInstance() {


        return new DndSpellInstance();
    }

    /**
     * todo
     * 一部分法术不需要指定目标,一部分需要指定一个位置,一部分需要指定多个位置
     * 多阶段法术的后续也可能会需要指定位置,如内爆术多阶段转移目标
     * 参考 GameScene.selectCell SpiritBow.shooter
     */
    public void castSpell(Char caster) {
    }

}
