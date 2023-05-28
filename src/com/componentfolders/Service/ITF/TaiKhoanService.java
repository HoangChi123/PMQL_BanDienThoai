/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.TaiKhoanModel;

/**
 *
 * @author HA NGUYEN
 */
public interface TaiKhoanService {
    public String get(String tk,String mk);
    public Boolean addTK(TaiKhoanModel tk);
    public Boolean updateTK(TaiKhoanModel tk);
    public Boolean deleteTK(TaiKhoanModel tk);
}
