package com.wdzfa.oop.w24;

// visibility
/* 
1. Public: Jika method atau attribute dalam public secara explisit, 
    maka subclass tidak boleh mengurangi visibility
2. Private: Jika method atau attribute dalam private secara explisit,
    maka subclass pun tidak dapat mengakses
3. Final: method atau attribute dengan final keyword akan diwariskan,
    tetapi tidak bisa dioverride. dalam class yang sama bisa dioverload
*/


public class FinalPublicPrivate {
    public static void main(String[] args) {
        
        W24_Hero hero1 = new W24_Hero("maria", 40);
        W24_HeroIntel hero2 = new W24_HeroIntel("ucup", 50);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());

        hero1.setHealth(35);
        hero2.setHealth(80);
        
        hero1.display();
        hero2.display();

        hero1.setHealth("reset");
        hero1.display();
    }
    
}
