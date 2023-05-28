/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

/**
 *
 * @author BuiDucMinh
 */
public class ChiTietSanPham {

    private int id;
    private String maSanPham;
    private String tenSanPham;
    private double donGia;
    private String moTa;
    private String anhSanPham;
    private int soLuong;
    private int trangThai;
    private int idMauSac, idPin, idRam, idRom, idChip, idHang;
    public ChiTietSanPham(int id, String maSanPham, String tenSanPham, double donGia, String moTa, String anhSanPham, int soLuong, int trangThai, int idMauSac, int idPin, int idRam, int idRom, int idChip, int idHang) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.moTa = moTa;
        this.anhSanPham = anhSanPham;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.idMauSac = idMauSac;
        this.idPin = idPin;
        this.idRam = idRam;
        this.idRom = idRom;
        this.idChip = idChip;
        this.idHang = idHang;
    }

    public ChiTietSanPham() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getAnhSanPham() {
        return anhSanPham;
    }

    public void setAnhSanPham(String anhSanPham) {
        this.anhSanPham = anhSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public int getIdPin() {
        return idPin;
    }

    public void setIdPin(int idPin) {
        this.idPin = idPin;
    }

    public int getIdRam() {
        return idRam;
    }

    public void setIdRam(int idRam) {
        this.idRam = idRam;
    }

    public int getIdRom() {
        return idRom;
    }

    public void setIdRom(int idRom) {
        this.idRom = idRom;
    }

    public int getIdChip() {
        return idChip;
    }

    public void setIdChip(int idChip) {
        this.idChip = idChip;
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public String layTrangThai() {
        if (trangThai == 0) {
            return "Con Hang";
        } else {
            return "Het Hang";
        }
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "id=" + id + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", moTa=" + moTa + ", anhSanPham=" + anhSanPham + ", soLuong=" + soLuong + ", trangThai=" + trangThai + ", idMauSac=" + idMauSac + ", idPin=" + idPin + ", idRam=" + idRam + ", idRom=" + idRom + ", idChip=" + idChip + ", idHang=" + idHang + '}';
    }
}
