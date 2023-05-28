/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.Hang;
import com.componentfolders.Repo.HangReponsitory;
import com.componentfolders.Service.ITF.HangService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class HangServiceImpl implements HangService {

    HangReponsitory reponsitory = new HangReponsitory();

    @Override
    public List<Hang> getAllHang() {
        return reponsitory.getAllHang();
    }

    @Override
    public boolean checkTrung(String maHang) {
        for (Hang hang : getAllHang()) {
            if (hang.getMaHang().equals(maHang)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addHang(Hang hang) {
        Boolean add = reponsitory.addHang(hang);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updateHang(Hang hang) {
        Boolean update = reponsitory.updateHang(hang);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deleteHang(int id) {
        Boolean delete = reponsitory.deteleHang(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

}
