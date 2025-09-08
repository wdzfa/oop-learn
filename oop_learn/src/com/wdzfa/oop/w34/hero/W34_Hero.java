package com.wdzfa.oop.w34.hero;

public class W34_Hero {
    
    private String name;
    private double health;

    public W34_Hero (String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }

    /* 
        implementasi interface class => dengan implements class dan memaksa class
        untuk mengimplementasikan method attack (sekilas sama dengan abstract)
    */

    public void attack (W34_Hero enemy){
        System.out.println(this.name + " attacks " + enemy.name);
    }
}
