/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.company.management.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thinkpro
 */
public class PDF extends javax.swing.JPanel {

    /**
     * Creates new form PDF
     */
    public PDF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jbtSearch = new javax.swing.JButton();
        jlbGender = new javax.swing.JLabel();
        jlbName = new javax.swing.JLabel();
        jlbDob = new javax.swing.JLabel();
        jlbLuong = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jlbAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jlbChucVu = new javax.swing.JLabel();
        jcbChucVu = new javax.swing.JComboBox<>();
        jlbNgayLamViec = new javax.swing.JLabel();
        txtNgayLamViec = new javax.swing.JTextField();
        jbtPDF = new javax.swing.JButton();
        jbtClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jlbID.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbID.setForeground(new java.awt.Color(255, 255, 255));
        jlbID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbID.setText("Mã ID");

        txtID.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jbtSearch.setBackground(new java.awt.Color(255, 51, 51));
        jbtSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbtSearch.setText("Tìm Kiếm");
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jlbGender.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbGender.setForeground(new java.awt.Color(255, 255, 255));
        jlbGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbGender.setText("Giới tính");

        jlbName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbName.setForeground(new java.awt.Color(255, 255, 255));
        jlbName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbName.setText("Họ tên");

        jlbDob.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbDob.setForeground(new java.awt.Color(255, 255, 255));
        jlbDob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDob.setText("Ngày sinh");

        jlbLuong.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbLuong.setForeground(new java.awt.Color(255, 255, 255));
        jlbLuong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbLuong.setText("Lương");

        txtName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtGender.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtDob.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        txtLuong.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuongActionPerformed(evt);
            }
        });

        jlbAddress.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbAddress.setForeground(new java.awt.Color(255, 255, 255));
        jlbAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbAddress.setText("Địa chỉ");

        txtAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jlbChucVu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbChucVu.setForeground(new java.awt.Color(255, 255, 255));
        jlbChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbChucVu.setText("Chức vụ");

        jcbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Giám Đốc", "Trưởng Phòng", "Nhân Viên", " " }));
        jcbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbChucVuActionPerformed(evt);
            }
        });

        jlbNgayLamViec.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbNgayLamViec.setForeground(new java.awt.Color(255, 255, 255));
        jlbNgayLamViec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNgayLamViec.setText("Số ngày làm việc");

        txtNgayLamViec.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtNgayLamViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayLamViecActionPerformed(evt);
            }
        });

        jbtPDF.setBackground(new java.awt.Color(255, 0, 0));
        jbtPDF.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jbtPDF.setForeground(new java.awt.Color(255, 255, 255));
        jbtPDF.setText("Xuất PDF");
        jbtPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPDFActionPerformed(evt);
            }
        });

        jbtClear.setBackground(new java.awt.Color(255, 0, 0));
        jbtClear.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jbtClear.setForeground(new java.awt.Color(255, 255, 255));
        jbtClear.setText("Clear");
        jbtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClearActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Chức vụ", "Số ngày làm việc", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xuất excel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbDob, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlbNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jlbID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jbtSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jbtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuongActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void jcbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbChucVuActionPerformed

    private void txtNgayLamViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayLamViecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayLamViecActionPerformed

    private void jbtPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtPDFActionPerformed

    private void jbtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClearActionPerformed
        jcbChucVu.setSelectedIndex(0);
        txtName.setText("");
        txtNgayLamViec.setText("");
        txtDob.setText("");
        txtID.setText("");
        txtAddress.setText("");
        txtGender.setText("");
        txtLuong.setText("");
    }//GEN-LAST:event_jbtClearActionPerformed

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM can_bo WHERE ID=?");
                preparedStatement.setString(1, txtID.getText());
                ResultSet rs = preparedStatement.executeQuery();
                
                if(rs.next()){
                    String hoTen = rs.getString("ho_ten");
                    txtName.setText(hoTen);
                    
                    String ngaySinh = String.valueOf(rs.getDate("ngay_sinh"));
                    txtDob.setText(ngaySinh);
                    
                    String gioiTinh = rs.getString("Gioi_tinh");
                    txtGender.setText(gioiTinh);
                    
                    String diaChi = rs.getString("dia_chi");
                    txtAddress.setText(diaChi);
                    
                    String chucVu = rs.getString("chuc_vu");
                    jcbChucVu.setSelectedItem(chucVu);
                    
                    int soNgayLamViec = rs.getInt("so_ngay_lam_viec");
                    txtNgayLamViec.setText(String.valueOf(soNgayLamViec));
                    
                    double luong = rs.getDouble("Luong");
                    
                    
                    model.addRow(new Object[]{
                        txtID.getText(), hoTen, ngaySinh, gioiTinh, diaChi, chucVu, soNgayLamViec, luong
                    });
                }
                else{
                    JOptionPane.showMessageDialog(null, "Không tìm thấy cán bộ phù hợp!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtClear;
    private javax.swing.JButton jbtPDF;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JComboBox<String> jcbChucVu;
    private javax.swing.JLabel jlbAddress;
    private javax.swing.JLabel jlbChucVu;
    private javax.swing.JLabel jlbDob;
    private javax.swing.JLabel jlbGender;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbLuong;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbNgayLamViec;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgayLamViec;
    // End of variables declaration//GEN-END:variables
}
