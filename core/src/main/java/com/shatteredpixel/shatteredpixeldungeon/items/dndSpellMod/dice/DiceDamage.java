package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dice;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DiceDamage {

    public List<DiceVo> diceVoList;

    public int getDamage() {
        return diceVoList.stream().mapToInt(x -> getDamage()).sum();
    }
}


