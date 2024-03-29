
package pfinalp1_cespinal_aieong;

import java.util.ArrayList;

public class MenuJuegos extends javax.swing.JFrame {

    private ArrayList<Usuario> reg2 = new ArrayList<>();
    private String userin;
    private String[] wordlist;
    
    public MenuJuegos(ArrayList<Usuario> registro, String UsuarioDentro, String[] ListaPalabras) {
        initComponents();
        this.reg2 = registro;
        this.userin = UsuarioDentro;
        this.wordlist = ListaPalabras;
    }
    

    
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
        X0 = new javax.swing.JButton();
        gamepreview = new javax.swing.JTabbedPane();
        SpInv = new javax.swing.JPanel();
        DMAFInvPlay = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MHP = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DMAFInvPlay1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PAnagram = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PAnagramPlay = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        equiscero = new javax.swing.JButton();

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
        MHPain.setText("DMAF Paint");
        MHPain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MHPainActionPerformed(evt);
            }
        });

        ProjectAnagram.setBackground(new java.awt.Color(0, 0, 0));
        ProjectAnagram.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ProjectAnagram.setForeground(new java.awt.Color(255, 255, 255));
        ProjectAnagram.setText("Resto Retos");
        ProjectAnagram.setMaximumSize(new java.awt.Dimension(120, 24));
        ProjectAnagram.setMinimumSize(new java.awt.Dimension(120, 24));
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

        X0.setBackground(new java.awt.Color(0, 0, 0));
        X0.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        X0.setForeground(new java.awt.Color(255, 255, 255));
        X0.setText("DMAF da dinero");
        X0.setMaximumSize(new java.awt.Dimension(120, 24));
        X0.setMinimumSize(new java.awt.Dimension(120, 24));
        X0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MHPain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectAnagram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpaceInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SpaceInv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MHPain, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProjectAnagram, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(X0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(LogOut)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 440));

        SpInv.setBackground(new java.awt.Color(102, 0, 102));
        SpInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DMAFInvPlay.setBackground(new java.awt.Color(0, 0, 0));
        DMAFInvPlay.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        DMAFInvPlay.setForeground(new java.awt.Color(0, 255, 0));
        DMAFInvPlay.setText("Jugar");
        DMAFInvPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DMAFInvPlayActionPerformed(evt);
            }
        });
        SpInv.add(DMAFInvPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 173, 71));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DMAF INVADERS");
        SpInv.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 280, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/spinvbg.png"))); // NOI18N
        SpInv.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        gamepreview.addTab("tab1", SpInv);

        MHP.setBackground(new java.awt.Color(153, 255, 102));
        MHP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DMAF PAINT");
        MHP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 200, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/Banner.png"))); // NOI18N
        MHP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        DMAFInvPlay1.setBackground(new java.awt.Color(255, 102, 102));
        DMAFInvPlay1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        DMAFInvPlay1.setForeground(new java.awt.Color(255, 255, 255));
        DMAFInvPlay1.setText("A Pintar!");
        DMAFInvPlay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DMAFInvPlay1ActionPerformed(evt);
            }
        });
        MHP.add(DMAFInvPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 160, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/dmafpixelresize1.png"))); // NOI18N
        MHP.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 340));

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

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/xodadienrodmaf.jpg"))); // NOI18N

        equiscero.setBackground(new java.awt.Color(153, 102, 0));
        equiscero.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        equiscero.setForeground(new java.awt.Color(255, 255, 255));
        equiscero.setText("X0 da dinero!!!!");
        equiscero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equisceroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(equiscero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(equiscero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        gamepreview.addTab("tab4", jPanel3);

        getContentPane().add(gamepreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 600, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MHPainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHPainActionPerformed
        gamepreview.setSelectedIndex(1);
    }//GEN-LAST:event_MHPainActionPerformed

    private void ProjectAnagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectAnagramActionPerformed
        gamepreview.setSelectedIndex(2);
        System.out.println(userin);
        System.out.println(reg2.toString());
    }//GEN-LAST:event_ProjectAnagramActionPerformed

    private void SpaceInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceInvActionPerformed
        gamepreview.setSelectedIndex(0);
        
    }//GEN-LAST:event_SpaceInvActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        login log = new login(reg2,wordlist);
        this.dispose();
        userin = "";
        System.out.println("logout"+userin);
        log.setVisible(true);
        
        
        
    }//GEN-LAST:event_LogOutActionPerformed

    private void PAnagramPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAnagramPlayActionPerformed

        PAnagramMenu menuaccess = new PAnagramMenu(userin,reg2,wordlist);
        this.dispose();
        menuaccess.setVisible(true);

        
        
    }//GEN-LAST:event_PAnagramPlayActionPerformed

    private void DMAFInvPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DMAFInvPlayActionPerformed
        SpaceInvObjects sio = new SpaceInvObjects();
        sio.setVisible(true);
    }//GEN-LAST:event_DMAFInvPlayActionPerformed

    private void X0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X0ActionPerformed
        gamepreview.setSelectedIndex(3);
    }//GEN-LAST:event_X0ActionPerformed

    private void DMAFInvPlay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DMAFInvPlay1ActionPerformed
        Painterr p = new Painterr(reg2,userin,wordlist);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DMAFInvPlay1ActionPerformed

    private void equisceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equisceroActionPerformed
        xo equis = new xo();
        equis.setVisible(true);
    }//GEN-LAST:event_equisceroActionPerformed

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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DMAFInvPlay;
    private javax.swing.JButton DMAFInvPlay1;
    private javax.swing.JButton LogOut;
    private javax.swing.JPanel MHP;
    private javax.swing.JButton MHPain;
    private javax.swing.JPanel PAnagram;
    private javax.swing.JButton PAnagramPlay;
    private javax.swing.JButton ProjectAnagram;
    private javax.swing.JPanel SpInv;
    private javax.swing.JButton SpaceInv;
    private javax.swing.JButton X0;
    private javax.swing.JButton equiscero;
    private javax.swing.JTabbedPane gamepreview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
