package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod;

import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.DndSpell;

import java.util.ArrayList;
import java.util.List;

/**
 * property:
 * cl(max cl),spell level(max spell level)
 * energy(max energy)
 * known spells(can know spell)
 */
public class SpellBook extends Item {


    //max spell level = 9
    public List<List<DndSpell>> spells;

    public int spellLevel;
    public int maxSpellLevel;

    public int maxCastLevel;
    public int castLevel;

    public double maxEnergy;
    public double energy;


    public SpellBook() {
    }

}
