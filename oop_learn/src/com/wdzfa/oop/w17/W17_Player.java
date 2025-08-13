package com.wdzfa.oop.w17;

class W17_Player {

    private String name;
    private static int jumlahPlayer;
    
    W17_Player(String name){
        W17_Player.jumlahPlayer++;
        this.name = name;
    }

    W17_Player(){
        W17_Player.jumlahPlayer++;
        this.name = "sarni" + W17_Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Name: " + this.name);
    }
}
