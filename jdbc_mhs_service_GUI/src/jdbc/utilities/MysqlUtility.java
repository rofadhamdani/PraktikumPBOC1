/*
 * File : MysqlUtility.java
 * Deskripsi : Kelas koneksi ke Mysql
 * Pembuat : Muhammad Rofad Hamdani/24060124130117
 * Tanggal : 14 Mei 2026
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3307/jdbc_mhs";
                // sesuaikan username dan password
                String user = "root";
                String password = "mysqlpw123";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cme) {
                System.out.println("Gagal load driver : " + cme.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
