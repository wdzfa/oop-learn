package com.wdzfa.oop.w28.tutorial;

import com.wdzfa.oop.w28.Hero.W28_HeroStrength;

public class Protected {

    public static void main(String[] args) {

        W28_HeroStrength hero1 = new W28_HeroStrength("Ucup");

        hero1.display();
        hero1.setName("Otong");
        hero1.display();
    }
    
}
