/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Asus A408
 */
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH HANDPHONE ===");
        System.out.println("1. Xiaomi");
        System.out.println("2. iPhone");
        System.out.println("3. Samsung");
        System.out.println("4. Oppo");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        Phone phone;

        switch (pilih) {
            case 1: phone = new xiaomi(); break;
            case 2: phone = new iPhone(); break;
            case 3: phone = new Samsung(); break;
            case 4: phone = new Oppo(); break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        PhoneUser user = new PhoneUser(phone);

        int menu;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Besarkan volume");
            System.out.println("4. Kecilkan volume");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = input.nextInt();

            switch (menu) {
                case 1: user.turnOnThePhone(); break;
                case 2: user.turnOffThePhone(); break;
                case 3: user.makePhoneLouder(); break;
                case 4: user.makePhoneSilent(); break;
                case 0: System.out.println("Keluar..."); break;
                default: System.out.println("Menu tidak tersedia");
            }

        } while (menu != 0);

    }
}

