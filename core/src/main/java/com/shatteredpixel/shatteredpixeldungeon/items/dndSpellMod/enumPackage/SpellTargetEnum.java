package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

/**
 * 施法目标
 */
public enum SpellTargetEnum {
    SELF("自己"),
    FRIENDLY("友军"),
    ENEMY("敌人"),
    CHAR("角色"),

    //以下为非活动目标
    POSITION("位置"),
    PLANT("植物"),
    ;


    private String targetName;
    SpellTargetEnum(String targetName)
    {
        this.targetName = targetName;
    }

    public String getTargetName()
    {
        return targetName;
    }
}
