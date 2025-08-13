package com.wdzfa.oop.w22;

public class W22_HeroStrenght extends W22_Hero{
    
    String strenght = "STRENGHT";

    W22_HeroStrenght(String nameInput, double attackInput, double healthInput){
        super(nameInput,attackInput,healthInput);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type: " + this.strenght);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receive half damage " + damage + "->" + 0.5*damage);
        this.health = this.health - 0.5*damage;
    }
}
