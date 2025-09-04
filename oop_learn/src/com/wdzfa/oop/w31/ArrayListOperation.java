package com.wdzfa.oop.w31;

import java.util.ArrayList;

public class ArrayListOperation {
    
    public static void main(String[] args) {
        
        W31_Hero hero1 = new W31_Hero("Ucup", 100);
        W31_Hero hero2 = new W31_Hero("Otong", 100);
        W31_AgilityHero hero3 = new W31_AgilityHero("Dudung", 30);
        W31_IntelHero hero4 = new W31_IntelHero("Johny", 56);

        ArrayList<W31_Hero> listHero = new ArrayList<>();

        // operasi 1 : tambah member dengan add()
        System.out.println("Operasi 1 : ADD");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.add(hero4);

        System.out.println(listHero);
        System.out.println();

        // operasi 2 : merubah member dengan set
        System.out.println("Operasi 2 : SET");
        listHero.set(1, hero4);
        System.out.println(listHero);
        System.out.println();

        // operasi 3 : menghapus member dengan remove
        System.out.println("Operasi 3: REMOVE");
        listHero.remove(3);
        System.out.println(listHero);
        System.out.println();

        // operasi 4: mengakses member dengan get
        System.out.println("Operasi 4: GET");
        W31_Hero takeHero = listHero.get(0);
        System.out.println(listHero);
        takeHero.display();
        System.out.println();

        // method pada Arraylist
        System.out.println("Method2");
        System.out.println();
        System.out.println("1. size()\t: " + listHero.size());
		System.out.println("2. isEmpty()\t: " + listHero.isEmpty());
		System.out.println("3. containts(hero2)\t: " + listHero.contains(hero2));
		System.out.println("   containts(heroAgility)\t: " + listHero.contains(hero3));
		System.out.println("4. indexOf(hero1)\t: " + listHero.indexOf(hero1));
		System.out.println("   indexOf(heroAgility)\t: " + listHero.indexOf(hero3));

    }
}
