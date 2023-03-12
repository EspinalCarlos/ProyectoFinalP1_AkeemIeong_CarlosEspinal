
package pfinalp1_cespinal_aieong;
import javax.swing.JOptionPane;
import java.util.*;

public class PAnagramMenu extends javax.swing.JFrame {
    private ArrayList<Usuario> reg3 = new ArrayList<>();
    private String usuarioin;
    public String[] listafin;
    
    //VERIFICAR QUE EL USUARIO TIENE ADMIN PARA HABILITAR OPCION DE CREAR LISTA
    public void adminver(String verification){
        if(verification.equals("Fortin")){
            listcreator.setVisible(true);
        }
    }
    
    //CONSTRUCTOR
    public PAnagramMenu(String adveruser, ArrayList<Usuario> registro, String[] ListaPalabras) {
        initComponents();
        adminver(adveruser);
        this.reg3 = registro;
        this.usuarioin = adveruser;
        this.listafin = ListaPalabras;
        
    }
    private String[] makeList(String[] array){
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            String word = JOptionPane.showInputDialog("Ingrese una palabra: ");
            array[i] = word;
        }
        return array;
    }
    
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ez = new javax.swing.JButton();
        mid = new javax.swing.JButton();
        expert = new javax.swing.JButton();
        SalidaPAnagram = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        listcreator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DMAF Games presenta...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESTO RETOS");

        ez.setBackground(new java.awt.Color(51, 255, 0));
        ez.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ez.setForeground(new java.awt.Color(255, 255, 255));
        ez.setText("Facil");
        ez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezActionPerformed(evt);
            }
        });

        mid.setBackground(new java.awt.Color(255, 255, 0));
        mid.setForeground(new java.awt.Color(0, 0, 0));
        mid.setText("Medio");
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });

        expert.setBackground(new java.awt.Color(153, 0, 0));
        expert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        expert.setForeground(new java.awt.Color(255, 102, 102));
        expert.setText("Experto");
        expert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertActionPerformed(evt);
            }
        });

        SalidaPAnagram.setBackground(new java.awt.Color(255, 0, 0));
        SalidaPAnagram.setForeground(new java.awt.Color(255, 255, 255));
        SalidaPAnagram.setText("Salir");
        SalidaPAnagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaPAnagramActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Eliga la dificultad:");

        listcreator.setBackground(new java.awt.Color(255, 255, 255));
        listcreator.setForeground(new java.awt.Color(0, 0, 0));
        listcreator.setText("Crear lista");
        listcreator.setVisible(false);
        listcreator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listcreatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(listcreator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalidaPAnagram)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(ez)
                .addGap(18, 18, 18)
                .addComponent(mid)
                .addGap(18, 18, 18)
                .addComponent(expert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalidaPAnagram)
                    .addComponent(listcreator))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void ezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezActionPerformed
        
    }//GEN-LAST:event_ezActionPerformed

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void expertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expertActionPerformed

    private void listcreatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listcreatorActionPerformed
        String rondasS = JOptionPane.showInputDialog(null,"Ingrese el numero de rondas: ");
        int rondas = Integer.parseInt(rondasS);
        String[] listapalabras = new String[rondas];
        listafin = makeList(listapalabras);
        
        
        
    }//GEN-LAST:event_listcreatorActionPerformed

    private void SalidaPAnagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaPAnagramActionPerformed
       MenuJuegos mj = new MenuJuegos(reg3,usuarioin,listafin); 
       this.dispose();
       mj.setVisible(true);
    }//GEN-LAST:event_SalidaPAnagramActionPerformed

  
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
            java.util.logging.Logger.getLogger(PAnagramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAnagramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAnagramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAnagramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalidaPAnagram;
    private javax.swing.JButton expert;
    private javax.swing.JButton ez;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listcreator;
    private javax.swing.JButton mid;
    // End of variables declaration//GEN-END:variables
}
