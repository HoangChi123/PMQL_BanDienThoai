/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.Imel;
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
public class ImelResponsitory {
    private String addsql = "insert into IMEI(MAIMEI, IMEI, TRANGTHAI) values (?, ?, 0)";
    private String updatesql = "update IMEI set MAIMEI=?, IMEI=? where ID=?";
    private String deletesql = "update IMEI set TRANGTHAI=1 where ID=?";
    private String phuchoisql = "update IMEI set TRANGTHAI=0 where ID=?";

    public List<Imel> getAllImels() {
        String getAll = "select ID, MAIMEI, IMEI, TRANGTHAI, IDSP from IMEI where TRANGTHAI=0";
        System.out.println("chay done dong 28");
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(getAll)) {
            ArrayList<Imel> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            System.out.println("Chay done dong 31");
            while (rs.next()) {
                list.add(new Imel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
                System.out.println("Chay done dong 34");
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai getAllImels Reponsitory");
        }
        return null;
    }

    public List<Imel> getAllImelDelete() {
        String getAllDelete = "select ID, MAIMEI, IMEI, TRANGTHAI, IDSP from IMEI where TRANGTHAI=1";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(getAllDelete)) {
            ArrayList<Imel> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Imel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Loi Tai getAllImelDelete Reponsitory");
        }
        return null;
    }

    public boolean add(Imel imel) {
        String add = addsql;
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(add)) {
            ps.setObject(1, imel.getMaImel());
            ps.setObject(2, imel.getTenImel());
            kiemTra = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Loi tai add reponsitory");
        }
        return kiemTra > 0;
    }

    public boolean update(Imel imel) {
        String update = updatesql;
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(update)) {
            ps.setObject(1, imel.getMaImel());
            ps.setObject(2, imel.getTenImel());
            kiemTra = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Loi tai update reponsitory");
        }
        return kiemTra > 0;
    }

    public boolean delete(int id) {
        String delete = deletesql;
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(delete)) {
            ps.setObject(1, id);
            kiemTra = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Loi Tai delete reponsitory");
        }
        return kiemTra > 0;
    }

    public boolean phucHoi(int id) {
        String phucHoi = phuchoisql;
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(phucHoi)) {
            ps.setObject(1, id);
            kiemTra = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Loi tai phucHoi reponsitory");
        }
        return kiemTra > 0;
    }

    public static void main(String[] args) {
        new ImelResponsitory().getAllImels().forEach(x -> System.out.println(x.toString()));
    }
}
