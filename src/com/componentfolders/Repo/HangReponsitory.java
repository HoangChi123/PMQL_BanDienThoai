/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.Hang;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class HangReponsitory {
        public List<Hang> getAllHang() {
        String sql = "select ID, MAHANG, TENHANG from HANG";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<Hang> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Hang(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory Hang");
        }
        return null;
    }

    public boolean addHang(Hang hang) {
        String sql = "insert into HANG(MAHANG, TENHANG) values (?,?)";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hang.getMaHang());
            ps.setObject(2, hang.getTenHang());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean updateHang(Hang hang) {
        String sql = "update HANG set MAHANG=?, TENHANG=? where ID=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hang.getMaHang());
            ps.setObject(2, hang.getTenHang());
            ps.setObject(3, hang.getId());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean deteleHang(int id) {
        String sql = "delete from HANG where ID= ?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }
}
