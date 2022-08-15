/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.company.management.view;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.company.management.database.DatabaseCanBo;
import java.io.FileNotFoundException;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author thinkpro
 */
public class PDF extends javax.swing.JPanel {

    DefaultTableModel model;
    DatabaseCanBo db; 
    
    public PDF() {
        initComponents();
        
        model = (DefaultTableModel) jTable1.getModel();
        
        //Tạo ra các cột với các tiêu đề
        model.setColumnIdentifiers(new Object[]{
                "STT", "ID","Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Chức vụ" ,"Số Ngày Làm Việc", "Lương"
        });
        showData();
        
    }
    public void showData() {
    String id,  hoTen, diaChi, gioiTinh, ngaySinh;
    int soNgayLam;

    try {
  

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
            System.out.println("Database Connection Success");

            Statement statement;
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM can_bo");

            int i = 1;
            while (rs.next()) {
                id = rs.getString(2);
                hoTen = rs.getString("ho_ten");
                ngaySinh = rs.getString("ngay_sinh");
                
                gioiTinh = rs.getString(5);
                diaChi = rs.getString(6);
                String chucVu = rs.getString(7);
                String soNgayLamViec = rs.getString(8);
                double luong = rs.getDouble(9);

                model.addRow(new Object[]{
                        i++, id,hoTen,ngaySinh , gioiTinh, diaChi,chucVu, soNgayLamViec, String.format("%,.2f", luong)
                });
            }

            } catch (SQLException ex) {
                Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    int num =0;
    String idNum;
    

    
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
        jbtPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/pdf.png"))); // NOI18N
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
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jcbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jlbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jbtPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jcbChucVu)
                    .addComponent(txtNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPDF)
                    .addComponent(jbtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
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
//Xuat file PDF
    private void jbtPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPDFActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String gioiTinh = txtGender.getText();
        String diaChi = txtAddress.getText();
        String ngaySinh = txtDob.getText();
        String chucVu = (String) jcbChucVu.getSelectedItem();
        String ngayLam =txtNgayLamViec.getText();
        String Luong = txtLuong.getText();
        
        
        idNum = txtID.getText();

        
        String path ="File";
        // tạo một document
        Document doc = new Document();
        
        try{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile = fileChooser.getSelectedFile();
            
            if (saveFile != null ) {
                saveFile = new File(saveFile.toString() + ".pdf");
                
                // khởi tạo một PdfWriter truyền vào document và FileOutputStream
                PdfWriter.getInstance(doc, new FileOutputStream(new File(saveFile.toString())));
                num++;
                 // mở file để thực hiện viết
                doc.open();
                // thêm nội dung sử dụng add function
                Paragraph paragraph1 = new Paragraph("                                  He Thong Quan Ly Can Bo Cong Ty\n");
                doc.add(paragraph1);

                Paragraph paragraph2 = new Paragraph("********************************************************************************************");
                doc.add(paragraph2);

                Paragraph paragraph3 = new Paragraph("""
                                                     \tThong tin can bo chi tiet: 
                                                     Ma can bo: """+idNum+"\nHo va ten: "+ name+"\nGioi tinh: "+gioiTinh+"\nNgay Sinh: "+ ngaySinh+
                        "\nDia chi: "+diaChi+"\nSo ngay lam viec: "+ngayLam+"\nChuc vu trong cong ty: "+ chucVu+"\nLuong: "+Luong);
                doc.add(paragraph3);

                Paragraph paragraph4 = new Paragraph("********************************************************************************************");
                doc.add(paragraph4);

                Paragraph paragraph5 = new Paragraph("Cam on ban da su dung dich vu!");
                doc.add(paragraph5);
                
            } else {
                JOptionPane.showMessageDialog(null, "Lỗi tạo file!!!");
            }
            
            int a = JOptionPane.showConfirmDialog(null, "Do you want to print customer detail","Select",JOptionPane.YES_NO_OPTION);
//            if (a==0) {
//                try 
//                {
//                    if(!new File(saveFile.toString()).exists()) {
//                        System.err.println("File is not Exists");
//                    } else {
//                        Process p = Runtime.getRuntime().exec("File"+num+".pdf");// open a new notepad
//                    }
//                } catch (IOException e) 
//                {
//                    JOptionPane.showMessageDialog(null, e);
//                }
//
//            }
            
        }catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
        // dong file
        doc.close();
        
        
        
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
//Tim kiem can bo
    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        txtName.setEditable(false);
        txtGender.setEditable(false);
        txtDob.setEditable(false);
        txtLuong.setEditable(false);
        txtNgayLamViec.setEditable(false);
        txtAddress.setEditable(false);
        txtName.setEditable(false);
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
                    txtLuong.setText(String.valueOf(luong));
                    
                    int i=1;
                    model.addRow(new Object[]{
                        i++,txtID.getText(), hoTen, ngaySinh, gioiTinh, diaChi, chucVu, soNgayLamViec, luong
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
