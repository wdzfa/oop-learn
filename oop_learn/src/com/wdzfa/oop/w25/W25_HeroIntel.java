package com.wdzfa.oop.w25;

public class W25_HeroIntel extends W25_Hero{

    public String type;

    public W25_HeroIntel(String name, double health){
        super(name,health);
        this.type = "intel";
    }
    
    public void display(){
        System.out.println(this.getName() + " is a type " + type + " hero");
    }

    public void castMagic(){
        System.out.println("Mengeluarkan magic");
    }
}
