package com.wdzfa.oop.w35.tutorial;

import com.wdzfa.oop.w35.hero.W35_HeroAgility;
import com.wdzfa.oop.w35.hero.W35_HeroIntel;

public class InterfaceAndAbstract {
    
    public static void main(String[] args) {
        
        W35_HeroAgility hero1 = new W35_HeroAgility("otong" , 100);
        W35_HeroIntel hero2 = new W35_HeroIntel("ucup" , 20);

        hero1.display();
        hero1.attack(hero2);
        hero2.spell(hero1);
    }
}
