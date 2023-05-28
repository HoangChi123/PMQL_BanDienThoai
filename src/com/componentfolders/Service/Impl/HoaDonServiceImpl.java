/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.HDCT;
import com.componentfolders.Model.HoaDon;
import com.componentfolders.Repo.HoaDonRepository;
import com.componentfolders.Service.ITF.HoaDonService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HoaDonServiceImpl implements HoaDonService{
    private HoaDonRepository hdr = new HoaDonRepository();

    @Override
    public List<HoaDon> getAll() {
        return hdr.getAll();
    }
    

//    @Override
//    public HoaDon getOne(int id) {
//        return hdr.getOne(id);
//    }

    @Override
    public List<HDCT> gettimma(String ma) {
        List<HDCT> listHDCT = new ArrayList<>();
        
        List<HDCT> list = hdr.gettimma(ma);
        for (HDCT hdct : list) {
            listHDCT.add(new HDCT(hdct.getSOLUONG(), hdct.getHd(), hdct.getCtsp(), hdct.getDONGIA()));
        }
        return listHDCT;
    }

    @Override
    public List<HoaDon> listHDNgay(String ngayBatDauString, String ngayKetThuc) {
        return hdr.locTheoNgay(ngayKetThuc, ngayKetThuc);
    }
}
