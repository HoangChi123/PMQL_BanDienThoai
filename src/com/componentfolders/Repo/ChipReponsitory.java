/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.Chip;
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
public class ChipReponsitory {
        public List<Chip> getAllChip() {
        String sql = "select ID, MACHIP, TENCHIP from CHIP";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<Chip> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Chip(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory Chip");
        }
        return null;
    }

    public boolean addChip(Chip chip) {
        String sql = "insert into CHIP(MACHIP, TENCHIP) values (?,?)";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, chip.getMaChip());
            ps.setObject(2, chip.getTenChip());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean updateChip(Chip chip) {
        String sql = "update CHIP set MACHIP=?, TENCHIP=? where ID=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, chip.getMaChip());
            ps.setObject(2, chip.getTenChip());
            ps.setObject(3, chip.getId());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean deteleChip(int id) {
        String sql = "delete from ROM where ID= ?";
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
