package tela;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pedido;
import persistencia.PedidoDAO;

/**
 *
 * @author 39121742018.2
 */
public class MainScreen extends javax.swing.JFrame {

    private List<Integer> salgados;
    private List<Integer> guaravitas;
    
    public MainScreen() {
        initComponents();
        salgados = new ArrayList<>();
        guaravitas = new ArrayList<>();
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
        spnCoxinha = new javax.swing.JSpinner();
        spnJoelho = new javax.swing.JSpinner();
        spnKibe = new javax.swing.JSpinner();
        spnPaoDeQueijo = new javax.swing.JSpinner();
        spnEnroladinho = new javax.swing.JSpinner();
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
        spnGuaracamp = new javax.swing.JSpinner();
        spnAcaicamp = new javax.swing.JSpinner();
        pnlPagamento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnPagamento = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtCusto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCusto = new javax.swing.JButton();
        btnTroco = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
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

        spnCoxinha.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        spnJoelho.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        spnKibe.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        spnPaoDeQueijo.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        spnEnroladinho.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

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
                            .addComponent(spnCoxinha)
                            .addComponent(spnJoelho)
                            .addComponent(spnKibe)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSalgadoLayout.createSequentialGroup()
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSal4)
                            .addComponent(btnSal5))
                        .addGap(29, 29, 29)
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnPaoDeQueijo)
                            .addComponent(spnEnroladinho))))
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
                                            .addComponent(spnCoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlSalgadoLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(txtSal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalgadoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnJoelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(btnSal2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnKibe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSal3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnPaoDeQueijo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSal4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSalgadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSal5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtSal5))
                    .addComponent(spnEnroladinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        spnGuaracamp.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        spnAcaicamp.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

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
                        .addComponent(spnGuaracamp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGuaravitaLayout.createSequentialGroup()
                        .addComponent(btnGua2)
                        .addGap(18, 18, 18)
                        .addComponent(spnAcaicamp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
                        .addComponent(spnGuaracamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlGuaravitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGua2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGua2))
                    .addComponent(spnAcaicamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        jTabbedPane1.addTab("Guaravita", pnlGuaravita);

        pnlPagamento.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Custo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R$");

        txtTroco.setEditable(false);
        txtTroco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Troco");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("R$");

        spnPagamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnPagamento.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(2)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pagamento");

        txtCusto.setEditable(false);
        txtCusto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("R$");

        btnCusto.setText("Calcular");
        btnCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustoActionPerformed(evt);
            }
        });

        btnTroco.setText("Calcular");
        btnTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPagamentoLayout = new javax.swing.GroupLayout(pnlPagamento);
        pnlPagamento.setLayout(pnlPagamentoLayout);
        pnlPagamentoLayout.setHorizontalGroup(
            pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                                .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addGap(91, 91, 91)))
                        .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                                .addComponent(spnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel7))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addComponent(btnCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlPagamentoLayout.setVerticalGroup(
            pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCusto)
                    .addComponent(btnTroco))
                .addGap(135, 135, 135))
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

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 160, 50));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/imgs/salgados.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnGua1.setSelected(false);
        btnGua2.setSelected(false);
        btnSal1.setSelected(false);
        btnSal2.setSelected(false);
        btnSal3.setSelected(false);
        btnSal4.setSelected(false);
        btnSal5.setSelected(false);
        
        spnGuaracamp.setValue(0);
        spnAcaicamp.setValue(0);
        spnCoxinha.setValue(0);
        spnJoelho.setValue(0);
        spnKibe.setValue(0);
        spnPaoDeQueijo.setValue(0);
        spnEnroladinho.setValue(0);
        spnPagamento.setValue(0);
        txtTroco.setText("");
        txtCusto.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    float custo1 = 0f;
    float custo2 = 0f;
    float custo3 = 0f;
    float custo4 = 0f;
    float custo5 = 0f;
    float custo6 = 0f;
    float custo7 = 0f;
    float total = 0f;
    float troco = 0f;
    float pagamento = 0f;
    int insuf = 0;
    
    private void btnCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustoActionPerformed
        
        if (btnSal1.isSelected()) {
            int Sal1 = (int) spnCoxinha.getValue();
            custo1 = Sal1 * 3.5f;
        }
        if (btnSal2.isSelected()) {
            int Sal2 = (int) spnJoelho.getValue();
            custo2 = Sal2 * 3.5f;
        }
        if (btnSal3.isSelected()) {
            int Sal3 = (int) spnKibe.getValue();
            custo3 = Sal3 * 3.5f;
        }
        if (btnSal4.isSelected()) {
            int Sal4 = (int) spnPaoDeQueijo.getValue();
            custo4 = Sal4 * 3.5f;
        }
        if (btnSal5.isSelected()) {
            int Sal5 = (int) spnEnroladinho.getValue();
            custo5 = Sal5 * 3.5f;
        }
        if (btnGua1.isSelected()) {
            int Gua1 = (int) spnGuaracamp.getValue();
            custo6 = Gua1 * 1.5f;
        }
        if (btnGua1.isSelected()) {
            int Gua2 = (int) spnAcaicamp.getValue();
            custo7 = Gua2 * 1.5f;
        }
        
        total = (float) (custo1+custo2+custo3+custo4+custo5+custo6+custo7);
        
        txtCusto.setText(String.format("%.2f",total));
        
    }//GEN-LAST:event_btnCustoActionPerformed

    private void btnTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocoActionPerformed
        pagamento = (int) spnPagamento.getValue();
        troco = (float) pagamento-total;
        txtTroco.setText(String.format ("%.2f", troco));
        
        if (pagamento < total) {
            JOptionPane.showMessageDialog(this, "Valor insuficiente");
            insuf = 1;
        }
    }//GEN-LAST:event_btnTrocoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (insuf == 1) {
            JOptionPane.showMessageDialog(this, "Valor insuficiente!");
        } else {            
            Pedido p = new Pedido();
            p.setSalgados(salgados);
            p.setGuaravitas(guaravitas);
            
        }
        
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void addSalgado(int id) {
        salgados.add(id);
    }
   
    private void addGuaravita(int id) {
        guaravitas.add(id);
    }
    
    private void removeSalgado(int id) {
        guaravitas.remove(id);
    }
    
    private void removeGuaravita(int id) {
        guaravitas.remove(id);
    }
    
    
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCusto;
    private javax.swing.JRadioButton btnGua1;
    private javax.swing.JRadioButton btnGua2;
    private javax.swing.JRadioButton btnSal1;
    private javax.swing.JRadioButton btnSal2;
    private javax.swing.JRadioButton btnSal3;
    private javax.swing.JRadioButton btnSal4;
    private javax.swing.JRadioButton btnSal5;
    private javax.swing.JButton btnTroco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlGuaravita;
    private javax.swing.JPanel pnlPagamento;
    private javax.swing.JPanel pnlSalgado;
    private javax.swing.JSpinner spnAcaicamp;
    private javax.swing.JSpinner spnCoxinha;
    private javax.swing.JSpinner spnEnroladinho;
    private javax.swing.JSpinner spnGuaracamp;
    private javax.swing.JSpinner spnJoelho;
    private javax.swing.JSpinner spnKibe;
    private javax.swing.JSpinner spnPagamento;
    private javax.swing.JSpinner spnPaoDeQueijo;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtGua1;
    private javax.swing.JTextField txtGua2;
    private javax.swing.JTextField txtSal1;
    private javax.swing.JTextField txtSal2;
    private javax.swing.JTextField txtSal3;
    private javax.swing.JTextField txtSal4;
    private javax.swing.JTextField txtSal5;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
