
package pfinalp1_cespinal_aieong;

import pfinalp1_cespinal_aieong.Enemy;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SpaceInvObjects extends javax.swing.JFrame {

    
    public SpaceInvObjects() {
        initComponents();
        e = new Enemy();
    }
    
    public Player play = new Player(10,5,3,true,'🚀');
    public int ex = 0;
    public int ey = 0;
    public Object[][] matglobal = fillMat(11,11);
    public ArrayList<Enemy> regist = new ArrayList<>();
    
    public Object[][] fillMat(int x, int y){
        Object[][] matfin = new Object[x][y];
        
        for (int i = 0; i < matfin.length; i++) {
            for (int j = 0; j < matfin[i].length; j++) {
                if(i % 2== 0  && j % 2 != 0 && i < 2){
                    matfin[i][j] = new Enemy(i,j,100,play.getPosx(),'👾');
                }
                else if (i == play.getPosx() && j == play.getPosy()) {
                    matfin[i][j] = new Player(i,j,3,true,'W');
                } else {
                    matfin[i][j] = "";
                }
            }
            ex++;
            ey = 0;
        }
        return matfin;
    }
    
    public String printMat(Object[][] matrix){
        String fin = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == "") {
                    fin +=( "    -    ");
                }
                else if(matrix[i][j] instanceof Player){
                    
                    fin += "    W    ";
                }
                if (matrix[i][j] instanceof Enemy){
                    
                    fin += "    A    ";
                }
            }
            fin+="\n\n";
        }
        return fin;
    }
    
    public void StartGame(){
        Runnable updater;
        updater = ()->{
            boolean ver = true;
            Object[][] mat = matglobal;
            while(ver){
                System.out.flush();
                textarea.setText("");
                textarea.append(printMat(matglobal));

                
                for (int i = 0; i < matglobal.length; i++) {
                    for (int j = 0; j < matglobal[i].length; j++) {
                        if (matglobal[i][j] instanceof Enemy) {
                            Enemy en = (Enemy) matglobal[i][j];
                            System.out.println(en.getPosx()+" - "+en.getPosy());
                            
                            if(en.getPosy()!= 10 && en.getPosx()%2 == 0){
                                en.setPosy(en.getPosy()+1);
                            } else if (en.getPosy() == 10 && en.getPosx()%2 == 0){
                                en.setPosx(en.getPosx()+1);
                            } else if (en.getPosx()%2 != 0 && en.getPosy() != 0) {
                                en.setPosy(en.getPosy()-1);
                            } else if (en.getPosx()%2 !=0  && en.getPosy() == 0) {
                                en.setPosx(en.getPosx() + 1);
                            } if(en.getPosx() == 10 && en.getPosy() == 1){
                                ver = false;
                                
                            }
                            
                        }
                    }
                }
                
                for (int i = 0; i < matglobal.length; i++) {
                    int cont = 0;
                    for (int j = 0; j < matglobal[0].length; j++) {
                        if (matglobal[i][j] instanceof Enemy && matglobal[i][j] != ""&& !regist.contains(matglobal[i][j])) {
                            //System.out.println(i+" - "+j);
                            Enemy enn = (Enemy)matglobal[i][j];
                            int enx = enn.getPosx();
                            int eny = enn.getPosy();
                            matglobal[enx][eny] = enn;
                            matglobal[i][j] = "";
                            regist.add(enn);
                            //System.out.println(enx+" - "+eny);
                        }
                    }
                }
                regist.clear();
                
                try {
                    Thread.sleep(50);
                    
                } catch (InterruptedException ex) {
                }
            }
            if(ver == false){
                JOptionPane.showMessageDialog(null, "Animacion Finalizada \nLas naves enemigas llegaron hasta el plano de la nave aliada");
                this.dispose();
            }
        };
       
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(updater);
        executor.shutdown();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        textarea.setEditable(false);
        textarea.setBackground(new java.awt.Color(0, 0, 0));
        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textarea.setForeground(new java.awt.Color(255, 255, 255));
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar Animacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(152, 152, 152))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StartGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    
    
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
            java.util.logging.Logger.getLogger(SpaceInvObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpaceInvObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpaceInvObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpaceInvObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpaceInvObjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
    Enemy e;
   
}
