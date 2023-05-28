package com.raven.form;

import com.componentfolders.Model.NhanVien;
import com.componentfolders.Repo.NhanVienRepo;
import com.componentfolders.Service.ITF.NhanVienService;
import com.componentfolders.Service.Impl.NhanVienServiceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormNhanVienCu extends javax.swing.JPanel {

    private DefaultTableModel md;
    private ArrayList<NhanVien> list = new ArrayList<>();
    private NhanVienService nvSv = new NhanVienServiceImpl();
    private final String VALID_EMAIL_REGEX = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
    private final String VALID_PHONENUMBER_REGEX = "0+([0-9]{9,10})\\b";
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public FormNhanVienCu() {
        initComponents();
        setOpaque(false);
        loadData(list);
        loadDataLuuTru(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pl_nhanvien = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhoatdonglai = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txttennv = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtque = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        txtmatkhau = new javax.swing.JTextField();
        cbbchucvu = new javax.swing.JComboBox<>();
        rdnam = new javax.swing.JRadioButton();
        rdnu = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        txttimnv = new javax.swing.JTextField();
        jButton44 = new javax.swing.JButton();
        panel = new javax.swing.JTabbedPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblluutru = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();

        pl_nhanvien.setBackground(new java.awt.Color(255, 255, 255));
        pl_nhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHỨC NĂNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnhoatdonglai.setText("Hoạt động lại");
        btnhoatdonglai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhoatdonglaiActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnhoatdonglai, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnhoatdonglai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel31.setToolTipText("");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("MÃ NHÂN VIÊN");

        txtmanv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtmanv.setForeground(new java.awt.Color(0, 0, 102));
        txtmanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanvActionPerformed(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("TÊN NHÂN VIÊN");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("CHỨC VỤ");

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("GIỚI TÍNH");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("EMAIL");

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 102));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("QUÊ");

        txtque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtque.setForeground(new java.awt.Color(0, 0, 102));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("TÀI KHOẢN");

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("MẬT KHẨU");

        txttaikhoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttaikhoan.setForeground(new java.awt.Color(0, 0, 102));

        txtmatkhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtmatkhau.setForeground(new java.awt.Color(0, 0, 102));

        cbbchucvu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbchucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));

        rdnam.setSelected(true);
        rdnam.setText("Nam");

        rdnu.setText("Nữ");

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("NGÀY SINH");

        jDate.setDateFormatString("yyyy-MM-dd");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbchucvu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdnam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdnu))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtque, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel46)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(rdnam)
                    .addComponent(rdnu)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(cbbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BẢNG NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txttimnv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttimnv.setForeground(new java.awt.Color(0, 0, 102));

        jButton44.setText("Tìm kiếm");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        panel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tblnhanvien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblnhanvien.setForeground(new java.awt.Color(0, 0, 102));
        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã NV", "Tên NV", "Giới tính", "Chức vụ", "Email", "Quê quán", "Ngày sinh", "Tài khoản", "Mật Khẩu", "Trạng Thái"
            }
        ));
        tblnhanvien.setGridColor(new java.awt.Color(0, 0, 102));
        tblnhanvien.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanvienMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblnhanvien);

        panel.addTab("Nhân viên", jScrollPane7);

        tblluutru.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblluutru.setForeground(new java.awt.Color(0, 0, 102));
        tblluutru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã NV", "Tên NV", "Giới tính", "Chức vụ", "Email", "Quê quán", "Ngày sinh", "Tài khoản", "Mật khẩu", "Trạng Thái"
            }
        ));
        tblluutru.setGridColor(new java.awt.Color(0, 0, 102));
        tblluutru.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblluutru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblluutruMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblluutru);

        panel.addTab("Lưu trữ", jScrollPane11);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(872, Short.MAX_VALUE)
                .addComponent(txttimnv, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addComponent(panel)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttimnv)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pl_nhanvienLayout = new javax.swing.GroupLayout(pl_nhanvien);
        pl_nhanvien.setLayout(pl_nhanvienLayout);
        pl_nhanvienLayout.setHorizontalGroup(
            pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pl_nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl_nhanvienLayout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(304, Short.MAX_VALUE))))
        );
        pl_nhanvienLayout.setVerticalGroup(
            pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_nhanvienLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pl_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pl_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadData(ArrayList<NhanVien> list) {
        md = (DefaultTableModel) tblnhanvien.getModel();
        md.setRowCount(0);
        for (NhanVien nhanVien : nvSv.getAll()) {
            md.addRow(new Object[]{
                nhanVien.getId(), nhanVien.getMaNV(), nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getChucVu(), nhanVien.geteMail(), nhanVien.getQueQuan(), nhanVien.getNgaySinh(), nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), nhanVien.getTrangThai()
            });

        }
    }
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        String manv = txtmanv.getText();
        //        if (manv.isBlank()) {
        //            JOptionPane.showMessageDialog(this, "Không bỏ trống các trường.");
        //            return;
        //        }
        //       list  = NhanVienService.
        //        for (NhanVien x : list) {
        //            if (x.getMaNV().equalsIgnoreCase(txtmanv.getText())) {
        //                JOptionPane.showMessageDialog(this, "Không được trùng mà");
        //                return;
        //            }
        //        }
        if(!valiDate("add")){
            return;
        }
        String tennv = txttennv.getText();

        Boolean gioitinh = false;

        String tencv = cbbchucvu.getSelectedItem().toString();
        String email = txtemail.getText();

        String quequan = txtque.getText();

        Date ngaysinh = jDate.getDate();

        String taikhoan = txttaikhoan.getText();

        String matkhau = txtmatkhau.getText();

        NhanVien nv = new NhanVien();
        nv.setMaNV(manv);
        nv.setTen(tennv);
        nv.setGioiTinh(0);
        nv.setChucVu(0);
        nv.setMatKhau(matkhau);
        nv.setTaiKhoan(taikhoan);

        nv.setNgaySinh(ngaysinh);
        nv.setQueQuan(quequan);
        nvSv.add(nv);
        loadData(list);
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int row = tblnhanvien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn vào 1 dòng trên table");
            return;
        }
        String maSV = txtmanv.getText();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá? ");

        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        }
        if (confirm == JOptionPane.YES_OPTION) {
            nvSv.xoa(Integer.parseInt(txtId.getText()));
            JOptionPane.showMessageDialog(this, "Xoá thành công");
            loadData(list);
            loadDataLuuTru(list);
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }

    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnhoatdonglaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhoatdonglaiActionPerformed
        khoiPhuc();


    }//GEN-LAST:event_btnhoatdonglaiActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        String tk = txttaikhoan.getText();
        NhanVien nv = new NhanVien();
        nv.setTaiKhoan(tk);
        String mk = txtmatkhau.getText();
        nv.setMatKhau(mk);
        String que = txtque.getText();
        nv.setQueQuan(que);
        String email = txtemail.getText();
        nv.seteMail(email);
        String ma = txtmanv.getText();
        nv.setMaNV(ma);
        String ten = txttennv.getText();
        nv.setTen(ten);
        nv.setId(Integer.parseInt(txtId.getText()));
        if (cbbchucvu.getSelectedItem().equals("Nhân viên")) {
            nv.setChucVu(1);
        } else {
            nv.setChucVu(0);
        }
        if (rdnam.isSelected()) {
            nv.setGioiTinh(0);
        } else {
            nv.setGioiTinh(1);
        }
        nv.setNgaySinh(jDate.getDate());
        nvSv.update(nv);
        loadData(list);
    }//GEN-LAST:event_btnsuaActionPerformed

    private void txtmanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanvActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked
        int row = tblnhanvien.getSelectedRow();
        if (row <= -1) {
            return;
        }
        txtemail.setText(tblnhanvien.getValueAt(row, 5).toString());
        txtmanv.setText(tblnhanvien.getValueAt(row, 1).toString());
        txtmatkhau.setText(tblnhanvien.getValueAt(row, 9).toString());
        txtque.setText(tblnhanvien.getValueAt(row, 6).toString());
        txttaikhoan.setText(tblnhanvien.getValueAt(row, 8).toString());
        if (tblnhanvien.getValueAt(row, 3).toString().equals("1")) {
            rdnam.setSelected(true);
        } else {
            rdnu.setSelected(true);
        }


    }//GEN-LAST:event_tblnhanvienMouseClicked

    private void tblluutruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblluutruMouseClicked
        mouseclickLuuTru();

    }//GEN-LAST:event_tblluutruMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhoatdonglai;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbchucvu;
    private javax.swing.JButton jButton44;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JPanel pl_nhanvien;
    private javax.swing.JRadioButton rdnam;
    private javax.swing.JRadioButton rdnu;
    private javax.swing.JTable tblluutru;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtmatkhau;
    private javax.swing.JTextField txtque;
    private javax.swing.JTextField txttaikhoan;
    private javax.swing.JTextField txttennv;
    private javax.swing.JTextField txttimnv;
    // End of variables declaration//GEN-END:variables

    private void timKiem() {
        md = (DefaultTableModel) tblnhanvien.getModel();
        String maNV = txttimnv.getText().trim();
        List<NhanVien> listsearch = nvSv.tkiem(maNV);
        md.setRowCount(0);
        for (NhanVien nhanVien : listsearch) {
            md.addRow(new Object[]{
                nhanVien.getId(), nhanVien.getMaNV(), nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getChucVu(), nhanVien.geteMail(), nhanVien.getQueQuan(), nhanVien.getNgaySinh(), nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), nhanVien.getTrangThai()
            });
        }

    }

    private void loadDataLuuTru(ArrayList<NhanVien> list) {
        md = (DefaultTableModel) tblluutru.getModel();
        md.setRowCount(0);
        for (NhanVien nhanVien : nvSv.luuTru()) {
            md.addRow(new Object[]{
                nhanVien.getId(), nhanVien.getMaNV(), nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getChucVu(), nhanVien.geteMail(), nhanVien.getQueQuan(), nhanVien.getNgaySinh(), nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), nhanVien.getTrangThai()
            });

        }
    }

    private void khoiPhuc() {
        int row = tblluutru.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn vào 1 dòng trên table");
            return;
        }
        String Id = txtId.getText();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn khôi phục không ? ");

        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        }
        if (confirm == JOptionPane.YES_OPTION) {
            nvSv.phucHoi(Integer.parseInt(txtId.getText()));
            JOptionPane.showMessageDialog(this, "Khôi phục thành công");
            loadData(list);
            loadDataLuuTru(list);
            return;

        } else {
            JOptionPane.showMessageDialog(this, "Khôi phục thất bại");
        }
    }

    private void mouseclickLuuTru() {
        int row = tblluutru.getSelectedRow();
        if (row <= -1) {
            return;

        }
        txtId.setText(tblluutru.getValueAt(row, 0).toString());

    }

    private boolean valiDate(String check) {
        if (txtmanv.getText().isEmpty() || txttennv.getText().isEmpty() || txtemail.getText().isEmpty() || txtque.getText().isEmpty() || txttaikhoan.getText().isEmpty()
                || txtmatkhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thong Tin Trong");
            return false;
        }
        if (!txtemail.getText().trim().matches(VALID_EMAIL_REGEX)) {
            JOptionPane.showMessageDialog(this, "Email Khong Dung Dinh Dang");
            return false;
        }
        if(txttaikhoan.getText().trim().length() < 8){
            JOptionPane.showMessageDialog(this, "Tai Khoan Phai Tren 8 ki tu");
            return false;
        }
        if(txtmatkhau.getText().trim().length() < 8){
            JOptionPane.showMessageDialog(this, "Mat Khau Phai Co Tren 8 Ki Tu");
            return false;
        }
        return true;
    }
}
