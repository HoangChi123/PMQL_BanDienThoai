/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.Hang;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface HangService {

    List<Hang> getAllHang();

    boolean checkTrung(String maHang);

    String addHang(Hang hang);

    String updateHang(Hang hang);

    String deleteHang(int id);
}
