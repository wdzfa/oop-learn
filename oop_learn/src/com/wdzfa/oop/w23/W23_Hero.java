package com.wdzfa.oop.w23;

public class W23_Hero {
    String nama;

    W23_Hero(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("Name: " + this.nama);
    }

    void attack(W23_Hero enemy){
        System.out.println("Menyerang");
    }
}
