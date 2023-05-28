/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.ChiTietSanPham;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BuiDucMinh
 */
public class ChiTietSanPhamReponsitory {

    public List<ChiTietSanPham> getAllCTSP() {
        String sql = "select ID, MASP, TENSP, DONGIA, MOTA, URLANH, SOLUONG, TRANGTHAI, IDMS, IDPIN, IDRAM, IDROM, IDCHIP, IDHANG from SANPHAMCT where TRANGTHAI=0";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<ChiTietSanPham> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietSanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory CTSP");
        }
        return null;
    }

    public List<ChiTietSanPham> getAllCTSPLuuTru() {
        String sql = "select ID, MASP, TENSP, DONGIA, MOTA, URLANH, SOLUONG, TRANGTHAI, IDMS, IDPIN, IDRAM, IDROM, IDCHIP, IDHANG from SANPHAMCT where TRANGTHAI=1";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<ChiTietSanPham> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ChiTietSanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14)));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Loi Tai Reponsitory CTSP");
        }
        return null;
    }

    public List<ChiTietSanPham> timKiemSP(String tenSP) {
        List<ChiTietSanPham> list = new ArrayList<>();
        String sql = "select ID, MASP, TENSP, DONGIA, MOTA, URLANH, SOLUONG, TRANGTHAI, IDMS, IDPIN, IDRAM, IDROM, IDCHIP, IDHANG from SANPHAMCT where TENSP like ?";
        try {
            ResultSet rs = DBConnections.getDataFromQuery(sql, tenSP);
            while (rs.next()) {
                list.add(new ChiTietSanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSanPham.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Loi Tai Tim Kiem Reponsitory");
            System.out.println(ex);
        }
        return list;
    }

    public boolean addCTSP(ChiTietSanPham ctsp) {
        String sql = "insert into SANPHAMCT(MASP, TENSP, DONGIA, MOTA, URLANH, SOLUONG, TRANGTHAI, IDMS, IDPIN, IDRAM, IDROM, IDCHIP, IDHANG) values (?,?,?,?,?,?,0,?,?,?,?,?,?)";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ctsp.getMaSanPham());
            ps.setObject(2, ctsp.getTenSanPham());
            ps.setObject(3, ctsp.getDonGia());
            ps.setObject(4, ctsp.getMoTa());
            ps.setObject(5, ctsp.getAnhSanPham());
            ps.setObject(6, ctsp.getSoLuong());
            ps.setObject(7, ctsp.getIdMauSac());
            ps.setObject(8, ctsp.getIdPin());
            ps.setObject(9, ctsp.getIdRam());
            ps.setObject(10, ctsp.getIdRom());
            ps.setObject(11, ctsp.getIdChip());
            ps.setObject(12, ctsp.getIdHang());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean updateCTSP(ChiTietSanPham ctsp) {
        String sql = "update SANPHAMCT set MASP=?, TENSP=?, DONGIA=?, MOTA=?, URLANH=?, SOLUONG=?, IDMS=?, IDPIN=?, IDRAM=?, IDROM=?, IDCHIP=?, IDHANG=? where ID=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ctsp.getMaSanPham());
            ps.setObject(2, ctsp.getTenSanPham());
            ps.setObject(3, ctsp.getDonGia());
            ps.setObject(4, ctsp.getMoTa());
            ps.setObject(5, ctsp.getAnhSanPham());
            ps.setObject(6, ctsp.getSoLuong());
            ps.setObject(7, ctsp.getIdMauSac());
            ps.setObject(8, ctsp.getIdPin());
            ps.setObject(9, ctsp.getIdRam());
            ps.setObject(10, ctsp.getIdRom());
            ps.setObject(11, ctsp.getIdChip());
            ps.setObject(12, ctsp.getIdHang());
            ps.setObject(13, ctsp.getId());
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean deteleCTSP(int id) {
        String sql = "update SANPHAMCT set TRANGTHAI=1 where Id=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            kiemTra = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public boolean phucHoi(int idPhuHoi) {
        String sql = "update SANPHAMCT set TRANGTHAI=0 where Id=?";
        int kiemTra = 0;
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, idPhuHoi);
            kiemTra = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return kiemTra > 0;
    }

    public static void main(String[] args) {
        new ChiTietSanPhamReponsitory().getAllCTSP().forEach(x -> System.out.println(x.toString()));
    }
}
