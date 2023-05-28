/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

import java.util.Date;
import javax.naming.event.ObjectChangeListener;

/**
 *
 * @author DELL
 */
public class HoaDon {

    private int ID;
    private String MAHD;
    private int TRANGTHAI;
    private NhanVien nv;
    private KhachHang kh;
    private KhuyenMai km;
    private double TONGTIEN;
    private Date NgayMua;
    private String Mota;

    public HoaDon() {
    }

    public HoaDon(int ID, String MAHD, int TRANGTHAI, NhanVien nv, KhachHang kh, KhuyenMai km, double TONGTIEN, Date NgayMua, String Mota) {
        this.ID = ID;
        this.MAHD = MAHD;
        this.TRANGTHAI = TRANGTHAI;
        this.nv = nv;
        this.kh = kh;
        this.km = km;
        this.TONGTIEN = TONGTIEN;
        this.NgayMua = NgayMua;
        this.Mota = Mota;
    }

    public HoaDon(String MAHD, int TRANGTHAI, NhanVien nv, KhachHang kh, double TONGTIEN, Date NgayMua) {
        this.MAHD = MAHD;
        this.TRANGTHAI = TRANGTHAI;
        this.nv = nv;
        this.kh = kh;
        this.TONGTIEN = TONGTIEN;
        this.NgayMua = NgayMua;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public KhuyenMai getKm() {
        return km;
    }

    public void setKm(KhuyenMai km) {
        this.km = km;
    }

    public double getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(double TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date NgayMua) {
        this.NgayMua = NgayMua;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "ID=" + ID + ", MAHD=" + MAHD + ", TRANGTHAI=" + TRANGTHAI + ", nv=" + nv + ", kh=" + kh + ", km=" + km + ", TONGTIEN=" + TONGTIEN + ", NgayMua=" + NgayMua + ", Mota=" + Mota + '}';
    }

    

}
