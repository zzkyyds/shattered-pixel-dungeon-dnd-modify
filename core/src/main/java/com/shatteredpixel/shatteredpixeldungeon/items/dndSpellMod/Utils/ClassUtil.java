package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils;

import com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.dndSpells.DndSpell;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClassUtil {

    public static void main(String[] args) {
        Class<DndSpell> dndSpellClass=DndSpell.class;
        String packageName=dndSpellClass.getPackage().getName();
        for (Class<DndSpell> dndSpell : getAllSubClass(packageName, DndSpell.class)) {
            System.out.println(dndSpell.getSimpleName());
        }
    }

    /**
     * 获取指定父类,指定包下所有的子类
     */
    public static <T> List<Class<T>> getAllSubClass(String packageName, Class<T> clazz) {
        List<Class<T>> res=new ArrayList<>();
        Reflections reflections=new Reflections(packageName);
        Set<Class<? extends T>> subTypes=reflections.getSubTypesOf(clazz);
        for (Class<? extends T> subType : subTypes) {
            @SuppressWarnings("unchecked")
            Class<T> sc=(Class<T>) subType;
            res.add(sc);
        }
        return res;
    }
}
