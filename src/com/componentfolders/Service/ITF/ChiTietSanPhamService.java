/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.ChiTietSanPham;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface ChiTietSanPhamService {

    List<ChiTietSanPham> getAllCTSP();
    
    List<ChiTietSanPham> getAllCTSPLuuTru();

    List<ChiTietSanPham> timKiemSP(String tenSP);

    boolean checkTrung(String maSP);

    String addCTSP(ChiTietSanPham ctsp);

    String updateCTSP(ChiTietSanPham ctsp);

    String deleteCTSP(int id);
    
    String phucHoi(int idPhucHoi);
}
