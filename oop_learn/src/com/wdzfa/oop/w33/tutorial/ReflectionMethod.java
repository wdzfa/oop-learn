package com.wdzfa.oop.w33.tutorial;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.wdzfa.oop.w33.hero.W33_HeroAgility;

public class ReflectionMethod {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, IllegalArgumentException {
        
        W33_HeroAgility hero1 = new W33_HeroAgility("Ucup", 0);
        hero1.displayAll();

        System.out.println("\nKita akan mengambil seluruh method\n");

        Method[] methods = hero1.getClass().getDeclaredMethods();

        for (Method method:methods){
            // cek method nya ada apa aja
            System.out.println(method.getName());
            if (method.getName().equals("setHeroType")) {
                System.out.println("\nmenginvoke method setHeroType\n");
                method.setAccessible(true);
                method.invoke(hero1, "intel");
            }
            if (method.getName().equals("setNickName")) {
                System.out.println("\nmenginvoke method setNickName");
                method.setAccessible(true);
                method.invoke(hero1, "Brandon");
            }
        }
        hero1.displayAll();

        // mengakses constructor
        Object newHero = new Object();
        Constructor<?>[] constructorHero = hero1.getClass().getConstructors();
        for(Constructor<?> constructor:constructorHero){
            if (constructor.getName().equals("com.wdzfa.oop.w33.hero.W33_HeroAgility")) {
                Object[] obj = {"james", 20};
                newHero = constructor.newInstance(obj);
            }
        }

        // cast Object to HeroAgility
        W33_HeroAgility hero2 = (W33_HeroAgility) newHero;
        hero2.displayAll();
    }
    
}
