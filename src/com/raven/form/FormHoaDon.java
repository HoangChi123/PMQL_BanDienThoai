package com.raven.form;

import com.componentfolders.Model.HDCT;
import com.componentfolders.Model.HoaDon;
import com.componentfolders.Repo.HoaDonRepository;
import com.componentfolders.Service.Impl.HoaDonServiceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class FormHoaDon extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private HoaDonServiceImpl hoaDonServiceImpl = new HoaDonServiceImpl();
    private HoaDonRepository rp = new HoaDonRepository();

    public FormHoaDon() {
        initComponents();
        setOpaque(false);
        String headers[] = {"Mã HD", "Mã NV", "Mã KH", "Tên KH", "Trạng Thái", "Tổng Tiền", "Ngày Tạo"};

        showData();
    }

    private void showData() {
        try {
            List<HoaDon> listHD = hoaDonServiceImpl.getAll();
            System.out.println(listHD);
            dtm = (DefaultTableModel) tblHoaDon3.getModel();
            dtm.setRowCount(0);
            for (HoaDon hoaDon : listHD) {
                Object[] rowData = {
                    hoaDon.getMAHD(),
                    hoaDon.getNv().getMaNV(),
                    hoaDon.getKh().getMaKH(),
                    hoaDon.getKh().getTen(),
                    hoaDon.getKh().getSdt(),
                    hoaDon.getTRANGTHAI() == 0 ? "Chưa Thanh Toán" : "Đã thanh toán",
                    String.format("%,.0f", hoaDon.getTONGTIEN()) + " VND",
                    hoaDon.getNgayMua(),};
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
            System.out.println("Sai ở đây");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel58 = new javax.swing.JLabel();
        txtTimKiemHD = new javax.swing.JTextField();
        pHoaDon3 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblHoaDon3 = new javax.swing.JTable();
        btnFindHD = new javax.swing.JButton();
        pLoc = new javax.swing.JPanel();
        txtngayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        btnloc = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pSanPham = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        btnSortAsc = new javax.swing.JButton();
        btnSortDesc = new javax.swing.JButton();
        btnExportHD = new javax.swing.JButton();

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setText("Tìm Kiếm");

        txtTimKiemHD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTimKiemHD.setForeground(new java.awt.Color(0, 0, 102));

        pHoaDon3.setBackground(new java.awt.Color(255, 255, 255));
        pHoaDon3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoá Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblHoaDon3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblHoaDon3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Mã NV", "Mã KH", "Tên KH", "SDT", "Trạng Thái", "Tổng Tiền", "Ngày Tạo"
            }
        ));
        tblHoaDon3.setGridColor(new java.awt.Color(0, 0, 102));
        tblHoaDon3.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblHoaDon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDon3MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblHoaDon3);

        javax.swing.GroupLayout pHoaDon3Layout = new javax.swing.GroupLayout(pHoaDon3);
        pHoaDon3.setLayout(pHoaDon3Layout);
        pHoaDon3Layout.setHorizontalGroup(
            pHoaDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHoaDon3Layout.createSequentialGroup()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
                .addContainerGap())
        );
        pHoaDon3Layout.setVerticalGroup(
            pHoaDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHoaDon3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnFindHD.setText("Tìm kiếm");
        btnFindHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindHDActionPerformed(evt);
            }
        });

        pLoc.setBackground(new java.awt.Color(255, 255, 255));
        pLoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc theo ngày tạo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtngayBatDau.setDateFormatString("yyyy-MM-dd");

        txtNgayKetThuc.setDateFormatString("yyyy-MM-dd");

        btnloc.setText("Lọc");
        btnloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Từ:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Đến:");

        javax.swing.GroupLayout pLocLayout = new javax.swing.GroupLayout(pLoc);
        pLoc.setLayout(pLocLayout);
        pLocLayout.setHorizontalGroup(
            pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLocLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtngayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnloc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        pLocLayout.setVerticalGroup(
            pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtngayBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnloc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pLocLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))))
                .addContainerGap())
        );

        pSanPham.setBackground(new java.awt.Color(255, 255, 255));
        pSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pSanPham.setForeground(new java.awt.Color(0, 0, 102));

        tblSP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá"
            }
        ));
        tblSP.setGridColor(new java.awt.Color(0, 0, 102));
        tblSP.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblSP);

        javax.swing.GroupLayout pSanPhamLayout = new javax.swing.GroupLayout(pSanPham);
        pSanPham.setLayout(pSanPhamLayout);
        pSanPhamLayout.setHorizontalGroup(
            pSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSanPhamLayout.createSequentialGroup()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
        );
        pSanPhamLayout.setVerticalGroup(
            pSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSortAsc.setText("Sắp xếp chiều giảm dần");
        btnSortAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortAscActionPerformed(evt);
            }
        });

        btnSortDesc.setText("Sắp xếp chiều tăng dần");
        btnSortDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDescActionPerformed(evt);
            }
        });

        btnExportHD.setText("Excel");
        btnExportHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pHoaDon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFindHD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnExportHD, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFindHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportHD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(pHoaDon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(pSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblHoaDon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDon3MouseClicked

        int row = tblHoaDon3.getSelectedRow();
        int adc = Integer.parseInt(tblHoaDon3.getValueAt(row, 0).toString());
        dtm = (DefaultTableModel) tblSP.getModel();
        dtm.setRowCount(0);
        List<HoaDon> listHDCT = rp.getAllHDCT(adc);
        for (HoaDon hdct : listHDCT) {
            Object[] toRowData = {
                hdct.getID(),
                hdct.getTRANGTHAI(),
                hdct.getMota(),
                1,
                hdct.getTONGTIEN(),};
            dtm.addRow(toRowData);
//            dtm.addRow(new Object[]{
//                hdct.getHd().getMAHD(),
//                hdct.getCtsp().getMaSanPham(),
//                hdct.getCtsp().getTenSanPham(),
//                hdct.getSOLUONG(),
//                hdct.getDONGIA(),
//                hdct.getThanhTien(),
//            });

        }
    }//GEN-LAST:event_tblHoaDon3MouseClicked

    private void findHD() {
        String maHD = txtTimKiemHD.getText();
        int i = tblHoaDon3.getRowCount();
        for (int j = 0; j < i; j++) {
            if (maHD.equals(dtm.getValueAt(j, 0).toString())) {
                tblHoaDon3.setRowSelectionInterval(j, j);
                break;
            }
        }
    }

    private void sortAsc() {
        TableRowSorter<TableModel> sort = new TableRowSorter<>(tblHoaDon3.getModel());
        tblHoaDon3.setRowSorter(sort);
        List<RowSorter.SortKey> ColSortingKeys = new ArrayList<>();
        ColSortingKeys.add(new RowSorter.SortKey(6, SortOrder.ASCENDING));

        sort.setSortKeys(ColSortingKeys);
        sort.sort();
    }

    private void sortDesc() {
        TableRowSorter<TableModel> sort = new TableRowSorter<>(tblHoaDon3.getModel());
        tblHoaDon3.setRowSorter(sort);
        List<RowSorter.SortKey> ColSortingKeys = new ArrayList<>();
        ColSortingKeys.add(new RowSorter.SortKey(6, SortOrder.DESCENDING));

        sort.setSortKeys(ColSortingKeys);
        sort.sort();
    }

    private void sortHD() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String date1 = sdf.format(txtngayBatDau.getDate());
            String date2 = sdf.format(txtNgayKetThuc.getDate());
            dtm = (DefaultTableModel) tblHoaDon3.getModel();
            dtm.setRowCount(0);
            for (HoaDon hoaDon : hoaDonServiceImpl.listHDNgay(date1, date2)) {
                System.out.println("chay done dong 368");
                Object[] rowData = {
                    hoaDon.getMAHD(),
                    hoaDon.getNv().getMaNV(),
                    hoaDon.getKh().getMaKH(),
                    hoaDon.getKh().getTen(),
                    hoaDon.getKh().getSdt(),
                    hoaDon.getTRANGTHAI() == 0 ? "Chưa Thanh Toán" : "Đã thanh toán",
                    String.format("%,.0f", hoaDon.getTONGTIEN()) + " VND",
                    hoaDon.getNgayMua()};
                dtm.addRow(rowData);
                System.out.println("chay done dong 379");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
//        List<HoaDon> lstHD = hoaDonServiceImpl.getAll();
//        dtm.setRowCount(0);
//        Date From = txtngayBatDau.getDate();
//        Date To = txtNgayKetThuc.getDate();
//        for (HoaDon hoaDon : lstHD) {
//            if (hoaDon.getNgayMua().after(From) && hoaDon.getNgayMua().before(To)) {
////                System.out.println("cac");
//                String StrTT = "Chưa thanh toán";
//                if (hoaDon.getTRANGTHAI() == 1) {
//                    StrTT = "Đã thanh toán";
//                }
//                Object[] rowData = {
//                    hoaDon.getMAHD(),
//                    hoaDon.getNv().getMaNV(),
//                    hoaDon.getKh().getMaKH(),
//                    hoaDon.getKh().getTen(),
//                    hoaDon.getKh().getSdt(),
//                    StrTT,
//                    //                    hoaDon.getTRANGTHAI() == 0 ? "Chưa Thanh Toán" : "Đã thanh toán",
//                    String.format("%,.0f", hoaDon.getTONGTIEN()) + " VND",
//                    hoaDon.getNgayMua(),};
//                dtm.addRow(rowData);
//            }
//        }
    }
    private void btnFindHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindHDActionPerformed
        findHD();
    }//GEN-LAST:event_btnFindHDActionPerformed

    private void btnlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocActionPerformed
        sortHD();
    }//GEN-LAST:event_btnlocActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
//        
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnSortAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortAscActionPerformed
        sortAsc();
    }//GEN-LAST:event_btnSortAscActionPerformed

    private void btnSortDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDescActionPerformed
        sortDesc();
    }//GEN-LAST:event_btnSortDescActionPerformed

    private void btnExportHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportHDActionPerformed
//        exportexcel();
    }//GEN-LAST:event_btnExportHDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportHD;
    private javax.swing.JButton btnFindHD;
    private javax.swing.JButton btnSortAsc;
    private javax.swing.JButton btnSortDesc;
    private javax.swing.JButton btnloc;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JPanel pHoaDon3;
    private javax.swing.JPanel pLoc;
    private javax.swing.JPanel pSanPham;
    private javax.swing.JTable tblHoaDon3;
    private javax.swing.JTable tblSP;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private javax.swing.JTextField txtTimKiemHD;
    private com.toedter.calendar.JDateChooser txtngayBatDau;
    // End of variables declaration//GEN-END:variables
}
