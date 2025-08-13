package com.wdzfa.oop.w15.tutorial;

import com.wdzfa.oop.w15.terminal.Console;

// import static method dari console
import static com.wdzfa.oop.w15.terminal.Console.log;

class W15_Multifile {

    public static void main(String[] args) {
        W15_Player player1 = new W15_Player("otong");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());
        
        log("Menampilkan data dengan log saja");
        log(player1.getName());

    }
    
}
