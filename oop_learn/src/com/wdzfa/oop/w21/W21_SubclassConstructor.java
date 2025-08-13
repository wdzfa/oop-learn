package com.wdzfa.oop.w21;

// contructor di superclass dan subclass
// kalau bikin constructor di superclass, maka di subclass juga harus ada constructor
public class W21_SubclassConstructor {

    public static void main(String[] args) {
        
        // memakai constructor super class
        W21_Hero hero1 = new W21_Hero("esmeralda",10);
        hero1.display();

        W21_HeroStrenght hero2 = new W21_HeroStrenght("ucup",15);
        hero2.display();
    }
    
}
