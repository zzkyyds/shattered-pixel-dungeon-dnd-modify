package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.level0;

import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.DndSpell;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellInfluenceEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellShapeEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellTargetEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FireArrowSpell extends DndSpell {
    {
        school = SpellSchoolEnum.EVOCATION;
        spellLevel = 0;
        cost = 1;

        target = SpellTargetEnum.POSITION;
        influence = SpellInfluenceEnum.POSITION_AND_ENEMY;
        shape = SpellShapeEnum.POINT;

        canMetamagicList = List.of();
    }


    @Override
    public void castSpell(Char caster) {
    }


}
