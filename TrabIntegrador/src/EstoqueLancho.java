/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 39121742018.2
 */
public class EstoqueLancho extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueLancho
     */
    public EstoqueLancho() {
        initComponents();
        txt5.setVisible(false);
        vendedor.setVisible(false);
        alter.setVisible(false);
        rsalg.setVisible(false);
        rguaravitas.setVisible(false);
        txt6.setVisible(false);
        txtValor.setVisible(false);
        add1.setVisible(false);
        dcliente.setVisible(false);
        pagamento.setVisible(false);
        txt7.setVisible(false);
        troco.setVisible(false);
        txt8.setVisible(false);
        ltotal.setVisible(false);
        confirm.setVisible(false);
        reset.setVisible(false);
        salgGuara.setVisible(false);
        alter1.setVisible(false);
        qsalgesto.setVisible(false);
        qguaesto.setVisible(false);
        guaesto.setVisible(false);
        salgesto.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        quantSalg = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        salgVendi = new javax.swing.JTextField();
        txt3 = new javax.swing.JLabel();
        quantRefres = new javax.swing.JTextField();
        txt4 = new javax.swing.JLabel();
        guaraVendi = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        qs1 = new javax.swing.JTextField();
        qg1 = new javax.swing.JTextField();
        lucro = new javax.swing.JLabel();
        quantlucro = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();
        second = new javax.swing.JPanel();
        txt5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        alter = new javax.swing.JButton();
        vendedor = new javax.swing.JButton();
        fundosecond = new javax.swing.JLabel();
        tirth = new javax.swing.JPanel();
        rsalg = new javax.swing.JButton();
        rguaravitas = new javax.swing.JButton();
        txt6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        add1 = new javax.swing.JTextField();
        dcliente = new javax.swing.JLabel();
        pagamento = new javax.swing.JTextField();
        txt7 = new javax.swing.JLabel();
        troco = new javax.swing.JTextField();
        txt8 = new javax.swing.JLabel();
        ltotal = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        salgGuara = new javax.swing.JButton();
        salgesto = new javax.swing.JLabel();
        qsalgesto = new javax.swing.JTextField();
        guaesto = new javax.swing.JLabel();
        qguaesto = new javax.swing.JTextField();
        alter1 = new javax.swing.JButton();
        fundotirth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Quantidade disponivel de salgados");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 290, 50));

        quantSalg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantSalgActionPerformed(evt);
            }
        });
        quantSalg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantSalgKeyTyped(evt);
            }
        });
        getContentPane().add(quantSalg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 80, 30));

        txt2.setBackground(new java.awt.Color(51, 51, 51));
        txt2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Quantidade de salgados vendidos");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 280, -1));

        salgVendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salgVendiActionPerformed(evt);
            }
        });
        salgVendi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salgVendiKeyTyped(evt);
            }
        });
        getContentPane().add(salgVendi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 80, 30));

        txt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("Quantidade disponivel de guaravitas");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        quantRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantRefresActionPerformed(evt);
            }
        });
        quantRefres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantRefresKeyTyped(evt);
            }
        });
        getContentPane().add(quantRefres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, 30));

        txt4.setBackground(new java.awt.Color(0, 0, 0));
        txt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setText("Quantidade de guaravitas vendidos");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        guaraVendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guaraVendiActionPerformed(evt);
            }
        });
        guaraVendi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                guaraVendiKeyTyped(evt);
            }
        });
        getContentPane().add(guaraVendi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 80, 30));

        btn.setText("Cadastrar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 80, -1));

        qs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qs1ActionPerformed(evt);
            }
        });
        getContentPane().add(qs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 60, -1));

        qg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qg1ActionPerformed(evt);
            }
        });
        getContentPane().add(qg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 60, -1));

        lucro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lucro.setForeground(new java.awt.Color(255, 255, 255));
        lucro.setText("Lucro medio");
        getContentPane().add(lucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        quantlucro.setEditable(false);
        getContentPane().add(quantlucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 50, -1));

        add.setEditable(false);
        add.setText("R$");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 20, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salgados.jpg"))); // NOI18N
        fundo.setText("jLabel1");
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 5, 720, 500));

        second.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setText("Quantidade atual de salgados");
        second.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quantidade atual de guavitas");
        second.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        alter.setText("alterar quantidades");
        alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterActionPerformed(evt);
            }
        });
        second.add(alter, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        vendedor.setText("modo vendedor");
        vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorActionPerformed(evt);
            }
        });
        second.add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        fundosecond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salgados.jpg"))); // NOI18N
        fundosecond.setText("jLabel1");
        second.add(fundosecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 720, 510));

        getContentPane().add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 720, 480));

        tirth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rsalg.setText("Registrar salgado");
        rsalg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsalgActionPerformed(evt);
            }
        });
        tirth.add(rsalg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, -1));

        rguaravitas.setText("Registrar guaravita");
        rguaravitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rguaravitasActionPerformed(evt);
            }
        });
        tirth.add(rguaravitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, -1));

        txt6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setText("Valor da venda");
        tirth.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, 20));

        txtValor.setEditable(false);
        txtValor.setText("0");
        tirth.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 40, -1));

        add1.setText("R$");
        tirth.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 20, -1));

        dcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dcliente.setForeground(new java.awt.Color(255, 255, 255));
        dcliente.setText("pagamento do cliente");
        tirth.add(dcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoActionPerformed(evt);
            }
        });
        tirth.add(pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 60, -1));

        txt7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setText("Troco");
        tirth.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        troco.setEditable(false);
        troco.setText("0");
        troco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocoActionPerformed(evt);
            }
        });
        tirth.add(troco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 60, -1));

        txt8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt8.setForeground(new java.awt.Color(255, 255, 255));
        txt8.setText("Lucro total");
        tirth.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, 20));

        ltotal.setEditable(false);
        ltotal.setText("0");
        ltotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltotalActionPerformed(evt);
            }
        });
        tirth.add(ltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 70, -1));

        confirm.setText("Confirmar compra");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        tirth.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, -1));

        reset.setText("resetar");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        tirth.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, -1));

        salgGuara.setText("Salgado e guaravita");
        salgGuara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salgGuaraActionPerformed(evt);
            }
        });
        tirth.add(salgGuara, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, -1));

        salgesto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salgesto.setForeground(new java.awt.Color(255, 255, 255));
        salgesto.setText("Salgados em estoque");
        tirth.add(salgesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        qsalgesto.setEditable(false);
        qsalgesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qsalgestoActionPerformed(evt);
            }
        });
        tirth.add(qsalgesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 70, -1));

        guaesto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        guaesto.setForeground(new java.awt.Color(255, 255, 255));
        guaesto.setText("Guaravitas em estoque");
        tirth.add(guaesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        qguaesto.setEditable(false);
        tirth.add(qguaesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 70, -1));

        alter1.setText("Alterar quantidades em estoque");
        alter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alter1ActionPerformed(evt);
            }
        });
        tirth.add(alter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        fundotirth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salgados.jpg"))); // NOI18N
        tirth.add(fundotirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        getContentPane().add(tirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantSalgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantSalgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantSalgActionPerformed

    private void salgVendiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salgVendiActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_salgVendiActionPerformed

    private void guaraVendiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guaraVendiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guaraVendiActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:

        int QS = Integer.parseInt(quantSalg.getText().toString());
        int SV = Integer.parseInt(salgVendi.getText().toString());
        int QR = Integer.parseInt(quantRefres.getText().toString());
        int GV = Integer.parseInt(guaraVendi.getText().toString());

        int Q = QS - SV;
        qs1.setText(Integer.toString(Q));

        int R = QR - GV;
        qg1.setText(Integer.toString(R));

        int l = SV + GV * 5;
        quantlucro.setText(Integer.toString(l));

        qsalgesto.setText(Integer.toString(QS));
        qguaesto.setText(Integer.toString(QR));

        fundo.setVisible(false);
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        quantSalg.setVisible(false);
        quantRefres.setVisible(false);
        guaraVendi.setVisible(false);
        salgVendi.setVisible(false);
        btnlimpar.setVisible(false);
        btn.setVisible(false);
        rsalg.setVisible(false);
        rguaravitas.setVisible(false);
        txt6.setVisible(false);
        txtValor.setVisible(false);
        add1.setVisible(false);
        dcliente.setVisible(false);
        pagamento.setVisible(false);
        txt7.setVisible(false);
        troco.setVisible(false);
        txt8.setVisible(false);
        ltotal.setVisible(false);
        tirth.setVisible(false);
        reset.setVisible(false);
        salgGuara.setVisible(false);
        fundotirth.setVisible(false);
        second.setVisible(true);
        txt5.setVisible(true);
        vendedor.setVisible(true);
        alter.setVisible(true);
        alter1.setVisible(false);

    }//GEN-LAST:event_btnActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        quantSalg.setText("");
        salgVendi.setText("");
        quantRefres.setText("");
        guaraVendi.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed

    private void quantSalgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantSalgKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_quantSalgKeyTyped

    private void salgVendiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salgVendiKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_salgVendiKeyTyped

    private void quantRefresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantRefresKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_quantRefresKeyTyped

    private void guaraVendiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guaraVendiKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_guaraVendiKeyTyped

    private void quantRefresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantRefresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantRefresActionPerformed

    private void vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorActionPerformed
        rsalg.setVisible(true);
        rguaravitas.setVisible(true);
        txt6.setVisible(true);
        txtValor.setVisible(true);
        add1.setVisible(true);
        dcliente.setVisible(true);
        pagamento.setVisible(true);
        txt7.setVisible(true);
        troco.setVisible(true);
        txt8.setVisible(true);
        ltotal.setVisible(true);
        tirth.setVisible(true);
        fundotirth.setVisible(true);
        confirm.setVisible(true);
        salgGuara.setVisible(true);
        reset.setVisible(true);
        alter1.setVisible(false);
        qsalgesto.setVisible(true);
        qguaesto.setVisible(true);
        guaesto.setVisible(true);
        salgesto.setVisible(true);
        fundo.setVisible(false);
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        quantSalg.setVisible(false);
        quantRefres.setVisible(false);
        guaraVendi.setVisible(false);
        salgVendi.setVisible(false);
        btnlimpar.setVisible(false);
        btn.setVisible(false);
        second.setVisible(false);
        txt5.setVisible(false);
        vendedor.setVisible(false);
        alter.setVisible(false);
        qs1.setVisible(false);
        qg1.setVisible(false);
        lucro.setVisible(false);
        quantlucro.setVisible(false);
        add.setVisible(false);

    }//GEN-LAST:event_vendedorActionPerformed

    private void qs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qs1ActionPerformed

    private void qg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qg1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void alterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterActionPerformed
        // TODO add your handling code here:
        fundo.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        txt4.setVisible(true);
        quantSalg.setVisible(true);
        quantRefres.setVisible(true);
        guaraVendi.setVisible(true);
        salgVendi.setVisible(true);
        btnlimpar.setVisible(true);
        btn.setVisible(true);
        second.setVisible(false);
        txt5.setVisible(false);
        vendedor.setVisible(false);
        alter.setVisible(false);

        quantlucro.setText("");
        qs1.setText("");
        qg1.setText("");

    }//GEN-LAST:event_alterActionPerformed

    private void rsalgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsalgActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txtValor.getText());
        int p = a + 3;
        txtValor.setText(Integer.toString(p));
        int t = Integer.parseInt(qsalgesto.getText());
        int c = t - 1;
        qsalgesto.setText(Integer.toString(c));
        if (c == 0) {
            alter1.setVisible(true);
        }
    }//GEN-LAST:event_rsalgActionPerformed

    private void rguaravitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rguaravitasActionPerformed
        // TODO add your handling code here:
        int b = Integer.parseInt(txtValor.getText());
        int s = b + 2;
        txtValor.setText(Integer.toString(s));
        int j = Integer.parseInt(qguaesto.getText());
        int u = j - 1;
        qguaesto.setText(Integer.toString(u));
        if (u == 0) {
            alter1.setVisible(true);
        }

    }//GEN-LAST:event_rguaravitasActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:

        String valor = txtValor.getText().replace(",", ".");
        double c = Double.parseDouble(valor);

        int d = Integer.parseInt(ltotal.getText());
        double e = c + d;
        ltotal.setText(Double.toString(e));

        String paga = pagamento.getText().replace(",", ".");
        double g = Double.parseDouble(paga);

        double f = g - c;
        troco.setText(Double.toString(f));

        int k = Integer.parseInt(qsalgesto.getText().toString());
        int p = k - 1;
        qsalgesto.setText(Integer.toString(p));

        int y = Integer.parseInt(qguaesto.getText().toString());
        int u = y - 1;
        qguaesto.setText(Integer.toString(u));
    }//GEN-LAST:event_confirmActionPerformed

    private void ltotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltotalActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtValor.setText("0");
        pagamento.setText("");
        troco.setText("0");

    }//GEN-LAST:event_resetActionPerformed

    private void salgGuaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salgGuaraActionPerformed
        // TODO add your handling code here:
        int z = Integer.parseInt(txtValor.getText());
        int x = z + 5;
        txtValor.setText(Integer.toString(x));
        int j = Integer.parseInt(qguaesto.getText());
        int t = Integer.parseInt(qsalgesto.getText());
        int i = t - 1;
        int k = j - 1;
        qsalgesto.setText(Integer.toString(i));
        qguaesto.setText(Integer.toString(k));
        if (i == 0 || k == 0) {
            alter1.setVisible(true);
        }
    }//GEN-LAST:event_salgGuaraActionPerformed

    private void pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoActionPerformed

    private void alter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alter1ActionPerformed
        fundo.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        txt4.setVisible(true);
        quantSalg.setVisible(true);
        quantRefres.setVisible(true);
        guaraVendi.setVisible(false);
        salgVendi.setVisible(false);
        btnlimpar.setVisible(true);
        btn.setVisible(true);
        second.setVisible(false);
        txt5.setVisible(false);
        vendedor.setVisible(false);
        alter.setVisible(false);
        txt2.setVisible(false);
        txt4.setVisible(false);
        alter1.setVisible(false);
    }//GEN-LAST:event_alter1ActionPerformed

    private void qsalgestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qsalgestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qsalgestoActionPerformed

    private void trocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trocoActionPerformed

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
            java.util.logging.Logger.getLogger(EstoqueLancho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueLancho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueLancho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueLancho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueLancho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField add1;
    private javax.swing.JButton alter;
    private javax.swing.JButton alter1;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel dcliente;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel fundosecond;
    private javax.swing.JLabel fundotirth;
    private javax.swing.JLabel guaesto;
    private javax.swing.JTextField guaraVendi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField ltotal;
    private javax.swing.JLabel lucro;
    private javax.swing.JTextField pagamento;
    private javax.swing.JTextField qg1;
    private javax.swing.JTextField qguaesto;
    private javax.swing.JTextField qs1;
    private javax.swing.JTextField qsalgesto;
    private javax.swing.JTextField quantRefres;
    private javax.swing.JTextField quantSalg;
    private javax.swing.JTextField quantlucro;
    private javax.swing.JButton reset;
    private javax.swing.JButton rguaravitas;
    private javax.swing.JButton rsalg;
    private javax.swing.JButton salgGuara;
    private javax.swing.JTextField salgVendi;
    private javax.swing.JLabel salgesto;
    private javax.swing.JPanel second;
    private javax.swing.JPanel tirth;
    private javax.swing.JTextField troco;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JTextField txtValor;
    private javax.swing.JButton vendedor;
    // End of variables declaration//GEN-END:variables

}
