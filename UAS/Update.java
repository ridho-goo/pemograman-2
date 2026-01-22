/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3r;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author x260
 */
public class Update {

    koneksi konek = new koneksi();

    public void updateProduk(int id, String produkbarang, int stok, long harga) {
        try {
            konek.koneksi();

            String sql = "UPDATE produktoko SET "
                    + "produkbarang = ?, "
                    + "stok = ?, "
                    + "harga = ? "
                    + "WHERE id = ?";

            PreparedStatement pst = konek.con.prepareStatement(sql);
            pst.setString(1, produkbarang);
            pst.setInt(2, stok);
            pst.setLong(3, harga);
            pst.setInt(4, id);

            int hasil = pst.executeUpdate();

            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
            } else {
                JOptionPane.showMessageDialog(null, "ID tidak ditemukan");
            }

            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
