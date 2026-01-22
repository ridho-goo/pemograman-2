/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3r;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author x260
 */
public class isertData {
    koneksi konek = new koneksi();
    public void insertProduk(int kode, String produkbarang,int stok, long harga) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "insert into produktoko values('" + kode + "','" + produkbarang + "','" + stok + "','" + harga + "')";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
