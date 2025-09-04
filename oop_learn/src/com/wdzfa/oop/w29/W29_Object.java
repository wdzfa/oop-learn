package com.wdzfa.oop.w29;

public class W29_Object {
    
    public static void main(String[] args) {

        W29_Hero hero1 = new W29_Hero("ucup");

        hero1.display();

        // kita sebut class object sebagai superclass
        Object hero2 = hero1;

        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString(); // ini akan menghasilkan reference/memori

        System.out.println(hero2_str);
        System.out.println(hero1_str);

        // salah satu method dari class Object adalah equals

        // contoh penggunaan equals
        W29_Hero hero3 = new W29_Hero("Otong");
        W29_Hero hero4 = new W29_Hero("Otong");
        W29_Hero hero5 = new W29_Hero("Otong"); 
        // mereka punya variable name sama tapi mereka berbeda karena reference nya beda

        Jagoan hero6 = new Jagoan("Otong");

        System.out.println(hero3.equals(hero4));

        // override equals di class Hero
        System.out.println(hero3.equals(hero4));
        System.out.println(hero3.equals(hero1));
    }

    
}
