package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndEffects;


@FunctionalInterface
public interface SpellEffectTransfer {

    SpellEffect transfer(SpellEffect source,SpellEffect dest);
}
