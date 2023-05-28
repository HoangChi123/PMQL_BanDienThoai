/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class HDCT {
    private int ID;
    private int SOLUONG;
    private HoaDon hd;
    private ChiTietSanPham ctsp;
    private double DONGIA;
    private int TrangThai;
    private Date NgayMua;

    public HDCT() {
    }

    public HDCT(int SOLUONG, HoaDon hd, ChiTietSanPham ctsp, double DONGIA) {
        this.SOLUONG = SOLUONG;
        this.hd = hd;
        this.ctsp = ctsp;
        this.DONGIA = DONGIA;
    }

    
    public HDCT(int ID, int SOLUONG, HoaDon hd, ChiTietSanPham ctsp, double DONGIA, int TrangThai, Date NgayMua) {
        this.ID = ID;
        this.SOLUONG = SOLUONG;
        this.hd = hd;
        this.ctsp = ctsp;
        this.DONGIA = DONGIA;
        this.TrangThai = TrangThai;
        this.NgayMua = NgayMua;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    public ChiTietSanPham getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSanPham ctsp) {
        this.ctsp = ctsp;
    }

    public double getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(double DONGIA) {
        this.DONGIA = DONGIA;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date NgayMua) {
        this.NgayMua = NgayMua;
    }

//     public double getThanhTien(){
//        return DONGIA*SOLUONG;
//    }

    

    
}
