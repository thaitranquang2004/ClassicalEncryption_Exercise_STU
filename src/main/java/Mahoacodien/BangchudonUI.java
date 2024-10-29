package Mahoacodien;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class BangchudonUI extends javax.swing.JFrame {

    public BangchudonUI() {
        initComponents();
    }
    
    // Tạo bảng mã hóa từ bảng chữ cái gốc và bảng chữ cái hoán đổi
    private static HashMap<Character, Character> createCipherMap(String originalAlphabet, String cipherAlphabet) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < originalAlphabet.length(); i++) {
            map.put(originalAlphabet.charAt(i), cipherAlphabet.charAt(i));
        }
        return map;
    }

    // Phương thức mã hóa văn bản
    public static String encrypt(String text, HashMap<Character, Character> cipherMap) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            if (cipherMap.containsKey(c)) {
                result.append(cipherMap.get(c));  // Mã hóa ký tự
            } else {
                result.append(c);  // Giữ nguyên các ký tự không nằm trong bảng chữ cái
            }
        }

        return result.toString();
    }

    // Phương thức giải mã văn bản
    public static String decrypt(String text, HashMap<Character, Character> cipherMap) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        // Đảo ngược cipherMap để phục vụ việc giải mã
        HashMap<Character, Character> reverseMap = new HashMap<>();
        for (HashMap.Entry<Character, Character> entry : cipherMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        for (char c : text.toCharArray()) {
            if (reverseMap.containsKey(c)) {
                result.append(reverseMap.get(c));  // Giải mã ký tự
            } else {
                result.append(c);  // Giữ nguyên các ký tự không nằm trong bảng chữ cái
            }
        }

        return result.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        P_Text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        C_Text = new javax.swing.JTextArea();
        Encryption_Button = new javax.swing.JButton();
        Decryption_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Key_Encryption = new javax.swing.JTextField();
        Alpha_Key_Txt = new javax.swing.JTextField();
        RandomKey_Button = new javax.swing.JButton();
        Key_Decryption = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BANG CHU DON");

        P_Text.setColumns(20);
        P_Text.setRows(5);
        P_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane1.setViewportView(P_Text);

        C_Text.setColumns(20);
        C_Text.setRows(5);
        C_Text.setMargin(new java.awt.Insets(3, 6, 2, 6));
        jScrollPane2.setViewportView(C_Text);

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

        jLabel1.setText("Key");

        jLabel2.setText("key");

        Key_Encryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

        Alpha_Key_Txt.setMargin(new java.awt.Insets(3, 6, 2, 6));

        RandomKey_Button.setText("Random key");
        RandomKey_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomKey_ButtonActionPerformed(evt);
            }
        });

        Key_Decryption.setMargin(new java.awt.Insets(3, 6, 2, 6));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Encryption_Button)
                    .addComponent(Decryption_Button)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Key_Decryption))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RandomKey_Button)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Alpha_Key_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(Key_Encryption)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Key_Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Alpha_Key_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RandomKey_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Encryption_Button)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Key_Decryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Decryption_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hàm tạo chuỗi kí tự ngẫu nhiên trong bảng chuỗi Alphabet
    public static String generateRandomAlphabet() {
        // Tạo một danh sách chứa các ký tự từ 'A' đến 'Z'
        List<Character> alphabet = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }

        // Xáo trộn danh sách để tạo thứ tự ngẫu nhiên
        Collections.shuffle(alphabet);

        // Chuyển danh sách các ký tự thành chuỗi
        StringBuilder randomAlphabet = new StringBuilder();
        for (char c : alphabet) {
            randomAlphabet.append(c);
        }

        return randomAlphabet.toString();
    }
    
    // Hàm chạy nút mã hóa
    private void Encryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encryption_ButtonActionPerformed
        if (P_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(BangchudonUI.this, "Nhap van ban can ma hoa!");
        } else if (Key_Encryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(BangchudonUI.this,"Hay RandomKey de ma hoa!");
        } else {
            String originalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Alpha_Key_Txt.setText(originalAlphabet.toLowerCase());
            String randomKey = Key_Encryption.getText();
            String cipherAlphabet = randomKey;
            HashMap<Character, Character> cipherMap = createCipherMap(originalAlphabet, cipherAlphabet);
            String C_TextString = encrypt(P_Text.getText(), cipherMap);
            C_Text.setText(C_TextString);
        }
        
    }//GEN-LAST:event_Encryption_ButtonActionPerformed

    // Hàm chạy nút tạo ngẫu nhiên 1 khóa
    private void RandomKey_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomKey_ButtonActionPerformed
        String randomKey = generateRandomAlphabet();
        Key_Encryption.setText(randomKey.toLowerCase());  
    }//GEN-LAST:event_RandomKey_ButtonActionPerformed

    // Hàm chạy nút giải mã
    private void Decryption_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decryption_ButtonActionPerformed
        if (C_Text.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(BangchudonUI.this, "Nhap van ban can giai ma!");
        } else if (Key_Decryption.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(BangchudonUI.this,"Hay nhap key giai ma!");
        } else if (Key_Decryption.getText().length() != 26){
            JOptionPane.showMessageDialog(BangchudonUI.this,"Hay nhap key giai ma du 26 ky tu!");
        } else {
            String originalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String Key = Key_Decryption.getText();
            String cipherAlphabet = Key.toUpperCase();
            HashMap<Character, Character> cipherMap = createCipherMap(originalAlphabet, cipherAlphabet);
            String P_TextString = decrypt(C_Text.getText(), cipherMap);
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
            java.util.logging.Logger.getLogger(BangchudonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangchudonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangchudonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangchudonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangchudonUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alpha_Key_Txt;
    private javax.swing.JTextArea C_Text;
    private javax.swing.JButton Decryption_Button;
    private javax.swing.JButton Encryption_Button;
    private javax.swing.JTextField Key_Decryption;
    private javax.swing.JTextField Key_Encryption;
    private javax.swing.JTextArea P_Text;
    private javax.swing.JButton RandomKey_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
