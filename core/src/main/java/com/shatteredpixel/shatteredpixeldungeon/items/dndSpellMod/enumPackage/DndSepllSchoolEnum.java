package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage;

import java.util.Arrays;

public enum DndSepllSchoolEnum {
    ABJURATION("防护"),
    CONJURATION("召唤"),
    DIVINATION("预言"),
    ENCHANTMENT("惑控"),
    EVOCATION("塑能"),
    ILLUSION("幻术"),
    NECROMANCY("死灵"),
    TRANSMUTATION("变化"),
    COMMON("通用");


    private final String chineseName;

    public String getChineseName() {
        return chineseName;
    }

    public static DndSepllSchoolEnum getSchoolByChinese(String cn) {
        return Arrays.stream(DndSepllSchoolEnum.values()).filter(school -> cn.equals(school.getChineseName())).findAny().orElse(COMMON);
    }

    DndSepllSchoolEnum(String chineseName) {
        this.chineseName = chineseName;
    }
}
