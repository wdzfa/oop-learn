package com.wdzfa.oop;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    // getter (read only saja)
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // getter
    public double getJari2(){
        return this.diameter/2;
    }

    // getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}


public class W10_GetterAndSetter {
    
    public static void main(String[] args) {
        Data object = new Data();

        // read and write dengan menggunakan public
        object.intPublic = 10; // write
        System.out.println("public: " + object.intPublic); // read

        // read only (bisa menggunakan getter)
        object.getIntPrivate();
        int angka = object.getIntPrivate();
        System.out.println("getter: " + angka);

        // write only (bisa menulis saja)
        object.setDoublePrivate(0.05); // kalau mau baca pake display
        object.display();

        // gabungan read dan write dengan setter & getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("jari-jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("jari-jari: " + object2.getJari2());

        System.out.println("Luas : " + object2.getLuas());
    }

}
