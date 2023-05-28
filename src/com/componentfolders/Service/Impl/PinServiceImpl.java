/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.Pin;
import com.componentfolders.Repo.PinReponsitory;
import com.componentfolders.Service.ITF.PinService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class PinServiceImpl implements PinService {

    PinReponsitory reponsitory = new PinReponsitory();

    @Override
    public List<Pin> getAllPin() {
        return reponsitory.getAllPin();
    }

    @Override
    public boolean checkTrung(String maPin) {
        for (Pin pin : getAllPin()) {
            if (pin.getMaPin().equals(maPin)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String addPin(Pin pin) {
        Boolean add = reponsitory.addPin(pin);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updatePin(Pin pin) {
        Boolean update = reponsitory.updatePin(pin);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String deletePin(int id) {
        Boolean delete = reponsitory.detelePin(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

}
