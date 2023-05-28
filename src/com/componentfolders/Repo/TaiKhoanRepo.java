/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.TaiKhoanModel;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TaiKhoanRepo {
    private DBConnections connections;
    public String get(String tk, String mk) {
        TaiKhoanModel g = new TaiKhoanModel();
        String sql = "Select chucvu from NhanVien where taikhoan = ? and matkhau = ?";
        try (Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, tk);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                if(rs.getInt(1)== 0){
                    g.setChucvu("MANAGER");
                }else{
                    g.setChucvu("STAFF");
                }
                
                
            }
            System.out.println(g.getChucvu());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g.getChucvu();

    }
}
