/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import modelo.Pessoa;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro / Renan
 */
public class IframeCheck extends javax.swing.JInternalFrame {

    /**
     * Creates new form Iframecheck
     */
    public IframeCheck() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcFutebol = new javax.swing.JCheckBox();
        jcJogos = new javax.swing.JCheckBox();
        jcLeitura = new javax.swing.JCheckBox();
        jcViajar = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setTitle("Cadastrar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Hobby:");

        jcFutebol.setText("Futebol");

        jcJogos.setText("Jogos");

        jcLeitura.setText("Leitura");

        jcViajar.setText("Viajar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcJogos)
                    .addComponent(jcViajar)
                    .addComponent(jcLeitura)
                    .addComponent(jcFutebol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcFutebol)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcLeitura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcViajar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcJogos)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 212, Short.MAX_VALUE)
                .addComponent(jbCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cadastrar(){
        try {
            
            Pessoa p = new Pessoa();
            ArrayList hobby = new ArrayList();
                       
            if(jcFutebol.isSelected()){
                hobby.add(jcFutebol.getText());
            }
            if(jcJogos.isSelected()){
                hobby.add(jcJogos.getText());
            }
            if(jcLeitura.isSelected()){
                hobby.add(jcLeitura.getText());
            }
            if(jcViajar.isSelected()){
                hobby.add(jcViajar.getText());
            }
            p.setHobby(hobby);
            
            JOptionPane.showMessageDialog(this, "\nHobby: " + hobby,"Informações",JOptionPane.INFORMATION_MESSAGE);
            /* JOptionPane.showMessageDialog(this, 
                    "Voce escolheu: "+p.getSexo(),
                    "sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, 
                    p.toString(),
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            */
       // JOptionPane.showMessageDialog(rootPane, "Cadastro Efetuado com sucesso!"
       // +"\nDados cadastrados: "+p.toString(), "Sucesso",
       // JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Preencha os campos corretamente!","Erro",JOptionPane.WARNING_MESSAGE); 
        } 
        
}
    
    
    private void limpar(){
        jcFutebol.setSelected(false);
        jcJogos.setSelected(false);
        jcLeitura.setSelected(false);
        jcViajar.setSelected(false);
    }
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrar();
            limpar();
        }
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            limpar();
        }
    }//GEN-LAST:event_jbLimparKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JCheckBox jcFutebol;
    private javax.swing.JCheckBox jcJogos;
    private javax.swing.JCheckBox jcLeitura;
    private javax.swing.JCheckBox jcViajar;
    // End of variables declaration//GEN-END:variables
}
