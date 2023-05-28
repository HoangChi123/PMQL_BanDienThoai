package com.raven.form;

import com.componentfolders.Model.ChiTietSanPham;
import com.componentfolders.Model.Chip;
import com.componentfolders.Model.Hang;
import com.componentfolders.Model.Imel;
import com.componentfolders.Model.MauSac;
import com.componentfolders.Model.Pin;
import com.componentfolders.Model.Ram;
import com.componentfolders.Model.Rom;
import com.componentfolders.Service.ITF.ChiTietSanPhamService;
import com.componentfolders.Service.ITF.ChipService;
import com.componentfolders.Service.ITF.HangService;
import com.componentfolders.Service.ITF.ImelService;
import com.componentfolders.Service.ITF.MauSacService;
import com.componentfolders.Service.ITF.PinService;
import com.componentfolders.Service.ITF.RamService;
import com.componentfolders.Service.ITF.RomService;
import com.componentfolders.Service.Impl.ChiTietSanPhamServiceImpl;
import com.componentfolders.Service.Impl.ChipServiceImpl;
import com.componentfolders.Service.Impl.HangServiceImpl;
import com.componentfolders.Service.Impl.ImelServiceImpl;
import com.componentfolders.Service.Impl.MauSacServiceImpl;
import com.componentfolders.Service.Impl.PinServiceImpl;
import com.componentfolders.Service.Impl.RamServiceImpl;
import com.componentfolders.Service.Impl.RomServiceImpl;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FormSanPham extends javax.swing.JPanel {

    private final ChiTietSanPhamService chiTietSanPhamService;
    private final ChipService chipService;
    private final RamService ramService;
    private final PinService pinService;
    private final RomService romService;
    private final HangService hangService;
    private final MauSacService mauSacService;
    private final ImelService imelService;
    private List<ChiTietSanPham> list = new ArrayList<>();
    private DefaultTableModel tableModel;
    private String chon;
    private int rowSelect = -1;
    private JPanel paneTC;
    private DefaultComboBoxModel comboBoxModel;
    List<Chip> listChips = new ArrayList<>();

    public FormSanPham() {
        initComponents();
        chiTietSanPhamService = new ChiTietSanPhamServiceImpl();
        chipService = new ChipServiceImpl();
        ramService = new RamServiceImpl();
        pinService = new PinServiceImpl();
        romService = new RomServiceImpl();
        hangService = new HangServiceImpl();
        mauSacService = new MauSacServiceImpl();
        imelService = new ImelServiceImpl();
        loadData(list);
        listLuuTru(list);
        loadCbbChip(listChips);
        addCbb();
    }

    private void loadCbbChip(List<Chip> listChips) {
        comboBoxModel = (DefaultComboBoxModel) cbbchip.getModel();
        comboBoxModel.removeAllElements();
        for (Chip listChip : listChips) {
            comboBoxModel.addElement(listChip.getTenChip());
        }
    }

    private void addCbb() {
        cbbchip.removeAllItems();
        for (Chip chip : chipService.getAllChip()) {
            cbbchip.addItem(chip.getTenChip());
        }
        cbbram.removeAllItems();
        for (Ram ram : ramService.getAllRam()) {
            cbbram.addItem(ram.getMaRam());
        }
        cbbpin.removeAllItems();
        for (Pin pin : pinService.getAllPin()) {
            cbbpin.addItem(pin.getTenPin());
        }
        cbbrom.removeAllItems();
        for (Rom rom : romService.getAllRom()) {
            cbbrom.addItem(rom.getMaRom());
        }
        cbbhang.removeAllItems();
        for (Hang hang : hangService.getAllHang()) {
            cbbhang.addItem(hang.getTenHang());
        }
        cbbmausac.removeAllItems();
        for (MauSac mauSac : mauSacService.getAllMS()) {
            cbbmausac.addItem(mauSac.getTenMauSac());
        }
        cbbdanhsachimel.removeAllItems();
        for (Imel imel : imelService.getAllImels()) {
            cbbdanhsachimel.addItem(imel.getTenImel());
        }
    }

    private void loadData(List<ChiTietSanPham> list) {
        tableModel = (DefaultTableModel) tbsanpham.getModel();
        tableModel.setRowCount(0);
        for (ChiTietSanPham ctsp : chiTietSanPhamService.getAllCTSP()) {
            tableModel.addRow(new Object[]{
                ctsp.getId(), ctsp.getMaSanPham(), ctsp.getTenSanPham(), ctsp.getDonGia(), ctsp.getMoTa(), ctsp.getAnhSanPham(), ctsp.getSoLuong(),
                ctsp.getIdMauSac(), ctsp.getIdHang(), ctsp.getIdChip(), ctsp.getIdRam(), ctsp.getIdRom(), ctsp.getIdPin()
            });
        }
    }

    private void listLuuTru(List<ChiTietSanPham> list) {
        tableModel = (DefaultTableModel) tbsanphamphuchoi.getModel();
        tableModel.setRowCount(0);
        for (ChiTietSanPham ctsp : chiTietSanPhamService.getAllCTSPLuuTru()) {
            tableModel.addRow(new Object[]{
                ctsp.getId(), ctsp.getMaSanPham(), ctsp.getTenSanPham(), ctsp.getDonGia(), ctsp.getMoTa(), ctsp.getAnhSanPham(), ctsp.getSoLuong(),
                ctsp.getIdMauSac(), ctsp.getIdHang(), ctsp.getIdChip(), ctsp.getIdRam(), ctsp.getIdRom(), ctsp.getIdPin()
            });
        }
    }

    private void mouseClick() {
        int index = tbsanpham.getSelectedRow();
        lblidctsp.setText(tbsanpham.getValueAt(index, 0).toString());
        txtmasp.setText(tbsanpham.getValueAt(index, 1).toString());
        txttensp.setText(tbsanpham.getValueAt(index, 2).toString());
        txtdongia.setText(tbsanpham.getValueAt(index, 3).toString());
        txtsoluong.setText(tbsanpham.getValueAt(index, 6).toString());
        txtmota.setText(tbsanpham.getValueAt(index, 4).toString());
        if (tbsanpham.getValueAt(index, 5) != null) {
            lblanhsp.setText("");
            ImageIcon imageIcon = new ImageIcon("images/" + tbsanpham.getValueAt(index, 5).toString());
            Image img = imageIcon.getImage().getScaledInstance(lblanhsp.getWidth(), lblanhsp.getHeight(), 0);
            imageIcon = new ImageIcon(img);
            lblanhsp.setIcon(imageIcon);
        } else {
            lblanhsp.setText("");
            lblanhsp.setIcon(null);
        }
        cbbchip.setSelectedItem((String) tbsanpham.getValueAt(index, 9).toString());
        cbbram.setSelectedItem((String) tbsanpham.getValueAt(index, 10).toString());
        cbbpin.setSelectedItem((String) tbsanpham.getValueAt(index, 12).toString());
        cbbrom.setSelectedItem((String) tbsanpham.getValueAt(index, 11).toString());
        cbbhang.setSelectedItem((String) tbsanpham.getValueAt(index, 8).toString());
        cbbmausac.setSelectedItem((String) tbsanpham.getValueAt(index, 7).toString());
    }

    private void mouseClickPhucHoi() {
        int index = tbsanphamphuchoi.getSelectedRow();
        lblidspph.setText(tbsanphamphuchoi.getValueAt(index, 0).toString());
    }

    private boolean validateFrom(String check) {
        if (txtmasp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ma San Pham Trong");
            return false;
        }
        if (txttensp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ten San Pham Trong");
            return false;
        }
        if (txtdongia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Don Gia Trong");
            return false;
        }
        try {
            double dongia = Double.parseDouble(txtdongia.getText());
            if (dongia < 0) {
                JOptionPane.showMessageDialog(this, "Gia Khong Ton Tai");
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Don Gia Phai La So");
            return false;
        }
        if (txtsoluong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "So Luong Trong");
            return false;
        }
        try {
            int soLuong = Integer.parseInt(txtsoluong.getText());
            if (soLuong < 0) {
                JOptionPane.showMessageDialog(this, "So Luong Khong Ton Tai");
                return false;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "So Luong Phai La So");
            return false;
        }
        return true;
    }

    private ChiTietSanPham addFrom() {
        ChiTietSanPham ctsp = new ChiTietSanPham();
        ctsp.setMaSanPham(txtmasp.getText().trim());
        ctsp.setTenSanPham(txttensp.getText().trim());
        ctsp.setDonGia(Double.parseDouble(txtdongia.getText().trim()));
        ctsp.setMoTa(txtmota.getText().trim());
        if (chon == null && rowSelect >= 0) {
            ctsp.setAnhSanPham(lblanhsp.getText().trim());
        } else {
            ctsp.setAnhSanPham(chon != null ? chon : "");
        }
        ctsp.setSoLuong(Integer.parseInt(txtsoluong.getText().trim()));
        ctsp.setIdChip(chipService.getAllChip().get(cbbchip.getSelectedIndex()).getId());
        ctsp.setIdHang(hangService.getAllHang().get(cbbhang.getSelectedIndex()).getId());
        ctsp.setIdMauSac(mauSacService.getAllMS().get(cbbmausac.getSelectedIndex()).getId());
        ctsp.setIdPin(pinService.getAllPin().get(cbbpin.getSelectedIndex()).getId());
        ctsp.setIdRam(ramService.getAllRam().get(cbbram.getSelectedIndex()).getId());
        ctsp.setIdRom(romService.getAllRom().get(cbbrom.getSelectedIndex()).getId());
        return ctsp;
    }

    private ChiTietSanPham updateFrom() {
        ChiTietSanPham ctsp = new ChiTietSanPham();
        ctsp.setId(Integer.parseInt(lblidctsp.getText().trim()));
        ctsp.setMaSanPham(txtmasp.getText().trim());
        ctsp.setTenSanPham(txttensp.getText().trim());
        ctsp.setDonGia(Double.parseDouble(txtdongia.getText().trim()));
        ctsp.setMoTa(txtmota.getText().trim());
        if (chon == null && rowSelect >= 0) {
            ctsp.setAnhSanPham(lblanhsp.getText().trim());
        } else {
            ctsp.setAnhSanPham(chon != null ? chon : "");
        }
        ctsp.setSoLuong(Integer.parseInt(txtsoluong.getText().trim()));
        ctsp.setIdChip(chipService.getAllChip().get(cbbchip.getSelectedIndex()).getId());
        ctsp.setIdHang(hangService.getAllHang().get(cbbhang.getSelectedIndex()).getId());
        ctsp.setIdMauSac(mauSacService.getAllMS().get(cbbmausac.getSelectedIndex()).getId());
        ctsp.setIdPin(pinService.getAllPin().get(cbbpin.getSelectedIndex()).getId());
        ctsp.setIdRam(ramService.getAllRam().get(cbbram.getSelectedIndex()).getId());
        ctsp.setIdRom(romService.getAllRom().get(cbbrom.getSelectedIndex()).getId());
        return ctsp;
    }

    private void add() {
        if (chiTietSanPhamService.checkTrung(txtmasp.getText().trim())) {
            JOptionPane.showMessageDialog(this, "San Pham Co Ma Ton Tai");
            return;
        }
        if (!validateFrom("add")) {
            return;
        }
        String add = chiTietSanPhamService.addCTSP(addFrom());
        list = chiTietSanPhamService.getAllCTSP();
        loadData(list);
        JOptionPane.showMessageDialog(this, add);
    }

    private void update() {
        if (!validateFrom("update")) {
            return;
        }
        String update = chiTietSanPhamService.updateCTSP(updateFrom());
        list = chiTietSanPhamService.getAllCTSP();
        loadData(list);
        JOptionPane.showMessageDialog(this, update);
    }

    private void delete() {
        int index = tbsanpham.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Xoa");
        } else {
            int luaChon = JOptionPane.showConfirmDialog(this, "Ban Co Chac Chan Muon Xoa Khong", "Thong Bao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (luaChon == JOptionPane.YES_OPTION) {
                String delete = chiTietSanPhamService.deleteCTSP(Integer.parseInt(lblidctsp.getText().trim()));
                list = chiTietSanPhamService.getAllCTSP();
                loadData(list);
                listLuuTru(list);
                JOptionPane.showMessageDialog(this, delete);
            }
        }
    }

    private void phucHoi() {
        int index = tbsanphamphuchoi.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chon Dong De Phuc Hoi");
        } else {
            int luaChon = JOptionPane.showConfirmDialog(this, "Ban Co Muon Phuc Hoi San Pham Nay", "Thong Bao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (luaChon == JOptionPane.YES_OPTION) {
                String phucHoi = chiTietSanPhamService.phucHoi(Integer.parseInt(lblidspph.getText().trim()));
                list = chiTietSanPhamService.getAllCTSPLuuTru();
                loadData(list);
                listLuuTru(list);
                JOptionPane.showMessageDialog(this, phucHoi);
            }
        }
    }

    private void fromChip() {
        FromChip from = new FromChip();
        from.setVisible(true);
    }

    private void fromRam() {
        RamFrom from = new RamFrom();
        from.setVisible(true);
    }

    private void fromPin() {
        PinFrom from = new PinFrom();
        from.setVisible(true);
    }

    private void fromRom() {
        RomFrom from = new RomFrom();
        from.setVisible(true);
    }

    private void fromHang() {
        FromHang from = new FromHang();
        from.setVisible(true);
    }

    private void fromMauSac() {
        MauSacFrom from = new MauSacFrom();
        from.setVisible(true);
    }

    private void fromImel(){
        FromImel from = new FromImel();
        from.setVisible(true);
    }
    
    private void chonAnh() {
        try {
            JFileChooser jfc = new JFileChooser("D:\\IT\\Lap_Trinh_Java_3(SOF203)\\Assignment\\Bai_Tap_Assignment\\assignment\\images");
            jfc.showDialog(null, "Chon Anh");
            File file = jfc.getSelectedFile();
            if (file == null) {
                return;
            }
            Image img = ImageIO.read(file);
            lblanhsp.setText("");
            lblanhsp.setIcon(new ImageIcon(img.getScaledInstance(lblanhsp.getWidth(), lblanhsp.getHeight(), 0)));
            chon = file.getName();
        } catch (HeadlessException | IOException e) {
        }
        lblanhsp.setText("");
    }

    private void clearFrom() {
        lblidctsp.setText("");
        lblanhsp.setText("");
        txtmasp.setText("");
        txttensp.setText("");
        txtdongia.setText("");
        txtmota.setText("");
        txtsoluong.setText("");
    }

    private void searchSanPham() {
        tableModel = (DefaultTableModel) tbsanpham.getModel();
        String tenSP = txtsearch.getText().trim();
        List<ChiTietSanPham> listSearch = chiTietSanPhamService.timKiemSP(tenSP);
        tableModel.setRowCount(0);
        for (ChiTietSanPham ctsp : listSearch) {
            tableModel.addRow(new Object[]{
                ctsp.getId(), ctsp.getMaSanPham(), ctsp.getTenSanPham(), ctsp.getDonGia(), ctsp.getMoTa(), ctsp.getAnhSanPham(), ctsp.getSoLuong(),
                ctsp.getIdMauSac(), ctsp.getIdHang(), ctsp.getIdChip(), ctsp.getIdRam(), ctsp.getIdRom(), ctsp.getIdPin()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblidctsp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsanpham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fromthongtincbb = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbbchip = new javax.swing.JComboBox<>();
        cbbram = new javax.swing.JComboBox<>();
        cbbpin = new javax.swing.JComboBox<>();
        btnupdatechip = new javax.swing.JButton();
        btnupdateram = new javax.swing.JButton();
        btnupdatepin = new javax.swing.JButton();
        cbbrom = new javax.swing.JComboBox<>();
        cbbhang = new javax.swing.JComboBox<>();
        cbbmausac = new javax.swing.JComboBox<>();
        btnupdaterom = new javax.swing.JButton();
        btnupdatehang = new javax.swing.JButton();
        btnupdatemausac = new javax.swing.JButton();
        btnxuatexcel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblanhsp = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txttensp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtdongia = new javax.swing.JTextField();
        cbbdanhsachimel = new javax.swing.JComboBox<>();
        txtsoluong = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmota = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btncapnhat = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnresert = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtmasp = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbsanphamphuchoi = new javax.swing.JTable();
        btnkhoiphuc = new javax.swing.JButton();
        lblidspph = new javax.swing.JLabel();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("San Pham"));

        btnsearch.setText("Tim Kiem");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        tbsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ma SP", "Ten SP", "Don Gia", "Mo Ta", "Anh SP", "So Luong"
            }
        ));
        tbsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbsanpham);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsearch)
                .addGap(18, 18, 18))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("San Pham");

        fromthongtincbb.setBorder(javax.swing.BorderFactory.createTitledBorder("Thong Tin San Pham"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Chip:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("RAM:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Pin:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Rom:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Mau Sac:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Hang:");

        btnupdatechip.setText("Cap Nhat");
        btnupdatechip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatechipActionPerformed(evt);
            }
        });

        btnupdateram.setText("Cap Nhat");
        btnupdateram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateramActionPerformed(evt);
            }
        });

        btnupdatepin.setText("Cap Nhat");
        btnupdatepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatepinActionPerformed(evt);
            }
        });

        btnupdaterom.setText("Cap Nhat");
        btnupdaterom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateromActionPerformed(evt);
            }
        });

        btnupdatehang.setText("Cap Nhat");
        btnupdatehang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatehangActionPerformed(evt);
            }
        });

        btnupdatemausac.setText("Cap Nhat");
        btnupdatemausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatemausacActionPerformed(evt);
            }
        });

        btnxuatexcel.setText("Xuat Excel");

        javax.swing.GroupLayout fromthongtincbbLayout = new javax.swing.GroupLayout(fromthongtincbb);
        fromthongtincbb.setLayout(fromthongtincbbLayout);
        fromthongtincbbLayout.setHorizontalGroup(
            fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromthongtincbbLayout.createSequentialGroup()
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromthongtincbbLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(fromthongtincbbLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)))
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromthongtincbbLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120))
                    .addGroup(fromthongtincbbLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel7)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel6)
                        .addContainerGap(88, Short.MAX_VALUE))))
            .addGroup(fromthongtincbbLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnupdatechip, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(btnupdateram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnupdatepin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(fromthongtincbbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbrom, 0, 144, Short.MAX_VALUE)
                    .addComponent(cbbchip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbram, 0, 151, Short.MAX_VALUE)
                    .addComponent(cbbhang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbpin, 0, 157, Short.MAX_VALUE)
                    .addComponent(cbbmausac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromthongtincbbLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnupdaterom)
                .addGap(136, 136, 136)
                .addComponent(btnupdatehang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnxuatexcel)
                    .addComponent(btnupdatemausac))
                .addGap(66, 66, 66))
        );
        fromthongtincbbLayout.setVerticalGroup(
            fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromthongtincbbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbchip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdatechip)
                    .addComponent(btnupdateram)
                    .addComponent(btnupdatepin))
                .addGap(18, 18, 18)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbmausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromthongtincbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdaterom)
                    .addComponent(btnupdatehang)
                    .addComponent(btnupdatemausac))
                .addGap(18, 18, 18)
                .addComponent(btnxuatexcel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Bang San Pham"));

        jLabel8.setText("Anh:");

        lblanhsp.setBackground(new java.awt.Color(204, 204, 204));
        lblanhsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblanhspMouseClicked(evt);
            }
        });

        jLabel9.setText("Ten San Pham:");

        jLabel10.setText("Don Gia");

        jLabel11.setText("Danh Sach Imel:");

        jLabel12.setText("So Luong:");

        jButton1.setText("Cap Nhat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Mo Ta:");

        txtmota.setColumns(20);
        txtmota.setRows(5);
        jScrollPane2.setViewportView(txtmota);

        btnthem.setText("Them");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btncapnhat.setText("Cap Nhat");
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        btnxoa.setText("Xoa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnresert.setText("Lam Moi");
        btnresert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresertActionPerformed(evt);
            }
        });

        jButton6.setText("Cap Nhat");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel14.setText("Ma San Pham:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(btnthem))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btncapnhat)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnresert))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtsoluong)
                                    .addComponent(cbbdanhsachimel, 0, 165, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel9))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txttensp)
                                    .addComponent(txtdongia)
                                    .addComponent(txtmasp, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblanhsp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblanhsp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbdanhsachimel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btncapnhat)
                    .addComponent(btnxoa)
                    .addComponent(btnresert))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromthongtincbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fromthongtincbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("San Pham", jPanel2);

        tbsanphamphuchoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ma SP", "TenSP", "Don Gia", "Mo Ta", "Anh SP", "So Luong"
            }
        ));
        tbsanphamphuchoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsanphamphuchoiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbsanphamphuchoi);

        btnkhoiphuc.setText("Khoi Phuc");
        btnkhoiphuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoiphucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(lblidspph)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnkhoiphuc)
                .addGap(335, 335, 335))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnkhoiphuc)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblidspph)))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Luu Tru", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateromActionPerformed
        // TODO add your handling code here:
        fromRom();
    }//GEN-LAST:event_btnupdateromActionPerformed

    private void btnupdatechipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatechipActionPerformed
        // TODO add your handling code here:
        fromChip();
    }//GEN-LAST:event_btnupdatechipActionPerformed

    private void btnupdateramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateramActionPerformed
        // TODO add your handling code here:
        fromRam();
    }//GEN-LAST:event_btnupdateramActionPerformed

    private void btnupdatepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatepinActionPerformed
        // TODO add your handling code here:
        fromPin();
    }//GEN-LAST:event_btnupdatepinActionPerformed

    private void btnupdatehangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatehangActionPerformed
        // TODO add your handling code here:
        fromHang();
    }//GEN-LAST:event_btnupdatehangActionPerformed

    private void btnupdatemausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatemausacActionPerformed
        // TODO add your handling code here:
        fromMauSac();
    }//GEN-LAST:event_btnupdatemausacActionPerformed

    private void lblanhspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblanhspMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblanhspMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_btnthemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        chonAnh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tbsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsanphamMouseClicked
        // TODO add your handling code here:
        mouseClick();
    }//GEN-LAST:event_tbsanphamMouseClicked

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btncapnhatActionPerformed

    private void btnresertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresertActionPerformed
        // TODO add your handling code here:
        clearFrom();
    }//GEN-LAST:event_btnresertActionPerformed

    private void btnkhoiphucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoiphucActionPerformed
        // TODO add your handling code here:
        phucHoi();
    }//GEN-LAST:event_btnkhoiphucActionPerformed

    private void tbsanphamphuchoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsanphamphuchoiMouseClicked
        // TODO add your handling code here:
        mouseClickPhucHoi();
    }//GEN-LAST:event_tbsanphamphuchoiMouseClicked

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        searchSanPham();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        fromImel();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhat;
    private javax.swing.JButton btnkhoiphuc;
    private javax.swing.JButton btnresert;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnupdatechip;
    private javax.swing.JButton btnupdatehang;
    private javax.swing.JButton btnupdatemausac;
    private javax.swing.JButton btnupdatepin;
    private javax.swing.JButton btnupdateram;
    private javax.swing.JButton btnupdaterom;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxuatexcel;
    private javax.swing.JComboBox<String> cbbchip;
    private javax.swing.JComboBox<String> cbbdanhsachimel;
    private javax.swing.JComboBox<String> cbbhang;
    private javax.swing.JComboBox<String> cbbmausac;
    private javax.swing.JComboBox<String> cbbpin;
    private javax.swing.JComboBox<String> cbbram;
    private javax.swing.JComboBox<String> cbbrom;
    private javax.swing.JPanel fromthongtincbb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblanhsp;
    private javax.swing.JLabel lblidctsp;
    private javax.swing.JLabel lblidspph;
    private javax.swing.JTable tbsanpham;
    private javax.swing.JTable tbsanphamphuchoi;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextArea txtmota;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables

}
