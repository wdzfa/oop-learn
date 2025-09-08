package com.wdzfa.oop.w36.hero;


// real class
public class AttackMelee implements W36_IAttackSkill {
    
    private double power;

    public AttackMelee (double power) {
        this.power = power;
    }

    public void attack(W36_Hero enemy){
        System.out.println("Attack " + enemy.getName() + " with melee " + this.power);
    }
}
