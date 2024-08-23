package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.level0;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.DndSpell;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSchoolEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FireArrowSpell extends DndSpell {
    {
        school = SpellSchoolEnum.EVOCATION;
        spellLevel = 0;
        cost = 1;
    }


}
