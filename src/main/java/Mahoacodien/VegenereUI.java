package Mahoacodien;

import javax.swing.JOptionPane;

public class VegenereUI extends javax.swing.JFrame {

    public VegenereUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        P_Text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        C_Text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Encryption_Button = new javax.swing.JButton();
        Key_Encryption = new javax.swing.JTextField();
        Generate_Key_Encryp = new javax.swing.JTextField();
        Key_Decryption = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Generate_Key_Decryp = new javax.swing.JTextField();
        Decryption_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VEGENERE");

        P_Text.setColumns(20);
        P_Text.setRows(5);
        P_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane1.setViewportView(P_Text);

        C_Text.setColumns(20);
        C_Text.setRows(5);
        C_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane2.setViewportView(C_Text);

        jLabel1.setText("Key");

        jLabel2.setText("Key");

        jLabel3.setText("Key generation");

        Encryption_Button.setText("Encryption");
        Encryption_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encryption_ButtonActionPerformed(evt);
            }
        });

        Key_Encryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

        Generate_Key_Encryp.setMargin(new java.awt.Insets(3, 6, 2, 6));

        Key_Decryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

        jLabel4.setText("Key generation");

        Generate_Key_Decryp.setMargin(new java.awt.Insets(3, 6, 2, 6));

        Decryption_Button.setText("Decryption");
        Decryption_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decryption_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Encryption_Button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(72, 72, 72))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Generate_Key_Encryp)
                                .addComponent(Key_Decryption)
                                .addComponent(Generate_Key_Decryp, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                    .addComponent(Decryption_Button))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Generate_Key_Encryp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Encryption_Button)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Generate_Key_Decryp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Decryption_Button)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hàm chạy nút mã hóa
    private void Encryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encryption_ButtonActionPerformed
        if (P_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(VegenereUI.this, "Nhap van ban can ma hoa!");
        } else if (Key_Encryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(VegenereUI.this,"Hay Nhap Key de ma hoa!");
        } else{
            String text = P_Text.getText();
            String shift = Key_Encryption.getText();
            String C_TextString = encrypt(text, shift);
            C_Text.setText(C_TextString);
            Generate_Key_Encryp.setText(generateKey(text, shift));
        }
    }//GEN-LAST:event_Encryption_ButtonActionPerformed

    // Hàm chạy nút giải mã
    private void Decryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decryption_ButtonActionPerformed
        if (C_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(VegenereUI.this, "Nhap van ban can giai ma!");
        } else if (Key_Decryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(VegenereUI.this,"Hay nhap Key de giai ma!");
        } else{
            String text = C_Text.getText();
            String shift = Key_Decryption.getText();
            String P_TexString = decrypt(text, shift);
            P_Text.setText(P_TexString);
            Generate_Key_Decryp.setText(generateKey(text, shift));
        }
    }//GEN-LAST:event_Decryption_ButtonActionPerformed

    // Phương thức mã hóa Vegenere
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = generateKey(text, key).toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            // Chỉ mã hóa các ký tự là chữ cái
            if (Character.isLetter(text.charAt(i))) {
                char c = (char) (((text.charAt(i) + key.charAt(i)) % 26) + 'A');
                result.append(c);
            } else {
                result.append(text.charAt(i));  // Giữ nguyên các ký tự không phải chữ
            }
        }

        return result.toString();
    }

    // Phương thức giải mã Vegenere
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = generateKey(text, key).toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            // Chỉ giải mã các ký tự là chữ cái
            if (Character.isLetter(text.charAt(i))) {
                char c = (char) (((text.charAt(i) - key.charAt(i) + 26) % 26) + 'A');
                result.append(c);
            } else {
                result.append(text.charAt(i));  // Giữ nguyên các ký tự không phải chữ
            }
        }

        return result.toString();
    }

    // Phương thức sinh khóa: lặp lại khóa cho đủ độ dài văn bản
    private static String generateKey(String text, String key) {
        StringBuilder result = new StringBuilder(key);
        int keyLength = key.length();

        for (int i = 0; i < text.length() - keyLength; i++) {
            result.append(key.charAt(i % keyLength));
        }

        return result.toString();
    }
    
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
            java.util.logging.Logger.getLogger(VegenereUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VegenereUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VegenereUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VegenereUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VegenereUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea C_Text;
    private javax.swing.JButton Decryption_Button;
    private javax.swing.JButton Encryption_Button;
    private javax.swing.JTextField Generate_Key_Decryp;
    private javax.swing.JTextField Generate_Key_Encryp;
    private javax.swing.JTextField Key_Decryption;
    private javax.swing.JTextField Key_Encryption;
    private javax.swing.JTextArea P_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
