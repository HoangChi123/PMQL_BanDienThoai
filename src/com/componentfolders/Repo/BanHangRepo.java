/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.ChiTietSanPham;
import com.componentfolders.Model.GioHang;
import com.componentfolders.Model.HoaDonBanHang;
import com.componentfolders.Model.HoaDonChiTietBanHang;
import com.componentfolders.Model.KhuyenMai;
import com.componentfolders.Model.MGGBanHang;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class BanHangRepo {
        private DBConnections connections;
        public ArrayList<ChiTietSanPham> getListSP(){
        ArrayList<ChiTietSanPham> listsp = new ArrayList<>();
        String sql = "Select ID,IDHang,IDRam,IDMS,DonGia,TenSP From sanphamct where TrangThai = 1";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ChiTietSanPham sp = new ChiTietSanPham();
                sp.setId(rs.getInt(1));
                sp.setIdHang(rs.getInt(2));
                sp.setIdRam(rs.getInt(3));
                sp.setIdMauSac(rs.getInt(4));
                sp.setDonGia(rs.getInt(5));
                sp.setTenSanPham(rs.getString(6));

            
                listsp.add(sp);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listsp;
    }
        public ArrayList<ChiTietSanPham> getListSPTK(String txt){
        ArrayList<ChiTietSanPham> listsp = new ArrayList<>();
        String sql = "select SANPHAMCT.ID, SANPHAMCT.IDHANG, SANPHAMCT.IDRAM, SANPHAMCT.IDMS,SANPHAMCT.DONGIA,SANPHAMCT.TENSP from SANPHAMCT Where TRANGTHAI = 1 and ID = ? or IDMS = ? or TENSP = ?";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, txt);
            ps.setObject(2, txt);
            ps.setObject(3, txt);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ChiTietSanPham sp = new ChiTietSanPham();
                sp.setId(rs.getInt(1));
                sp.setIdHang(rs.getInt(2));
                sp.setIdRam(rs.getInt(3));
                sp.setIdMauSac(rs.getInt(4));
                sp.setDonGia(rs.getInt(5));
                sp.setTenSanPham(rs.getString(6));

            
                listsp.add(sp);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listsp;
    }
        public int idhoadon(){
        int a = 0;
        String sql = "select top 1 ID from hoadon order by ID desc";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                a = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return a;
    
    }
        public boolean addhd(HoaDonBanHang hd){
        String sql = "INSERT INTO HoaDon(MaHD, TongTien, IDNV,IDKH, IDKM, NgayMua) VALUES (?, ?,?,?,?,?)";
        try(Connection con = connections.getConnection();) {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setObject(1, hd.getMaHD());
           ps.setObject(2, hd.getTongTien());
           ps.setObject(3, hd.getIdNhanVien());
           ps.setObject(4, hd.getIdKH());
           ps.setObject(5, hd.getIdKM());
           ps.setObject(6, hd.getNgayMua());
           
           ps.executeUpdate();
           return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
             
    }
    public boolean addhdct(HoaDonChiTietBanHang hdct){
        String sql1 = "INSERT INTO HDCT(IDHD,IDSP,SoLuong,DonGia) VALUES (?, ?,?,?)";
        try(Connection con = connections.getConnection();) {
           PreparedStatement ps1 = con.prepareStatement(sql1);
           ps1.setObject(1, hdct.getIDHD());
           ps1.setObject(2, hdct.getIDSP());
           ps1.setInt(3, hdct.getSl());
           ps1.setDouble(4, hdct.getDongia());
           ps1.executeUpdate();
           return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
             
    }
    public boolean UpdateSP(String sp){
        String sql = "UPDATE SanPhamCT SET TrangThai = 0 WHERE ID = ?";
        try(Connection con = connections.getConnection();) {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setObject(1, sp);
           ps.executeUpdate();
           return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
             
    }
    
    public ArrayList<KhuyenMai> MAGG(){
        ArrayList<KhuyenMai> lkm = new ArrayList<>();
        String sql = "select TEN,LoaiGiamGia,GiaTriGiam from KhuyenMai Where TrangThai = 1";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                KhuyenMai km = new KhuyenMai();
                km.setTen(rs.getString(1));
                km.setGiaTriGiam(Integer.parseInt(rs.getString(3)));
                km.setLoaiGiamGia(Integer.parseInt(rs.getString(2)));
                
                lkm.add(km);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lkm;
    
    }
     public ArrayList<KhuyenMai> MAGG2(String IDSP){
        ArrayList<KhuyenMai> lkm = new ArrayList<>();
        String sql = "select TEN,GiaTriGiam from KhuyenMai join SPKM on KhuyenMai.ID = SPKM.IDKM Where SPKM.IDSP =?";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, IDSP);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                KhuyenMai km = new KhuyenMai();
                km.setTen(rs.getString(1));
                km.setGiaTriGiam(Integer.parseInt(rs.getString(2)));   
                lkm.add(km);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lkm;
    
    }
    public ArrayList<MGGBanHang> MAGGSP(int idsp){
        ArrayList<MGGBanHang> lkm = new ArrayList<>();
        String sql = "select IDKM From SPKM Where IDSP = ?";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, idsp);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                MGGBanHang km = new MGGBanHang();
                km.setIDKM(rs.getInt(1));
                lkm.add(km);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lkm;
    
    }
    public int GiaTriGiamSP(String MAKM){
        int gtgg = 0;
            String sql = "select GiaTriGiam From KhuyenMai Where MAKM = ?";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, MAKM);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                gtgg = rs.getInt(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
            
    return gtgg;
    }
    public ArrayList<ChiTietSanPham> getListSPTheoHang(int Hang){
        ArrayList<ChiTietSanPham> listsp = new ArrayList<>();
        String sql = "Select ID,IDHang,IDRam,IDMS,DonGia,TenSP From sanphamct where TrangThai = 1 and IDHang = ?";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, Hang);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ChiTietSanPham sp = new ChiTietSanPham();
                sp.setId(rs.getInt(1));
                sp.setIdHang(rs.getInt(2));
                sp.setIdRam(rs.getInt(3));
                sp.setIdMauSac(rs.getInt(4));
                sp.setDonGia(rs.getInt(5));
                sp.setTenSanPham(rs.getString(6));

            
                listsp.add(sp);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listsp;
    }
    public ArrayList<KhuyenMai> MAKH(){
        ArrayList<KhuyenMai> lkm = new ArrayList<>();
        String sql = "select ID From KhachHang";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                KhuyenMai km = new KhuyenMai();
                km.setMaKM(rs.getString(1));
                
                lkm.add(km);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lkm;
    
    }
    public ArrayList<KhuyenMai> MANV(){
        ArrayList<KhuyenMai> lkm = new ArrayList<>();
        String sql = "select ID From NhanVien";
        try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                KhuyenMai km = new KhuyenMai();
                km.setMaKM(rs.getString(1));
                
                lkm.add(km);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lkm;
    
    }
    
    
        
}

