/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

/**
 *
 * @author BuiDucMinh
 */
public class Ram {
    private int id;
    private String maRam;
    private int dungLuong;

    public Ram(int id, String maRam, int dungLuong) {
        this.id = id;
        this.maRam = maRam;
        this.dungLuong = dungLuong;
    }

    public Ram() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaRam() {
        return maRam;
    }

    public void setMaRam(String maRam) {
        this.maRam = maRam;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public String toString() {
        return "Ram{" + "dungLuong=" + dungLuong + '}';
    }    
}
