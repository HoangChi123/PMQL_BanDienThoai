/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.Ram;
import com.componentfolders.Repo.RamReponsitory;
import com.componentfolders.Service.ITF.RamService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class RamServiceImpl implements RamService {

    RamReponsitory reponsitory = new RamReponsitory();

    @Override
    public List<Ram> getAllRam() {
        return reponsitory.getAllRam();
    }

    @Override
    public boolean checkTrung(String maRam) {
        for (Ram ram : getAllRam()) {
            if (ram.getMaRam().equals(maRam)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addRam(Ram ram) {
        Boolean add = reponsitory.addRam(ram);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updateRam(Ram ram) {
        Boolean update = reponsitory.updateRam(ram);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deleteRam(int id) {
        Boolean delete = reponsitory.deteleRam(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }
}
