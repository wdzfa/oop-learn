package com.wdzfa.oop.w33.hero;

public class W33_HeroAgility extends W33_Hero {

    private String heroType = "agility";
    private String nickname;

    public W33_HeroAgility (String name, double health){
        super(name,health);
    }

    public void displayAll(){
        this.display();
        System.out.println("herotype: " + this.heroType);
        System.out.println("nickname: " + this.nickname);
    }

    private void setHeroType (String heroType){
        this.heroType = heroType;
    }
    
    private void setNickName(String nickname){
        this.nickname = nickname;
    }
}
