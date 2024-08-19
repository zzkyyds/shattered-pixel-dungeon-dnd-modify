package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SepllInfluenceEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellShapeEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellTargetEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic.Metamagic;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 法术实例
 * 对于多阶段法术,可以考虑使用then或者类似的方法
 */
@NoArgsConstructor
@AllArgsConstructor
public class DndSpellInstance {

    public DndSpell originSpell;

    public List<DndSpellInstance> nextSpells;

    //角色
    public Char caster;
    public Char targetChar;

    //持续时间
    public double castTime = 1;
    public double duration = 1;

    //施法范围
    public SpellTargetEnum target = SpellTargetEnum.SELF;
    public SepllInfluenceEnum influence = SepllInfluenceEnum.ALL_CHAR;
    public SpellShapeEnum shape = SpellShapeEnum.CIRCLE;
    public int range = 3;
}
