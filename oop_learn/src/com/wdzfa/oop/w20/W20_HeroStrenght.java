package com.wdzfa.oop.w20;

// this.name akan mengakses atribut name kalau ada di kelas ini.
// jika tidak ada maka akan mengkases atribut name dari superclass.

// super.name akan selalu mengakses atribut superclass
class W20_HeroStrenght extends W20_Hero{
    String name = "Class strenght";
    
    // ini yang di cetak adalah name di class ini
    void show(){
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }

    // ini yg di cetak adalah name di superclass
    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        this.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("method ini ada di subclass");
    }
}
