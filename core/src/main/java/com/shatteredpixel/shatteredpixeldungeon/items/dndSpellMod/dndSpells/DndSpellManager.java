package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils.ClassUtil;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.DndSepllSchoolEnum;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DndSpellManager {


    public static Map<DndSepllSchoolEnum, List<DndSpell>> schoolMap = new HashMap<>();
    public static Map<Integer, List<DndSpell>> levelMap = new HashMap<>();


    private static void init() {
        Class<DndSpell> clazz = DndSpell.class;
        List<Class<DndSpell>> spells = ClassUtil.getAllSubClass(clazz.getPackage().getName(), clazz);

        for (Class<DndSpell> spell : spells) {
            DndSepllSchoolEnum school=getSchool(spell);
            int level = getLevel(spell);
//            List<DndSpell> l=schoolMap.getOrDefault(school,new ArrayList<>());
//            l.add(spell.newInstance());

        }
    }


    @SneakyThrows
    @SuppressWarnings("unchecked")
    private static <T> T getField(Class<DndSpell> clazz, String fieldName) {
        Field field = clazz.getDeclaredField(fieldName);
        return (T) field.get(clazz);
    }

    public static DndSepllSchoolEnum getSchool(Class<DndSpell> clazz) {
        return getField(clazz, "school");
    }

    public static int getLevel(Class<DndSpell> clazz) {
        return getField(clazz, "level");
    }
}
