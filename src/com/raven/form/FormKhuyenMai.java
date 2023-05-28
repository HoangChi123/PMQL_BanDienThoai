package com.raven.form;

import com.componentfolders.Model.KMSP;
import com.componentfolders.Model.KhuyenMai;
import com.componentfolders.Repo.KhuyenMaiRepo;
import com.componentfolders.Service.ITF.KhuyenMaiService;
import com.componentfolders.Service.Impl.KhuyenMaiImpl;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FormKhuyenMai extends javax.swing.JPanel {
    private KhuyenMaiService kmsv = new KhuyenMaiImpl();
    private KhuyenMaiRepo rp = new KhuyenMaiRepo();
    private DefaultTableModel defaultTableModel;
    ArrayList<KMSP> listspchon = new ArrayList<>();
    ArrayList<KMSP> listsp = rp.GetListSP();

    public FormKhuyenMai() {
        initComponents();
        setOpaque(false);
        LoadData();
        LoadDataSP();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKM = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LoaiMaCbb = new javax.swing.JComboBox<>();
        txtMucGiam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateEnd = new com.toedter.calendar.JDateChooser();
        jDateStart = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cbbHang = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSPDC = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblsp = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(159, 159, 159));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại Mã", "Tên Mã", "Mã KM", "Mức Giảm", "Ngày Kết Thúc", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(tblKM);

        jButton1.setText("Tất Cả");

        jButton2.setText("Đang Diễn Ra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Loại Mã:");

        LoaiMaCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áp Dụng Cho Hóa Đơn", "Áp Dụng Cho Sản Phẩm" }));

        jLabel4.setText("Mã KM:");

        jLabel5.setText("Thời Gian:");

        jDateEnd.setDateFormatString("yyyy-MM-dd");

        jDateStart.setDateFormatString("yyyy-MM-dd");

        jLabel6.setText("Mức Giảm % :");

        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Kết Thúc");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateStart, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LoaiMaCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton4)
                .addGap(56, 56, 56)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LoaiMaCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(81, 81, 81))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbbHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "SamSung", "Apple" }));
        cbbHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbHangItemStateChanged(evt);
            }
        });

        jLabel7.setText("Hãng:");

        tblSPDC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "TÊN SP", "HÃNG"
            }
        ));
        tblSPDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPDCMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSPDCMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblSPDC);

        tblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "TÊN SP", "HÃNG"
            }
        ));
        tblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblspMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblsp);

        jButton7.setText("Chọn ALL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setText("SP ĐƯỢC CHỌN:");

        jButton8.setText("Bỏ ALL");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(343, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jButton7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jButton8)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void LoadData(){
        ArrayList<KhuyenMai> listkm= kmsv.getList();
    defaultTableModel = (DefaultTableModel) tblKM.getModel();
        defaultTableModel.setRowCount(0);

            for (KhuyenMai kh : listkm) {                 
                Object[] rowData ={
                    kh.getHinhThucGiamGia() == 1 ? "Cho Hóa Đơn":"Cho Sản Phẩm",
                    kh.getTen(),
                    kh.getMaKM(),
                    kh.getGiaTriGiam() + "%",
                    kh.getNgayBatDau(),
                    kh.getNgayKetThuc(),
                    kh.getTrangthai() == 1 ? "Có Thể Áp Dụng":"Đã Hết Hạn"
                         
                };
            defaultTableModel.addRow(rowData);
        }

    }
    public void LoadDataSP(){
        
    defaultTableModel = (DefaultTableModel) tblsp.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listsp) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }

    }
    public void LoadDataSP2(){
    ArrayList<KMSP> listspp = rp.GetListSP();
    defaultTableModel = (DefaultTableModel) tblsp.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listspp) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbbHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbHangItemStateChanged
        // TODO add your handling code here:
        int a;
        defaultTableModel = (DefaultTableModel) tblsp.getModel();
        defaultTableModel.setRowCount(0);
        if (cbbHang.getSelectedItem().equals("Apple")) {
             a = 1;
             for (KMSP kh : listsp) {
            if (kh.getIDHang() == a) {
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
                defaultTableModel.addRow(rowData);
            }
                
            
        }
        }else if (cbbHang.getSelectedItem().equals("SamSung")) {
             a = 2;
             for (KMSP kh : listsp) {
            if (kh.getIDHang() == a) {
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
                defaultTableModel.addRow(rowData);
            }
             }
        }else {
            LoadDataSP();
        }
 
        
        
    }//GEN-LAST:event_cbbHangItemStateChanged

    private void tblspMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspMousePressed
        // TODO add your handling code here:
        int row = tblsp.getSelectedRow();
        if (row == -1) {
                return;
            }
        String ten = tblsp.getValueAt(row, 1).toString();
        String ma = tblsp.getValueAt(row, 0).toString();
        int hang; 
        if (tblsp.getValueAt(row, 2).toString().equals("SamSung")){
                hang = 2;
                KMSP kk = new KMSP();
        kk.setIDHang(hang);
        kk.setIDSP(Integer.parseInt(ma));
        kk.setTenSP(ten);
        
        listspchon.add(kk);
        listsp.remove(row);
        LoadDataSP();
        }
        else if (tblsp.getValueAt(row, 2).toString().equals("Apple")){
                hang = 1;
                KMSP kk = new KMSP();
        kk.setIDHang(hang);
        kk.setIDSP(Integer.parseInt(ma));
        kk.setTenSP(ten);
        listspchon.add(kk);
        listsp.remove(row);
        LoadDataSP();
        }
        
        
    defaultTableModel = (DefaultTableModel) tblSPDC.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listspchon) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }
    }//GEN-LAST:event_tblspMousePressed

    private void tblSPDCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPDCMousePressed
        // TODO add your handling code here:
        int row = tblSPDC.getSelectedRow();
        if (row == -1) {
                return;
            }
        String ten = tblSPDC.getValueAt(row, 1).toString();
        String ma = tblSPDC.getValueAt(row, 0).toString();
        int hang; 
        if (tblSPDC.getValueAt(row, 2).toString().equals("SamSung")){
                hang = 2;
                KMSP kk = new KMSP();
        kk.setIDHang(hang);
        kk.setIDSP(Integer.parseInt(ma));
        kk.setTenSP(ten);
        
        listspchon.remove(row);
        listsp.add(kk);
        LoadDataSP();
        }
        else if (tblSPDC.getValueAt(row, 2).toString().equals("Apple")){
                hang = 1;
                KMSP kk = new KMSP();
        kk.setIDHang(hang);
        kk.setIDSP(Integer.parseInt(ma));
        kk.setTenSP(ten);
        listspchon.remove(row);
        listsp.add(kk);
        LoadDataSP();
        }
        
        defaultTableModel = (DefaultTableModel) tblSPDC.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listspchon) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }
        
    }//GEN-LAST:event_tblSPDCMousePressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        listsp = (ArrayList<KMSP>)listspchon.clone();
        LoadDataSP();
        listspchon.removeAll(listspchon);
        

        defaultTableModel = (DefaultTableModel) tblSPDC.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listspchon) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tblSPDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPDCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSPDCMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        listspchon = (ArrayList<KMSP>)listsp.clone();
        listsp.removeAll(listsp);
        LoadDataSP();
        
        

        defaultTableModel = (DefaultTableModel) tblSPDC.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listspchon) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (LoaiMaCbb.getSelectedItem().equals("Áp Dụng Cho Hóa Đơn")) {
            KhuyenMai km = new KhuyenMai();
            km.setLoaiGiamGia(1);
            km.setHinhThucGiamGia(1);
            km.setMaKM(txtMaKM.getText());
            km.setNgayBatDau(jDateStart.getDate());
            km.setNgayKetThuc(jDateEnd.getDate());
            km.setGiaTriGiam(Integer.parseInt(txtMucGiam.getText()));
            rp.addKMHD(km);
            LoadData();
            LoadDataSP();
        }else{
            KhuyenMai km = new KhuyenMai();
            km.setLoaiGiamGia(2);
            km.setHinhThucGiamGia(2);
            km.setMaKM(txtMaKM.getText());
            km.setNgayBatDau(jDateStart.getDate());
            km.setNgayKetThuc(jDateEnd.getDate());
            km.setGiaTriGiam(Integer.parseInt(txtMucGiam.getText()));
            rp.addKMHD(km);
            rp.GETMGG();
            for (KMSP kmsp : listspchon) {
                rp.AddSPSALE(kmsp.getIDSP(), rp.GETMGG());
                listsp.add(kmsp);
                
            }
            listspchon.removeAll(listspchon);
            LoadData();
            LoadDataSP();
            defaultTableModel = (DefaultTableModel) tblSPDC.getModel();
        defaultTableModel.setRowCount(0);

            for (KMSP kh : listspchon) {                 
                Object[] rowData ={
                    kh.getIDSP() ,
                    kh.getTenSP(),
                    kh.getIDHang() == 1 ? "Apple":"SamSung",
                         
                };
            defaultTableModel.addRow(rowData);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LoaiMaCbb;
    private javax.swing.JComboBox<String> cbbHang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateEnd;
    private com.toedter.calendar.JDateChooser jDateStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblKM;
    private javax.swing.JTable tblSPDC;
    private javax.swing.JTable tblsp;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtMucGiam;
    // End of variables declaration//GEN-END:variables
}
