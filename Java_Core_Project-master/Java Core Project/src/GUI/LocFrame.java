/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import FileIOCSV.*;
import Objects.SanPham;
import SanPhamComparator.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class LocFrame extends javax.swing.JDialog {

    FileIOSanPham fileIOSanPham = new FileIOSanPham();
    FileIOLoc fileIOLoc = new FileIOLoc();
    List<SanPham> listSanPhams = fileIOSanPham.SanPhamReadCSV();
    List<SanPham> listLoc = new ArrayList<>();
    DefaultTableModel TableModel;

    public LocFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TableModel = (DefaultTableModel) Table.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SoLuongNhieuNhatRadioButton = new javax.swing.JRadioButton();
        SoLuongItNhatRadioButton = new javax.swing.JRadioButton();
        Top10NSXRadioButton = new javax.swing.JRadioButton();
        QuaHanRadioButton = new javax.swing.JRadioButton();
        GiaLonNhatRadioButton = new javax.swing.JRadioButton();
        GiaNhoNhatRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lọc");

        buttonGroup1.add(SoLuongNhieuNhatRadioButton);
        SoLuongNhieuNhatRadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SoLuongNhieuNhatRadioButton.setText("Top 10 số lượng nhiều nhất");
        SoLuongNhieuNhatRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoLuongNhieuNhatRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(SoLuongItNhatRadioButton);
        SoLuongItNhatRadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SoLuongItNhatRadioButton.setText("Top 10 số lượng ít nhất");
        SoLuongItNhatRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoLuongItNhatRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Top10NSXRadioButton);
        Top10NSXRadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Top10NSXRadioButton.setText("Top 10 NSX gần nhất");
        Top10NSXRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Top10NSXRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(QuaHanRadioButton);
        QuaHanRadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        QuaHanRadioButton.setText("Những sản phẩm quá hạn");
        QuaHanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuaHanRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(GiaLonNhatRadioButton);
        GiaLonNhatRadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GiaLonNhatRadioButton.setText("Top 10 có giá lớn nhất");
        GiaLonNhatRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaLonNhatRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(GiaNhoNhatRadioButton);
        GiaNhoNhatRadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GiaNhoNhatRadioButton.setText("Top 10 có giá nhỏ nhất");
        GiaNhoNhatRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaNhoNhatRadioButtonActionPerformed(evt);
            }
        });

        Table.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Số Lượng", "Đơn Vị Tính", "Giá Nhập", "Giá Bán", "Nhà Sản Xuất", "Ngày Sản Xuất", "Hạn Sử dụng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(35);
            Table.getColumnModel().getColumn(0).setMaxWidth(35);
            Table.getColumnModel().getColumn(1).setMinWidth(80);
            Table.getColumnModel().getColumn(1).setMaxWidth(80);
            Table.getColumnModel().getColumn(2).setMinWidth(150);
            Table.getColumnModel().getColumn(2).setMaxWidth(250);
        }

        SaveButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SaveButton.setText("Lưu");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ExitButton.setText("Thoát");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SoLuongNhieuNhatRadioButton)
                    .addComponent(SoLuongItNhatRadioButton, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GiaLonNhatRadioButton)
                    .addComponent(GiaNhoNhatRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuaHanRadioButton)
                    .addComponent(Top10NSXRadioButton))
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Top10NSXRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(QuaHanRadioButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SoLuongNhieuNhatRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(SoLuongItNhatRadioButton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(GiaNhoNhatRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(GiaLonNhatRadioButton))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(ExitButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SoLuongItNhatRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoLuongItNhatRadioButtonActionPerformed
        if (SoLuongItNhatRadioButton.isSelected()) {
            listSanPhams.sort(new SoLuongSpTangComparator());
            resetList();
            int j;
            if (listSanPhams.size() < 10) {
                for (SanPham s : listSanPhams) {
                    listLoc.add(s);
                }
            } else {
                for (j = 0; j < 10; j++) {
                    listLoc.add(listSanPhams.get(j));
                }
            }
            updateTable(listLoc);
        }
    }//GEN-LAST:event_SoLuongItNhatRadioButtonActionPerformed

    private void SoLuongNhieuNhatRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoLuongNhieuNhatRadioButtonActionPerformed
        if (SoLuongNhieuNhatRadioButton.isSelected()) {
            listSanPhams.sort(new SoLuongSPGiamComparator());
            resetList();
            int j;
            if (listSanPhams.size() < 10) {
                for (SanPham s : listSanPhams) {
                    listLoc.add(s);
                }
            } else {
                for (j = 0; j < 10; j++) {
                    listLoc.add(listSanPhams.get(j));
                }
            }
            updateTable(listLoc);
        }
    }//GEN-LAST:event_SoLuongNhieuNhatRadioButtonActionPerformed

    private void GiaNhoNhatRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaNhoNhatRadioButtonActionPerformed
        if (GiaNhoNhatRadioButton.isSelected()) {
            listSanPhams.sort(new GiaNhapTangComparator());
            resetList();
            int j;
            if (listSanPhams.size() < 10) {
                for (SanPham s : listSanPhams) {
                    listLoc.add(s);
                }
            } else {
                for (j = 0; j < 10; j++) {
                    listLoc.add(listSanPhams.get(j));
                }
            }
            updateTable(listLoc);
        }
    }//GEN-LAST:event_GiaNhoNhatRadioButtonActionPerformed

    private void GiaLonNhatRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaLonNhatRadioButtonActionPerformed
        if (GiaLonNhatRadioButton.isSelected()) {
            listSanPhams.sort(new GiaNhapGiamComparator());
            resetList();
            int j;
            if (listSanPhams.size() < 10) {
                for (SanPham s : listSanPhams) {
                    listLoc.add(s);
                }
            } else {
                for (j = 0; j < 10; j++) {
                    listLoc.add(listSanPhams.get(j));
                }
            }
            updateTable(listLoc);
        }
    }//GEN-LAST:event_GiaLonNhatRadioButtonActionPerformed

    private void Top10NSXRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Top10NSXRadioButtonActionPerformed
        if (Top10NSXRadioButton.isSelected()) {
            listSanPhams.sort(new NSXGiamComparator());
            resetList();
            int j;
            if (listSanPhams.size() < 10) {
                for (SanPham s : listSanPhams) {
                    listLoc.add(s);
                }
            } else {
                for (j = 0; j < 10; j++) {
                    listLoc.add(listSanPhams.get(j));
                }
            }
            updateTable(listLoc);
        }
    }//GEN-LAST:event_Top10NSXRadioButtonActionPerformed

    private void QuaHanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuaHanRadioButtonActionPerformed
        if (QuaHanRadioButton.isSelected()) {
            listSanPhams.sort(new HSDTangComparator());
            resetList();
            LocalDate now = LocalDate.now();
            int j;
            for (j = 0; j < listSanPhams.size(); j++) {
                if (listSanPhams.get(j).getHSD().isBefore(now)) {
                    listLoc.add(listSanPhams.get(j));
                }
            }
            updateTable(listLoc);
        }
    }//GEN-LAST:event_QuaHanRadioButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc muốn lưu dữ liệu lọc này?",
                "Xác Nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            String s = "";
            if (SoLuongNhieuNhatRadioButton.isSelected()) {
                s = "Top10SoLuongLonNhat";
            } else if (SoLuongItNhatRadioButton.isSelected()) {
                s = "Top10SoLuongNhoNhat";
            } else if (GiaLonNhatRadioButton.isSelected()) {
                s = "Top10GiaLonNhat";
            } else if (GiaNhoNhatRadioButton.isSelected()) {
                s = "Top10GiaNhoNhat";
            } else if (Top10NSXRadioButton.isSelected()) {
                s = "Top10NSXGanNgayHienTai";
            } else if (QuaHanRadioButton.isSelected()) {
                s = "SanPhamQuaHan";
            } else {
                JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 trong các điều kiện!");
            }
            fileIOLoc.SanPhamWriteToCSV(listLoc, s);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void resetList() {
        while (!listLoc.isEmpty()) {
            listLoc.remove(0);
        }
    }

    private void updateTable(List<SanPham> list) {
        int i = 1;
        TableModel.setRowCount(0);
        for (SanPham s : list) {
            TableModel.addRow(new Object[]{i, s.getTenSanPham(), s.getLoaiSanPham(), s.getSoLuong(), s.getGiaNhap(), s.getDonViTinh(), s.getNSX(), s.getHSD(), (s.getSoLuong() * s.getGiaNhap())});
            i++;
            Table.scrollRectToVisible(Table.getCellRect(Table.getRowCount() - 1, 0, true));
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                LocFrame dialog = new LocFrame(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JRadioButton GiaLonNhatRadioButton;
    private javax.swing.JRadioButton GiaNhoNhatRadioButton;
    private javax.swing.JRadioButton QuaHanRadioButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JRadioButton SoLuongItNhatRadioButton;
    private javax.swing.JRadioButton SoLuongNhieuNhatRadioButton;
    private javax.swing.JTable Table;
    private javax.swing.JRadioButton Top10NSXRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}