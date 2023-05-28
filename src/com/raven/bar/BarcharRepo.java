/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.bar;

import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BarcharRepo {
    private DBConnections connection;
    public String XeTop1(){
        String he = "";
        String sql = "select Top 1 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
                    
                    
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getString(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return null;
        }   
      }
    public String XeTop2(){
        String he = "";
        String sql = "select Top 2 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getString(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return null;
        }   
    }
    public String XeTop3(){
        String he = "";
        String sql = "select Top 3 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getString(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return null;
        }   
    }
    public String XeTop4(){
        String he = "";
        String sql = "select Top 4 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getString(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return null;
        }   
    }
    public String XeTop5(){
        String he = "";
        String sql = "select Top 5 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getString(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return null;
        }   
    }
    public int LanthueXeTop1(){
        int he = 0;
        String sql = "select Top 1 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(2);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public int LanthueXeTop2(){
        int he = 0;
        String sql = "select Top 2 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(2);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public int LanthueXeTop3(){
        int he = 0;
        String sql = "select Top 3 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(2);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public int LanthueXeTop4(){
        int he = 0;
        String sql = "select Top 4 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(2);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public int LanthueXeTop5(){
        int he = 0;
        String sql = "select Top 5 SANPHAMCT.TENSP, COUNT(SANPHAMCT.TENSP) from SANPHAMCT join HDCT on SANPHAMCT.ID = HDCT.IDSP Group By SANPHAMCT.TENSP order by Count(SANPHAMCT.tensp) desc";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(2);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public double DoanhThu(){
        double he = 0;
        String sql = "Select SUM(TongTien) from HoaDon";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getDouble(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public int NhanVien(){
        int he = 0;
        String sql = "Select SUM(ID) from NhanVien";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
    public int HD(){
        int he = 0;
        String sql = "Select count(ID) from HoaDOn";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                he = rs.getInt(1);
            }
            return he;
            
        }catch(Exception e){ 
            e.printStackTrace(); 
            return 0;
        }   
    }
}
