
package pfinalp1_cespinal_aieong;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class login extends javax.swing.JFrame {

    private ArrayList<Usuario> reg = new ArrayList<>();
    private String[] wlist;
    
    public login(ArrayList<Usuario> registro , String[] ListaPalabras) {
        initComponents();
        this.reg = registro;
        this.wlist = ListaPalabras;
    }
   
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        iniciar = new javax.swing.JButton();
        regi = new javax.swing.JButton();
        exitmscreen = new javax.swing.JButton();
        logreg = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        nameusuario = new javax.swing.JTextField();
        passusuario = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        initsession = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        nameregister = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailregister = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passregister = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dmaf = new javax.swing.JLabel();
        registarray = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 50));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        iniciar.setBackground(new java.awt.Color(0, 0, 0));
        iniciar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setText("LOG IN");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        regi.setBackground(new java.awt.Color(0, 0, 0));
        regi.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        regi.setForeground(new java.awt.Color(255, 255, 255));
        regi.setText("REGISTRAR");
        regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiActionPerformed(evt);
            }
        });

        exitmscreen.setBackground(new java.awt.Color(255, 204, 0));
        exitmscreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/exit_1_8.png"))); // NOI18N
        exitmscreen.setBorder(null);
        exitmscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmscreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regi, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exitmscreen)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(regi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(exitmscreen)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 450));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        nameusuario.setText("Nombre de Usuario");
        nameusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameusuarioActionPerformed(evt);
            }
        });

        passusuario.setText("jPasswordField1");
        passusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passusuarioActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/usern.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese su nombre de usuario: ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/password-76_64x64.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ingrese su password: ");

        initsession.setBackground(new java.awt.Color(0, 0, 0));
        initsession.setForeground(new java.awt.Color(255, 255, 255));
        initsession.setText("Iniciar Sesion");
        initsession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initsessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(343, 343, 343))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(initsession)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(initsession, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        logreg.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        nameregister.setBackground(new java.awt.Color(0, 0, 0));
        nameregister.setForeground(new java.awt.Color(255, 255, 255));
        nameregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameregisterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese un nombre de usuario");

        emailregister.setBackground(new java.awt.Color(0, 0, 0));
        emailregister.setForeground(new java.awt.Color(255, 255, 255));
        emailregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailregisterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese su correo electronico");

        passregister.setBackground(new java.awt.Color(0, 0, 0));
        passregister.setForeground(new java.awt.Color(255, 255, 255));
        passregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passregisterActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese una password");

        dmaf.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        dmaf.setForeground(new java.awt.Color(255, 255, 255));
        dmaf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfinalp1_cespinal_aieong/uy2.png"))); // NOI18N
        dmaf.setText("Se ha registrado con exito");
        dmaf.setVisible(false);

        registarray.setBackground(new java.awt.Color(0, 0, 0));
        registarray.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        registarray.setForeground(new java.awt.Color(255, 255, 255));
        registarray.setText("Registrar");
        registarray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passregister)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailregister)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameregister, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(dmaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registarray)
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(nameregister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailregister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passregister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(registarray, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(dmaf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        logreg.addTab("tab2", jPanel5);

        jPanel1.add(logreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 670, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        // TODO add your handling code here:
        logreg.setSelectedIndex(0);
        dmaf.setVisible(false);
    }//GEN-LAST:event_iniciarActionPerformed

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
        // TODO add your handling code here:
        logreg.setSelectedIndex(1);
    }//GEN-LAST:event_regiActionPerformed

    private void exitmscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmscreenActionPerformed
        // TODO add your handling code here:
        mprincipal mp = new mprincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitmscreenActionPerformed

    private void nameusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameusuarioActionPerformed

    private void passusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passusuarioActionPerformed

    private void initsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initsessionActionPerformed
        String usuarioin = "";
        
        String userstring = nameusuario.getText();
        String passstring = passusuario.getText();
        
        if(reg.isEmpty() && !"Fortin".equals(userstring)){
            JOptionPane.showMessageDialog(null, "No se encuentra ningun usuario registrado \nFavor registrarse en la ventana de registro");
        }
        
        if (userstring.equals("Fortin") && passstring.equals("absolutoidolo")) {
            JOptionPane.showMessageDialog(null, "Modo administrador activado");
            JOptionPane.showMessageDialog(null, "ACCEDIENDO!");
            usuarioin = "Fortin";
            MenuJuegos mj = new MenuJuegos(reg,usuarioin,wlist);
            mj.setVisible(true);
            System.out.println(usuarioin);
            this.dispose();
        }
        System.out.println(reg.size());
        if(!"Fortin".equals(userstring) && !"absolutoidolo".equals(passstring)){
            for (int i = 0; i < reg.size(); i++) {
                Usuario usuario = reg.get(i);
                String userver = usuario.getUsername();
                String passver = usuario.getPassword();

                if (userstring.equals(userver) && passstring.equals(passver)) {
                    JOptionPane.showMessageDialog(null, "ACCEDIENDO!");
                    usuarioin = userver;
                    MenuJuegos mj = new MenuJuegos(reg,usuarioin,wlist);
                    mj.setVisible(true);
                    System.out.println(usuarioin);
                    this.dispose();
                } else if(i == reg.size()-1 && userstring != userver || i == reg.size() && passstring != passver){
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o password incorrectos");
                }
            }
        }
    }//GEN-LAST:event_initsessionActionPerformed

    private void nameregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameregisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameregisterActionPerformed

    private void emailregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailregisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailregisterActionPerformed

    private void passregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passregisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passregisterActionPerformed

    private void registarrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarrayActionPerformed
        // TODO add your handling code here:
        String user = nameregister.getText();
        String email = emailregister.getText();
        String pass = passregister.getText();
        dmaf.setVisible(true);
        
        Usuario use = new Usuario(user,email,pass);
        String prueba = use.toString();
        System.out.println(prueba);
        reg.add(use);
        System.out.println(reg.toString());
        
        if (wlist != null) {
            for (int i = 0; i < wlist.length; i++) {
                System.out.println(wlist[i]);
            }
        }
        
        
    }//GEN-LAST:event_registarrayActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dmaf;
    private javax.swing.JTextField emailregister;
    private javax.swing.JButton exitmscreen;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton initsession;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane logreg;
    private javax.swing.JTextField nameregister;
    private javax.swing.JTextField nameusuario;
    private javax.swing.JTextField passregister;
    private javax.swing.JPasswordField passusuario;
    private javax.swing.JButton regi;
    private javax.swing.JButton registarray;
    // End of variables declaration//GEN-END:variables
}
