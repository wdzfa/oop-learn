package com.wdzfa.oop.w36.hero;

public class W36_Hero {
    
    private String name;
    private double health;
    private W36_IAttackSkill iAttackSkill;

    public W36_Hero (String name, double health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }

    // set attack skill
    public void setAttackSkill(W36_IAttackSkill iAttackSkill){
        this.iAttackSkill = iAttackSkill;
    }

    // menambahkan method attack
    public void attack(W36_Hero enemy){
        System.out.println(this.name + " is attacking " + enemy.name);
        this.iAttackSkill.attack(enemy);
    }
}
