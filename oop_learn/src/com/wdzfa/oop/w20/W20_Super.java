package com.wdzfa.oop.w20;

public class W20_Super {
    public static void main(String[] args) {
        
        W20_Hero hero1 = new W20_Hero();
        W20_HeroStrenght hero2 = new W20_HeroStrenght();

        hero1.show();
        hero2.show();

        // note:
        // proses akan mencari di subclass nya terlebih dahulu
        // apabila tidak ada maka akan mencetak di superclass
        
    }
}
