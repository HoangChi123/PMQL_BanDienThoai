/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.Rom;
import com.componentfolders.Repo.RomReponsitory;
import com.componentfolders.Service.ITF.RomService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class RomServiceImpl implements RomService {

    RomReponsitory repon = new RomReponsitory();

    @Override
    public List<Rom> getAllRom() {
        return repon.getAllRom();
    }

    @Override
    public boolean checkTrung(String maRom) {
        for (Rom rom : getAllRom()) {
            if (rom.getMaRom().equals(maRom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addRom(Rom rom) {
        Boolean add = repon.addRom(rom);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updateRom(Rom rom) {
        Boolean update = repon.updateRom(rom);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deleteRom(int id) {
        Boolean delete = repon.deteleRom(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

}
