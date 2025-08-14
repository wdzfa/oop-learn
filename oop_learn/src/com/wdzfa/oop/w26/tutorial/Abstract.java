package com.wdzfa.oop.w26.tutorial;

import com.wdzfa.oop.w26.hero.W26_Hero;
import com.wdzfa.oop.w26.hero.W26_HeroAgility;
import com.wdzfa.oop.w26.hero.W26_HeroIntel;
import com.wdzfa.oop.w26.hero.W26_HeroStrenght;

public class Abstract {
    public static void main(String[] args) {
        
        W26_HeroIntel hero1 = new W26_HeroIntel("otong");
        hero1.display();

        // object dari kelas abstract (tidak bisa dilakukan)
        // W26_Hero hero2 = new W26_Hero("maria");
        // hero2.display();

        W26_HeroAgility hero3 = new W26_HeroAgility("mario");
        hero3.display();

        hero1.levelUp();
        hero3.levelUp();
        hero1.display();
        hero3.display();

        W26_HeroStrenght hero4 = new W26_HeroStrenght("ucup");
        hero4.levelUp();
        hero4.display();
    }
}
