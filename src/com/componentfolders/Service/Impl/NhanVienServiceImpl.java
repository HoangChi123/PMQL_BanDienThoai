/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.NhanVien;
import com.componentfolders.Repo.NhanVienRepo;
import com.componentfolders.Service.ITF.NhanVienService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienServiceImpl implements NhanVienService {

    NhanVienRepo nvRepo = new NhanVienRepo();

    @Override
    public ArrayList<NhanVien> getAll() {
        return nvRepo.getAll();
    }

    @Override
    public ArrayList<NhanVien> luuTru() {
        return nvRepo.luuTru();
    }

    @Override
    public String add(NhanVien nv) {
        Boolean add = nvRepo.add(nv);
        if (add) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public String update(NhanVien nv) {
        Boolean update = nvRepo.update(nv);
        if (update) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public String xoa(int id) {
        Boolean xoa = nvRepo.xoa(id);
        if (xoa) {
            return "Thành công";
        } else {
            return "Thất bại";
        }

    }

    @Override
    public String phucHoi(int id) {
        Boolean phucHoi = nvRepo.phucHoi(id);
        if (phucHoi) {
            return "Thành công";
        } else {
            return "Thất bại";
        }

    }

    @Override
    public List<NhanVien> tkiem(String ma) {
       return nvRepo.tkiem(ma);
    }

   




    

}
