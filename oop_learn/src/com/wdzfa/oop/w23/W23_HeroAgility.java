package com.wdzfa.oop.w23;

public class W23_HeroAgility extends W23_Hero{
    
    String type = "agility";

    W23_HeroAgility (String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type : " + this.type + "\n");
    }

    void showOff(){
        System.out.println("Saya hero agility\n");
    }
}
