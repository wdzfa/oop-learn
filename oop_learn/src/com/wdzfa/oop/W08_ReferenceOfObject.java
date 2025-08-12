package com.wdzfa.oop;

// ini akan sangat dihindari dalam penggunaan oop,
// karena akan dengan mudah nilai suatu field diubah

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(String message){
        System.out.println(message);
        System.out.println("Judul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis + "\n");
    }
}


public class W08_ReferenceOfObject {
    
    public static void main(String[] args) {

        Buku buku1 = new Buku("killing komandan Tore", "haruke");
        buku1.display("buku 1");
        
        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // assignment object
         Buku buku2 = buku1; // ini harus dihindari
         buku2.display("buku 2");

         String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2)); // nilai address akan sama
         System.out.println(addressBuku2);

         // karena buku1 dan buku2 berada pada address/referensi yang sama
         buku1.judul = "Membunuh komandantur"; // ini akan membuat buku2.judul juga ikut berubah
         System.out.println("Display untuk perubahan judul");
         buku1.display("buku 1");
         buku2.display("buku 2");

         // memasukkan object kedalam methods
         System.out.println("Display untuk perubahan penulis dalam fungsi");
         fungsi(buku2);
         buku1.display("buku 1");
         buku2.display("buku 2");
    }


    // method ini juga harus di hindari, karna data dengan mudah ikut terubah
    // (bukan begini cara untuk copy object) karna selama address nya sama maka value nya juga akan sama
    // kalau di ubah akan ikut keubah semua
    public static void fungsi(Buku dataBuku){
        
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("adress dalam fungsi : " + addressDataBuku);
        dataBuku.penulis = "Haruki mahalkami";
    }
}
