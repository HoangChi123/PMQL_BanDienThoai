/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.KhachHang;
import java.util.List;

/**
 *
 * @author fpt
 */
public interface KhachHangService {

    public List<KhachHang> getlAll();

    public String add(KhachHang kh);

    boolean checkTrung(String ma);

    public String update(KhachHang kh);

    public String delete(int id);

    List<KhachHang> TimKiem(String ma);
}

