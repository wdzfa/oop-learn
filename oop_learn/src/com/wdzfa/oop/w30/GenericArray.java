package com.wdzfa.oop.w30;

import java.util.ArrayList;

public class GenericArray {
    
    public static void main(String[] args) {
        
        W30_Hero hero1 = new W30_Hero("Ucup", 20);
        W30_Hero hero2 = new W30_Hero("Otong", 100);
        W30_AgilityHero hero3 = new W30_AgilityHero("Sarno", 40);
        W30_IntelHero hero4 = new W30_IntelHero("Kusri", 30);

        // Array sederhana
        W30_Hero[] kumpulaHeros = new W30_Hero[3];

        // masukkan anggota
        kumpulaHeros[0] = hero1;
        kumpulaHeros[1] = hero2;
        kumpulaHeros[2] = hero3;
        // kumpulaHeros[3] = hero4; // error karna ini array fix

        for(W30_Hero hero : kumpulaHeros){
            hero.display();
        }

        // Array List (not fix)
        ArrayList<W30_Hero> listHero = new ArrayList<>();
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.add(hero4);

        System.out.println("\nArrayList\n");
        for(W30_Hero hero:listHero){
            hero.display();
        }


        // Reference
        hero3.setName("Dudung");

        System.out.println("\nArrayList\n");
        for(W30_Hero hero:listHero){
            hero.display();
        }

        System.out.println("\nArray fix");
        for(W30_Hero hero : kumpulaHeros){
            hero.display();
        }
    }
}
