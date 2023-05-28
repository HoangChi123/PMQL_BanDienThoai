/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.ChiTietSanPham;
import com.componentfolders.Repo.ChiTietSanPhamReponsitory;
import com.componentfolders.Service.ITF.ChiTietSanPhamService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    ChiTietSanPhamReponsitory reponsitory = new ChiTietSanPhamReponsitory();

    @Override
    public List<ChiTietSanPham> getAllCTSP() {
        return reponsitory.getAllCTSP();
    }

    @Override
    public List<ChiTietSanPham> timKiemSP(String tenSP) {
        return reponsitory.timKiemSP(tenSP);
    }

    @Override
    public boolean checkTrung(String maSP) {
        for (ChiTietSanPham ctsp : getAllCTSP()) {
            if (ctsp.getMaSanPham().equals(maSP)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addCTSP(ChiTietSanPham ctsp) {
        Boolean add = reponsitory.addCTSP(ctsp);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updateCTSP(ChiTietSanPham ctsp) {
        Boolean update = reponsitory.updateCTSP(ctsp);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deleteCTSP(int id) {
        Boolean delete = reponsitory.deteleCTSP(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public List<ChiTietSanPham> getAllCTSPLuuTru() {
        return reponsitory.getAllCTSPLuuTru();
    }

    @Override
    public String phucHoi(int idPhucHoi) {
        Boolean phucHoi = reponsitory.phucHoi(idPhucHoi);
        if(phucHoi){
            return "Thanh Cong";
        }else{
            return "That Bai";
        }
    }

}
