package com.shatteredpixel.shatteredpixeldungeon.items.dndSpellMod.Utils;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }

    /**
     * 求最大公约数
     * 辗转相除法
     * a,b为正整数
     */
    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
}
