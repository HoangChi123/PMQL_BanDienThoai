/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.KhachHang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.componentfolders.Utilities.DBConnections;

/**
 *
 * @author fpt
 */
public class KhachHangRepository {

    public List<KhachHang> getAllKH() {
        String sql = "select ID, MAKH, TEN, GIOITINH, EMAIL, QUEQUAN, NGAYSINH from KHACHHANG";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<KhachHang> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory KhachHang");
        }
        return null;
    }

    public ArrayList<KhachHang> searchMa(String ma) {

        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT*FROM KHACHHANG WHERE MAKH like ?";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = DBConnections.getDataFromQuery(sql, ma);
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory ");
        }
        return null;
    }

    public boolean addKH(KhachHang kh) {
        String sql = "Insert into KHACHHANG(MAKH,TEN,GIOITINH,NGAYSINH,QUEQUAN,EMAIL) values(?,?,?,?,?,?)";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, kh.getMaKH());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getGioiTinh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getQueQuan());
            ps.setObject(6, kh.getEmail());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean updateCTSP(KhachHang kh) {
        String sql = "UPDATE KHACHHANG SET TEN=?, MAKH=?, GIOITINH=?, NGAYSINH=?,QUEQUAN=?,EMAIL=? where ID=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, kh.getTen());
            ps.setObject(2, kh.getMaKH());
            ps.setObject(3, kh.getGioiTinh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getQueQuan());
            ps.setObject(6, kh.getEmail());
            ps.setObject(7, kh.getId());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Update Respon");
        }
        return kiemTra > 0;
    }

    public boolean deteleCTSP(int id) {
        String sql = "DELETE KHACHHANG where Id=?";
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
