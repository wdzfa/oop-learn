package com.wdzfa.oop;

import javax.print.DocFlavor.STRING;

class PlayerNumber2 {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private ArmorNumber2 armor;
    private WeaponNumber2 weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int damage;
    private int totalDamage;
    private boolean isAlive;

    public PlayerNumber2(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public void setArmor(ArmorNumber2 armor){
        this.armor = armor;
    }
    
    public void setWeapon(WeaponNumber2 weapon){
        this.weapon = weapon;
    }

    private void levelUp() {
        this.level++;
    }

    public int maxHealth() {
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }

    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    public void display() {
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Alive\t\t: " + this.isAlive + "\n");
    }

    public String getName(){
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }
 
    public void attack(PlayerNumber2 player){ //ini agak bahaya, karna menggunakan class yg sama jadi bisa ubah value
        // hitung damage
        int damage = this.getAttackPower();
        System.out.println(this.name + " is attacking " + player.getName() + " with " + damage);
        // attack si opponent
        player.defence(damage);
        this.levelUp();
    }

    public void defence(int damage){

        int deltaDamage;
        int defencePower = this.armor.getDefencePower();

        System.out.println(this.name + " defence power = " + defencePower);
        if (damage > defencePower) {
            deltaDamage = damage - this.armor.getDefencePower();
        } else{
            deltaDamage = 0;
        }

        System.out.println("damage earned = " + deltaDamage);

        // adding total damage
        this.totalDamage += deltaDamage;

        // checking is alive
        if (this.getHealth()<=0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }
        this.display();
    }

}

class ArmorNumber2 {
    private String name;
    private int strenght;
    private int health;

    public ArmorNumber2(String name, int strenght, int health){
        this.name = name;
        this.strenght = strenght;
        this.health = health;
    }

    public int getDefencePower(){
        return this.strenght*2;
    }

    public int getAddHealth() {
        return this.strenght*10 + this.health;
    }

}

class WeaponNumber2 {
    private String name;
    private int attack;

    public WeaponNumber2 (String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}



public class W11_Encapsulation {
    public static void main(String[] args) {
        
        PlayerNumber2 player1 = new PlayerNumber2("Marni");
        ArmorNumber2 armor1 = new ArmorNumber2("Baju besi", 5, 100);
        WeaponNumber2 weapon1 = new WeaponNumber2("Pedang", 10);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        PlayerNumber2 player2 = new PlayerNumber2("Isabela");
        ArmorNumber2 armor2 = new ArmorNumber2("Gaun Pesta", 1, 40);
        WeaponNumber2 weapon2 = new WeaponNumber2("Pecut", 40);

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

       //  player1.levelUp(); //gabisa uda jadi private
        player1.display();
        System.out.println("player 2");
        player2.display();

        // saling serang
        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
    
    }
    
}
