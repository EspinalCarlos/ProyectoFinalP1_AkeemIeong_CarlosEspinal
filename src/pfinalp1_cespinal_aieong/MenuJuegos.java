
package pfinalp1_cespinal_aieong;


public class MenuJuegos extends javax.swing.JFrame {

  
    public MenuJuegos() {
        initComponents();
    }
    
    public String userin = "";

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MHPain = new javax.swing.JButton();
        ProjectAnagram = new javax.swing.JButton();
        SpaceInv = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        gamepreview = new javax.swing.JTabbedPane();
        SpInv = new javax.swing.JPanel();
        MHP = new javax.swing.JPanel();
        PAnagram = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PAnagramPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DMAF GAMES");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/theicon.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        MHPain.setBackground(new java.awt.Color(0, 0, 0));
        MHPain.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        MHPain.setForeground(new java.awt.Color(255, 255, 255));
        MHPain.setText("MH Pain");
        MHPain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MHPainActionPerformed(evt);
            }
        });

        ProjectAnagram.setBackground(new java.awt.Color(0, 0, 0));
        ProjectAnagram.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ProjectAnagram.setForeground(new java.awt.Color(255, 255, 255));
        ProjectAnagram.setText("Resto Retos");
        ProjectAnagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectAnagramActionPerformed(evt);
            }
        });

        SpaceInv.setBackground(new java.awt.Color(0, 0, 0));
        SpaceInv.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        SpaceInv.setForeground(new java.awt.Color(255, 255, 255));
        SpaceInv.setText("DMAF Invaders");
        SpaceInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceInvActionPerformed(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(255, 0, 0));
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectAnagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MHPain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpaceInv, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(SpaceInv, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MHPain, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(ProjectAnagram, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(LogOut)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 440));

        SpInv.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout SpInvLayout = new javax.swing.GroupLayout(SpInv);
        SpInv.setLayout(SpInvLayout);
        SpInvLayout.setHorizontalGroup(
            SpInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        SpInvLayout.setVerticalGroup(
            SpInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        gamepreview.addTab("tab1", SpInv);

        MHP.setBackground(new java.awt.Color(153, 255, 102));

        javax.swing.GroupLayout MHPLayout = new javax.swing.GroupLayout(MHP);
        MHP.setLayout(MHPLayout);
        MHPLayout.setHorizontalGroup(
            MHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        MHPLayout.setVerticalGroup(
            MHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        gamepreview.addTab("tab2", MHP);

        PAnagram.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/Anagramarep.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Creacion de anagramas, te miras capaz de lograr el reto?");

        PAnagramPlay.setBackground(new java.awt.Color(0, 204, 204));
        PAnagramPlay.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        PAnagramPlay.setForeground(new java.awt.Color(255, 255, 255));
        PAnagramPlay.setText("Jugar");
        PAnagramPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAnagramPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PAnagramLayout = new javax.swing.GroupLayout(PAnagram);
        PAnagram.setLayout(PAnagramLayout);
        PAnagramLayout.setHorizontalGroup(
            PAnagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAnagramLayout.createSequentialGroup()
                .addGap(0, 135, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(124, 124, 124))
            .addGroup(PAnagramLayout.createSequentialGroup()
                .addGroup(PAnagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PAnagramLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2))
                    .addGroup(PAnagramLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(PAnagramPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PAnagramLayout.setVerticalGroup(
            PAnagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAnagramLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(PAnagramPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        gamepreview.addTab("tab3", PAnagram);

        getContentPane().add(gamepreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 600, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MHPainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHPainActionPerformed
        gamepreview.setSelectedIndex(1);
    }//GEN-LAST:event_MHPainActionPerformed

    private void ProjectAnagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectAnagramActionPerformed
        gamepreview.setSelectedIndex(2);
    }//GEN-LAST:event_ProjectAnagramActionPerformed

    private void SpaceInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceInvActionPerformed
        gamepreview.setSelectedIndex(0);
    }//GEN-LAST:event_SpaceInvActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        login lg = new login();
        this.dispose();
        userin = "";
        System.out.println("logout"+userin);
        lg.setVisible(true);
        
    }//GEN-LAST:event_LogOutActionPerformed

    private void PAnagramPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAnagramPlayActionPerformed
        PAnagramMenu menuaccess = new PAnagramMenu();
        this.dispose();
        menuaccess.setVisible(true);
        System.out.println(userin);
        
    }//GEN-LAST:event_PAnagramPlayActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JPanel MHP;
    private javax.swing.JButton MHPain;
    private javax.swing.JPanel PAnagram;
    private javax.swing.JButton PAnagramPlay;
    private javax.swing.JButton ProjectAnagram;
    private javax.swing.JPanel SpInv;
    private javax.swing.JButton SpaceInv;
    private javax.swing.JTabbedPane gamepreview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
