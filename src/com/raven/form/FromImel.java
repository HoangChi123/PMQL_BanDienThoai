/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;

import com.componentfolders.Model.Imel;
import com.componentfolders.Service.ITF.ImelService;
import com.componentfolders.Service.Impl.ImelServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BuiDucMinh
 */
public class FromImel extends javax.swing.JFrame {

    /**
     * Creates new form FromImel
     */
    private ArrayList<Imel> list = new ArrayList<>();
    private ImelService service;
    private DefaultTableModel dtm;
    private final String number = "([0-9]{9,10})\\\\b";

    public FromImel() {
        initComponents();
        service = new ImelServiceImpl();
        setLocationRelativeTo(null);
        loadData(list);
        loadDataRemove(list);
    }

    private void loadData(ArrayList<Imel> list) {
        dtm = (DefaultTableModel) tbimel.getModel();
        dtm.setRowCount(0);
        System.out.println("chay done dong 36");
        for (Imel imel : service.getAllImels()) {
            System.out.println("chay done dong 38");
            dtm.addRow(new Object[]{
                imel.getId(), imel.getMaImel(), imel.getTenImel()
            });
        }
    }

    private void loadDataRemove(List<Imel> list) {
        dtm = (DefaultTableModel) tbimeldelete.getModel();
        dtm.setRowCount(0);
        for (Imel allImel : service.getAllImelsDelete()) {
            dtm.addRow(new Object[]{
                allImel.getId(), allImel.getMaImel(), allImel.getTenImel()
            });
        }
    }

    private void mouseClick() {
        int index = tbimel.getSelectedRow();
        lblid.setText(tbimel.getValueAt(index, 0).toString());
        txtmaimel.setText(tbimel.getValueAt(index, 1).toString());
        txttenimel.setText(tbimel.getValueAt(index, 2).toString());
    }

    private void mouseClickDelete() {
        int index = tbimeldelete.getSelectedRow();
        lblid.setText(tbimeldelete.getValueAt(index, 0).toString());
    }

    private boolean validateFrom(String check) {
        if (txtmaimel.getText().isEmpty() || txttenimel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thong Tin Trong");
            return false;
        }
        if (txttenimel.getText().trim().equals(number)) {
            JOptionPane.showMessageDialog(this, "Imel Phai La So");
            return false;
        }
        if (txttenimel.getText().trim().length() < 13) {
            JOptionPane.showMessageDialog(this, "Imel Phai la 13 so");
            return false;
        }
        if (txttenimel.getText().trim().length() > 13) {
            JOptionPane.showMessageDialog(this, "Imel Phai la 13 so");
            return false;
        }

        return true;
    }

    private Imel addfrom() {
        Imel imel = new Imel();
        imel.setMaImel(txtmaimel.getText().trim());
        imel.setTenImel(txttenimel.getText().trim());
        return imel;
    }

    private Imel updatefrom() {
        Imel imel = new Imel();
        imel.setId(Integer.parseInt(lblid.getText().trim()));
        imel.setMaImel(txtmaimel.getText().trim());
        imel.setTenImel(txttenimel.getText().trim());
        return imel;
    }

    private void add() {
        if (service.checkMa(txtmaimel.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Ma Trung");
            return;
        }
        if (service.checkTrung(txtmaimel.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Imei Trung");
            return;
        }
        if (!validateFrom("add")) {
            return;
        }
        String add = service.add(addfrom());
        list = (ArrayList<Imel>) service.getAllImels();
        loadData(list);
        JOptionPane.showMessageDialog(this, add);
    }

    private void update() {
        int index = tbimel.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Sua");
        } else {
            if (!validateFrom("add")) {
                return;
            }
            String update = service.update(updatefrom());
            list = (ArrayList<Imel>) service.getAllImels();
            loadData(list);
            JOptionPane.showMessageDialog(this, update);
        }
    }

    private void delete() {
        int index = tbimel.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Xoa");
        } else {
            int luaChon = JOptionPane.showConfirmDialog(this, "Ban Co Chac Chan Muon Xoa Khong", "Thong Bao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (luaChon == JOptionPane.YES_OPTION) {
                String delete = service.delete(Integer.parseInt(lblid.getText().trim()));
                list = (ArrayList<Imel>) service.getAllImels();
                loadData(list);
                loadDataRemove(list);
                JOptionPane.showMessageDialog(this, delete);
            } else {
            }
        }
    }

    private void resert() {
        lblid.setText("");
        txtmaimel.setText("");
        txttenimel.setText("");
    }

    private void recover() {
        int index = tbimeldelete.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Phuc Hoi");
        } else {
            int luaChon = JOptionPane.showConfirmDialog(this, "Ban Co Muon Phuc Hoi Imei Nay", "Thong Bao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (luaChon == JOptionPane.YES_OPTION) {
                String phucHoi = service.phucHoi(Integer.parseInt(lblid.getText().trim()));
                list = (ArrayList<Imel>) service.getAllImelsDelete();
                loadData(list);
                loadDataRemove(list);
                JOptionPane.showMessageDialog(this, phucHoi);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmaimel = new javax.swing.JTextField();
        txttenimel = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbimel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbimeldelete = new javax.swing.JTable();
        btnresert = new javax.swing.JButton();
        btnrecover = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("IMEL");

        jLabel2.setText("Ma Imel:");

        jLabel3.setText("Imel:");

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tbimel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MA IMEL", "IMEL"
            }
        ));
        tbimel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbimelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbimel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sach Imel", jPanel1);

        tbimeldelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MA IMEL", "TEN IMEL"
            }
        ));
        tbimeldelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbimeldeleteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbimeldelete);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sach Imel Da Xoa", jPanel2);

        btnresert.setText("Clear");
        btnresert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresertActionPerformed(evt);
            }
        });

        btnrecover.setText("Recover");
        btnrecover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttenimel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtmaimel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnadd)
                        .addGap(28, 28, 28)
                        .addComponent(btnupdate)
                        .addGap(29, 29, 29)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnresert)
                        .addGap(18, 18, 18)
                        .addComponent(btnrecover))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmaimel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttenimel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnresert)
                    .addComponent(btnrecover))
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbimelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbimelMouseClicked
        // TODO add your handling code here:
        mouseClick();
    }//GEN-LAST:event_tbimelMouseClicked

    private void tbimeldeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbimeldeleteMouseClicked
        // TODO add your handling code here:
        mouseClickDelete();
    }//GEN-LAST:event_tbimeldeleteMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresertActionPerformed
        // TODO add your handling code here:
        resert();
    }//GEN-LAST:event_btnresertActionPerformed

    private void btnrecoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecoverActionPerformed
        // TODO add your handling code here:
        recover();
    }//GEN-LAST:event_btnrecoverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrecover;
    private javax.swing.JButton btnresert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTable tbimel;
    private javax.swing.JTable tbimeldelete;
    private javax.swing.JTextField txtmaimel;
    private javax.swing.JTextField txttenimel;
    // End of variables declaration//GEN-END:variables
}
