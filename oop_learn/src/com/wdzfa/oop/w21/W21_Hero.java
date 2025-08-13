package com.wdzfa.oop.w21;

public class W21_Hero {
    String name;
    double defencePower;

    W21_Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    W21_Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name = " + this.name);
    }
}
