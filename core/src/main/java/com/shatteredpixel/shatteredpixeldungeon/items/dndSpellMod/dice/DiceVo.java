package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dice;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils.RandomUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DiceVo {
    //骰子大小
    public DiceEnum diceType;
    //每个骰子加值
    public int diceAdd = 0;
    //骰子数量
    public int diceCount;
    //伤害倍率
    public double diceRate = 1;
    //是否为最大
    public boolean isMax = false;

    public DiceVo(DiceEnum diceType, int diceCount) {
        this.diceType = diceType;
        this.diceCount = diceCount;
    }

    public int getDamage() {
        return (int) ((isMax ? diceType.getDiceSize() : diceType.getDiceRandom() + diceAdd) * diceCount * diceRate);
    }

    public double getAvg() {
        return (getMin() + getMax()) / 2.0;
    }

    public int getMin() {
        return (int) ((isMax ? diceType.getDiceSize() : 1 + diceAdd) * diceCount * diceRate);
    }

    public int getMax() {
        return (int) ((diceType.getDiceSize() + diceAdd) * diceCount * diceRate);
    }
}
