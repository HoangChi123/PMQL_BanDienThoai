/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.KhachHang;
import com.componentfolders.Repo.KhachHangRepository;
import com.componentfolders.Service.ITF.KhachHangService;
import java.util.List;

/**
 *
 * @author fpt
 */

 public class KhacHangServiceImpl implements KhachHangService {

     KhachHangRepository repo = new KhachHangRepository();

    @Override
    public String add(KhachHang kh) {
        Boolean add = repo.addKH(kh);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String update(KhachHang kh) {
        Boolean update = repo.updateCTSP(kh);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String delete(int id) {
        Boolean delete = repo.deteleCTSP(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public List<KhachHang> TimKiem(String ma) {
        return repo.searchMa(ma);
    }

    @Override
    public boolean checkTrung(String ma) {
        for (KhachHang khachHang : repo.getAllKH()) {
            if (khachHang.getMaKH().equals(ma)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<KhachHang> getlAll() {
        return repo.getAllKH();
    }

}
   

