package com.wdzfa.oop.w19;

public class W19_Overriding {
    public static void main(String[] args) {
        
        W19_Hero hero1 = new W19_Hero();
        hero1.name = "Saitama";
        // hero1.defencePower = gak bisa, ga punya
        hero1.show();

        W19_HeroStrenght hero2 = new W19_HeroStrenght();
        hero2.name = "Mount Lady";
        hero2.defencePower = 100;
        hero2.show();
    }
}
