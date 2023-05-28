/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

/**
 *
 * @author BuiDucMinh
 */
public class Rom {

    private int id;
    private String maRom;
    private int dungLuong;

    public Rom(int id, String maRom, int dungLuong) {
        this.id = id;
        this.maRom = maRom;
        this.dungLuong = dungLuong;
    }

    public Rom() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaRom() {
        return maRom;
    }

    public void setMaRom(String maRom) {
        this.maRom = maRom;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public String toString() {
        return "Rom{" + "dungLuong=" + dungLuong + '}';
    }
    
}
