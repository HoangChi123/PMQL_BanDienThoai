/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Model;

/**
 *
 * @author BuiDucMinh
 */
public class Imel {

    private int id;
    private String maImel;
    private String tenImel;
    private int TrangThai;
    private int idSP;

    public Imel(int id, String maImel, String tenImel, int TrangThai, int idSP) {
        this.id = id;
        this.maImel = maImel;
        this.tenImel = tenImel;
        this.TrangThai = TrangThai;
        this.idSP = idSP;
    }

    public Imel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaImel() {
        return maImel;
    }

    public void setMaImel(String maImel) {
        this.maImel = maImel;
    }

    public String getTenImel() {
        return tenImel;
    }

    public void setTenImel(String tenImel) {
        this.tenImel = tenImel;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    @Override
    public String toString() {
        return "Imel{" + "id=" + id + ", maImel=" + maImel + ", tenImel=" + tenImel + ", TrangThai=" + TrangThai + ", idSP=" + idSP + '}';
    }
}
