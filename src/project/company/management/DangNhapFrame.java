
package project.company.management;

import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;
import project.company.management.view.MainFrame;


public class DangNhapFrame extends javax.swing.JFrame {

    public DangNhapFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        close_label = new javax.swing.JLabel();
        bt_cancel = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        tf_tai_khoan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pf_mat_khau = new javax.swing.JPasswordField();
        bt_ok = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 51, 51));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 51));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/icons8_google_code_300px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/icons8_java_100px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/icon_app.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 600));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 102, 102));
        kGradientPanel2.setkGradientFocus(50);
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");

        close_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/icons8_close_30px.png"))); // NOI18N
        close_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_labelMouseClicked(evt);
            }
        });

        bt_cancel.setText("Cancel");
        bt_cancel.setkEndColor(new java.awt.Color(196, 199, 82));
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Tài khoản");

        tf_tai_khoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tf_tai_khoan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_tai_khoan.setRequestFocusEnabled(true);
        tf_tai_khoan.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabel8.setText("Mật khẩu");

        pf_mat_khau.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        pf_mat_khau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_mat_khauActionPerformed(evt);
            }
        });
        pf_mat_khau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_mat_khauKeyPressed(evt);
            }
        });

        bt_ok.setText("OK");
        bt_ok.setkEndColor(new java.awt.Color(196, 199, 82));
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close_label))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(tf_tai_khoan, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pf_mat_khau, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(99, Short.MAX_VALUE)))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(close_label)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(468, Short.MAX_VALUE))
            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tf_tai_khoan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pf_mat_khau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(108, 108, 108)))
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 660, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_labelMouseClicked

    private void pf_mat_khauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_mat_khauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_mat_khauActionPerformed

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
        // nếu tài khoản nhập vào giống với database thì cho vào trong.
        DatabaseUser db = new DatabaseUser();
        
        String usernameInput = tf_tai_khoan.getText();
        String password = String.valueOf(pf_mat_khau.getPassword());
        
        boolean isRight = db.searchData(usernameInput, password);
        
        if (isRight) {
            JOptionPane.showMessageDialog(rootPane, "Login success");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Login Failure");
        }

        System.out.println("" + password);

    }//GEN-LAST:event_bt_okActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
        tf_tai_khoan.setText("");
        pf_mat_khau.setText("");
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void pf_mat_khauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_mat_khauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DatabaseUser db = new DatabaseUser();
        
        String usernameInput = tf_tai_khoan.getText();
        String password = String.valueOf(pf_mat_khau.getPassword());
        
        boolean isRight = db.searchData(usernameInput, password);
        
        if (isRight) {
            JOptionPane.showMessageDialog(rootPane, "Login success");
            MainFrame main = new MainFrame();
            main.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Login Failure");
        }

        System.out.println("" + password);
        }
    }//GEN-LAST:event_pf_mat_khauKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhapFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton bt_cancel;
    private com.k33ptoo.components.KButton bt_ok;
    private javax.swing.JLabel close_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPasswordField pf_mat_khau;
    private javax.swing.JTextField tf_tai_khoan;
    // End of variables declaration//GEN-END:variables
}
