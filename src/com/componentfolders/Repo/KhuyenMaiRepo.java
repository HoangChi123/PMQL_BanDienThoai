/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.KMSP;
import com.componentfolders.Model.KhuyenMai;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HA NGUYEN
 */
public class KhuyenMaiRepo {
      private DBConnections connections;
      
      public ArrayList<KhuyenMai> GetListKM(){
          ArrayList<KhuyenMai> listkm = new ArrayList<>();
          String sql = "Select * from Khuyenmai where trangthai = 1";
          try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                KhuyenMai kh = new KhuyenMai();
                 kh.setID(rs.getInt(1));
                 kh.setMaKM(rs.getString(2));
                 kh.setTen(rs.getString(3));
                 kh.setNgayBatDau(rs.getDate(4));
                 kh.setNgayKetThuc(rs.getDate(5));
                 kh.setLoaiGiamGia(rs.getInt(6));
                 kh.setHinhThucGiamGia(rs.getInt(7));
                 kh.setGiaTriGiam(rs.getInt(8));
                 kh.setTrangthai(rs.getInt(9));
                 listkm.add(kh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
          return listkm;
      
      }
      public ArrayList<KMSP> GetListSP(){
          ArrayList<KMSP> listsp = new ArrayList<>();
          String sql = "Select ID, TenSP, IDHang from SanPhamCT where trangthai = 1";
          try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                KMSP kh = new KMSP();
                 kh.setIDSP(rs.getInt(1));
                 kh.setTenSP(rs.getString(2));
                 kh.setIDHang(rs.getInt(3));
                 listsp.add(kh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
          return listsp;
      }
      public boolean addKMHD(KhuyenMai hd){
         String sql = "INSERT INTO KhuyenMai(MaKM, Ten, NgayBD,NgayKT, LoaiGiamGia, HinhThucGiamGia,GiaTriGiam, TrangThai) VALUES (?, ?,?,?,?,?,?,1)";
        try(Connection con = connections.getConnection();) {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setObject(1, hd.getMaKM());
           ps.setObject(2, hd.getMaKM());
           ps.setObject(3, hd.getNgayBatDau());
           ps.setObject(4, hd.getNgayKetThuc());
           ps.setObject(5, hd.getLoaiGiamGia());
           ps.setObject(6, hd.getLoaiGiamGia());
           ps.setObject(7, hd.getGiaTriGiam());
           
           ps.executeUpdate();
           return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
          
      }
      public int GETMGG(){
          int a = 0;
        String sql = "select top 1 ID from KhuyenMai Where LoaiGiamGia = 2 order by ID desc";
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
      public boolean AddSPSALE(int MSP,int MKM){
        String sql = "INSERT INTO SPKM VALUES (?, ?)";
        try(Connection con = connections.getConnection();) {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setObject(1, MSP);
           ps.setObject(2, MKM);
           
           ps.executeUpdate();
           return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
          
      }
}
