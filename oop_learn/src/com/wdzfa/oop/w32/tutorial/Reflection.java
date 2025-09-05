package com.wdzfa.oop.w32.tutorial;

import java.lang.reflect.Field;

import com.wdzfa.oop.w32.hero.W32_HeroAgility;

public class Reflection {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        
        W32_HeroAgility hero1 = new W32_HeroAgility("Otong", 70);

        // access modifier
        hero1.nickname = "tongtong";
        hero1.displayAll(); // bisa dilakukan
        // hero1.heroType = "intel"; // tidak bisa dilakukan karena heroType private
        // hero1.nane = "ucup"; // tidak bisa dilakukan juga

        // Reflection
        Class<?> classHero1 = hero1.getClass();
        Class<?> parentClass1 = hero1.getClass().getSuperclass();
        System.out.println(classHero1);
        System.out.println(parentClass1);

        // cek attribute dari object hero1
        System.out.println("\nAttribute object hero1\n");
        Field[] hero1AllField = classHero1.getDeclaredFields();
        System.out.println("jumlah attribute: " + hero1AllField.length);

        System.out.println("Attribute: ");
        for(Field field : hero1AllField) { // untuk tahu field apa aja, meskipun private juga kebaca
            System.out.println(field.getName());
        }

        System.out.println("Attribute superclass Hero:");
        Field[] superclassField = parentClass1.getDeclaredFields();
        System.out.println("total attribute: " + superclassField.length);
        
        System.out.println("Attribute superclass:");
        for(Field field : superclassField) {
            System.out.println(field.getName());
        }

        // mengubah value pada attribute yang private
        System.out.println("\nKita ubah");
        hero1.displayAll();
        System.out.println("\nMenjadi");
        // merubah public bisa
        hero1AllField[0].set(hero1, "cupcup");
        // merubah private (field ke 2: herotype)
        hero1AllField[1].setAccessible(true);
        hero1AllField[1].set(hero1, "intel");

        // ubah value juga di bagian superclass
        superclassField[0].setAccessible(true);
        superclassField[0].set(hero1, "Ucup");
        superclassField[1].setAccessible(true);
        superclassField[1].set(hero1, 0);
        hero1.displayAll();
    }
    
}
