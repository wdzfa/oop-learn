package com.wdzfa.oop.w17;

public class W17_Overloading {

    public static void main(String[] args) {
        // overloading pada constructor
        /*
         * Overloading: Membuat beberapa metode dengan nama yang sama dalam satu kelas,
         * tetapi dengan parameter yang berbeda (baik jumlah, tipe, atau urutannya).
         */
        W17_Player player1 = new W17_Player("Saitama"); // bisa pake input string
        W17_Player player2 = new W17_Player(); // bisa tanpa input

        player1.show();
        player2.show();

        // overloading methods
        int a = W17_Matematika.tambah(1, 19);
        System.out.println(a);

        double b = W17_Matematika.tambah(1, 0.98);
        System.out.println(b);
    }
    
}
