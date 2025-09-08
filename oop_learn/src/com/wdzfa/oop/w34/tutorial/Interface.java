package com.wdzfa.oop.w34.tutorial;

import com.wdzfa.oop.w34.hero.W34_Hero;

public class Interface {
    
    public static void main(String[] args) {
        
        W34_Hero hero1 = new W34_Hero("ucup", 100);
        W34_Hero hero2 = new W34_Hero("otong", 20);

        hero1.attack(hero2);
    
    }
}
