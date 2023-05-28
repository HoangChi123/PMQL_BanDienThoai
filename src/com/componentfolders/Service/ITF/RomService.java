/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.Rom;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface RomService {

    List<Rom> getAllRom();

    boolean checkTrung(String maRom);

    String addRom(Rom rom);

    String updateRom(Rom rom);

    String deleteRom(int id);
}
