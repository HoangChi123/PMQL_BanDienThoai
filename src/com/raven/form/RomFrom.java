/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;

import com.componentfolders.Model.Rom;
import com.componentfolders.Service.ITF.RomService;
import com.componentfolders.Service.Impl.RomServiceImpl;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BuiDucMinh
 */
public class RomFrom extends javax.swing.JFrame {

    /**
     * Creates new form RomFrom
     */
    private RomService romService;
    private DefaultTableModel tableModel;
    private ArrayList<Rom> list;

    public RomFrom() {
        initComponents();
        setLocationRelativeTo(null);
        romService = new RomServiceImpl();
        loadData(list);
    }

    private void loadData(ArrayList<Rom> list) {
        tableModel = (DefaultTableModel) tbrom.getModel();
        tableModel.setRowCount(0);
        for (Rom rom : romService.getAllRom()) {
            tableModel.addRow(new Object[]{
                rom.getId(), rom.getMaRom(), rom.getDungLuong()
            });
        }
    }

    private void mouseClick() {
        int index = tbrom.getSelectedRow();
        lblmarom.setText(tbrom.getValueAt(index, 0).toString());
        txtmarom.setText(tbrom.getValueAt(index, 1).toString());
        txtdungluongrom.setText(tbrom.getValueAt(index, 2).toString());
    }

    private boolean validateFrom(String check) {
        if (txtmarom.getText().isEmpty() || txtdungluongrom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thong Tin Khong Duoc De Trong");
            return false;
        }
        try {
            int dungLuongRom = Integer.parseInt(txtdungluongrom.getText());
            if (dungLuongRom < 0) {
                JOptionPane.showMessageDialog(this, "Rom Khong Ton Tai");
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dung Luong Phai La So");
            return false;
        }
        return true;
    }

    private Rom addFrom() {
        Rom rom = new Rom();
        rom.setMaRom(txtmarom.getText().trim());
        rom.setDungLuong(Integer.parseInt(txtdungluongrom.getText().trim()));
        return rom;
    }

    private Rom updateFrom() {
        Rom rom = new Rom();
        rom.setId(Integer.parseInt(lblmarom.getText().trim()));
        rom.setMaRom(txtmarom.getText().trim());
        rom.setDungLuong(Integer.parseInt(txtdungluongrom.getText().trim()));
        return rom;
    }

    private void addrow() {
        if (romService.checkTrung(txtmarom.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Ma Trung");
            return;
        }
        if (!validateFrom("Add rom")) {
            return;
        }
        String add = romService.addRom(addFrom());
        list = (ArrayList<Rom>) romService.getAllRom();
        loadData(list);
        JOptionPane.showMessageDialog(this, add);
    }

    private void updateRow() {
        int index = tbrom.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Sua");
        } else {
            if (!validateFrom("update rom")) {
                return;
            }
            String update = romService.updateRom(updateFrom());
            list = (ArrayList<Rom>) romService.getAllRom();
            loadData(list);
            JOptionPane.showMessageDialog(this, update);
        }
    }

    private void deleteRow() {
        int index = tbrom.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Xoa");
        } else {
            int luaChon = JOptionPane.showConfirmDialog(this, "Ban Co Chac Chan Muon Xoa Khong", "Thong Bao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (luaChon == JOptionPane.YES_OPTION) {
                String delete = romService.deleteRom(Integer.parseInt(lblmarom.getText().trim()));
                list = (ArrayList<Rom>) romService.getAllRom();
                loadData(list);
                JOptionPane.showMessageDialog(this, delete);
            } else {
            }
        }
    }

    private void newFrom() {
        lblmarom.setText("");
        txtmarom.setText("");
        txtdungluongrom.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmarom = new javax.swing.JTextField();
        txtdungluongrom = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnresert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbrom = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblmarom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ma Rom:");

        jLabel2.setText("Dung Luong:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("THUOC TINH ROM");

        btnadd.setText("THEM");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("CAP NHAT");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("XOA");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnresert.setText("LAM MOI");
        btnresert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresertActionPerformed(evt);
            }
        });

        tbrom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MA ROM", "DUNG LUONG"
            }
        ));
        tbrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbromMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbrom);

        jLabel4.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnadd)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnresert))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmarom)
                                    .addComponent(txtdungluongrom, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblmarom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(lblmarom, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmarom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdungluongrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnresert))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        addrow();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updateRow();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        deleteRow();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresertActionPerformed
        // TODO add your handling code here:
        newFrom();
    }//GEN-LAST:event_btnresertActionPerformed

    private void tbromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbromMouseClicked
        // TODO add your handling code here:
        mouseClick();
    }//GEN-LAST:event_tbromMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnresert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmarom;
    private javax.swing.JTable tbrom;
    private javax.swing.JTextField txtdungluongrom;
    private javax.swing.JTextField txtmarom;
    // End of variables declaration//GEN-END:variables

}
