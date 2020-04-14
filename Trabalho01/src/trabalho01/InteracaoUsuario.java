package trabalho01;

public class InteracaoUsuario extends javax.swing.JFrame {

    private Pilha pilha;

    /**
     * Creates new form InteracaoUsuario
     */
    public InteracaoUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        GrupoBotaoPilha = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfExpressao = new javax.swing.JTextField();
        taInformacao = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        rbVetor = new javax.swing.JRadioButton();
        rbDinamica = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/Calc.png"))); // NOI18N
        jLabel2.setText("Calculadora Pós Fixa ");

        tfExpressao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfExpressao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expressão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        tfExpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExpressaoActionPerformed(evt);
            }
        });

        taInformacao.setColumns(20);
        taInformacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taInformacao.setLineWrap(true);
        taInformacao.setRows(5);
        taInformacao.setText("Para utilizar a Calculadora Pós Fixa, insira as \nexpressões separadas por espaço. \n\nExemplo: 1 2 +");
        taInformacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pilha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        rbVetor.setBackground(new java.awt.Color(255, 255, 255));
        GrupoBotaoPilha.add(rbVetor);
        rbVetor.setText("Vetor");

        rbDinamica.setBackground(new java.awt.Color(255, 255, 255));
        GrupoBotaoPilha.add(rbDinamica);
        rbDinamica.setText("Dinâmica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbVetor)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(rbDinamica, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(rbVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taInformacao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfExpressao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void tfExpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfExpressaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfExpressaoActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        if(validaExpressao()){
            if (rbVetor.isSelected()) {
                calcularComPilhaVetor();
            } else if (rbDinamica.isSelected()) {
                calcularComPilhaDinamica();
            }
        }

    }//GEN-LAST:event_btCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(InteracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InteracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InteracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InteracaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InteracaoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotaoPilha;
    private javax.swing.JButton btCalcular;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbDinamica;
    private javax.swing.JRadioButton rbVetor;
    private javax.swing.JTextArea taInformacao;
    private javax.swing.JTextField tfExpressao;
    // End of variables declaration//GEN-END:variables

    private boolean validaExpressao() {
        String exp = tfExpressao.getText();

        //Verifica se expressão contem letras ou esta vazia
        //Se sim, lança aviso
        if (exp.matches("[A-Z]*") || exp.matches("[a-z]*") || exp.isEmpty()) {
            taInformacao.setText("Expressão inválida");
            return false;
        }

        //Variaveis para contabilizar numeros de operadores e valores
        int qntvalores = 0;
        int qntoperadores = 0;
        
        //Vetor que recebe valores a cada espaço
        String[] str = exp.split(" ");

        //For que percorre o vetor identificando o tipo de cada dado
        //Exemplo: str[0] = "5"
        //O metodo ehValor(), classifica como valor
        //Exemplo: str[2] = "+"
        //O metodo ehOperador(), classifica como operando
        for (int i = 0; i < str.length; i++) {
            if (ehValor(str[i])) {
                qntvalores++;
            } else if (ehOperador(str[i])) {
                qntoperadores++;
            }
            
        }

        //Verifica situações de erro
        if (qntvalores == qntoperadores || qntoperadores > qntvalores) {
            taInformacao.setText("Não há operandos suficientes para realizar a soma");
            return false;
        } else if (qntvalores - qntoperadores != 1) {
            taInformacao.setText("Faltou algum operador para usar todos os elementos da expressão");
            return false;
        }
        
        return true;
    }

    //Metodo que classifica se é valor
    private boolean ehValor(String string) {
        //O método matches informa se essa 
        //sequência corresponde ou não à expressão regular especificada.
        if (string.matches("[0-9]*")) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo que classifica se operador
    private boolean ehOperador(String string) {
        if (string.equals("+")
                || string.equals("-")
                || string.equals("/")
                || string.equals("*")) {
            return true;
        } else {
            return false;
        }

    }

    private void calcularComPilhaVetor() {
        this.pilha = new PilhaVetor();
        
        try {
            String resultado = Calculadora.calculaExpressao(tfExpressao.getText(), pilha);
            taInformacao.setText("O resultado da expressão é: "+resultado);
        } catch (Exception ex) {
            taInformacao.setText("Erro! "+ex.getMessage());
        }
    }

    private void calcularComPilhaDinamica() {
        this.pilha = new PilhaLista();
        
        try {
            String resultado = Calculadora.calculaExpressao(tfExpressao.getText(), pilha);
            taInformacao.setText("O resultado da expressão é: "+resultado);
        } catch (Exception ex) {
            taInformacao.setText("Erro! "+ex.getMessage());
        }
    }

}
