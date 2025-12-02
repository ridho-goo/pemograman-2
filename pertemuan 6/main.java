/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Asus A408
 */
public class main {
public static void main(String[] args) {

        // membuat objek dari class User
        User dian = new User();

        // menggunakan method setter
        dian.setUsername("dian");
        dian.setPassword("kopiJava");

        // menggunakan method getter
        System.out.println("Username: " + dian.getUsername());
        System.out.println("Password: " + dian.getPassword());
}
}

