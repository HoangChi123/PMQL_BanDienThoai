/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Service.Impl;

import com.componentfolders.Model.TaiKhoanModel;
import com.componentfolders.Repo.TaiKhoanRepo;
import com.componentfolders.Service.ITF.TaiKhoanService;


public class TaiKhoanImpl implements TaiKhoanService{
    TaiKhoanRepo he = new TaiKhoanRepo();
    
    @Override
    public String get(String tk, String mk) {
         return he.get(tk, mk); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean addTK(TaiKhoanModel tk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean updateTK(TaiKhoanModel tk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean deleteTK(TaiKhoanModel tk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
