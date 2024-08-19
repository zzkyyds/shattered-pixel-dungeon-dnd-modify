package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.level0;

import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.DndSpell;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.DndSepllSchoolEnum;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.metamagic.Metamagic;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FireArrowSpell extends DndSpell {
    public DndSepllSchoolEnum school = DndSepllSchoolEnum.EVOCATION;
    public int spellLevel = 0;
    protected double cost = 1;


    public void castSpell(final Hero user, final int dst, List<Metamagic> metamagicList) {
    }
}
