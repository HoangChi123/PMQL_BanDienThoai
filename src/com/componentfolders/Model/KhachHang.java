/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

/**
 *
 * @author fpt
 */
public class KhachHang {

    private int id;
    private String maKH;
    private String ten;
    private int gioiTinh =0;
    private String email,sdt;
    private String queQuan;
    private String ngaySinh;

    public KhachHang(int id, String maKH, String ten, int gioiTinh, String email, String queQuan, String ngaySinh) {
        this.id = id;
        this.maKH = maKH;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }
    public String getSdt(){
        return sdt;
    }
    public void setSdt(){
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", maKH=" + maKH + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", email=" + email + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + '}';
    }

    public KhachHang() {
    }
    public String laygt(){
        if(gioiTinh==0){
           return "Nữ";
        }else{
           return "Nam"; 
        }
    }

}

