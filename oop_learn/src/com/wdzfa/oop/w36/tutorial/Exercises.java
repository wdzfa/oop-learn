package com.wdzfa.oop.w36.tutorial;

import com.wdzfa.oop.w36.hero.AttackMelee;
import com.wdzfa.oop.w36.hero.AttackRange;
import com.wdzfa.oop.w36.hero.W36_HeroAgility;

public class Exercises {
    

    public static void main(String[] args) {
         
        W36_HeroAgility hero1 = new W36_HeroAgility("ucup", 100);
        W36_HeroAgility hero2 = new W36_HeroAgility("otong", 20);
        
        hero1.setAttackSkill(new AttackMelee(20));
        hero2.setAttackSkill(new AttackRange(100, 10));

        hero1.display();
        hero2.display();

        // implementasi method attack
        hero1.attack(hero2);
        hero2.attack(hero1);
        
    }
}
