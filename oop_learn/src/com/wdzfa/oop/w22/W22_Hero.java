package com.wdzfa.oop.w22;

public class W22_Hero {
    String name;
    double attackPower, health;

    W22_Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    // method attack
    void attack(W22_Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health = this.health - damage;
    }

    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.attackPower);
    }
}
