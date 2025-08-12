package com.wdzfa.oop;

class Polos {
    String dataString;
    int dataInteger;
}

// class constructor
class MahasiswaBaru {
    String nama;
    String NIM;
    String jurusan;

    // constructor akan dipanggil saat object pertama kali dibuat
//    MahasiswaBaru() {
//        System.out.println("ini adalah constructor");
//    }

    // constructor dengan parameter
    MahasiswaBaru(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class W04_Constructor {

    public static void main(String[] args) {

        MahasiswaBaru mahasiswa1 = new MahasiswaBaru("ucup", "23423232","teknik perteknikan");
        MahasiswaBaru mahasiswa2 = new MahasiswaBaru("otong", "32443344", "teknik pertambangan");

    }
}
