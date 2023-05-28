/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author HA NGUYEN
 */
public interface KhuyenMaiService {
    public ArrayList<KhuyenMai> getList();
    public Boolean addKM(KhuyenMai km);
    public Boolean updateKM(KhuyenMai km);
    public Boolean deleteKM(KhuyenMai km);
    public Boolean KhoiPhucKM(KhuyenMai km);
    public ArrayList<KhuyenMai> SearchKM(String id);
}
