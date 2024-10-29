package Mahoacodien;

public class MainUI extends javax.swing.JFrame {

    public MainUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Ceasar_Menu = new javax.swing.JButton();
        Bangchudon_Menu = new javax.swing.JButton();
        Playfair_Menu = new javax.swing.JButton();
        Vegenere_Menu = new javax.swing.JButton();
        Chuyendichdong_Menu = new javax.swing.JButton();
        Exit_Menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Ceasar_MenuBar = new javax.swing.JMenuItem();
        Bangchudon_Menubar = new javax.swing.JMenuItem();
        Playfair_Menubar = new javax.swing.JMenuItem();
        Vegenere_Menubar = new javax.swing.JMenuItem();
        Chuyendichdong_Menubar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU MA HOA CO DIEN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("MÃ HÓA CỔ ĐIỂN v1");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentY(0.0F);

        Ceasar_Menu.setText("CEASAR");
        Ceasar_Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ceasar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ceasar_MenuActionPerformed(evt);
            }
        });

        Bangchudon_Menu.setText("BANG CHU DON");
        Bangchudon_Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bangchudon_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bangchudon_MenuActionPerformed(evt);
            }
        });

        Playfair_Menu.setText("PLAYFAIR");
        Playfair_Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Playfair_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Playfair_MenuActionPerformed(evt);
            }
        });

        Vegenere_Menu.setText("VEGENERE");
        Vegenere_Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Vegenere_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vegenere_MenuActionPerformed(evt);
            }
        });

        Chuyendichdong_Menu.setText("CHUYEN DICH DONG");
        Chuyendichdong_Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Chuyendichdong_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chuyendichdong_MenuActionPerformed(evt);
            }
        });

        Exit_Menu.setText("EXIT");
        Exit_Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Exit_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_MenuActionPerformed(evt);
            }
        });

        jLabel3.setText("Hãy chọn chức năng!");

        jMenu1.setText("Options");

        Ceasar_MenuBar.setText("Ceasar");
        Ceasar_MenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ceasar_MenuBarActionPerformed(evt);
            }
        });
        jMenu1.add(Ceasar_MenuBar);

        Bangchudon_Menubar.setText("Bang chu don");
        Bangchudon_Menubar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bangchudon_MenubarActionPerformed(evt);
            }
        });
        jMenu1.add(Bangchudon_Menubar);

        Playfair_Menubar.setText("Playfair");
        Playfair_Menubar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Playfair_MenubarActionPerformed(evt);
            }
        });
        jMenu1.add(Playfair_Menubar);

        Vegenere_Menubar.setText("Vegenere");
        Vegenere_Menubar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vegenere_MenubarActionPerformed(evt);
            }
        });
        jMenu1.add(Vegenere_Menubar);

        Chuyendichdong_Menubar.setText("Chuyen dich dong");
        Chuyendichdong_Menubar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chuyendichdong_MenubarActionPerformed(evt);
            }
        });
        jMenu1.add(Chuyendichdong_Menubar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Chuyendichdong_Menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(Playfair_Menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ceasar_Menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Bangchudon_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(Vegenere_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Exit_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel3)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ceasar_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Bangchudon_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Playfair_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vegenere_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Chuyendichdong_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Exit_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ceasar_MenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ceasar_MenuBarActionPerformed
        // Mở bảng chức năng Ceasar trên Menubar
        new CeasarUI().setVisible(true);
    }//GEN-LAST:event_Ceasar_MenuBarActionPerformed

    private void Bangchudon_MenubarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bangchudon_MenubarActionPerformed
        // Mở bảng chức năng Bảng chữ đơn trên Menubar
        new BangchudonUI().setVisible(true);
    }//GEN-LAST:event_Bangchudon_MenubarActionPerformed

    private void Playfair_MenubarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Playfair_MenubarActionPerformed
        // Mở bảng chức năng Playfair trên Menubar
        new PlayfairUI().setVisible(true);
    }//GEN-LAST:event_Playfair_MenubarActionPerformed

    private void Vegenere_MenubarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vegenere_MenubarActionPerformed
        // Mở bảng chức năng Vegenere trên Menubar
        new VegenereUI().setVisible(true);
    }//GEN-LAST:event_Vegenere_MenubarActionPerformed

    private void Chuyendichdong_MenubarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chuyendichdong_MenubarActionPerformed
        // Mở bảng chức năng Chuyển dịch dòng trên Menubar
        new ChuyendichdongUI().setVisible(true);
    }//GEN-LAST:event_Chuyendichdong_MenubarActionPerformed

    private void Bangchudon_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bangchudon_MenuActionPerformed
        // Mở bảng chức năng Bảng chữ đơn
        new BangchudonUI().setVisible(true);
    }//GEN-LAST:event_Bangchudon_MenuActionPerformed

    private void Exit_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_MenuActionPerformed
        // Thoát khỏi chương trình
        System.exit(0);
    }//GEN-LAST:event_Exit_MenuActionPerformed

    private void Ceasar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ceasar_MenuActionPerformed
        // Mở bảng chức năng Ceasar
        new CeasarUI().setVisible(true);
    }//GEN-LAST:event_Ceasar_MenuActionPerformed

    private void Playfair_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Playfair_MenuActionPerformed
        // Mở bảng chức năng Playfair
        new PlayfairUI().setVisible(true);
    }//GEN-LAST:event_Playfair_MenuActionPerformed

    private void Vegenere_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vegenere_MenuActionPerformed
        // Mở bảng chức năng Vegenere
        new VegenereUI().setVisible(true);
    }//GEN-LAST:event_Vegenere_MenuActionPerformed

    private void Chuyendichdong_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chuyendichdong_MenuActionPerformed
        // Mở bảng chức năng Chuyển dịch dòng
        new ChuyendichdongUI().setVisible(true);
    }//GEN-LAST:event_Chuyendichdong_MenuActionPerformed
                                          
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bangchudon_Menu;
    private javax.swing.JMenuItem Bangchudon_Menubar;
    private javax.swing.JButton Ceasar_Menu;
    private javax.swing.JMenuItem Ceasar_MenuBar;
    private javax.swing.JButton Chuyendichdong_Menu;
    private javax.swing.JMenuItem Chuyendichdong_Menubar;
    private javax.swing.JButton Exit_Menu;
    private javax.swing.JButton Playfair_Menu;
    private javax.swing.JMenuItem Playfair_Menubar;
    private javax.swing.JButton Vegenere_Menu;
    private javax.swing.JMenuItem Vegenere_Menubar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
