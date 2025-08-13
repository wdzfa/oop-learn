package com.wdzfa.oop.w18;

/*
 * Inheritance: Konsep pewarisan di mana sebuah kelas (subclass) dapat mewarisi properti dan metode dari kelas lain (superclass).
 */

public class W18_Inheritance {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero();
        hero1.name = "ucup";
        hero1.show();

        HeroStrenght hero2 = new HeroStrenght();
        hero2.name = "otong";
        hero2.show();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Michael";
        hero3.show();
    }
}
