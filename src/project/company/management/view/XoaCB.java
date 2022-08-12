
package project.company.management.view;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.company.management.DatabaseCanBo;


public class XoaCB extends javax.swing.JPanel {

    
    
    
    DefaultTableModel model;
    DatabaseCanBo db; 
    
    
    public XoaCB() {
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
                String luong = rs.getString(9);

                model.addRow(new Object[]{
                        i++, id,hoTen,ngaySinh , gioiTinh, diaChi,chucVu, soNgayLamViec, luong
                });
            }

            } catch (SQLException ex) {
                Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        txtInput = new javax.swing.JTextField();
        btnDelete = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 102, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(339, 420));

        txtInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInputKeyPressed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhập mã cán bộ cần xóa");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 153, 255));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(804, 642));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                PreparedStatement ps1 = con.prepareStatement("SELECT * FROM can_bo where ma_can_bo=?");
                PreparedStatement ps2 = con.prepareStatement("DELETE FROM can_bo where ma_can_bo=?");
                ps1.setString(1, txtInput.getText());
                ResultSet rs = ps1.executeQuery();
                if(rs.next()){
                    if(JOptionPane.showConfirmDialog(null, "Xác nhận xóa cán bộ khỏi danh sách",
                            "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                        ps2.setString(1, txtInput.getText());
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Xóa cán bộ thành công!");
                        showTable();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Không tồn tại cán bộ cần xóa!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(XoaCB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XoaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnDelete.doClick();
            txtInput.setText("");
        }
    }//GEN-LAST:event_txtInputKeyPressed

    private void showTable(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                PreparedStatement ps = con.prepareStatement("SELECT * FROM can_bo");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Vector vector = new Vector();
                    vector.add(rs.getString("ho_ten"));
                    vector.add(rs.getString("ngay_sinh"));
                    vector.add(rs.getString("dia_chi"));
                    vector.add(rs.getString("chuc_vu"));
                    vector.add(rs.getString("ma_can_bo"));
                    model.addRow(vector);
                }
            } catch (SQLException ex) {
                Logger.getLogger(XoaCB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XoaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
