package com.wdzfa.oop.w19;

// subclass, child class
class W19_HeroStrenght extends W19_Hero{
    double defencePower;

    // overriding methods
    void show(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
