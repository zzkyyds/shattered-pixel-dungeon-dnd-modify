package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

/**
 * 施法能够影响的
 */
public enum SepllInfluenceEnum {
    SELF("自己"),
    FRIENDLY("友军"),
    ALL_FRIENDLY("所有友军"),
    SELF_AND_FRIENDLY("自己和友军"),
    SELF_AND_ALL_FRIENDLY("自己和所有友军"),
    ENEMY("敌人"),
    ALL_ENEMY("所有敌人"),
    ALL_CHAR("所有角色");


    private String influenceName;

    SepllInfluenceEnum(String targetName) {
        this.influenceName = targetName;
    }

    public String getInfluenceName() {
        return influenceName;
    }
}
