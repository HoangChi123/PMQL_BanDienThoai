package com.raven.form;

import com.componentfolders.Model.ChiTietSanPham;
import com.componentfolders.Model.GioHang;
import com.componentfolders.Model.HoaDonBanHang;
import com.componentfolders.Model.HoaDonChiTietBanHang;
import com.componentfolders.Model.HoaDonTreo;
import com.componentfolders.Model.KhuyenMai;
import com.componentfolders.Model.MGGBanHang;
import com.componentfolders.Repo.BanHangRepo;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class FormBanHang extends javax.swing.JPanel {
    BanHangRepo rp = new BanHangRepo();
     private DefaultTableModel defaultTableModel;
      private DefaultTableModel defaultTableModel2;
       private DefaultTableModel defaultTableModel3;
     ArrayList<HoaDonTreo> listhdt = new ArrayList<>();
     ArrayList<GioHang> listgh = new ArrayList<>();
      Date currentDate = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        
     
     int hdtdangluu;
     int hdtreo = 0;
     String maa, tenn;
     int soluongg,donnhangg;
     double dongiaa,thanhtienn;
    public FormBanHang() {
        initComponents();
        setOpaque(false);
        LoadData();
        loadcbbMGG();
        loadcbbKH();
        loadcbbNV();
        
        txtNgayTT.setText((formatter.format(currentDate)));
    }
    public void loadcbbMGG() {
         ArrayList<KhuyenMai> list = rp.MAGG();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbMGG.getModel();
        dcm.removeAllElements();
        for (KhuyenMai km : list) {
            if (km.getLoaiGiamGia() == 1) {
                dcm.addElement(km.getTen());
            }
        }
        
//        cbbMGG.setSelectedIndex(0);
    }
    public void loadcbbKH() {
         ArrayList<KhuyenMai> list = rp.MAKH();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbKH.getModel();
        dcm.removeAllElements();
        for (KhuyenMai km : list) {
                dcm.addElement(km.getMaKM());   
        }
        
//        cbbMGG.setSelectedIndex(0);
    }
    public void loadcbbNV() {
         ArrayList<KhuyenMai> list = rp.MANV();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbKH.getModel();
        dcm.removeAllElements();
        for (KhuyenMai km : list) {
                dcm.addElement(km.getMaKM());   
        }
        
//        cbbMGG.setSelectedIndex(0);
    }
    public void loadcbbMGGSP(String IDSP) {
       
        ArrayList<KhuyenMai> list = rp.MAGG2(IDSP);
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbMGGSP.getModel();
        dcm.removeAllElements();
        for (KhuyenMai km : list) {
                        dcm.addElement(km.getTen());       
            }
        }
    
    public void LoadData(){
        ArrayList<ChiTietSanPham> listsp= rp.getListSP();
        defaultTableModel = (DefaultTableModel) tblSP.getModel();
        defaultTableModel.setRowCount(0);
        
            for (ChiTietSanPham kh : listsp) {                 
                Object[] rowData ={
                    
                    kh.getId(),
                    kh.getIdHang() == 1 ? "Apple":"SamSung",
                    kh.getIdRam(),
                    kh.getIdMauSac()== 1 ? "Vàng":"Tím",
                    kh.getDonGia(),
                    kh.getTenSanPham()
                         
                };
            defaultTableModel.addRow(rowData);
            
        }
    }
    public void LoadHDT(){   
        defaultTableModel = (DefaultTableModel) tblDonhang.getModel();
        defaultTableModel.setRowCount(0);
            for (HoaDonTreo hd : listhdt) {                 
                Object[] rowData ={
                    hd.getMaHD()
                         
                };
            defaultTableModel.addRow(rowData);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        cbbMGGSP = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbbSP = new javax.swing.JComboBox<>();
        btnThemSP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbbMGG = new javax.swing.JComboBox<>();
        txtMaDH = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTongTien1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNgayTT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbNV = new javax.swing.JComboBox<>();
        cbbKH = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonhang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnTaoDonHang = new javax.swing.JButton();
        btnXoaDonHang = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Giỏ Hàng");

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Thành Tiền", "Đơn Hàng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        tblGioHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblGioHangKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblGioHang);

        cbbMGGSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMGGSPItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbMGGSP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(cbbMGGSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Loại", "Ram", "Màu Sắc", "Giá Sản Phẩm", "Tên SP"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);
        if (tblSP.getColumnModel().getColumnCount() > 0) {
            tblSP.getColumnModel().getColumn(3).setResizable(false);
            tblSP.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setText("Sản Phẩm");

        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbbSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "SamSung", "Apple" }));
        cbbSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSPItemStateChanged(evt);
            }
        });

        btnThemSP.setText("Thêm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cbbSP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)))
                .addComponent(btnThemSP)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemSP)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Thanh Toán");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(116, 116, 116))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(15, 15, 15))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Đơn Hàng:");

        jLabel7.setText("Tổng Tiền:");

        jLabel8.setText("Mã Giảm Giá:");

        cbbMGG.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMGGItemStateChanged(evt);
            }
        });

        txtMaDH.setEditable(false);
        txtMaDH.setBackground(new java.awt.Color(204, 204, 204));

        txtTongTien.setEditable(false);
        txtTongTien.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("% Giảm");

        txtTongTien1.setEditable(false);
        txtTongTien1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("Thành Tiền:");

        txtGiamGia.setEditable(false);
        txtGiamGia.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setText("Ngày Mua:");

        txtNgayTT.setEditable(false);
        txtNgayTT.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Tiền Khách Trả:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaDH)
                                    .addComponent(cbbMGG, 0, 184, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtTongTien1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtNgayTT, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbbMGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNgayTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Nhân Viên:");

        jLabel5.setText("Khách Hàng:");

        cbbNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        cbbKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbKH, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addComponent(cbbNV, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDonhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT"
            }
        ));
        tblDonhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonhangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDonhang);

        jLabel1.setText("Đơn Hàng:");

        btnTaoDonHang.setText("Tạo");
        btnTaoDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDonHangActionPerformed(evt);
            }
        });

        btnXoaDonHang.setText("Xóa");
        btnXoaDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDonHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaoDonHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaDonHang)
                        .addGap(35, 35, 35))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnTaoDonHang)
                    .addComponent(btnXoaDonHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDonHangActionPerformed
        // TODO add your handling code here:
        HoaDonTreo hdt = new HoaDonTreo();
        hdt.setMaHD(hdtreo+1);
        hdtreo += 1 ;       
        listhdt.add(hdt);
        LoadHDT();
    }//GEN-LAST:event_btnTaoDonHangActionPerformed
    
    public void XoaDH(){
        int row = tblDonhang.getSelectedRow();
        defaultTableModel = (DefaultTableModel) tblDonhang.getModel();
 
        listhdt.remove(row);

        
        
        defaultTableModel.removeRow(row);
        defaultTableModel2 = (DefaultTableModel) tblGioHang.getModel();
        defaultTableModel2.setRowCount(0);
    }
    private void btnXoaDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDonHangActionPerformed
        // TODO add your handling code here:
        XoaDH();
        
    }//GEN-LAST:event_btnXoaDonHangActionPerformed

    private void tblDonhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonhangMouseClicked
        // TODO add your handling code here:
        int row = tblDonhang.getSelectedRow();
        int vl = Integer.parseInt(tblDonhang.getValueAt(row, 0).toString());
        if(row == -1){
            return;
        }
        else{
            hdtdangluu = Integer.parseInt(tblDonhang.getValueAt(row, 0).toString());
            defaultTableModel = (DefaultTableModel) tblGioHang.getModel();
        defaultTableModel.setRowCount(0);
        int a = 1;
            for (GioHang hd : listgh) {  
                if(hd.getDonHang() == vl){
                Object[] rowData ={
                    a,
                    hd.getMaSp(),
                    hd.getTenSP(),
                    hd.getSoluong(),
                    hd.getDonGia(),
                    hd.getDonGia() * hd.getSoluong(),
                    hd.getDonHang()
                    
                         
                };
            defaultTableModel.addRow(rowData);
            a+=1;
           
                }
                int row2 = tblGioHang.getRowCount();
                String count;
                double counta;
                double b = 0;
                for (int i = 0; i < row2; i++) {
                    counta = Double.parseDouble((tblGioHang.getValueAt(i, 6).toString()));
                    b += counta;
                    txtTongTien1.setText(String.valueOf(b));
                }
                
        }
            txtMaDH.setText(String.valueOf(vl));
        }
    }//GEN-LAST:event_tblDonhangMouseClicked

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:
        int row = tblSP.getSelectedRow();
        if(row == -1){
            return;
        }
        else{
            tenn = tblSP.getValueAt(row, 5).toString();
            maa  = tblSP.getValueAt(row, 0).toString();
            soluongg = 1;
            dongiaa = Double.parseDouble(tblSP.getValueAt(row, 4).toString());
            thanhtienn = soluongg*dongiaa;
        }
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
        GioHang hdct = new GioHang();
        hdct.setDonHang(hdtdangluu);
        hdct.setMaSp(maa);
        hdct.setDonGia(dongiaa);
        hdct.setSoluong(1);
        hdct.setTenSP(tenn);
        hdct.setThanhTien(dongiaa);
        listgh.add(hdct);
        defaultTableModel = (DefaultTableModel) tblGioHang.getModel();
        defaultTableModel.setRowCount(0);
        int a = 0;
            for (GioHang hd : listgh) {
                if (hd.getDonHang() == hdtdangluu) { 
                    Object[] rowData ={
                        a,
                    hd.getMaSp(),
                    hd.getTenSP(),
                    hd.getSoluong(),
                    hd.getDonGia(),
                    hd.getThanhTien(),
                    hd.getDonHang()
                    
                         
                };
            defaultTableModel.addRow(rowData);
            a+=1;
                }
                
              
        }
            int row2 = tblGioHang.getRowCount();
                double counta;
                double b = 0;
                DecimalFormat df = new DecimalFormat("#");
                for (int i = 0; i < row2; i++) {
                    counta = Double.parseDouble((tblGioHang.getValueAt(i, 5).toString()));
                    b += counta;
                    
                    String tt = df.format(b);
                    txtTongTien1.setText(tt);
                    
                    
                }
                
                double tiengiam = b * Integer.parseInt(txtGiamGia.getText()) / 100;
                    double dongiacuoi = b - tiengiam;
                    String ttt = df.format(dongiacuoi);
                    txtTongTien.setText(ttt);
                
                
    }//GEN-LAST:event_btnThemSPActionPerformed
    public void tinhtien(){
        int row2 = tblGioHang.getRowCount();
                double counta;
                double b = 0;
                DecimalFormat df = new DecimalFormat("#");
                for (int i = 0; i < row2; i++) {
                    counta = Double.parseDouble((tblGioHang.getValueAt(i, 5).toString()));
                    b += counta;
                    
                    String tt = df.format(b);
                    txtTongTien1.setText(tt);
                    
                    
                }
                double tiengiam = b * Integer.parseInt(txtGiamGia.getText()) / 100;
                    double dongiacuoi = b - tiengiam;
                    String ttt = df.format(dongiacuoi);
                    txtTongTien.setText(ttt);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        HoaDonBanHang hd = new HoaDonBanHang();
        
        hd.setMaHD("");
        hd.setTongTien(Integer.parseInt(txtTongTien.getText()));
        hd.setIdNhanVien(1);
        hd.setIdKM(1);
        hd.setIdKH(1);
        hd.setNgayMua(txtNgayTT.getText());
        
        
        
        if(rp.addhd(hd) == true){
            int hang = tblGioHang.getRowCount();
            HoaDonChiTietBanHang hdcc = new HoaDonChiTietBanHang();
            System.out.println("Mã Hóa ĐƠn Hiejn Tại là:"+ rp.idhoadon());
        for (int i = 0; i < hang; i++) {
                hdcc.setIDSP(Integer.parseInt(tblGioHang.getValueAt(i, 1).toString()));
                System.out.println("IDSP" + hdcc.getIDSP() );
                hdcc.setSl(1);
                hdcc.setDongia(Double.parseDouble(tblGioHang.getValueAt(i, 5).toString()));
                hdcc.setIDHD((rp.idhoadon()));
                System.out.println("Mã HD được Thêm Vào Là"+ hdcc.getIDHD());
                rp.addhdct(hdcc);
                rp.UpdateSP(tblGioHang.getValueAt(i, 1).toString());
        }
        }else{
            System.out.println("Looxt Nút Thanh Toán");
        }
        XoaDH();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbbMGGItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMGGItemStateChanged
        // TODO add your handling code here:
        ArrayList<KhuyenMai> listt = rp.MAGG();
        for (KhuyenMai khuyenMai : listt) {
            if (khuyenMai.getTen().equals(cbbMGG.getSelectedItem())) {
                txtGiamGia.setText(String.valueOf(khuyenMai.getGiaTriGiam()));
                
            }
        }
//        double b = Double.parseDouble(txtTongTien1.getText());
//        DecimalFormat df = new DecimalFormat("#");
//                double tiengiam = b * Integer.parseInt(txtGiamGia.getText()) / 100;
//                    double dongiacuoi = b - tiengiam;
//                    String ttt = df.format(dongiacuoi);
//                    txtTongTien.setText(ttt);
        
    }//GEN-LAST:event_cbbMGGItemStateChanged

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        // TODO add your handling code here:
        int row = tblGioHang.getSelectedRow();
        defaultTableModel = (DefaultTableModel) tblGioHang.getModel();
        if (row == -1) {
                return ;
            }
        String IDSP = tblGioHang.getValueAt(row, 1).toString();
        double t = Double.parseDouble(tblGioHang.getValueAt(row, 4).toString());
        
        try{
          loadcbbMGGSP(IDSP);
          int mggsp =  rp.GiaTriGiamSP(cbbMGGSP.getSelectedItem().toString());
          defaultTableModel.setValueAt(t - (t*mggsp/100), row, 5);
          tinhtien();
        }catch(Exception e){
            System.out.println("Lỗi Lấy Giá trị MGGSP");
        }
    }//GEN-LAST:event_tblGioHangMouseClicked

    private void tblGioHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGioHangKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tblGioHangKeyPressed

    private void cbbMGGSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMGGSPItemStateChanged
        // TODO add your handling code here:
        int row = tblGioHang.getSelectedRow();
        defaultTableModel = (DefaultTableModel) tblGioHang.getModel();
        if (row == -1) {
                return ;
            }
        String IDSP = tblGioHang.getValueAt(row, 1).toString();
        double t = Double.parseDouble(tblGioHang.getValueAt(row, 4).toString());
        
        try{
          int mggsp =  rp.GiaTriGiamSP(cbbMGGSP.getSelectedItem().toString());
          defaultTableModel.setValueAt(t - (t*mggsp/100), row, 5);
          tinhtien();
        }catch(Exception e){
            System.out.println("Lỗi Lấy Giá trị MGGSP");
        }
    }//GEN-LAST:event_cbbMGGSPItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = tblGioHang.getSelectedRow();
        defaultTableModel = (DefaultTableModel) tblGioHang.getModel();
 
        listgh.remove(row);

        
        
        defaultTableModel.removeRow(row);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbbSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSPItemStateChanged
        // TODO add your handling code here:
        if(cbbSP.getSelectedItem().equals("SamSung")){
            ArrayList<ChiTietSanPham> listsp= rp.getListSPTheoHang(2);
            defaultTableModel = (DefaultTableModel) tblSP.getModel();
            defaultTableModel.setRowCount(0);
        
            for (ChiTietSanPham kh : listsp) {                 
                Object[] rowData ={
                    
                    kh.getId(),
                    kh.getIdHang() == 1 ? "Apple":"SamSung",
                    kh.getIdRam(),
                    kh.getIdMauSac(),
                    kh.getDonGia(),
                    kh.getTenSanPham()
                         
                };
            defaultTableModel.addRow(rowData);
            
            }
        }
        else if(cbbSP.getSelectedItem().equals("Apple")){
            ArrayList<ChiTietSanPham> listsp= rp.getListSPTheoHang(1);
            defaultTableModel = (DefaultTableModel) tblSP.getModel();
            defaultTableModel.setRowCount(0);
        
            for (ChiTietSanPham kh : listsp) {                 
                Object[] rowData ={
                    
                    kh.getId(),
                    kh.getIdHang() == 1 ? "Apple":"SamSung",
                    kh.getIdRam(),
                    kh.getIdMauSac(),
                    kh.getDonGia(),
                    kh.getTenSanPham()
                         
                };
            defaultTableModel.addRow(rowData);
            
            }
        }else{
            LoadData();
        }
    }//GEN-LAST:event_cbbSPItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String abc = txtTimKiem.getText();
        if (abc.equals("Tím")) {
            abc = "1";
            ArrayList<ChiTietSanPham> listsp= rp.getListSPTK(abc);
        defaultTableModel = (DefaultTableModel) tblSP.getModel();
        defaultTableModel.setRowCount(0);
        
            for (ChiTietSanPham kh : listsp) {                 
                Object[] rowData ={
                    
                    kh.getId(),
                    kh.getIdHang() == 1 ? "Apple":"SamSung",
                    kh.getIdRam(),
                    kh.getIdMauSac()== 1 ? "Vàng":"Tím",
                    kh.getDonGia(),
                    kh.getTenSanPham()
                         
                };
            defaultTableModel.addRow(rowData);
            
        }
        }
        abc = "2";
        ArrayList<ChiTietSanPham> listsp= rp.getListSPTK(abc);
        defaultTableModel = (DefaultTableModel) tblSP.getModel();
        defaultTableModel.setRowCount(0);
        
            for (ChiTietSanPham kh : listsp) {                 
                Object[] rowData ={
                    
                    kh.getId(),
                    kh.getIdHang() == 1 ? "Apple":"SamSung",
                    kh.getIdRam(),
                    kh.getIdMauSac()== 1 ? "Vàng":"Tím",
                    kh.getDonGia(),
                    kh.getTenSanPham()
                         
                };
            defaultTableModel.addRow(rowData);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoDonHang;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnXoaDonHang;
    private javax.swing.JComboBox<String> cbbKH;
    private javax.swing.JComboBox<String> cbbMGG;
    private javax.swing.JComboBox<String> cbbMGGSP;
    private javax.swing.JComboBox<String> cbbNV;
    private javax.swing.JComboBox<String> cbbSP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDonhang;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaDH;
    private javax.swing.JTextField txtNgayTT;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongTien1;
    // End of variables declaration//GEN-END:variables
}
