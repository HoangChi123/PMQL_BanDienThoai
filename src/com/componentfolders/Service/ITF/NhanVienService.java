/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanVienService {

    ArrayList<NhanVien> getAll();

    ArrayList<NhanVien> luuTru();

    String add(NhanVien nv);

    String update(NhanVien nv);

    String xoa(int id);

    String phucHoi(int id);

    List<NhanVien> tkiem(String ma);
}
