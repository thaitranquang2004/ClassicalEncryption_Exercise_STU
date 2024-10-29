package Mahoacodien;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ChuyendichdongUI extends javax.swing.JFrame {

    public ChuyendichdongUI() {
        initComponents();
    }

    // Phương thức mã hóa văn bản
    public static String encrypt(String text, String key) {
        int[] keyOrder = getKeyOrder(key);
        int numCols = key.length();
        int numRows = (int) Math.ceil((double) text.length() / numCols);

        // Tạo ma trận với số hàng và số cột
        char[][] grid = new char[numRows][numCols];
        for (char[] row : grid) {
            Arrays.fill(row, ' ');  // Điền khoảng trắng vào những ô trống
        }

        // Điền văn bản vào ma trận theo hàng
        int index = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (index < text.length()) {
                    grid[row][col] = text.charAt(index++);
                }
            }
        }

        // Đọc văn bản theo thứ tự của khóa
        StringBuilder encryptedText = new StringBuilder();
        for (int col : keyOrder) {
            for (int row = 0; row < numRows; row++) {
                encryptedText.append(grid[row][col]);
            }
        }

        return encryptedText.toString().trim();
    }

    // Phương thức giải mã văn bản
    public static String decrypt(String encryptedText, String key) {
        int[] keyOrder = getKeyOrder(key);
        int numCols = key.length();
        int numRows = (int) Math.ceil((double) encryptedText.length() / numCols);

        // Tạo ma trận để chứa các ký tự mã hóa
        char[][] grid = new char[numRows][numCols];

        // Điền các ký tự mã hóa vào ma trận theo thứ tự của khóa
        int index = 0;
        for (int col : keyOrder) {
            for (int row = 0; row < numRows; row++) {
                if (index < encryptedText.length()) {
                    grid[row][col] = encryptedText.charAt(index++);
                }
            }
        }

        // Đọc văn bản theo thứ tự hàng để giải mã
        StringBuilder decryptedText = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                decryptedText.append(grid[row][col]);
            }
        }

        return decryptedText.toString().trim();
    }

    // Phương thức xác định thứ tự cột dựa trên khóa
    private static int[] getKeyOrder(String key) {
        char[] keyChars = key.toCharArray();
        Character[] sortedKey = new Character[key.length()];
        for (int i = 0; i < keyChars.length; i++) {
            sortedKey[i] = keyChars[i];
        }
        Arrays.sort(sortedKey);

        int[] keyOrder = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            keyOrder[i] = new String(keyChars).indexOf(sortedKey[i]);
            keyChars[keyOrder[i]] = '\0';  // Đánh dấu ký tự đã được sử dụng
        }

        return keyOrder;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        P_Text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        C_Text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Key_Encryption = new javax.swing.JTextField();
        Encryption_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Key_Decryption = new javax.swing.JTextField();
        Decryption_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHUYEN DICH DONG");

        P_Text.setColumns(20);
        P_Text.setRows(5);
        P_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane1.setViewportView(P_Text);

        C_Text.setColumns(20);
        C_Text.setRows(5);
        C_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane2.setViewportView(C_Text);

        jLabel1.setText("Key");

        Key_Encryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

        Encryption_Button.setText("Encryption");
        Encryption_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encryption_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Key");

        Key_Decryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Encryption_Button)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Decryption_Button)
                            .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Encryption_Button)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Decryption_Button)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hàm chạy nút mã hóa
    private void Encryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encryption_ButtonActionPerformed
        if (P_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ChuyendichdongUI.this,"Hay nhap van ban can ma hoa");
        } else if (Key_Encryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ChuyendichdongUI.this, "Hay nhap key ma hoa");
        } else {
            String text = P_Text.getText().replaceAll("\\s+", "");
            String shift = Key_Encryption.getText();
            String C_TextString = encrypt(text, shift);
            C_Text.setText(C_TextString);
        }
        
    }//GEN-LAST:event_Encryption_ButtonActionPerformed

    // Hàm chạy nút giải mã
    private void Decryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decryption_ButtonActionPerformed
        if (C_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ChuyendichdongUI.this,"Hay nhap van ban can giai ma");
        } else if (Key_Decryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ChuyendichdongUI.this, "Hay nhap key giai ma");
        } else {
            String text = C_Text.getText();
            String shift = Key_Decryption.getText();
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
            java.util.logging.Logger.getLogger(ChuyendichdongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyendichdongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyendichdongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyendichdongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyendichdongUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea C_Text;
    private javax.swing.JButton Decryption_Button;
    private javax.swing.JButton Encryption_Button;
    private javax.swing.JTextField Key_Decryption;
    private javax.swing.JTextField Key_Encryption;
    private javax.swing.JTextArea P_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
