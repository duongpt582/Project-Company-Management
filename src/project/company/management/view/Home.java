
package project.company.management.view;

import javax.swing.table.DefaultTableModel;
import project.company.management.DatabaseCanBo;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.*;

public final class Home extends javax.swing.JPanel {

    DefaultTableModel model;
    DatabaseCanBo db;
   
    public Home() throws SQLException {
        initComponents();
        
        model = (DefaultTableModel) tableInfomation.getModel();
        
        //Tạo ra các cột với các tiêu đề
        model.setColumnIdentifiers(new Object[]{
                "STT", "ID","Chức Vụ", "Tên", "Ngày sinh", "Địa chỉ", "Số Ngày Làm Việc", "Lương" ,"Ngày Thêm"
        });
        showData();
        
    }
    public void showData() {
    String hoTen, diaChi, macanBo, ngaySinh;
    int id, soNgayLam;

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                System.out.println("Database Connection Success");

                Statement statement;
                statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM can_bo");

                int i = 0;
                while (rs.next()) {
                    hoTen = rs.getString("ho_ten");
                    ngaySinh = rs.getString("ngay_sinh");
                    diaChi = rs.getString("dia_chi");
                    macanBo = rs.getString("ma_can_bo");


                    model.addRow(new Object[]{
                            i++, null, null, hoTen, ngaySinh, diaChi, macanBo, null, null
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfomation = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1164, 0, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 102));

        jButton1.setText("jButton1");

        tableInfomation.setModel(new javax.swing.table.DefaultTableModel(
        ));
        tableInfomation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tableInfomation);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton1))

        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1139, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)

        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1180, 610));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tableInfomation;


    // End of variables declaration//GEN-END:variables
}
