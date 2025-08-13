package com.wdzfa.oop;

import java.util.ArrayList;

class Player13 {

    // static int numberOfPlayer; ini juga bisa
    private static int numberOfPlayer; // kalau pake ini, maka showNumberOfPlayer menjadi getter nya
    private static ArrayList<String> nameList = new ArrayList<String>();
    private String name;


    Player13(String name){
        this.name = name;
        Player13.numberOfPlayer++;
        Player13.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player name: " + this.name);
    }

    // static method
    static void showNumberOfPlayer(){
        System.out.println("Number of player: " + Player13.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player13.nameList;
    }
}


public class W14_StaticMethods {

    public static void main(String[] args) {
        Player13 player1 = new Player13("Saitama");
        Player13 player2 = new Player13("All Mighty");
        Player13 player3 = new Player13("Midnight");
        Player13 player4 = new Player13("Mt Lady");

        // player1.show();
        // player2.show();

        Player13.showNumberOfPlayer();
        
        System.out.println("Name of player: " + Player13.getNames());
    }
    
}
