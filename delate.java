/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3r;

import java.sql.Statement;

/**
 *
 * @author x260
 */
public class delate {

    koneksi konek = new koneksi();

    public void deleteData(int id) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from produktoko where id = '" + id + "'";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {

        }
    }

    public void hapusSemua() {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "DELETE FROM transaksi";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {

        }
    }
}
