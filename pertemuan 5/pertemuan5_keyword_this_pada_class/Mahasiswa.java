/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_keyword_this_pada_class;

/**
 *
 * @author Asus A408
 */
class Mahasiswa {
    String nama;
    int umur;

    // Constructor menggunakan keyword this
    Mahasiswa(String nama, int umur) {
        this.nama = nama;   // this mengacu pada variabel class
        this.umur = umur;
    }

    void tampil() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }
}


