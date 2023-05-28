/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.Pin;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface PinService {

    List<Pin> getAllPin();

    boolean checkTrung(String maPin);

    String addPin(Pin pin);

    String updatePin(Pin pin);

    String deletePin(int id);
}
