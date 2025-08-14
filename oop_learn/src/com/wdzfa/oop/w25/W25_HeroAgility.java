package com.wdzfa.oop.w25;

public class W25_HeroAgility extends W25_Hero{
    
    String type;

    public W25_HeroAgility(String name, double health){
        super(name,health);
        this.type = "agility";
    }
    
    public void display(){
        System.out.println(this.getName() + " is a type " + type + " hero");
    }
}
