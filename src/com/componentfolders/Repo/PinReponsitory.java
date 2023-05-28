/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.Pin;
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
public class PinReponsitory {
        public List<Pin> getAllPin() {
        String sql = "select ID, MAPIN, TENPIN from PIN";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<Pin> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Pin(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory Pin");
        }
        return null;
    }

    public boolean addPin(Pin pin) {
        String sql = "insert into PIN(MAPIN, TENPIN) values (?,?)";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, pin.getMaPin());
            ps.setObject(2, pin.getTenPin());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean updatePin(Pin pin) {
        String sql = "update PIN set MAPIN=?, TENPIN=? where ID=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, pin.getMaPin());
            ps.setObject(2, pin.getTenPin());
            ps.setObject(3, pin.getId());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean detelePin(int id) {
        String sql = "delete from PIN where ID= ?";
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
