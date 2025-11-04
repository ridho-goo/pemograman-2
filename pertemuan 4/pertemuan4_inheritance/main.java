/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_inheritance;

/**
 *
 * @author Dwi
 */
public class main {
    public static void main(String[] args) {
        enemy monster = new enemy ();
        zombie zumbi = new zombie ();
        pocong pocing = new pocong ();
        burung garuda = new burung ();
        
       zumbi.walk();
       pocing.jump();
       garuda.walk();
       garuda.jump();
       garuda.fly();       
        
    }
}
