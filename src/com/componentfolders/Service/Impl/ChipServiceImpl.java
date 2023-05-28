/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.Chip;
import com.componentfolders.Repo.ChipReponsitory;
import com.componentfolders.Service.ITF.ChipService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class ChipServiceImpl implements ChipService {

    ChipReponsitory reponsitory = new ChipReponsitory();

    @Override
    public List<Chip> getAllChip() {
        return reponsitory.getAllChip();
    }

    @Override
    public boolean checkTrung(String maChip) {
        for (Chip chip : getAllChip()) {
            if (chip.getMaChip().equals(maChip)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addChip(Chip chip) {
        Boolean add = reponsitory.addChip(chip);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updateChip(Chip chip) {
        Boolean update = reponsitory.updateChip(chip);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deleteChip(int id) {
        Boolean delete = reponsitory.deteleChip(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

}
