package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndEffects.spellSave;

import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndEffects.SpellEffect;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.SpellSaveType;

import java.util.List;

public class SpellSave {

    public SpellSaveType saveType;
    public int dc;
    public Char target;
    public Char caster;

    public SpellEffect successEffect;
    public SpellEffect failureEffect;
}
