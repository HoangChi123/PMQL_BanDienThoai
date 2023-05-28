/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.ChiTietSanPham;
import com.componentfolders.Model.HDCT;
import com.componentfolders.Model.HoaDon;
import com.componentfolders.Model.KhachHang;
import com.componentfolders.Model.NhanVien;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HoaDonRepository {

    public List<HoaDon> getAll() {
        List<HoaDon> listHD = new ArrayList<>();
        String query = "SELECT HOADON.ID, NHANVIEN.MANV,  KHACHHANG.MAKH, KHACHHANG.TEN, HOADON.TRANGTHAI, HOADON.TONGTIEN, HOADON.NgayMua, KhachHang.SDT\n"
                + "FROM HOADON JOIN NHANVIEN ON HOADON.IDNV = NHANVIEN.ID JOIN KHACHHANG ON HOADON.IDKH = KHACHHANG.ID";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMAHD(rs.getString(1));
                hoaDon.setTRANGTHAI(rs.getInt(5));
                hoaDon.setTONGTIEN(rs.getDouble(6));
                hoaDon.setNgayMua(rs.getDate(7));

                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(rs.getString(2));
                hoaDon.setNv(nhanVien);

                KhachHang khachHang = new KhachHang();
                khachHang.setMaKH(rs.getString(3));
                khachHang.setTen(rs.getString(4));
                khachHang.setSdt(rs.getString(8));
                hoaDon.setKh(khachHang);

                listHD.add(hoaDon);

            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        }
        return listHD;
    }
    public List<HoaDon> getAllHDCT(int abc) {
        List<HoaDon> listHD = new ArrayList<>();
        String query = "SELECT HDCT.IDHD, HDCT.IDSP,  SANPHAMCT.Tensp, HDCT.DONGIA FROM HDCT JOIN SanPhamCT on HDCT.IDSP = SanPhamCT.ID where HDCT.IDHD = ?";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, abc);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setID(rs.getInt(1));
                hoaDon.setTRANGTHAI(rs.getInt(2));
                hoaDon.setTONGTIEN(rs.getInt(4));
                hoaDon.setMota(rs.getString(3));

                listHD.add(hoaDon);

            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        }
        return listHD;
    }

    public List<HDCT> gettimma(String ma) {
        List<HDCT> getList = new ArrayList<>();
        try {
            String query = "SELECT HOADON.MAHD, SANPHAMCT.MASP,SANPHAMCT.TENSP,HDCT.soluong,HDCT.DonGia FROM HDCT JOIN SANPHAMCT\n"
                    + "				ON HDCT.IDSP = SANPHAMCT.ID\n"
                    + "                    JOIN HOADON ON HDCT.IDHD = HOADON.ID\n"
                    + "                    WHERE HOADON.MAHD = ?";

            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDCT hoaHdct = new HDCT();
                hoaHdct.setSOLUONG(rs.getInt(4));
                hoaHdct.setDONGIA(rs.getDouble(5));

                HoaDon hd = new HoaDon();
                hd.setMAHD(rs.getString(1));
                hoaHdct.setHd(hd);

                ChiTietSanPham ctsp = new ChiTietSanPham();
                ctsp.setMaSanPham(rs.getString(2));
                ctsp.setTenSanPham(rs.getString(3));
                hoaHdct.setCtsp(ctsp);

                getList.add(hoaHdct);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getList;
    }

    public List<HoaDon> locTheoNgay(String ngauBatDau, String ngayKetThuc) {
        List<HoaDon> listHDNgay = new ArrayList<>();
        String sql = "SELECT HOADON.MAHD, NHANVIEN.MANV,  KHACHHANG.MAKH, KHACHHANG.TEN, HOADON.TRANGTHAI, HOADON.TONGTIEN, HOADON.NgayMua, KhachHang.SDT\n"
                + "FROM HOADON JOIN NHANVIEN ON HOADON.IDNV = NHANVIEN.ID JOIN KHACHHANG ON HOADON.IDKH = KHACHHANG.ID WHERE HOADON.NgayMua between ? and ?";
        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ngauBatDau);
            ps.setObject(2, ngayKetThuc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMAHD(rs.getString(1));
                hoaDon.setTRANGTHAI(rs.getInt(5));
                hoaDon.setTONGTIEN(rs.getDouble(6));
                hoaDon.setNgayMua(rs.getDate(7));

                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(rs.getString(2));
                hoaDon.setNv(nhanVien);

                KhachHang khachHang = new KhachHang();
                khachHang.setMaKH(rs.getString(3));
                khachHang.setTen(rs.getString(4));
                khachHang.setSdt(rs.getString(8));
                hoaDon.setKh(khachHang);

                listHDNgay.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi tai respon");
        }
        return listHDNgay;
    }
    public static void main(String[] args) {
        System.out.println(new HoaDonRepository().locTheoNgay("2023-01-01", "2023-04-17"));
    }
//    public HoaDon getOne(int id) {
//        String query = "SELECT [ID]\n"
//                + "      ,[MAHD]\n"
//                + "      ,[TRANGTHAI]\n"
//                + "      ,[IDNV]\n"
//                + "      ,[IDKH]\n"
//                + "      ,[IDKM]\n"
//                + "      ,[TONGTIEN]\n"
//                + "      ,[NgayMua]\n"
//                + "      ,[Mota]\n"
//                + "  FROM [dbo].[HOADON] WHERE ID = ?;";
//        try ( Connection con = DBConnections.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
//            ps.setObject(1, id);
//            ResultSet rs = ps.executeQuery();
//            List<HoaDon> listHD = new ArrayList<>();
//            if (rs.next()) {
//                return new HoaDon(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDouble(7), rs.getDate(8), rs.getString(9));
//            }
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }
}
