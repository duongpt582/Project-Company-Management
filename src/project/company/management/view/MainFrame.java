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

public class MainFrame extends javax.swing.JFrame {

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
    

    public MainFrame() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Can Bo");
        jpnMenu.paintComponents(g);
        
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnHome, jlbHome);
        controller.setView(jpnThem, jlbThem);
        controller.setView(jpnSua, jlbSua);
        controller.setView(jpnXoa, jlbXoa);
        controller.setView(jpnTimKiem, jlbTimKiem);
        controller.setView(jpnCheckin, jlbCheckin);
        
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("Home", jpnHome, jlbHome));
        listItem.add(new DanhMucBean("ThemCanBo", jpnThem, jlbThem));
        listItem.add(new DanhMucBean("SuaCanBo", jpnSua, jlbSua));
        listItem.add(new DanhMucBean("XoaCanBo", jpnXoa, jlbXoa));
        listItem.add(new DanhMucBean("TimKiemCanBo", jpnTimKiem, jlbTimKiem));
        listItem.add(new DanhMucBean("Checkin", jpnCheckin, jlbCheckin));
        
        controller.setEvent(listItem);
        
        this.pack();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnThem = new javax.swing.JPanel();
        jlbThem = new javax.swing.JLabel();
        jpnSua = new javax.swing.JPanel();
        jlbSua = new javax.swing.JLabel();
        jpnXoa = new javax.swing.JPanel();
        jlbXoa = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jlbTimKiem = new javax.swing.JLabel();
        jpnCheckin = new javax.swing.JPanel();
        jlbCheckin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpnBar = new javax.swing.JPanel();
        searchText1 = new project.company.management.view.SearchText();
        jLabel2 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 255, 255));
        setResizable(false);

        jpnMenu.setBackground(new java.awt.Color(0, 51, 102));
        jpnMenu.paintComponents(g);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        jPanel3.setBackground(new java.awt.Color(0, 66, 128));

        jpnHome.setBackground(new java.awt.Color(0, 66, 128));
        jpnHome.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jpnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbHome.setBackground(new java.awt.Color(0, 66, 128));
        jlbHome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 255, 255));
        jlbHome.setText("Trang chủ");

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThem.setBackground(new java.awt.Color(0, 66, 128));
        jpnThem.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jlbThem.setBackground(new java.awt.Color(0, 66, 128));
        jlbThem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbThem.setForeground(new java.awt.Color(255, 255, 255));
        jlbThem.setText("Thêm mới cán bộ");

        javax.swing.GroupLayout jpnThemLayout = new javax.swing.GroupLayout(jpnThem);
        jpnThem.setLayout(jpnThemLayout);
        jpnThemLayout.setHorizontalGroup(
            jpnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThemLayout.setVerticalGroup(
            jpnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnSua.setBackground(new java.awt.Color(0, 66, 128));
        jpnSua.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));

        jlbSua.setBackground(new java.awt.Color(0, 66, 128));
        jlbSua.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbSua.setForeground(new java.awt.Color(255, 255, 255));
        jlbSua.setText("Sửa thông tin cán bộ");

        javax.swing.GroupLayout jpnSuaLayout = new javax.swing.GroupLayout(jpnSua);
        jpnSua.setLayout(jpnSuaLayout);
        jpnSuaLayout.setHorizontalGroup(
            jpnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnSuaLayout.setVerticalGroup(
            jpnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSua, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnXoa.setBackground(new java.awt.Color(0, 66, 128));
        jpnXoa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jlbXoa.setBackground(new java.awt.Color(0, 66, 128));
        jlbXoa.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbXoa.setForeground(new java.awt.Color(255, 255, 255));
        jlbXoa.setText("Xoá cán bộ");

        javax.swing.GroupLayout jpnXoaLayout = new javax.swing.GroupLayout(jpnXoa);
        jpnXoa.setLayout(jpnXoaLayout);
        jpnXoaLayout.setHorizontalGroup(
            jpnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnXoaLayout.setVerticalGroup(
            jpnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnTimKiem.setBackground(new java.awt.Color(0, 66, 128));
        jpnTimKiem.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jlbTimKiem.setBackground(new java.awt.Color(0, 66, 128));
        jlbTimKiem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jlbTimKiem.setText("Tìm kiếm cán bộ");

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnCheckin.setBackground(new java.awt.Color(0, 66, 128));
        jpnCheckin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jlbCheckin.setBackground(new java.awt.Color(0, 66, 128));
        jlbCheckin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbCheckin.setForeground(new java.awt.Color(255, 255, 255));
        jlbCheckin.setText("Checkin giờ làm");

        javax.swing.GroupLayout jpnCheckinLayout = new javax.swing.GroupLayout(jpnCheckin);
        jpnCheckin.setLayout(jpnCheckinLayout);
        jpnCheckinLayout.setHorizontalGroup(
            jpnCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCheckinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnCheckinLayout.setVerticalGroup(
            jpnCheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCheckinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnCheckin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));

        jpnBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/baseline_search_black_24dp.png"))); // NOI18N

        javax.swing.GroupLayout jpnBarLayout = new javax.swing.GroupLayout(jpnBar);
        jpnBar.setLayout(jpnBarLayout);
        jpnBarLayout.setHorizontalGroup(
            jpnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBarLayout.setVerticalGroup(
            jpnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jpnView.setBackground(new java.awt.Color(235, 235, 235));
        jpnView.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jpnView.setDoubleBuffered(false);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
                    new MainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlbCheckin;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbThem;
    private javax.swing.JLabel jlbTimKiem;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JPanel jpnBar;
    private javax.swing.JPanel jpnCheckin;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnSua;
    private javax.swing.JPanel jpnThem;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnXoa;
    private project.company.management.view.SearchText searchText1;
    // End of variables declaration//GEN-END:variables

  
}
