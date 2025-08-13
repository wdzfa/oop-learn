package com.wdzfa.oop;

class Display {
    static String type = "Display";
    private String name;

    Display(String name) {
        this.name = name;
    } 

    void show() {
        System.out.println("Display name = " + this.name);
    }

    void setType(String typeInput){
        type = typeInput; // alternatif 1
        // this.type = typeInput // alternatif 2
        // Display.type = typeInput; // alternatif 3 (paling direkomen)
    }
}


public class W13_StaticVariable {

    public static void main(String[] args) {
        
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        // sharing (kalau diubah, akan ikut terubah semua)
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        Display.type = "Spanduk";
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        // ini juga akan ikut terubah juga
        display1.setType("Tampilkan");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
    
}
