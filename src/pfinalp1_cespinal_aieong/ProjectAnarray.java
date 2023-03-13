
package pfinalp1_cespinal_aieong;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProjectAnarray extends javax.swing.JFrame {
    private String userin;
    private ArrayList<Usuario> reg4;
    private String[] wlist;
    private int Vidas;
    
    
    public ProjectAnarray(String usuario, ArrayList<Usuario> registro ,String[] lista, int life) {
        initComponents();
        this.userin = usuario;
        this.reg4 = registro;
        this.wlist = lista;
        this.Vidas = life;
    }
    
    
    
    public boolean wordVerification(String word1, String word2){
        String pal1 = word1.toLowerCase();
        String pal2 = word2.toLowerCase();
        String v1 = "";
        String v2 = "";
        
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < pal1.length(); j++) {
                if ((int)pal1.charAt(j) == i) {
                    v1 += pal1.charAt(j);
                }
            }
            for (int j = 0; j < pal2.length(); j++) {
                if((int)pal2.charAt(j) == i){
                    v2 += pal2.charAt(j);
                }
            }
        }
        
        if (v1.equals(v2)) {
            return true;
        } else{
            return false;
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        roundCounter = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        propWord = new javax.swing.JLabel();
        wordIngrese = new javax.swing.JTextField();
        verifyWord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        roundCounter.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        roundCounter.setForeground(new java.awt.Color(255, 255, 255));
        roundCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundCounter.setText("PLACEHOLDER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(roundCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundCounter, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        propWord.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        propWord.setForeground(new java.awt.Color(255, 255, 255));
        propWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        propWord.setText("PLACEHOLDER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(propWord, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propWord, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        wordIngrese.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wordIngrese.setText("Anagrama aqui");

        verifyWord.setText("Verificar");
        verifyWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(wordIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(verifyWord)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(wordIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(verifyWord)
                .addGap(0, 151, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verifyWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyWordActionPerformed
        boolean wv = true;
        String w1 = propWord.getText();
        String w2 = wordIngrese.getText();
        wv = wordVerification(w1,w2);
        
        if (Vidas != 0){
            if(wv == false){
                JOptionPane.showMessageDialog(null, "no");
                Vidas--;
            } else if(wv == true && wlist.length > 1){
                
            } else if(wv == true && wlist.length == 1){
                this.dispose();
                PAnagramMenu pam = new PAnagramMenu(userin,reg4,wlist);
                pam.setVisible(true);
                JOptionPane.showMessageDialog(null, "USTED GANO!!");
            }
        } else{
            this.dispose();
            PAnagramMenu pam = new PAnagramMenu(userin,reg4,wlist);
            pam.setVisible(true);
            JOptionPane.showMessageDialog(null, "Usted ha perdido");
        }
        
    }//GEN-LAST:event_verifyWordActionPerformed

    
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
            java.util.logging.Logger.getLogger(ProjectAnarray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectAnarray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectAnarray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectAnarray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel propWord;
    public javax.swing.JLabel roundCounter;
    public javax.swing.JButton verifyWord;
    private javax.swing.JTextField wordIngrese;
    // End of variables declaration//GEN-END:variables
}
