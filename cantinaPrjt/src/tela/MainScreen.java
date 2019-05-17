package tela;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 *
 * @author 39121742018.2
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlSalgado = new javax.swing.JPanel();
        txtSal1 = new javax.swing.JTextField();
        txtSal2 = new javax.swing.JTextField();
        txtSal3 = new javax.swing.JTextField();
        txtSal4 = new javax.swing.JTextField();
        txtSal5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spnSal1 = new javax.swing.JSpinner();
        spnSal2 = new javax.swing.JSpinner();
        spnSal3 = new javax.swing.JSpinner();
        spnSal4 = new javax.swing.JSpinner();
        spnSal5 = new javax.swing.JSpinner();
        btnSal1 = new javax.swing.JRadioButton();
        btnSal2 = new javax.swing.JRadioButton();
        btnSal3 = new javax.swing.JRadioButton();
        btnSal4 = new javax.swing.JRadioButton();
        btnSal5 = new javax.swing.JRadioButton();
        pnlGuaravita = new javax.swing.JPanel();
        txtGua1 = new javax.swing.JTextField();
        txtGua2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGua1 = new javax.swing.JRadioButton();
        btnGua2 = new javax.swing.JRadioButton();
        spnGua1 = new javax.swing.JSpinner();
        spnGua2 = new javax.swing.JSpinner();
        pnlPagamento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnPagamento = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSalgado.setBackground(new java.awt.Color(0, 153, 153));

        txtSal1.setEditable(false);
        txtSal1.setText("Coxinha");

        txtSal2.setEditable(false);
        txtSal2.setText("Joelho");

        txtSal3.setEditable(false);
        txtSal3.setText("Kibe");

        txtSal4.setEditable(false);
        txtSal4.setText("Pão de Queijo");

        txtSal5.setEditable(false);
        txtSal5.setText("Enroladinho de Salsicha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salgados");

        spnSal1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2000, 1));

        spnSal2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2000, 1));

        spnSal3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2000, 1));

        spnSal4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));

        spnSal5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));

        btnSal1.setBackground(new java.awt.Color(0, 153, 153));

        btnSal2.setBackground(new java.awt.Color(0, 153, 153));

        btnSal3.setBackground(new java.awt.Color(0, 153, 153));

        btnSal4.setBackground(new java.awt.Color(0, 153, 153));

        btnSal5.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout pnlSalgadoLayout = new javax.swing.GroupLayout(pnlSalgado);
        pnlSalgado.setLayout(pnlSalgadoLayout);
        pnlSalgadoLayout.setHorizontalGroup(
            pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalgadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSal5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtSal4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtSal3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtSal2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtSal1))
                .addGap(18, 18, 18)
                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSalgadoLayout.createSequentialGroup()
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSal1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSal2))
                            .addComponent(btnSal3))
                        .addGap(29, 29, 29)
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnSal1)
                            .addComponent(spnSal2)
                            .addComponent(spnSal3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSalgadoLayout.createSequentialGroup()
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSal4)
                            .addComponent(btnSal5))
                        .addGap(29, 29, 29)
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnSal4)
                            .addComponent(spnSal5))))
                .addGap(278, 278, 278))
        );
        pnlSalgadoLayout.setVerticalGroup(
            pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalgadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSalgadoLayout.createSequentialGroup()
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSalgadoLayout.createSequentialGroup()
                                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlSalgadoLayout.createSequentialGroup()
                                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnSal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlSalgadoLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(txtSal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalgadoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnSal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(btnSal2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnSal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSal3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnSal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSal4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSal5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtSal5))
                    .addComponent(spnSal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Salgado", pnlSalgado);

        pnlGuaravita.setBackground(new java.awt.Color(0, 153, 153));

        txtGua1.setEditable(false);
        txtGua1.setText("Guaracamp");

        txtGua2.setEditable(false);
        txtGua2.setText("Açaícamp");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Guaravitas");

        btnGua1.setBackground(new java.awt.Color(0, 153, 153));

        btnGua2.setBackground(new java.awt.Color(0, 153, 153));

        spnGua1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2000, 1));

        spnGua2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2000, 1));

        javax.swing.GroupLayout pnlGuaravitaLayout = new javax.swing.GroupLayout(pnlGuaravita);
        pnlGuaravita.setLayout(pnlGuaravitaLayout);
        pnlGuaravitaLayout.setHorizontalGroup(
            pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuaravitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGua2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtGua1))
                .addGap(18, 18, 18)
                .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGuaravitaLayout.createSequentialGroup()
                        .addComponent(btnGua1)
                        .addGap(18, 18, 18)
                        .addComponent(spnGua1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGuaravitaLayout.createSequentialGroup()
                        .addComponent(btnGua2)
                        .addGap(18, 18, 18)
                        .addComponent(spnGua2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        pnlGuaravitaLayout.setVerticalGroup(
            pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGuaravitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGuaravitaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGua1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlGuaravitaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(spnGua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGua2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGua2))
                    .addComponent(spnGua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        jTabbedPane1.addTab("Guaravita", pnlGuaravita);

        pnlPagamento.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pagamento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R$");

        jTextField2.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Troco");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("R$");

        javax.swing.GroupLayout pnlPagamentoLayout = new javax.swing.GroupLayout(pnlPagamento);
        pnlPagamento.setLayout(pnlPagamentoLayout);
        pnlPagamentoLayout.setHorizontalGroup(
            pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPagamentoLayout.createSequentialGroup()
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPagamentoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        pnlPagamentoLayout.setVerticalGroup(
            pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );

        jTabbedPane1.addTab("Pagamento", pnlPagamento);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 570, 290));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 590, 310));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 160, 50));

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/imgs/salgados.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btnGua1.setSelected(false);
        btnGua2.setSelected(false);
        btnSal1.setSelected(false);
        btnSal2.setSelected(false);
        btnSal3.setSelected(false);
        btnSal4.setSelected(false);
        btnSal5.setSelected(false);
        
        spnGua1.setValue(0);
        spnGua2.setValue(0);
        spnSal1.setValue(0);
        spnSal2.setValue(0);
        spnSal3.setValue(0);
        spnSal4.setValue(0);
        spnSal5.setValue(0);
        spnPagamento.setValue(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Pedido pedido = new Pedido();
        pedido.setMatricula(txtMatricula.getText());
        pedido.setNome(txtNome.getText());
        pedido.setNota01(new Double (txtNota01.getText()));
        pedido.setNota02(new Double (txtNota02.getText()));
        
        AlunoDAO dao = new AlunoDAO();
        
        try{
            dao.insereAluno(a);
            JOptionPane.showMessageDialog(this, "Aluno registrado com sucesso","Registro de aluno", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(cadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnGua1;
    private javax.swing.JRadioButton btnGua2;
    private javax.swing.JRadioButton btnSal1;
    private javax.swing.JRadioButton btnSal2;
    private javax.swing.JRadioButton btnSal3;
    private javax.swing.JRadioButton btnSal4;
    private javax.swing.JRadioButton btnSal5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlGuaravita;
    private javax.swing.JPanel pnlPagamento;
    private javax.swing.JPanel pnlSalgado;
    private javax.swing.JSpinner spnGua1;
    private javax.swing.JSpinner spnGua2;
    private javax.swing.JSpinner spnPagamento;
    private javax.swing.JSpinner spnSal1;
    private javax.swing.JSpinner spnSal2;
    private javax.swing.JSpinner spnSal3;
    private javax.swing.JSpinner spnSal4;
    private javax.swing.JSpinner spnSal5;
    private javax.swing.JTextField txtGua1;
    private javax.swing.JTextField txtGua2;
    private javax.swing.JTextField txtSal1;
    private javax.swing.JTextField txtSal2;
    private javax.swing.JTextField txtSal3;
    private javax.swing.JTextField txtSal4;
    private javax.swing.JTextField txtSal5;
    // End of variables declaration//GEN-END:variables
}
