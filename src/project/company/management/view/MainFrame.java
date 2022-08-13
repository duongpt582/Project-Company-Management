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
import project.company.management.model.DanhMucBean;
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

        setLocationRelativeTo(null);

        panelMenu.paintComponents(g);
        
        

        ChuyenManHinhController controller = new ChuyenManHinhController(panelView);
        controller.setView(panelHome, labelHome);
        controller.setView(panelThem, labelThem);
        controller.setView(panelSua, labelSua);
        controller.setView(panelXoa, labelXoa);
        controller.setView(panelPDF, labelPDF);
        controller.setView(panelExportExcelPanel, labelExportExcelPanel);
        
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("Home", panelHome, labelHome));
        listItem.add(new DanhMucBean("ThemCanBo", panelThem, labelThem));
        listItem.add(new DanhMucBean("SuaCanBo", panelSua, labelSua));
        listItem.add(new DanhMucBean("XoaCanBo", panelXoa, labelXoa));
        listItem.add(new DanhMucBean("PDF", panelPDF, labelPDF));
        listItem.add(new DanhMucBean("ExportExcelPanel", panelExportExcelPanel, labelExportExcelPanel));
        
        controller.setEvent(listItem);
        
        this.pack();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        panelThem = new javax.swing.JPanel();
        labelThem = new javax.swing.JLabel();
        panelSua = new javax.swing.JPanel();
        labelSua = new javax.swing.JLabel();
        panelXoa = new javax.swing.JPanel();
        labelXoa = new javax.swing.JLabel();
        panelPDF = new javax.swing.JPanel();
        labelPDF = new javax.swing.JLabel();
        panelExportExcelPanel = new javax.swing.JPanel();
        labelExportExcelPanel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpnBar = new javax.swing.JPanel();
        searchText1 = new project.company.management.view.SearchText();
        jLabel2 = new javax.swing.JLabel();
        panelView = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 255, 255));
        setResizable(false);

        panelMenu.setBackground(new java.awt.Color(0, 51, 102));
        panelMenu.paintComponents(g);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        jPanel3.setBackground(new java.awt.Color(0, 66, 128));

        panelHome.setBackground(new java.awt.Color(0, 66, 128));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        panelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelHome.setBackground(new java.awt.Color(0, 66, 128));
        labelHome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/homeIcon.png"))); // NOI18N
        labelHome.setText("Trang chủ");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelThem.setBackground(new java.awt.Color(0, 66, 128));
        panelThem.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        labelThem.setBackground(new java.awt.Color(0, 66, 128));
        labelThem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelThem.setForeground(new java.awt.Color(255, 255, 255));
        labelThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/add-user.png"))); // NOI18N
        labelThem.setText("Thêm mới");

        javax.swing.GroupLayout panelThemLayout = new javax.swing.GroupLayout(panelThem);
        panelThem.setLayout(panelThemLayout);
        panelThemLayout.setHorizontalGroup(
            panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelThem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThemLayout.setVerticalGroup(
            panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelSua.setBackground(new java.awt.Color(0, 66, 128));
        panelSua.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));

        labelSua.setBackground(new java.awt.Color(0, 66, 128));
        labelSua.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelSua.setForeground(new java.awt.Color(255, 255, 255));
        labelSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/bugIcon.png"))); // NOI18N
        labelSua.setText("Sửa");

        javax.swing.GroupLayout panelSuaLayout = new javax.swing.GroupLayout(panelSua);
        panelSua.setLayout(panelSuaLayout);
        panelSuaLayout.setHorizontalGroup(
            panelSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSuaLayout.setVerticalGroup(
            panelSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelXoa.setBackground(new java.awt.Color(0, 66, 128));
        panelXoa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        labelXoa.setBackground(new java.awt.Color(0, 66, 128));
        labelXoa.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelXoa.setForeground(new java.awt.Color(255, 255, 255));
        labelXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/delete.png"))); // NOI18N
        labelXoa.setText("Xoá");

        javax.swing.GroupLayout panelXoaLayout = new javax.swing.GroupLayout(panelXoa);
        panelXoa.setLayout(panelXoaLayout);
        panelXoaLayout.setHorizontalGroup(
            panelXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelXoaLayout.setVerticalGroup(
            panelXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPDF.setBackground(new java.awt.Color(0, 66, 128));
        panelPDF.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        labelPDF.setBackground(new java.awt.Color(0, 66, 128));
        labelPDF.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelPDF.setForeground(new java.awt.Color(255, 255, 255));
        labelPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/printer.png"))); // NOI18N
        labelPDF.setText("Xuất PDF");

        javax.swing.GroupLayout panelPDFLayout = new javax.swing.GroupLayout(panelPDF);
        panelPDF.setLayout(panelPDFLayout);
        panelPDFLayout.setHorizontalGroup(
            panelPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPDFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPDFLayout.setVerticalGroup(
            panelPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPDFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelExportExcelPanel.setBackground(new java.awt.Color(0, 66, 128));
        panelExportExcelPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        labelExportExcelPanel.setBackground(new java.awt.Color(0, 66, 128));
        labelExportExcelPanel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelExportExcelPanel.setForeground(new java.awt.Color(255, 255, 255));
        labelExportExcelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/excel-64.png"))); // NOI18N
        labelExportExcelPanel.setText("Xuất Excel");

        javax.swing.GroupLayout panelExportExcelPanelLayout = new javax.swing.GroupLayout(panelExportExcelPanel);
        panelExportExcelPanel.setLayout(panelExportExcelPanelLayout);
        panelExportExcelPanelLayout.setHorizontalGroup(
            panelExportExcelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExportExcelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelExportExcelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelExportExcelPanelLayout.setVerticalGroup(
            panelExportExcelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExportExcelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelExportExcelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelExportExcelPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelExportExcelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
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
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jpnBarLayout.setVerticalGroup(
            jpnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panelView.setBackground(new java.awt.Color(235, 235, 235));
        panelView.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        panelView.setDoubleBuffered(false);

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpnBar;
    private javax.swing.JLabel labelExportExcelPanel;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelPDF;
    private javax.swing.JLabel labelSua;
    private javax.swing.JLabel labelThem;
    private javax.swing.JLabel labelXoa;
    private javax.swing.JPanel panelExportExcelPanel;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPDF;
    private javax.swing.JPanel panelSua;
    private javax.swing.JPanel panelThem;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel panelXoa;
    private project.company.management.view.SearchText searchText1;
    // End of variables declaration//GEN-END:variables

  
}
