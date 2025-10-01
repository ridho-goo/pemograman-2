/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package yafiadyatma._project ;

/**
 *
 * @author pc3
 */

import java.util.Scanner;

class Student {
    String nama;
    int nilai;

    // Constructor
    Student(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Method untuk menampilkan info
    void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);
        if (nilai >= 75) {
            System.out.println("Status: Lulus ");
        } else {
            System.out.println("Status: Tidak Lulus ");
        }
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Manajemen Nilai Siswa ===");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // hapus enter biar tidak nyangkut

        Student[] siswa = new Student[jumlah];

        // Input data siswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData siswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Nilai : ");
            int nilai = input.nextInt();
            input.nextLine();

            siswa[i] = new Student(nama, nilai);
        }

        // Output data siswa
        System.out.println("\n=== Daftar Siswa ===");
        for (int i = 0; i < jumlah; i++) {
            siswa[i].tampilkanInfo();
        }

        input.close();
    }
}
