/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.componentfolders.Service.ITF;

import com.componentfolders.Model.Imel;
import java.util.List;

/**
 *
 * @author BuiDucMinh
 */
public interface ImelService {

    List<Imel> getAllImels();

    List<Imel> getAllImelsDelete();

    String add(Imel imel);

    String update(Imel imel);

    String delete(int id);

    String phucHoi(int id);

    boolean checkTrung(String imel);
    
    boolean checkMa(String ma);
}
