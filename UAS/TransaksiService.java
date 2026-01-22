/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3r;

/**
 *
 * @author x260
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class TransaksiService {

    Connection con;
    public TransaksiService(Connection con) {
        this.con = con;
    }

    public void beliProduk(int idProduk) {
        try {
            con.setAutoCommit(false); 
            String cekSql = "SELECT stok, harga FROM produktoko WHERE id = ?";
            PreparedStatement cek = con.prepareStatement(cekSql);
            cek.setInt(1, idProduk);
            ResultSet rs = cek.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Produk tidak ditemukan");
                con.rollback();
                return;
            }
            int stok = rs.getInt("stok");
            long harga = rs.getLong("harga");
            if (stok <= 0) {
                JOptionPane.showMessageDialog(null, "Stok habis");
                con.rollback();
                return;
            }

            String updateStok = "UPDATE produktoko SET stok = stok - 1 WHERE id = ?";
            PreparedStatement up = con.prepareStatement(updateStok);
            up.setInt(1, idProduk);
            up.executeUpdate();

            String insertTrans = "INSERT INTO transaksi "
                    + "(id_produk, jumlah, totalharga, tanggal) "
                    + "VALUES (?, ?, ?, NOW())";

            PreparedStatement ins = con.prepareStatement(insertTrans);
            ins.setInt(1, idProduk);
            ins.setInt(2, 1);
            ins.setLong(3, harga);
            ins.executeUpdate();

            con.commit(); 
            JOptionPane.showMessageDialog(null, "Pembelian berhasil");

        } catch (Exception e) {
            try {
                con.rollback(); 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (Exception e) {
            }
        }
    }
}
