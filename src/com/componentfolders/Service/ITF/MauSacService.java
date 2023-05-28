/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.MauSac;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface MauSacService {

    List<MauSac> getAllMS();

    boolean checkTrung(String maMauSac);

    String addMS(MauSac mauSac);

    String updateMS(MauSac mauSac);

    String deleteMS(int id);
}
