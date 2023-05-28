/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.Imel;
import com.componentfolders.Repo.ImelResponsitory;
import com.componentfolders.Service.ITF.ImelService;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public class ImelServiceImpl implements ImelService {

    ImelResponsitory responsitory = new ImelResponsitory();

    @Override
    public List<Imel> getAllImels() {
        return responsitory.getAllImels();
    }

    @Override
    public List<Imel> getAllImelsDelete() {
        return responsitory.getAllImelDelete();
    }

    @Override
    public String add(Imel imel) {
        Boolean add = responsitory.add(imel);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String update(Imel imel) {
        Boolean update = responsitory.update(imel);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String delete(int id) {
        Boolean delete = responsitory.delete(id);
        if (delete) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String phucHoi(int id) {
        Boolean phucHoi = responsitory.phucHoi(id);
        if (phucHoi) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public boolean checkTrung(String imel) {
        for (Imel allImel : responsitory.getAllImels()) {
            if (allImel.getTenImel().equals(imel)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkMa(String ma) {
        for (Imel allImel : responsitory.getAllImels()) {
            if (allImel.getMaImel().equals(ma)) {
                return true;
            }
        }
        return false;
    }
}
