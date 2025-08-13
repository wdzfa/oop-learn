package com.wdzfa.oop.w22;

public class W22_InheritanceExercises {
    public static void main(String[] args) {
        

        W22_Hero hero1= new W22_Hero("Tanjiro", 10, 100);
        hero1.display();

        W22_HeroStrenght hero2 = new W22_HeroStrenght("Zanitsu", 20, 100);
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
        
        hero1.display();
        hero2.display();

    }
}
