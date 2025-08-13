package com.wdzfa.oop.w21;

public class W21_HeroStrenght extends W21_Hero{
    
    W21_HeroStrenght(String name, double defencePower){
        super(name, defencePower); // ini akan memanggil constructor di superclass
    }

    W21_HeroStrenght(String name){
        super(name);
    }
}


