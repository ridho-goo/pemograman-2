/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Overiding_pada_Inheritance;

/**
 *
 * @author Asus A408
 */
class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class sapi extends Hewan {
    // Method overriding
    @Override
    void suara() {
        System.out.println("sapi: M0hhhh!");
    }
}