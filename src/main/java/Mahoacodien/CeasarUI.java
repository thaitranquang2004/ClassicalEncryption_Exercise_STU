package Mahoacodien;

import javax.swing.JOptionPane;

public class CeasarUI extends javax.swing.JFrame {

    public CeasarUI() {
        initComponents();
    }

    // Phương thức để mã hóa văn bản
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Kiểm tra ký tự là chữ cái thường
            if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' + shift) % 26) + 'a');
                result.append(ch);
            }
            // Kiểm tra ký tự là chữ cái hoa
            else if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' + shift) % 26) + 'A');
                result.append(ch);
            } else {
                result.append(c); // Giữ nguyên các ký tự không phải là chữ
            }
        }

        return result.toString();
    }
    
    // Phương thức để giải mã văn bản
    public static String decrypt(String text, int shift) {
        // Đơn giản chỉ cần mã hóa với giá trị shift âm
        return encrypt(text, 26 - (shift % 26));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Encryption_Button = new javax.swing.JButton();
        Decryption_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Key_Encryption = new javax.swing.JSpinner();
        Key_Decryption = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        P_Text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        C_Text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CEASAR");

        jLabel1.setText("Key");

        Encryption_Button.setText("Encryption");
        Encryption_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encryption_ButtonActionPerformed(evt);
            }
        });

        Decryption_Button.setText("Decryption");
        Decryption_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decryption_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Key");

        P_Text.setColumns(20);
        P_Text.setRows(5);
        P_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane1.setViewportView(P_Text);

        C_Text.setColumns(20);
        C_Text.setRows(5);
        C_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane2.setViewportView(C_Text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Encryption_Button)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Decryption_Button)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(Encryption_Button)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Decryption_Button)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hàm chạy nút mã hóa
    private void Encryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encryption_ButtonActionPerformed
        if (P_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(CeasarUI.this, "Nhap van ban can ma hoa!");
        } else{
            String text = P_Text.getText();
            int shift = (Integer )Key_Encryption.getValue();
            String C_TextString = encrypt(text, shift);
            C_Text.setText(C_TextString);
        }
        
    }//GEN-LAST:event_Encryption_ButtonActionPerformed

    // Hàm chạy nút giải mã
    private void Decryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decryption_ButtonActionPerformed
        if (C_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(CeasarUI.this, "Nhap van ban can giai ma!");
        } else{
            String text = C_Text.getText();
            int shift = (Integer) Key_Decryption.getValue();
            String P_TextString = decrypt(text, shift);
            P_Text.setText(P_TextString);
        }
    }//GEN-LAST:event_Decryption_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CeasarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CeasarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CeasarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CeasarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CeasarUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea C_Text;
    private javax.swing.JButton Decryption_Button;
    private javax.swing.JButton Encryption_Button;
    private javax.swing.JSpinner Key_Decryption;
    private javax.swing.JSpinner Key_Encryption;
    private javax.swing.JTextArea P_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
