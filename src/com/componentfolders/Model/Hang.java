/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

/**
 *
 * @author BuiDucMinh
 */
public class Hang {
    private int id;
    private String maHang;
    private String tenHang;

    public Hang(int id, String maHang, String tenHang) {
        this.id = id;
        this.maHang = maHang;
        this.tenHang = tenHang;
    }

    public Hang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    @Override
    public String toString() {
        return tenHang;
    }
    
}
