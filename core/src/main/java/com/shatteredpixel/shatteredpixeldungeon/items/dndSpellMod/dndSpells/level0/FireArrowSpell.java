package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.level0;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.DndSpell;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSchoolEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FireArrowSpell extends DndSpell {
    public SpellSchoolEnum school = SpellSchoolEnum.EVOCATION;
    public int spellLevel = 0;
    protected double cost = 1;


}
