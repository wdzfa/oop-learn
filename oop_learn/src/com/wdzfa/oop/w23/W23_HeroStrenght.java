package com.wdzfa.oop.w23;

public class W23_HeroStrenght extends W23_Hero {
    
    String type = "Strenght";

    W23_HeroStrenght (String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type : " + this.type + "\n");
    }
}
