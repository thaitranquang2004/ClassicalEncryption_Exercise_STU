package Mahoacodien;

import static Mahoacodien.BangchudonUI.encrypt;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class PlayfairUI extends javax.swing.JFrame {

    public PlayfairUI() {
        initComponents();
    }
    private String key;
    private char[][] matrix;

    public PlayfairUI(String key) {
        this.key = formatKey(key);
        this.matrix = generateMatrix(this.key);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        Generate_Key_Encryp = new javax.swing.JTextArea();
        GenerateKey_Button = new javax.swing.JButton();
        Encryption_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Key_Decryption = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Generate_Key_Decryp = new javax.swing.JTextArea();
        Decryption_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PLAYFAIR");

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

        Generate_Key_Encryp.setColumns(20);
        Generate_Key_Encryp.setRows(5);
        Generate_Key_Encryp.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane3.setViewportView(Generate_Key_Encryp);

        GenerateKey_Button.setText("Generate Key");
        GenerateKey_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateKey_ButtonActionPerformed(evt);
            }
        });

        Encryption_Button.setText("Encryption");
        Encryption_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encryption_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Key");

        Key_Decryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

        Generate_Key_Decryp.setColumns(20);
        Generate_Key_Decryp.setRows(5);
        Generate_Key_Decryp.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane4.setViewportView(Generate_Key_Decryp);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(GenerateKey_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Encryption_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Decryption_Button)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenerateKey_Button)
                            .addComponent(Encryption_Button))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Decryption_Button)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hàm chạy nút mã hóa
    private void Encryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encryption_ButtonActionPerformed
        if (P_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(PlayfairUI.this, "Nhap van ban can ma hoa!");
        } else if (Key_Encryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(PlayfairUI.this,"Hay nhap Key de ma hoa!");
        } else if (Generate_Key_Encryp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(PlayfairUI.this, "Hay GenerateKey ma hoa!");
        } else {
            String text = P_Text.getText();
            String shift = Key_Encryption.getText();
            PlayfairUI playfair = new PlayfairUI(shift);
            String C_TextString = playfair.encrypt(text);
            C_Text.setText(C_TextString);
            //String Generate_String = String.valueOf(generateMatrix(shift));
        }
    }//GEN-LAST:event_Encryption_ButtonActionPerformed

    // Hàm chạy nút giải mã
    private void Decryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decryption_ButtonActionPerformed
        if (C_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(PlayfairUI.this, "Nhap van ban can giai ma!");
        } else if (Key_Decryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(PlayfairUI.this,"Hay nhap Key de giai ma!");
        } else{
        String text = C_Text.getText();
        String shift = Key_Decryption.getText();
        PlayfairUI playfair = new PlayfairUI(shift);
        String P_TextString = playfair.decrypt(text);
        P_Text.setText(P_TextString);
        String Generate_String = generateKey(Key_Decryption.getText());
        Generate_Key_Decryp.setText(Generate_String);
        }
    }//GEN-LAST:event_Decryption_ButtonActionPerformed

    private void GenerateKey_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateKey_ButtonActionPerformed
        if (Key_Encryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(PlayfairUI.this,"Hay nhap Key de ma hoa!");
        } else {
            String Generate_String = generateKey(Key_Encryption.getText());
            Generate_Key_Encryp.setText(Generate_String);
        }
    }//GEN-LAST:event_GenerateKey_ButtonActionPerformed

    // Format key: loại bỏ các ký tự trùng và ghép 'I' với 'J'
    private String formatKey(String key) {
        key = key.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder formattedKey = new StringBuilder();
        for (char c : key.toCharArray()) {
            if (formattedKey.indexOf(String.valueOf(c)) == -1) {
                formattedKey.append(c);
            }
        }
        return formattedKey.toString();
    }

    // Tạo ma trận 5x5 từ key
    private char[][] generateMatrix(String key) {
        char[][] matrix = new char[5][5];
        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        String keyMatrix = key;

        for (char c : alphabet.toCharArray()) {
            if (keyMatrix.indexOf(c) == -1) {
                keyMatrix += c;
            }
        }
        //monarchyBCDEFGHIKLMNOPQRSTUVWXYZ

        int index = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                matrix[row][col] = keyMatrix.charAt(index++);
            }
        }
        return matrix;
    }
    
    // Hàm tạo chuỗi kí tự khóa trên ma trận hiện thị lên giao diện
     private String generateKey(String key) {
        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        String keyMatrix = key;

        for (char c : alphabet.toCharArray()) {
            if (keyMatrix.indexOf(c) == -1) {
                keyMatrix += c;
            }
        }
        //monarchyBCDEFGHIKLMNOPQRSTUVWXYZ
        
        String key_final = "" ;
        
        for (char c : keyMatrix.toCharArray()) {
            if (key_final.indexOf(Character.toUpperCase(c)) == -1) {
                key_final += Character.toUpperCase(c) ;
            }
        }
        
        return key_final;
     }
     
     
    // Tìm vị trí của một ký tự trong ma trận
    private int[] findPosition(char c) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (matrix[row][col] == c) {
                    return new int[] { row, col };
                }
            }
        }
        return null;
    }

    // Xử lý văn bản: loại bỏ các ký tự không hợp lệ và thêm 'X' nếu cần
    private String formatText(String text) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder formattedText = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char first = text.charAt(i);
            char second = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            if (first == second) {
                second = 'X'; // Thêm 'X' nếu gặp hai ký tự giống nhau
                i--;
            }

            formattedText.append(first).append(second);
        }

        return formattedText.toString();
    }

    // Phương thức mã hóa văn bản
    public String encrypt(String plaintext) {
        plaintext = formatText(plaintext);
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i += 2) {
            char first = plaintext.charAt(i);
            char second = plaintext.charAt(i + 1);

            int[] pos1 = findPosition(first);
            int[] pos2 = findPosition(second);

            if (pos1[0] == pos2[0]) { // Cùng hàng
                ciphertext.append(matrix[pos1[0]][(pos1[1] + 1) % 5]);
                ciphertext.append(matrix[pos2[0]][(pos2[1] + 1) % 5]);
            } else if (pos1[1] == pos2[1]) { // Cùng cột
                ciphertext.append(matrix[(pos1[0] + 1) % 5][pos1[1]]);
                ciphertext.append(matrix[(pos2[0] + 1) % 5][pos2[1]]);
            } else { // Khác hàng và cột
                ciphertext.append(matrix[pos1[0]][pos2[1]]);
                ciphertext.append(matrix[pos2[0]][pos1[1]]);
            }
        }

        return ciphertext.toString();
    }

    // Phương thức giải mã văn bản
    public String decrypt(String ciphertext) {
        ciphertext = formatText(ciphertext);
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i += 2) {
            char first = ciphertext.charAt(i);
            char second = ciphertext.charAt(i + 1);

            int[] pos1 = findPosition(first);
            int[] pos2 = findPosition(second);

            if (pos1[0] == pos2[0]) { // Cùng hàng
                plaintext.append(matrix[pos1[0]][(pos1[1] + 4) % 5]);
                plaintext.append(matrix[pos2[0]][(pos2[1] + 4) % 5]);
            } else if (pos1[1] == pos2[1]) { // Cùng cột
                plaintext.append(matrix[(pos1[0] + 4) % 5][pos1[1]]);
                plaintext.append(matrix[(pos2[0] + 4) % 5][pos2[1]]);
            } else { // Khác hàng và cột
                plaintext.append(matrix[pos1[0]][pos2[1]]);
                plaintext.append(matrix[pos2[0]][pos1[1]]);
            }
        }

        return plaintext.toString();
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
            java.util.logging.Logger.getLogger(PlayfairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayfairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayfairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayfairUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayfairUI().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea C_Text;
    private javax.swing.JButton Decryption_Button;
    private javax.swing.JButton Encryption_Button;
    private javax.swing.JButton GenerateKey_Button;
    private javax.swing.JTextArea Generate_Key_Decryp;
    private javax.swing.JTextArea Generate_Key_Encryp;
    private javax.swing.JTextField Key_Decryption;
    private javax.swing.JTextField Key_Encryption;
    private javax.swing.JTextArea P_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
