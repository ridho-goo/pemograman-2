/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_modifier;



/**
 *
 * @author Dwi
 */
 public class pbo_mahasiwa_modifier {
    
     //variabel
     //(modifier) di privat agar tidak ribet di utama
     private String nim = "";
     private String nama = "";
     private double ipk = 0 ;
     private String predikat = "";
     private int jumlahSertif = 0;
    
     //konstruktor method khusus yang di buat untuk objek class (agar urut)
    public pbo_mahasiwa_modifier (String nim,  String nama, double ipk) {
            
            //this untuk memanggil string variabel (tetap sesuai variabel)
            this.nim = nim;
            this.nama = nama;
            this.ipk = ipk;}
    
    //agar bisa di panggil di daftar_mahaiswa
    public void tampilData(){
        System.out.println("nim  : "+nim);
        System.out.println("nama : "+nama);
        System.out.println("ipk  : "+ipk);}
    
    //agar predikat bisa keluar di daftar_mahasiswa
    public String predikat() {
         if (ipk >= 3.50)
                 {predikat = "cumlaude"; }
         else if (ipk >= 3.25 ) 
                 {predikat = "sangat mengagumkan";}
         return predikat; }
     
     
    //prosedur parameter
    //nilai remidi
    public void remidi (double nilai_tambah) {
         ipk = ipk + nilai_tambah;}
     
    //fungsi paramater
    //sertifikat
    public int  sertif (int sertifSaya){
         jumlahSertif = jumlahSertif + sertifSaya;
         return jumlahSertif;}
    
}
