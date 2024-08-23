package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

import lombok.Getter;

/**
 * 施法目标
 */
@Getter
public enum SpellTargetEnum {
    SELF("自己"),
    FRIENDLY("友军"),
    ENEMY("敌人"),
    CHAR("角色"),

    //以下为非活动目标
    POSITION("位置"),
    PLANT("植物"),
    ;


    private final String targetName;
    SpellTargetEnum(String targetName)
    {
        this.targetName = targetName;
    }

}
