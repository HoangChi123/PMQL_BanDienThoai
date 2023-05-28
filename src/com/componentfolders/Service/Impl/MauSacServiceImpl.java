/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.MauSac;
import com.componentfolders.Repo.MauSacReponsitory;
import com.componentfolders.Service.ITF.MauSacService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class MauSacServiceImpl implements MauSacService {

    MauSacReponsitory reponsitory = new MauSacReponsitory();

    @Override
    public List<MauSac> getAllMS() {
        return reponsitory.getAllMS();
    }

    @Override
    public boolean checkTrung(String maMauSac) {
        for (MauSac mauSac : getAllMS()) {
            if (mauSac.getMaMauSac().equals(maMauSac)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addMS(MauSac mauSac) {
        Boolean add = reponsitory.addMS(mauSac);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updateMS(MauSac mauSac) {
        Boolean update = reponsitory.updateMS(mauSac);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deleteMS(int id) {
        Boolean delete = reponsitory.deteleMS(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

}
