package com.wdzfa.oop.w25;

public class Casting {
    
    public static void main(String[] args) {
        
        // object dengan class HeroIntel
        W25_HeroIntel hero1 = new W25_HeroIntel("ucup", 10);
        hero1.display();

        // upcasting subclass to superclass
        W25_Hero heroUp = (W25_Hero) hero1;
        heroUp.display();

        // ada field yang hilang
        // System.out.println(heroUp.type); // tidak bisa
        // heroUp.castMagic(); // ini juga ga ada

        // gabisa casting dari superclass ke subclass
        // W25_Hero heroReg = new W25_Hero("otong", 100);
        // heroReg.display();
        // W25_HeroAgility hero2 = (W25_HeroAgility) heroReg;
        // hero2.display();

        // kita coba dr intel ke hero, lalu di balikin lagi ke intel 
        // -> berhasil down casting
        W25_HeroIntel hero3 = (W25_HeroIntel) heroUp;
        hero3.display();
        System.out.println(hero3.type);
        hero3.castMagic();
    }
}
