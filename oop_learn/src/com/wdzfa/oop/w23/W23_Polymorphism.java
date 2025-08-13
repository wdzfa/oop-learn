package com.wdzfa.oop.w23;

// Polymorphism = banyak bentuk 
public class W23_Polymorphism {
    
    public static void main(String[] args) {
        
        W23_Hero hero1 = new W23_Hero("ucup");
        W23_HeroStrenght hero2 = new W23_HeroStrenght("otong");
        hero1.display();
        hero2.display();

        // Polymorphic, tipe data Hero, object HeroStrenght
        W23_Hero hero3 = new W23_HeroStrenght("Maria");
        hero3.display();

        // tidak bisa
        // HeroIntel hero4 = new Hero("Mahmud");

        // array list
        W23_Hero[] kumpulanHero = new W23_Hero[3];
        kumpulanHero[0]= hero1;
        kumpulanHero[1]= hero2;
        kumpulanHero[2]= hero3;

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        
        W23_HeroAgility hero4 = new W23_HeroAgility("Mahmud");
        hero4.display();
        hero4.showOff(); // bisa call showoff

        W23_Hero hero5 = new W23_HeroAgility("Maria");
        hero5.display();
        // hero5.showOff(); // ini tidak bisa, karna showoff ada di ability
        // dan di anggap bahwa tipe nya menjadi hero, bukan hero agility lagi

        // kumpulanHero[3]= hero5; // ini juga gabisa karna kumpulanHero tipe nya Hero
        // kumpulanHero[3].showOff(); // ini tidak bisa


        // aplikasi
        hero1.attack(hero2);
        hero2.attack(hero3);
    }
}
