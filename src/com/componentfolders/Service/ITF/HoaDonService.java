/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.HDCT;
import com.componentfolders.Model.HoaDon;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface HoaDonService {

    List<HoaDon> getAll();

    List<HDCT> gettimma(String ma);
//    HoaDon getOne(int id);
    List<HoaDon> listHDNgay(String ngayBatDauString, String ngayKetThuc);
}
