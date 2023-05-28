/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.Ram;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface RamService {

    List<Ram> getAllRam();

    boolean checkTrung(String maRam);

    String addRam(Ram ram);

    String updateRam(Ram ram);

    String deleteRam(int id);
}
