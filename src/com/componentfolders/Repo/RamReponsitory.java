/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.Ram;
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
public class RamReponsitory {
        public List<Ram> getAllRam() {
        String sql = "select ID, MARAM, DUNGLUONG from RAM";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<Ram> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Ram(rs.getInt(1), rs.getString(2), rs.getInt(3)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory Ram");
        }
        return null;
    }

    public boolean addRam(Ram ram) {
        String sql = "insert into RAM(MARAM, DUNGLUONG) values (?,?)";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ram.getMaRam());
            ps.setObject(2, ram.getDungLuong());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean updateRam(Ram ram) {
        String sql = "update RAM set MARAM=?, DUNGLUONG=? where ID=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ram.getMaRam());
            ps.setObject(2, ram.getDungLuong());
            ps.setObject(3, ram.getId());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean deteleRam(int id) {
        String sql = "delete from RAM where ID= ?";
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
