package com.wdzfa.oop.w28.Hero;

public abstract class W28_Hero {
    
    // private String name;
    protected String name; 
    /* 
        jarang digunakan karna menyalahi enkapsulasi, hanya bisa diakses o
        leh subclass Hero
        ga enaknya kalau nanti ini di hapus, subclass nya gabisa panggil variable tsb
    */ 
    private int level;

    public W28_Hero (String name){
        this.name = name;
        this.level = 1;
    }

    public abstract void display(); 
    // kalau ada abstract ini juga berarti class yang inherit ke Hero harus memiliki method ini juga

    // getter
    public String getName(){
        String str = "name : " + this.name + "-" + this.level;
        return str;
    }

    protected void setName(String name){
        this.name = name;
    }

}
