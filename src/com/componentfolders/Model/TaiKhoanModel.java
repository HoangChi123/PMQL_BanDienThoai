/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

public class TaiKhoanModel {
    private String taikhoan,matkhau,chucvu;

    public TaiKhoanModel(String taikhoan, String matkhau, String chucvu) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.chucvu = chucvu;
    }

    public TaiKhoanModel() {
    }

    

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    
}
