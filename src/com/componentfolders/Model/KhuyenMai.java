/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

import java.util.Date;

/**
 *
 * @author HA NGUYEN
 */
public class KhuyenMai {
    private int ID, LoaiGiamGia,HinhThucGiamGia,GiaTriGiam,trangthai;
    private String MaKM,Ten;
    private Date NgayBatDau,NgayKetThuc;

    public KhuyenMai(int ID, int LoaiGiamGia, int HinhThucGiamGia, int GiaTriGiam, int trangthai, String MaKM, String Ten, Date NgayBatDau, Date NgayKetThuc) {
        this.ID = ID;
        this.LoaiGiamGia = LoaiGiamGia;
        this.HinhThucGiamGia = HinhThucGiamGia;
        this.GiaTriGiam = GiaTriGiam;
        this.trangthai = trangthai;
        this.MaKM = MaKM;
        this.Ten = Ten;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    

    public KhuyenMai() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLoaiGiamGia() {
        return LoaiGiamGia;
    }

    public void setLoaiGiamGia(int LoaiGiamGia) {
        this.LoaiGiamGia = LoaiGiamGia;
    }

    public int getHinhThucGiamGia() {
        return HinhThucGiamGia;
    }

    public void setHinhThucGiamGia(int HinhThucGiamGia) {
        this.HinhThucGiamGia = HinhThucGiamGia;
    }

    public int getGiaTriGiam() {
        return GiaTriGiam;
    }

    public void setGiaTriGiam(int GiaTriGiam) {
        this.GiaTriGiam = GiaTriGiam;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
