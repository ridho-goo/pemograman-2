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
public class daftar_mahasiswa_modifier 

        //untuk memanggil pbo
    {
    public static void main(String[] args)
            
            //objek clas adalah m1
    {
      pbo_mahasiwa_modifier m1 = new pbo_mahasiwa_modifier("22", "dwi", 3.5 );
       
        //hasil fungsi parameter
        //remidi
        //kalau tidak di private banyak yang harus di panggil disini(modifider)
        m1.remidi(0.1);
        m1.tampilData();
        
        //hasil proseudr parameter
        //sertifikat
        System.out.println("sertif saya "+ m1.sertif(10));
         
        //untuk mencetak tulisan dari pbo nama nim ipk + predikat
        System.out.println(m1.predikat());
        
}
    
}
