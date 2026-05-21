/*
 * File : MysqlMahasiswaService.java
 * Deskripsi : Kelas untuk memodifikasi table mysql
 * Pembuat : Muhammad Rofad Hamdani/24060124130117
 * Tanggal : 14 Mei 2026
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.*;
import static jdbc.utilities.MysqlUtility.getConnection;

/**
 *
 * @author LENOVO
 */
public class MysqlMahasiswaService {
  Connection koneksi = null;

  public MysqlMahasiswaService() {
    koneksi = getConnection();
  }

  public Mahasiswa makeMhsObject() {
    return new Mahasiswa();
  }

  public void add(Mahasiswa mhs) throws SQLException {
    String query = "INSERT INTO mahasiswa (id,nama) VALUES (" + mhs.getId() + ",'" + mhs.getNama() + "')";
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("sukses insert");
    } 
    catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
  }

  public void update(Mahasiswa mhs) throws SQLException {
    String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("sukses update");
    } 
    catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
  }

  public void delete(int id) throws SQLException {
    String query = "DELETE FROM mahasiswa WHERE id = " + id;
    try {
      Statement s = koneksi.createStatement();
      s.executeUpdate(query);
      System.out.println("sukses delete");
    } 
    catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
  }

  public Mahasiswa getById(int id) throws SQLException {
    Mahasiswa mhs = new Mahasiswa();
    String query = "SELECT * FROM mahasiswa WHERE id = " + id;
    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      if (rs.next()) {
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
      }
    } 
    catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
    return mhs;
  }

  public List<Mahasiswa> getAll() throws SQLException {
    List<Mahasiswa> mahasiswaList = new ArrayList<>();
    String query = "SELECT * FROM mahasiswa";
    try {
      Statement s = koneksi.createStatement();
      ResultSet rs = s.executeQuery(query);
      while (rs.next()) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        mahasiswaList.add(mhs);
      }
    } 
    catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
    return mahasiswaList;
  }
}
