/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3r;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author x260
 */
public class koneksi {
    Connection con = null;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/produk";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
//            JOptionPane.showMessageDialog(null, "Sukses Koneksi");
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
        }
    }
    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public static void main(String[] args) {
//        koneksi sambung = new koneksi();
//        sambung.koneksi();
//    }
}
