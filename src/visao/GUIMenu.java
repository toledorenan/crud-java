/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import modelo.pessoaLogin;

/**
 *
 * @author QI
 */
public class GUIMenu extends javax.swing.JFrame implements InternalFrameListener{
    private boolean flagIframeCalcImc = false;
    private boolean flagIframeInputtext = false;
    private boolean flagIframeSobre = false;
    private boolean flagIframecheck = false;
    private boolean flagIframeradio = false;
    private boolean flagGUICadProduto = false;
    private boolean flagGUIManutencaoProduto = false;
    private boolean flagGUICadUsuario = false;
    private boolean flagGuiGeraPDFTextoDigitado = false;
    
  
    /**
     * Creates new form GUIMenu
     * @throws java.sql.SQLException
     */
    public GUIMenu() throws SQLException {
         
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
        
        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAreaTrabalho = new javax.swing.JDesktopPane();
        jpStatus = new javax.swing.JPanel();
        jlInfo = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jArquivo = new javax.swing.JMenu();
        JMICadProd = new javax.swing.JMenuItem();
        jBuscar = new javax.swing.JMenuItem();
        JMICadUser = new javax.swing.JMenuItem();
        JMIGerarPDF = new javax.swing.JMenuItem();
        jSeparador = new javax.swing.JPopupMenu.Separator();
        jmLogout = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();
        jN1 = new javax.swing.JMenu();
        JMIInput = new javax.swing.JMenuItem();
        JMIRadio = new javax.swing.JMenuItem();
        JMICheck = new javax.swing.JMenuItem();
        JMIIMC = new javax.swing.JMenuItem();
        jAjuda = new javax.swing.JMenu();
        jSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jAreaTrabalho.setPreferredSize(new java.awt.Dimension(800, 600));

        jpStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jpStatus.setEnabled(false);

        pessoaLogin pLogin = new pessoaLogin();
        jlInfo.setText("Você está logado como "+pLogin.getLogin());

        javax.swing.GroupLayout jpStatusLayout = new javax.swing.GroupLayout(jpStatus);
        jpStatus.setLayout(jpStatusLayout);
        jpStatusLayout.setHorizontalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatusLayout.createSequentialGroup()
                .addContainerGap(672, Short.MAX_VALUE)
                .addComponent(jlInfo)
                .addContainerGap())
        );
        jpStatusLayout.setVerticalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlInfo))
        );

        javax.swing.GroupLayout jAreaTrabalhoLayout = new javax.swing.GroupLayout(jAreaTrabalho);
        jAreaTrabalho.setLayout(jAreaTrabalhoLayout);
        jAreaTrabalhoLayout.setHorizontalGroup(
            jAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jAreaTrabalhoLayout.setVerticalGroup(
            jAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAreaTrabalhoLayout.createSequentialGroup()
                .addGap(0, 582, Short.MAX_VALUE)
                .addComponent(jpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jAreaTrabalho.setLayer(jpStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jArquivo.setText("Arquivo");
        jArquivo.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jArquivoMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArquivoActionPerformed(evt);
            }
        });

        JMICadProd.setText("Cadastrar Produto");
        JMICadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadProdActionPerformed(evt);
            }
        });
        JMICadProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMICadProdKeyPressed(evt);
            }
        });
        jArquivo.add(JMICadProd);

        jBuscar.setText("Buscar Produto!");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuscarKeyPressed(evt);
            }
        });
        jArquivo.add(jBuscar);

        JMICadUser.setText("Cadastrar Usuário");
        JMICadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadUserActionPerformed(evt);
            }
        });
        JMICadUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMICadUserKeyPressed(evt);
            }
        });
        jArquivo.add(JMICadUser);

        JMIGerarPDF.setText("Gerador de PDF");
        JMIGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGerarPDFActionPerformed(evt);
            }
        });
        JMIGerarPDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMIGerarPDFKeyPressed(evt);
            }
        });
        jArquivo.add(JMIGerarPDF);
        jArquivo.add(jSeparador);

        jmLogout.setText("Logout");
        jmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLogoutActionPerformed(evt);
            }
        });
        jArquivo.add(jmLogout);

        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jmSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmSairKeyPressed(evt);
            }
        });
        jArquivo.add(jmSair);

        jMenu.add(jArquivo);

        jN1.setText("N1");

        JMIInput.setText("Input");
        JMIInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIInputActionPerformed(evt);
            }
        });
        JMIInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMIInputKeyPressed(evt);
            }
        });
        jN1.add(JMIInput);

        JMIRadio.setText("Radio");
        JMIRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIRadioActionPerformed(evt);
            }
        });
        JMIRadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMIRadioKeyPressed(evt);
            }
        });
        jN1.add(JMIRadio);

        JMICheck.setText("Check");
        JMICheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICheckActionPerformed(evt);
            }
        });
        JMICheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMICheckKeyPressed(evt);
            }
        });
        jN1.add(JMICheck);

        JMIIMC.setText("IMC");
        JMIIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIIMCActionPerformed(evt);
            }
        });
        JMIIMC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JMIIMCKeyPressed(evt);
            }
        });
        jN1.add(JMIIMC);

        jMenu.add(jN1);

        jAjuda.setText("Ajuda");

        jSobre.setText("Sobre");
        jSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSobreActionPerformed(evt);
            }
        });
        jSobre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSobreKeyPressed(evt);
            }
        });
        jAjuda.add(jSobre);

        jMenu.add(jAjuda);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jAreaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jAreaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jArquivoActionPerformed

    private void jArquivoMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jArquivoMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jArquivoMenuKeyPressed

    private void JMICadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadProdActionPerformed
            AbrirCadProduto();
    }//GEN-LAST:event_JMICadProdActionPerformed

    private void JMICadProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMICadProdKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            AbrirCadProduto();
        }
    }//GEN-LAST:event_JMICadProdKeyPressed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmSairKeyPressed
        dispose();
    }//GEN-LAST:event_jmSairKeyPressed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        AbrirBusca();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirBusca();
        }
    }//GEN-LAST:event_jBuscarKeyPressed

    private void jSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSobreActionPerformed
        AbrirSobre();
    }//GEN-LAST:event_jSobreActionPerformed

    private void jSobreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSobreKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                AbrirSobre();
       }
    }//GEN-LAST:event_jSobreKeyPressed

    private void JMIInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIInputActionPerformed
        AbrirInput();
    }//GEN-LAST:event_JMIInputActionPerformed

    private void JMIInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMIInputKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirInput();
    }
    }//GEN-LAST:event_JMIInputKeyPressed

    private void JMIRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIRadioActionPerformed
        AbrirRadio();
    }//GEN-LAST:event_JMIRadioActionPerformed

    private void JMIRadioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMIRadioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirRadio();
    }
    }//GEN-LAST:event_JMIRadioKeyPressed

    private void JMICheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICheckActionPerformed
        AbrirCheck();
    }//GEN-LAST:event_JMICheckActionPerformed

    private void JMICheckKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMICheckKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirCheck();
    }
    }//GEN-LAST:event_JMICheckKeyPressed

    private void JMIIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIIMCActionPerformed
        AbrirCalcIMC();
    }//GEN-LAST:event_JMIIMCActionPerformed

    private void JMIIMCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMIIMCKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirCalcIMC();
    }
    }//GEN-LAST:event_JMIIMCKeyPressed

    private void JMICadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadUserActionPerformed
        AbrirCadUsuario();
        
    }//GEN-LAST:event_JMICadUserActionPerformed

    private void JMICadUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMICadUserKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirCadUsuario();
    }
    }//GEN-LAST:event_JMICadUserKeyPressed

    private void jmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLogoutActionPerformed
        AbrirAcesso();
        dispose();
    }//GEN-LAST:event_jmLogoutActionPerformed

    private void JMIGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGerarPDFActionPerformed
        AbrirGuiGeraPDFTextoDigitado();
    }//GEN-LAST:event_JMIGerarPDFActionPerformed

    private void JMIGerarPDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JMIGerarPDFKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        AbrirGuiGeraPDFTextoDigitado();
    }
    }//GEN-LAST:event_JMIGerarPDFKeyPressed
        
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
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new GUIMenu().setVisible(true);
                    
        
                } catch (SQLException ex) {
                    Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void AbrirAcesso(){
    GUIAcesso ga = new GUIAcesso();
    ga.setVisible(true);
    ga.setLocation(100, 120);
}
    
    
    private void AbrirGuiGeraPDFTextoDigitado(){
        if(!flagGuiGeraPDFTextoDigitado){
        GuiGeraPDFTextoDigitado ggpdf = new GuiGeraPDFTextoDigitado();
        jAreaTrabalho.add(ggpdf);
        ggpdf.setVisible(true);
        
        ggpdf.setVisible(true);
        ggpdf.setClosable(true);   //simbolo de fechar janela
        ggpdf.setIconifiable(true); //simbolo de minimizar
        ggpdf.setMaximizable(true); //simbolo de maximizar janela
        ggpdf.setLocation(30, 20);  // posicionar janela
        
        
        flagGUICadUsuario = true;
        ggpdf.addInternalFrameListener(this);
        }    
    }
    private void AbrirCadUsuario(){
        if(!flagGUICadUsuario){
        GUICadUsuario gcu = new GUICadUsuario();
        jAreaTrabalho.add(gcu);
        gcu.setVisible(true);
        
        gcu.setVisible(true);
        gcu.setClosable(true);   //simbolo de fechar janela
        gcu.setIconifiable(true); //simbolo de minimizar
        gcu.setMaximizable(true); //simbolo de maximizar janela
        gcu.setLocation(30, 20);  // posicionar janela
        
        
        flagGUICadUsuario = true;
        gcu.addInternalFrameListener(this);
        }    
    }
    private void AbrirCadProduto(){
        if(!flagGUICadProduto){
        GUICadProduto gcp = new GUICadProduto();
        jAreaTrabalho.add(gcp);
        gcp.setVisible(true);
        
        gcp.setVisible(true);
        gcp.setClosable(true);   //simbolo de fechar janela
        gcp.setIconifiable(true); //simbolo de minimizar
        gcp.setMaximizable(true); //simbolo de maximizar janela
        gcp.setLocation(30, 20);  // posicionar janela
        
        flagGUICadProduto = true;
        gcp.addInternalFrameListener(this);
        }    
    }
    
    private void AbrirBusca(){
        if(!flagGUIManutencaoProduto){
        GUIManutencaoProduto acp = new GUIManutencaoProduto();
        jAreaTrabalho.add(acp);
        acp.setVisible(true);
        
        acp.setVisible(true);
        acp.setClosable(true);   //simbolo de fechar janela
        acp.setIconifiable(true); //simbolo de minimizar
        acp.setMaximizable(true); //simbolo de maximizar janela
        acp.setLocation(30, 20);  // posicionar janela
        
        
        flagGUIManutencaoProduto = true;
        acp.addInternalFrameListener(this);
    }
    }    
    
    private void AbrirInput(){
        if(!flagIframeInputtext){
        IframeInputtext ifi = new IframeInputtext();
        jAreaTrabalho.add(ifi);
        ifi.setVisible(true);
        ifi.setClosable(true);   //simbolo de fechar janela
        ifi.setIconifiable(true); //simbolo de minimizar
        ifi.setMaximizable(true); //simbolo de maximizar janela
        ifi.setLocation(30, 20);  // posicionar janela
        flagIframeInputtext = true;
        ifi.addInternalFrameListener(this);
        
        
        }
    }
    private void AbrirRadio(){
        if(!flagIframeradio){
        IframeRadio ifr = new IframeRadio();
        jAreaTrabalho.add(ifr);
        ifr.setVisible(true);
        
        ifr.setClosable(true);   //simbolo de fechar janela
        ifr.setIconifiable(true); //simbolo de minimizar
        ifr.setMaximizable(true); //simbolo de maximizar janela
        ifr.setLocation(30, 20);  // posicionar janela
        
        flagIframeradio = true;
        ifr.addInternalFrameListener(this);
        }
    }
    private void AbrirCheck(){
        if(!flagIframecheck){
        IframeCheck ifc = new IframeCheck();
        jAreaTrabalho.add(ifc);
        ifc.setVisible(true);
        
        ifc.setClosable(true);   //simbolo de fechar janela
        ifc.setIconifiable(true); //simbolo de minimizar
        ifc.setMaximizable(true); //simbolo de maximizar janela
        ifc.setLocation(30, 20);  // posicionar janela
        
        flagIframecheck = true;
        ifc.addInternalFrameListener(this);
        }
    }
    private void AbrirSobre(){
        if(!flagIframeSobre){
        IframeSobre ifs = new IframeSobre();
        jAreaTrabalho.add(ifs);
        ifs.setVisible(true);
        
        ifs.setClosable(true);   //simbolo de fechar janela
        ifs.setIconifiable(true); //simbolo de minimizar
        ifs.setMaximizable(true); //simbolo de maximizar janela
        ifs.setLocation(30, 20);  // posicionar janela
        
        flagIframeSobre = true;
        ifs.addInternalFrameListener(this);
        }
    }
     private void AbrirCalcIMC(){
         if(!flagIframeCalcImc){
        IframeCalcImc ifc = new IframeCalcImc();
        jAreaTrabalho.add(ifc);
        ifc.setVisible(true);
        
        ifc.setClosable(true);   //simbolo de fechar janela
        ifc.setIconifiable(true); //simbolo de minimizar
        ifc.setMaximizable(true); //simbolo de maximizar janela
        ifc.setLocation(30, 20);  // posicionar janela
        
        flagIframeCalcImc = true;
        ifc.addInternalFrameListener(this);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMICadProd;
    private javax.swing.JMenuItem JMICadUser;
    private javax.swing.JMenuItem JMICheck;
    private javax.swing.JMenuItem JMIGerarPDF;
    private javax.swing.JMenuItem JMIIMC;
    private javax.swing.JMenuItem JMIInput;
    private javax.swing.JMenuItem JMIRadio;
    private javax.swing.JMenu jAjuda;
    private javax.swing.JDesktopPane jAreaTrabalho;
    private javax.swing.JMenu jArquivo;
    private javax.swing.JMenuItem jBuscar;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jN1;
    private javax.swing.JPopupMenu.Separator jSeparador;
    private javax.swing.JMenuItem jSobre;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JMenuItem jmLogout;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JPanel jpStatus;
    // End of variables declaration//GEN-END:variables

     @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
    
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof IframeCalcImc){
            flagIframeCalcImc = false;
        }else if(e.getInternalFrame() instanceof IframeInputtext){
            flagIframeInputtext = false;
        }else if(e.getInternalFrame() instanceof IframeSobre){
            flagIframeSobre = false;
        }else if(e.getInternalFrame() instanceof IframeCheck){
            flagIframecheck = false;
        }else if(e.getInternalFrame() instanceof IframeRadio){
            flagIframeradio = false;
        }else if(e.getInternalFrame() instanceof GUICadProduto){
            flagGUICadProduto = false;
        }else if(e.getInternalFrame() instanceof GUIManutencaoProduto){
            flagGUIManutencaoProduto = false;
        }else if(e.getInternalFrame() instanceof GUICadUsuario){
            flagGUICadUsuario = false;
        }
        else if(e.getInternalFrame() instanceof GuiGeraPDFTextoDigitado){
            flagGuiGeraPDFTextoDigitado = false;
        }
        
        
        }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {

    }
        
}
