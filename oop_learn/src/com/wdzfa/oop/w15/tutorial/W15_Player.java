package com.wdzfa.oop.w15.tutorial;

import com.wdzfa.oop.w15.terminal.Console;;

// visibility default
class W15_Player {

    private String name;

    W15_Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("Menggunakan console log");
        Console.log("Player name: " + this.name);
    }
    
}
