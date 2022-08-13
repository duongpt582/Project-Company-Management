
package project.company.management.view;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SuaCB extends javax.swing.JPanel {

    
    public SuaCB() {
        initComponents();
        jlbChange.setVisible(false);
        txtChange.setVisible(false);
        ButtonGroup btnGr = new ButtonGroup();
        btnGr.add(btnNam);
        btnGr.add(btnNu);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        txtInput = new javax.swing.JTextField();
        btnFind = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoNgayLamViec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnUpdate = new com.k33ptoo.components.KButton();
        cbChucVu = new javax.swing.JComboBox<>();
        btnUpdate1 = new com.k33ptoo.components.KButton();
        txtChange = new javax.swing.JTextField();
        jlbChange = new javax.swing.JLabel();
        btnNam = new javax.swing.JRadioButton();
        btnNu = new javax.swing.JRadioButton();

        jLabel10.setText("jLabel10");

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));

        txtInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInputKeyPressed(evt);
            }
        });

        btnFind.setText("Tìm kiếm");
        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhập mã cán bộ cần sửa");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 153, 255));

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Chức vụ", "Số ngày làm việc", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblShow);
        if (tblShow.getColumnModel().getColumnCount() > 0) {
            tblShow.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblShow.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblShow.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblShow.getColumnModel().getColumn(7).setPreferredWidth(70);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel3.setText("Để sửa thông tin của cán bộ, hãy sửa bất kỳ thông tin phía dưới!");

        txtHoTen.setPreferredSize(new java.awt.Dimension(175, 40));

        txtNgaySinh.setPreferredSize(new java.awt.Dimension(175, 40));

        txtDiaChi.setPreferredSize(new java.awt.Dimension(175, 40));

        txtSoNgayLamViec.setPreferredSize(new java.awt.Dimension(175, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Họ tên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Giới tính");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Địa chỉ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Chức vụ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Số ngày làm việc");

        btnUpdate.setText("Sửa");
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Giám Đốc", "Trưởng Phòng", "Nhân Viên" }));
        cbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChucVuActionPerformed(evt);
            }
        });

        btnUpdate1.setText("Làm mới");
        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        txtChange.setPreferredSize(new java.awt.Dimension(110, 22));

        jlbChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbChange.setText("Thay đổi");
        jlbChange.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jlbChangeComponentHidden(evt);
            }
        });

        btnNam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNam.setText("Nam");

        btnNu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNu.setText("Nữ");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel2))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(236, 236, 236))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(94, 94, 94)))
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbChange)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jLabel9)
                                            .addComponent(cbChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(84, 84, 84)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7)
                                            .addComponent(txtSoNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                                .addComponent(btnNam)
                                                .addGap(65, 65, 65)
                                                .addComponent(btnNu))))))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNam)
                    .addComponent(btnNu))
                .addGap(41, 41, 41)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jlbChange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                DefaultTableModel model = (DefaultTableModel) tblShow.getModel();
                model.setRowCount(0);
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM can_bo WHERE ID=?");
                preparedStatement.setString(1, txtInput.getText());
                ResultSet rs = preparedStatement.executeQuery();
                
                if(rs.next()){
                    String hoTen = rs.getString("ho_ten");
                    txtHoTen.setText(hoTen);
                    
                    String ngaySinh = String.valueOf(rs.getDate("ngay_sinh"));
                    txtNgaySinh.setText(ngaySinh);
                    
                    String gioiTinh = rs.getString("Gioi_tinh");
                    if(gioiTinh.equals("Nam")) btnNam.doClick();
                    else btnNu.doClick();
                    
                    String diaChi = rs.getString("dia_chi");
                    txtDiaChi.setText(diaChi);
                    
                    String chucVu = rs.getString("chuc_vu");
                    cbChucVu.setSelectedItem(chucVu);
                    
                    int soNgayLamViec = rs.getInt("so_ngay_lam_viec");
                    txtSoNgayLamViec.setText(String.valueOf(soNgayLamViec));
                    
                    double luong = rs.getDouble("Luong");
                    
                    if(chucVu.equals("Trưởng Phòng"))
                        txtChange.setText(String.valueOf(luong - soNgayLamViec * 500000));
                    else if(chucVu.equals("Nhân Viên"))
                        txtChange.setText(String.valueOf(luong - soNgayLamViec * 200000));
                    
                    model.addRow(new Object[]{
                        txtInput.getText(), hoTen, ngaySinh, gioiTinh, diaChi, chucVu, soNgayLamViec, String.format("%,.2f", luong)
                    });
                    txtInput.setEditable(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Không tìm thấy cán bộ phù hợp!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SuaCB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtNgaySinh.setEditable(false);
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnFind.doClick();
        }
    }//GEN-LAST:event_txtInputKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                String gioiTinh;
                DefaultTableModel model = (DefaultTableModel) tblShow.getModel();
                model.setRowCount(0);
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                PreparedStatement preparedStatement = con.prepareStatement("UPDATE can_bo set ho_ten=?, ngay_sinh=?, Gioi_tinh=?,"
                        + "dia_chi=?, chuc_vu=?, so_ngay_lam_viec=?, luong=? WHERE ID=?");

                if(txtHoTen.getText().equals("") ||
                   txtNgaySinh.getText().equals("") || 
                   txtDiaChi.getText().equals("") || 
                   cbChucVu.getSelectedIndex() == 0 || 
                   txtSoNgayLamViec.getText().equals("") ||
                   txtChange.getText().equals("")){
                    
                        JOptionPane.showMessageDialog(null, "Không được để trống!");
                        btnFindActionPerformed(evt);
                }
                else if(JOptionPane.showConfirmDialog(null, "Xác nhận sửa thông tin của cán bộ?",
                            "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    
                        preparedStatement.setString(8, txtInput.getText());
                        preparedStatement.setString(1, txtHoTen.getText());
                        preparedStatement.setString(2, txtNgaySinh.getText());
                        if(btnNam.isSelected()){
                            preparedStatement.setString(3, btnNam.getText());
                            gioiTinh = btnNam.getText();
                        }
                        else{
                            preparedStatement.setString(3, btnNu.getText());
                            gioiTinh = btnNu.getText();
                        }
                        preparedStatement.setString(4, txtDiaChi.getText());
                        preparedStatement.setString(5, cbChucVu.getSelectedItem().toString());
                        preparedStatement.setString(6, txtSoNgayLamViec.getText());
                
                        double luong;
                        double thuong = Double.parseDouble(txtChange.getText());
                        if(cbChucVu.getSelectedItem().toString().equals("Giám Đốc"))
                            luong = Double.parseDouble(txtSoNgayLamViec.getText()) * 1000000;
                        else if(cbChucVu.getSelectedItem().toString().equals("Trưởng Phòng"))
                            luong = Double.parseDouble(txtSoNgayLamViec.getText()) * 500000 + thuong;
                        else luong = Double.parseDouble(txtSoNgayLamViec.getText()) * 200000 + thuong;
                        preparedStatement.setDouble(7, luong);
                        preparedStatement.executeUpdate();
                        model.addRow(new Object[]{
                            txtInput.getText(), txtHoTen.getText(), txtNgaySinh.getText(), gioiTinh,
                            txtDiaChi.getText(), cbChucVu.getSelectedItem().toString(), txtSoNgayLamViec.getText(), String.format("%,.2f", luong)
                        });
                        JOptionPane.showMessageDialog(null, "Sửa thành công!");
                   }
            } catch (SQLException ex) {
                Logger.getLogger(SuaCB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChucVuActionPerformed
        // TODO add your handling code here:
        int index = cbChucVu.getSelectedIndex();

        if (index == 0) {
            jlbChange.setText("Hãy chọn chức vụ");
            jlbChange.setVisible(true);
            txtChange.setVisible(false);
        }
        if (index == 1) {
            jlbChange.setVisible(false);
            txtChange.setVisible(false);
            txtChange.setText("0");
        }
        if (index == 2) {
            jlbChange.setText("Tiền phụ cấp quản lý:");
            jlbChange.setVisible(true);

            txtChange.setVisible(true);
            txtChange.setText("");
        }
        if (index == 3) {
            jlbChange.setText("Số tiền thưởng:");
            jlbChange.setVisible(true);

            txtChange.setVisible(true);
            txtChange.setText("");
        }
    }//GEN-LAST:event_cbChucVuActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        cbChucVu.setSelectedIndex(0);
        txtHoTen.setText("");
        txtSoNgayLamViec.setText("");
        txtNgaySinh.setText("");
        txtInput.setText("");
        txtDiaChi.setText("");
        ButtonGroup btnGr = new ButtonGroup();
        btnGr.add(btnNam);
        btnGr.add(btnNu);
        btnGr.clearSelection();
        txtInput.setEditable(true);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void jlbChangeComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jlbChangeComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbChangeComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnFind;
    private javax.swing.JRadioButton btnNam;
    private javax.swing.JRadioButton btnNu;
    private com.k33ptoo.components.KButton btnUpdate;
    private com.k33ptoo.components.KButton btnUpdate1;
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbChange;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoNgayLamViec;
    // End of variables declaration//GEN-END:variables
}
