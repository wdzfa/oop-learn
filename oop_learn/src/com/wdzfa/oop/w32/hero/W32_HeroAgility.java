package com.wdzfa.oop.w32.hero;

public class W32_HeroAgility extends W32_Hero {
    
    public String nickname;
    private String heroType;

    public W32_HeroAgility (String name, double health){
        super(name, health);
    }

    public void displayAll(){
        this.display();
        System.out.println("heroType: " + this.heroType);
        System.out.println("nickname: " + this.nickname);
    }

    private void setHeroType (String heroType){
        this.heroType = heroType;
    }

}
