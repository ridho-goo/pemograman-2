/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201018;

/**
 *
 * @author fii
 */
public class pbo_motor {
    
    //variabel
    String merk = "";
    String warna = "";
    int cc;
 
    //konstruktor
    public pbo_motor (String merk, String warna, int cc) {
        this.merk = merk;
        this.warna = warna;
        this.cc = cc;   
    }
    
    public void tampilData(){
        System.out.println("merk     :" + merk);
        System.out.println("warna    :" + warna);
        System.out.println("cc       :" + cc   );
       
        
        
    }
    
}
    

