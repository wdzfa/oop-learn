package com.wdzfa.oop.w24;

public class W24_HeroIntel extends W24_Hero{
    
    W24_HeroIntel(String name, double health){
        super(name, health);
    }

    // public double getHealth(){
    //     return this.health(); // ini gabisa karna di hero health nya private
    // }

    public void display(){
        System.out.println(this.name + " mempunyai health " + this.getHealth());
    }

    // coba ovveride setter (tidak bisa) karna di hero sudah final
    // void setHealth(double newHealth){
    //     System.out.println("mencoba memasukkan health");
    // }
}
