/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;

/**
 *
 * @author Leandro / Renan
 */
public class IframeCalcImc extends javax.swing.JInternalFrame {

    /**
     * Creates new form IframeCalcImc
     */
    public IframeCalcImc() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtResultadoPesoMin = new javax.swing.JTextField();
        txtResultadoImc = new javax.swing.JTextField();
        txtResultadoPesoMax = new javax.swing.JTextField();
        txtResultadoPesoMed = new javax.swing.JTextField();
        txtResultadoAvaliacao = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();

        setTitle("Calcular IMC");

        jLabel1.setText("Bem vindo, Calcule seu IMC!");

        jLabel2.setText("Digite sua Altura:");

        jLabel3.setText("Digite sua Peso:");

        jLabel4.setText("Dados a Serem Exibidos");

        jLabel5.setText("IMC:");

        jLabel6.setText("Peso Mínimo:");

        jLabel7.setText("Peso Médio:");

        jLabel8.setText("Peso Máximo:");

        jLabel9.setText("Resultado da Avaliação:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtResultadoPesoMax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtResultadoPesoMed, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoPesoMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoImc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoAvaliacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(txtPeso)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnCalcular)
                        .addGap(78, 78, 78)
                        .addComponent(BtnLimpar)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(BtnLimpar))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResultadoImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtResultadoPesoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtResultadoPesoMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtResultadoPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtResultadoAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Double peso, altura, total, pesoMin, pesoMed, pesoMax, imc;
    
    private void calcularIMC(double altura, double peso){
       imc = peso / (altura * altura);
       txtResultadoImc.setText(String.valueOf(imc));
    }
    private void calcularPesoMin (double altura){
        pesoMin = 18.5 * (altura * altura);
        txtResultadoPesoMin.setText(String.valueOf(pesoMin));
    }
    private void calcularPesoMed (){
        pesoMed = (pesoMin + pesoMax)/2;
        txtResultadoPesoMed.setText(String.valueOf(pesoMed));
    }
    private void calcularPesoMax (double altura){
        pesoMax = 24.9 * (altura * altura);
        txtResultadoPesoMax.setText(String.valueOf(pesoMax));
    }
    private void verificaSituacao(){
        if (imc < 18.5){
            txtResultadoAvaliacao.setText("Você esta abaixo do Peso Ideal!");
        }
        if ((imc >= 18.5) && (imc <= 24.9)){
            txtResultadoAvaliacao.setText("Você esta no Peso Ideal!");
        }
        if ((imc >= 25.00)&&(imc <= 29.9)){
            txtResultadoAvaliacao.setText("Você esta Acima do seu peso!");
        }
        if ((imc >= 30.00)&&(imc <= 34.9)){
            txtResultadoAvaliacao.setText("Obesidade Grau I!");
        }
        if ((imc >= 35.00)&&(imc <= 39.9)){
            txtResultadoAvaliacao.setText("Obesidade Grau II!");
        }
        if (imc >= 40.00){
            txtResultadoAvaliacao.setText("Obesidade Grau III!");
        }
    }
    
    private void LimparCampos(){
        txtAltura.setText("");
        txtPeso.setText("");
        txtResultadoAvaliacao.setText("");
        txtResultadoImc.setText("");
        txtResultadoPesoMin.setText("");
        txtResultadoPesoMed.setText("");
        txtResultadoPesoMax.setText("");
        
    }
    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        altura = Double.parseDouble(txtAltura.getText());
        peso = Double.parseDouble(txtPeso.getText());
        
        calcularIMC (altura, peso);
        calcularPesoMin (altura);
        calcularPesoMax (altura);
        calcularPesoMed ();
        verificaSituacao ();
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtResultadoAvaliacao;
    private javax.swing.JTextField txtResultadoImc;
    private javax.swing.JTextField txtResultadoPesoMax;
    private javax.swing.JTextField txtResultadoPesoMed;
    private javax.swing.JTextField txtResultadoPesoMin;
    // End of variables declaration//GEN-END:variables
}