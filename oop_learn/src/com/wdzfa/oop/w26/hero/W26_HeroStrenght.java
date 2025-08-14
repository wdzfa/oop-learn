package com.wdzfa.oop.w26.hero;

public class W26_HeroStrenght extends W26_Hero{

    public W26_HeroStrenght(String name){
        super(name);
        levelUp();
    }
    
    public void levelUp(){
        this.setLevel(10);
    }
}
