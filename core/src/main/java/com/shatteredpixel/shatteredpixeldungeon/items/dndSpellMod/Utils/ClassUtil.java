package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils;

import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClassUtil {

    public static void main(String[] args) {

    }

    /**
     * 获取指定父类,指定包下所有的子类,包括子类的子类
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

    public static <T> List<Class<T>> getDirectSubClass(String packageName,@NotNull Class<T> clazz) {
        return getAllSubClass(packageName, clazz).stream().filter(x->clazz.equals(x.getSuperclass())).collect(Collectors.toList());
    }
}
