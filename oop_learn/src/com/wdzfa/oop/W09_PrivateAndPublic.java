package com.wdzfa.oop;

class NewPlayer{
    String name;            // default, bisa dibaca dan ditulis dari luar class
    public int exp;         // public, bisa dibaca dan ditulis dari luar class
    private int health;     // private, hanya bisa dibaca dan ditulis di dalam class saja

    NewPlayer(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display(){
        tambahExp();
        System.out.println("\nName\t: " + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("health\t: " + this.health); //membaca tapi di dalam class
    }

    // public
    public void ubahNama (String namaBaru){
        this.name = namaBaru;
    }

    // private
    private void tambahExp(){
        this.exp += 100;
    }
}

public class W09_PrivateAndPublic {
    public static void main(String[] args) {

        NewPlayer player1 = new NewPlayer("Marni", 0, 100);

        // default
        System.out.println(player1.name);
        player1.name = "Surti";
        System.out.println(player1.name);

        // public
        System.out.println(player1.exp);
        player1.exp = 100;
        System.out.println(player1.exp);

        // private
        // System.out.println(player1.health); // membaca data
        // player1.health = 200; // Menulis data
        // System.out.println(player1.health); // membaca data

        // methods
        // default
        player1.display();

        // public
        player1.ubahNama("Tejo");
        player1.display();

        // private (tidak bisa diakses)
        // player1.tambahExp();
    }
}
