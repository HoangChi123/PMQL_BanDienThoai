/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.Chip;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface ChipService {

    List<Chip> getAllChip();

    boolean checkTrung(String maChip);

    String addChip(Chip chip);

    String updateChip(Chip chip);

    String deleteChip(int id);
}
