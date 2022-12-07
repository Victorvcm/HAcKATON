package view;

/**
 *
 * @author raiss
 */
public class LoginRH extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginRH() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtEmailLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtSenhaLogin = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btncadastr = new javax.swing.JButton();
        btncadastr1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lovelo Black", 0, 16)); // NOI18N
        jLabel1.setText("Hackvara");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lovelo Black", 0, 16)); // NOI18N
        jLabel2.setText("Hackvara");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 504, 10));

        jLabel3.setFont(new java.awt.Font("Lovelo Black", 0, 30)); // NOI18N
        jLabel3.setText("Login RH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dosis", 1, 16)); // NOI18N
        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        edtEmailLogin.setFont(new java.awt.Font("Dosis", 1, 16)); // NOI18N
        edtEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmailLoginActionPerformed(evt);
            }
        });
        getContentPane().add(edtEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 259, -1));

        jLabel5.setFont(new java.awt.Font("Dosis", 1, 16)); // NOI18N
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        edtSenhaLogin.setFont(new java.awt.Font("Dosis", 1, 16)); // NOI18N
        getContentPane().add(edtSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 259, -1));

        jLabel6.setFont(new java.awt.Font("Dosis", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Não esta cadastrado? ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        btncadastr.setFont(new java.awt.Font("Dosis", 1, 16)); // NOI18N
        btncadastr.setText("Cadastre-se!");
        btncadastr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, 30));

        btncadastr1.setFont(new java.awt.Font("Dosis", 1, 16)); // NOI18N
        btncadastr1.setText("Confirmar");
        btncadastr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastr1ActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tela Rh.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEmailLoginActionPerformed

    private void btncadastrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrActionPerformed
        CadastroEmpresa tela = new CadastroEmpresa();
        tela.setVisible(true);

        dispose();
    }//GEN-LAST:event_btncadastrActionPerformed

    private void btncadastr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastr1ActionPerformed
        telaEmpresa tela = new telaEmpresa();
        tela.setVisible(true);

        dispose();
    }//GEN-LAST:event_btncadastr1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastr;
    private javax.swing.JButton btncadastr1;
    private javax.swing.JTextField edtEmailLogin;
    private javax.swing.JPasswordField edtSenhaLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
