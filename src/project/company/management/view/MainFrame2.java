
package project.company.management.view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.company.management.bean.DanhMucBean;
import project.company.management.controller.ChuyenManHinhController;


public class MainFrame2 extends javax.swing.JFrame {

    private Graphics g;

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#1cb5e0"), 0, getHeight(), Color.decode("#1cb5e0"));
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        
        super.paintComponents(g);
        
    }
    /**
     *
     * @throws SQLException
     */
    public MainFrame2() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Can Bo");
//        jpnMenu.paintComponents(g);
        
        
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnHome, jlbHome);
        controller.setView(jpnThem, jlbThem);
        controller.setView(jpnSua, jlbSua);
        controller.setView(jpnXoa, jlbXoa);
//        controller.setView(jpnTimKiem, jlbTimKiem);
//        controller.setView(jpnCheckin, jlbCheckin);
        
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("Home", jpnHome, jlbHome));
        listItem.add(new DanhMucBean("ThemCanBo", jpnThem, jlbThem));
        listItem.add(new DanhMucBean("SuaCanBo", jpnSua, jlbSua));
        listItem.add(new DanhMucBean("XoaCanBo", jpnXoa, jlbXoa));
//        listItem.add(new DanhMucBean("TimKiemCanBo", jpnTimKiem, jlbTimKiem));
//        listItem.add(new DanhMucBean("Checkin", jpnCheckin, jlbCheckin));
        
        controller.setEvent(listItem);
        
        this.pack();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplTieuDe = new javax.swing.JPanel();
        jlbTieuDe = new javax.swing.JLabel();
        jpnMenu = new javax.swing.JPanel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnThem = new javax.swing.JPanel();
        jlbThem = new javax.swing.JLabel();
        jpnSua = new javax.swing.JPanel();
        jlbSua = new javax.swing.JLabel();
        jpnXoa = new javax.swing.JPanel();
        jlbXoa = new javax.swing.JLabel();
        jpnPDF = new javax.swing.JPanel();
        jlbPDF = new javax.swing.JLabel();
        jpnLogOut = new javax.swing.JPanel();
        jlbLogOut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTieuDe.setFont(new java.awt.Font("Apple Chancery", 0, 30)); // NOI18N
        jlbTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTieuDe.setText("Quản Lý Cán Bộ");
        jlbTieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jplTieuDeLayout = new javax.swing.GroupLayout(jplTieuDe);
        jplTieuDe.setLayout(jplTieuDeLayout);
        jplTieuDeLayout.setHorizontalGroup(
            jplTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTieuDeLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jlbTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jplTieuDeLayout.setVerticalGroup(
            jplTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jplTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpnHome.setBackground(new java.awt.Color(255, 255, 255));
        jpnHome.setForeground(new java.awt.Color(255, 255, 255));

        jlbHome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 102, 0));
        jlbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/homeIcon.png"))); // NOI18N
        jlbHome.setText("Home");
        jlbHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnThem.setBackground(new java.awt.Color(255, 255, 255));

        jlbThem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbThem.setForeground(new java.awt.Color(255, 102, 0));
        jlbThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/add-user.png"))); // NOI18N
        jlbThem.setText("Thêm");

        javax.swing.GroupLayout jpnThemLayout = new javax.swing.GroupLayout(jpnThem);
        jpnThem.setLayout(jpnThemLayout);
        jpnThemLayout.setHorizontalGroup(
            jpnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbThem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnThemLayout.setVerticalGroup(
            jpnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbThem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnSua.setBackground(new java.awt.Color(255, 255, 255));

        jlbSua.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbSua.setForeground(new java.awt.Color(255, 102, 0));
        jlbSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/bugIcon.png"))); // NOI18N
        jlbSua.setText("Sửa");

        javax.swing.GroupLayout jpnSuaLayout = new javax.swing.GroupLayout(jpnSua);
        jpnSua.setLayout(jpnSuaLayout);
        jpnSuaLayout.setHorizontalGroup(
            jpnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSuaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbSua, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnSuaLayout.setVerticalGroup(
            jpnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSuaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbSua, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnXoa.setBackground(new java.awt.Color(255, 255, 255));

        jlbXoa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbXoa.setForeground(new java.awt.Color(255, 102, 0));
        jlbXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/delete.png"))); // NOI18N
        jlbXoa.setText("Xóa");

        javax.swing.GroupLayout jpnXoaLayout = new javax.swing.GroupLayout(jpnXoa);
        jpnXoa.setLayout(jpnXoaLayout);
        jpnXoaLayout.setHorizontalGroup(
            jpnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnXoaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnXoaLayout.setVerticalGroup(
            jpnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnXoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnPDF.setBackground(new java.awt.Color(255, 255, 255));

        jlbPDF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbPDF.setForeground(new java.awt.Color(255, 102, 0));
        jlbPDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/printer.png"))); // NOI18N
        jlbPDF.setText("Xuất PDF");

        javax.swing.GroupLayout jpnPDFLayout = new javax.swing.GroupLayout(jpnPDF);
        jpnPDF.setLayout(jpnPDFLayout);
        jpnPDFLayout.setHorizontalGroup(
            jpnPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPDFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnPDFLayout.setVerticalGroup(
            jpnPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPDFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnLogOut.setBackground(new java.awt.Color(255, 255, 255));

        jlbLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbLogOut.setForeground(new java.awt.Color(255, 102, 0));
        jlbLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/log-out.png"))); // NOI18N
        jlbLogOut.setText("Log out");

        javax.swing.GroupLayout jpnLogOutLayout = new javax.swing.GroupLayout(jpnLogOut);
        jpnLogOut.setLayout(jpnLogOutLayout);
        jpnLogOutLayout.setHorizontalGroup(
            jpnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLogOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnLogOutLayout.setVerticalGroup(
            jpnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLogOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jpnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jpnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jpnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 126, 1480, 590));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 1160, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainFrame2().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbLogOut;
    private javax.swing.JLabel jlbPDF;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbThem;
    private javax.swing.JLabel jlbTieuDe;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JPanel jplTieuDe;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnLogOut;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnPDF;
    private javax.swing.JPanel jpnSua;
    private javax.swing.JPanel jpnThem;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnXoa;
    // End of variables declaration//GEN-END:variables
}
