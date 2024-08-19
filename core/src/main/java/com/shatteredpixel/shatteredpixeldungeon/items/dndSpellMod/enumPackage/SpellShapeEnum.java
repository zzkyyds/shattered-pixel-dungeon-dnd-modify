package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

public enum SpellShapeEnum {
    CONICAL("扇形"),
    LINE("直线"),
    CIRCLE("圆形"),
    POINT("点"),
    ;

    private String rangeName;

    SpellShapeEnum(String rangeName) {
        this.rangeName = rangeName;
    }

    public String getRangeName() {
        return rangeName;
    }
}
