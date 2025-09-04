package com.wdzfa.oop.w29;

// public class W29_Hero extends Object{
public class W29_Hero {
    
    private String name;

    public W29_Hero (String name){
        this.name = name;
    }

    public void display(){
        System.out.println("\nName: " + this.name);
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) {
            System.out.println("Object dengan reference/memori sama");
            return true;
        } else if (this.getClass() == otherObject.getClass()) {
            System.out.println("Object dengan class sama");
            System.out.println("Reference berbeda");

            W29_Hero other = (W29_Hero) otherObject;

            if (this.name == other.name) {
                System.out.println("Namanya sama");
                return true;
            } else {
                System.out.println("Namanya beda");
                return false;
            }
        }
        else{
            return false;
        }
    }
}
