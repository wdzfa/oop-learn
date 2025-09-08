package com.wdzfa.oop.w36.hero;

public class AttackRange implements W36_IAttackSkill{
    
    private double power;
    private double range;

    public AttackRange (double power, double range){
        this.power = power;
        this.range = range;
    }

    public void attack(W36_Hero enemy){
        System.out.println("Attack " + enemy.getName() + " with power " + this.power + " at range " + this.range);
    }

}
