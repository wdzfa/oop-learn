package com.wdzfa.oop.w23;

public class W23_HeroIntel extends W23_Hero{
    
    String type = "intel";

    W23_HeroIntel (String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type : " + this.type + "\n");
    }
}
