package com.wdzfa.oop.w35.hero;

public class W35_HeroAgility extends W35_Hero implements IAttackSkill{

    /*
       akan error jika double extend Hero dan ABSAttackSkill, implements khusus interface
       extends digunakan untuk pewarisan antar kelas (satu kelas mewarisi dari kelas lain), 
       sementara implements digunakan untuk implementasi interface. 
     */
    public W35_HeroAgility(String name, double health){
        super(name, health);
    }

    public void attack(W35_Hero enemy) {
        System.out.println(this.getName() + " menyerang " + enemy.getName());
    }
    
}
