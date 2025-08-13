package com.wdzfa.oop.w24;

public class W24_Hero {
    
    public String name;
    private double health; // harus bikin getter kalau mau diakses langsung di luar classs

    W24_Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    // getter
    public double getHealth(){
        return this.health;
    }

    // setter final = tidak bisa di timpa di heroIntel
    // kalau mau nimpa maka hapus final (tidak menggunakan final)
    final void setHealth(double health){
        this.health = health;
    }

    // kalau di overload bisa
    final void setHealth(String mode){
        if (mode.equals("reset")) {
            this.health = 100;
            
        }
    }

    public void display(){
        System.out.println(this.name + " mempunyai health " + this.health);
    }
}
