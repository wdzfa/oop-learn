package com.wdzfa.oop.w28.Hero;

public class W28_HeroStrength extends W28_Hero{
    
    public W28_HeroStrength(String name){
        super(name);
    }

    public void display(){
        System.out.println(this.getName());
    }

    public void setName(String name){
        super.setName(name);
    }
}
