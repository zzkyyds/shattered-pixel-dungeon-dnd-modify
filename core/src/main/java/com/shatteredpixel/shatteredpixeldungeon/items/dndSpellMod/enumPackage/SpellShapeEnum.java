package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

import lombok.Getter;

@Getter
public enum SpellShapeEnum {
    CONICAL("扇形"),
    LINE("直线"),
    CIRCLE("圆形"),
    POINT("点"),
    ;

    private final String rangeName;

    SpellShapeEnum(String rangeName) {
        this.rangeName = rangeName;
    }

}
