/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

import java.util.Date;



/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private int id;
    private String maNV;
    private String ten;
    private int gioiTinh ;
    private int chucVu;
    private String eMail;
    private String taiKhoan;
    private String matKhau;
    private String queQuan;
    private int trangThai;
    private Date ngaySinh;

    public NhanVien() {
    }

    public NhanVien( int id,String maNV, String ten, int gioiTinh, int chucVu, String eMail, String taiKhoan, String matKhau, String queQuan, int trangThai, Date ngaySinh) {
        this.id = id;
        this.maNV = maNV;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.eMail = eMail;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.queQuan = queQuan;
        this.trangThai = trangThai;
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void isGioiTinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", maNV=" + maNV + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", chucVu=" + chucVu + ", eMail=" + eMail + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", queQuan=" + queQuan + ", trangThai=" + trangThai + ", ngaySinh=" + ngaySinh + '}';
    }

   
           
}
