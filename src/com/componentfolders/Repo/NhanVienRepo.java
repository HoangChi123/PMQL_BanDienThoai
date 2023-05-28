/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.NhanVien;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepo {

    private DBConnections connection;

    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> getList = new ArrayList<>();
        String sql = "select ID,MANV,TEN,GIOITINH,CHUCVU,EMAIL,TAIKHOAN,MATKHAU,QUEQUAN,TRANGTHAI,NGAYSINH from NHANVIEN WHERE TRANGTHAI = 0";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                getList.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getDate(11)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return getList;
    }

    public ArrayList<NhanVien> luuTru() {
        ArrayList<NhanVien> getList = new ArrayList<>();
        String sql = "select ID,MANV,TEN,GIOITINH,CHUCVU,EMAIL,TAIKHOAN,MATKHAU,QUEQUAN,TRANGTHAI,NGAYSINH from NHANVIEN where TRANGTHAI = 1";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                getList.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getDate(11)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return getList;
    }
    public List<NhanVien> tkiem(String ma){
        List<NhanVien> nv = new ArrayList<>();
        String sql = "select ID,MANV,TEN,GIOITINH,CHUCVU,EMAIL,TAIKHOAN,MATKHAU,QUEQUAN,TRANGTHAI,NGAYSINH from NHANVIEN WHERE MANV LIKE ?";
        try {
            ResultSet rs = DBConnections.getDataFromQuery(sql, ma);
            while (rs.next()) {
                nv.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getDate(11)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  nv;
    }
    
    

    public boolean add(NhanVien nv) {
        String sql = "INSERT INTO NHANVIEN(MANV,TEN,GIOITINH,CHUCVU,EMAIL,TAIKHOAN,MATKHAU,QUEQUAN,TRANGTHAI, NGAYSINH) VALUES (?, ?,? ,?, ?, ?,?,?,0,?)";
        int check = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.getChucVu());
            ps.setObject(5, nv.geteMail());
            ps.setObject(6, nv.getTaiKhoan());
            ps.setObject(7, nv.getMatKhau());
            ps.setObject(8, nv.getQueQuan());
            ps.setObject(9, nv.getNgaySinh());
            check = ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(NhanVien nv) {
        String sql = "UPDATE NHANVIEN SET MANV =?,TEN = ?,GIOITINH = ?,CHUCVU =?,EMAIL=?,TAIKHOAN=?,MATKHAU=?,QUEQUAN=?, NGAYSINH=? ,TRANGTHAI=0 WHERE ID=?";
        int check = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.getChucVu());
            ps.setObject(5, nv.geteMail());
            ps.setObject(6, nv.getTaiKhoan());
            ps.setObject(7, nv.getMatKhau());
            ps.setObject(8, nv.getQueQuan());
            ps.setObject(9, nv.getNgaySinh());
              ps.setObject(10, nv.getId());
           
            
            check = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return check > 0;
    }

    public boolean xoa(int id) {
        String sql = "UPDATE NHANVIEN SET TRANGTHAI=1 WHERE ID =?";

        int check = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return check > 0;
    }

    public boolean phucHoi(int id) {
        String sql = "UPDATE NHANVIEN SET TRANGTHAI = 0  WHERE ID=? ";
        int check = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new NhanVienRepo().luuTru().forEach(x-> System.out.println(x.toString()));
    }
}
