package com.wdzfa.oop.w35.hero;

public class W35_HeroIntel extends W35_Hero implements IAttackSkill, ISpellSkill{
    
    public W35_HeroIntel (String name, double health){
        super(name, health);
    }

    public void attack(W35_Hero enemy){
        System.out.println(this.getName() + " menyerang " + enemy.getName());
    }

    public void spell(W35_Hero enemy){
        System.out.println(this.getName() + " memagic " + enemy.getName());
    }
}
