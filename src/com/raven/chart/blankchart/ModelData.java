/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.chart.blankchart;


public class ModelData {
    String Month;
    double HD;
    double tien;

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public double getHD() {
        return HD;
    }

    public void setHD(double HD) {
        this.HD = HD;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public ModelData() {
    }

    public ModelData(String Month, double HD, double tien) {
        this.Month = Month;
        this.HD = HD;
        this.tien = tien;
    }
    
}
