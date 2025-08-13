package com.wdzfa.oop.w20;

// superclass, parent class
class W20_Hero {
    String name = "Class Hero";

    void show(){
        System.out.println("ini adalah: " + this.name);
    }

    // method ini tidak pernah dipanggil disini
    void dummyMethod(){
        System.out.println("method ini ada di superclass");
    }
}
