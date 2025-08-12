package com.wdzfa.oop;

class MahasiswaNew {
    String nama; // = "nama asli";
    String NIM;

    MahasiswaNew(String nama, String NIM) {
        // System.out.println(nama); // ini akan memanggil dr local scope = ucup
        // System.out.println(this.nama); // ini memanggil si object nya = nama asli
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : "+ this.nama);
        System.out.println("NIM  : "+ this.NIM);
    }

    // tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNim(){
        return this.NIM;
    }

    // dengan return dan dengan parameter
    String sayHi (String message){
        return message + " juga, nama saya " + nama;
    }
}

class Dosen {

    String nama;

    Dosen(String nama){
        this.nama = nama;
    }
}


public class W05_Methods {

    public static void main(String[] args) {
        MahasiswaNew mahasiswa1 = new MahasiswaNew("ucup", "1246322");
        System.out.println(mahasiswa1.nama);

        // method call
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);

        Dosen dosen1 = new Dosen("otong");

    }
}
