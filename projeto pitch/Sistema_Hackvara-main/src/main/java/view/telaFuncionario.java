/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author raiss
 */
public class telaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public telaFuncionario() {
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtTotalDia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtTotalMes = new javax.swing.JTextField();
        edtTotalGorjeta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lovelo Black", 0, 16)); // NOI18N
        jLabel2.setText("Hackvara");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 450, 66, 21);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 470, 673, 10);

        jLabel1.setFont(new java.awt.Font("Lovelo Black", 0, 30)); // NOI18N
        jLabel1.setText("FUNCIONÁRIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 10, 207, 40);

        jLabel3.setFont(new java.awt.Font("Dosis", 1, 18)); // NOI18N
        jLabel3.setText("Total do dia:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(102, 126, 108, 24);

        edtTotalDia.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        edtTotalDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTotalDiaActionPerformed(evt);
            }
        });
        getContentPane().add(edtTotalDia);
        edtTotalDia.setBounds(102, 162, 230, 46);

        jLabel4.setFont(new java.awt.Font("Dosis", 1, 18)); // NOI18N
        jLabel4.setText("Total do mês:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(102, 214, 120, 28);

        edtTotalMes.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        getContentPane().add(edtTotalMes);
        edtTotalMes.setBounds(102, 248, 230, 43);

        edtTotalGorjeta.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        getContentPane().add(edtTotalGorjeta);
        edtTotalGorjeta.setBounds(102, 343, 230, 44);

        jLabel8.setFont(new java.awt.Font("Dosis", 1, 18)); // NOI18N
        jLabel8.setText("Total de gorjeta:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(102, 309, 143, 28);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tela consulta gorjeta.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 710, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtTotalDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTotalDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTotalDiaActionPerformed

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
            java.util.logging.Logger.getLogger(telaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edtTotalDia;
    private javax.swing.JTextField edtTotalGorjeta;
    private javax.swing.JTextField edtTotalMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
