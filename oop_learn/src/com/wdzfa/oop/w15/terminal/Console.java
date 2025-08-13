package com.wdzfa.oop.w15.terminal;

public class Console {
    public static void log(String message) {
        System.out.println(message);
    }
    
}

// ini hanya bisa di akses dari package oop.w15
class Terminal {
    public static void log(String message) {
        System.out.println(message);
    }
}
