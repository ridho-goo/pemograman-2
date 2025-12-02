/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Inheritance_pewarisan;

/**
 *
 * @author Asus A408
 */
class kendaraan {
    String merk = "Honda";

    void info() {
        System.out.println("Ini adalah kendaraan bermerek: " + merk);
    }
}

// Motor mewarisi sifat dari Kendaraan
class Motor extends kendaraan {
    String tipe = "NMax";

    void tampil() {
        info(); // method dari parent class
        System.out.println("Tipe motor: " + tipe);
    }
}