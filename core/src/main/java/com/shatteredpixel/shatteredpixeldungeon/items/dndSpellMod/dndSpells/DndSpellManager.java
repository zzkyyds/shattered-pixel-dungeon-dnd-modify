package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils.ClassUtil;
import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.enumPackage.DndSepllSchoolEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DndSpellManager {


    public static List<DndSpell> spells = new ArrayList<>();
    public static Map<DndSepllSchoolEnum, List<DndSpell>> schoolMap = new HashMap<>();
    public static Map<Integer, List<DndSpell>> levelMap = new HashMap<>();


    public static void main(String[] args) {
        init();
        System.out.println(schoolMap);
        System.out.println(levelMap);
    }

    static {
        init();
    }

    private static void init() {
        Class<DndSpell> clazz = DndSpell.class;
        List<Class<DndSpell>> spellClasses = ClassUtil.getAllSubClass(clazz.getPackage().getName(), clazz);
        List<DndSpell> spells = spellClasses.stream().map(x -> {
            try {
                return x.getConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());

        for (DndSpell spell : spells) {
            spells.add(spell);

            DndSepllSchoolEnum school = spell.getSchool();
            int level = spell.getSpellLevel();
            List<DndSpell> l;
            l = schoolMap.getOrDefault(school, new ArrayList<>());
            l.add(spell);
            schoolMap.put(school, l);
            l = levelMap.getOrDefault(level, new ArrayList<>());
            l.add(spell);
            levelMap.put(level, l);
        }

    }
}
