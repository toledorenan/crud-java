/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 * @author ReNan / LeaNdr0
 * @since 09/04/2014 - 09:55
 * @version 1.0 beta
 */
public class GUIManutencaoProduto extends javax.swing.JInternalFrame {
    
    

    /* Criando um modelo de tabela padrão 
     com o nome das colunas */
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"ID","Nome","Valor Custo (R$)","Quantidade","Fornecedor","Data","Categoria","Peso (KG)"});

    /**
     * Creates new form GUIManutencaoProduto
     */
    public GUIManutencaoProduto() {
        initComponents();
        /* Chamando o método preencherTabela 
         no construtor */
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbPreencher = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableProduto = new javax.swing.JTable();
        jlCodigo = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlValor = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtFornecedor = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jlPeso = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        jtValorCusto = new javax.swing.JTextField();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jcbPesquisa = new javax.swing.JComboBox();

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Produto");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jbPreencher.setText("Buscar");
        jbPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jButton1.setText("Deletar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jbModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbModificarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane2.setLayer(jbPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Custo Valor", "Quantidade", "Fornecedor", "Data", "Categoria", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableProduto.setEditingColumn(1);
        jtableProduto.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(jtableProduto);
        if (jtableProduto.getColumnModel().getColumnCount() > 0) {
            jtableProduto.getColumnModel().getColumn(0).setPreferredWidth(2);
            jtableProduto.getColumnModel().getColumn(1).setPreferredWidth(8);
            jtableProduto.getColumnModel().getColumn(2).setPreferredWidth(6);
            jtableProduto.getColumnModel().getColumn(3).setPreferredWidth(3);
            jtableProduto.getColumnModel().getColumn(4).setPreferredWidth(6);
            jtableProduto.getColumnModel().getColumn(5).setPreferredWidth(8);
        }

        jlCodigo.setText("Código:");

        jtCodigo.setEditable(false);

        jlNome.setText("Nome:");

        jlValor.setText("Valor Custo:");

        jlQuantidade.setText("Quantidade:");

        jLabel1.setText("Fornecedor: ");

        jbConfirmar.setText("Confirmar Modificação!");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        jbConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbConfirmarKeyPressed(evt);
            }
        });

        jlPeso.setText("Peso:");

        jlPesquisa.setFont(new java.awt.Font("Vrinda", 1, 24)); // NOI18N
        jlPesquisa.setText("BUSCAR");

        jtPesquisa.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jcbPesquisa.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jcbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Valor Custo", "Quantidade", "Fornecedor", "Categoria", "Peso", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jlCodigo)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(jtQuantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlValor)
                                .addGap(18, 18, 18)
                                .addComponent(jtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addComponent(jbConfirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPesquisa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValor)
                    .addComponent(jtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuantidade)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPeso)
                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void deletar() {
        try {
            int linha = jtableProduto.getSelectedRow();
            if (linha == -1){
                JOptionPane.showMessageDialog(this, "Você não selecionou nenhuma linha! ");
            } else {
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                
                String id = (String) jtableProduto.getValueAt(linha, 0);
                
                ps.deletarProduto(Long.parseLong(id));
                
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso! ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao deletar! " + e.getMessage());
        }
    }
   
    
    
    private void preencherTabela() {
        try {
            // comentário legal 
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();
            
            ArrayList<ProdutoVO> prod = new ArrayList<>();
            
            prod = ps.buscarProdutos();

            for (int i = 0;i < prod.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getId()),
                    String.valueOf(prod.get(i).getNome()),
                    String.valueOf(prod.get(i).getValorCusto()),
                    String.valueOf(prod.get(i).getQuantidade()),
                    String.valueOf(prod.get(i).getFornecedor()),
                    String.valueOf(prod.get(i).getData()),
                    String.valueOf(prod.get(i).getCategoria()),
                    String.valueOf(prod.get(i).getPeso())
                        
                        
                });
            }
            
            jtableProduto.setModel(dtm);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha preencherTabela
    
    private void alterar() {
//        try {
            int linha = jtableProduto.getSelectedRow();
            if (linha != -1){
                jtCodigo.setText((String)jtableProduto.getValueAt(linha, 0));
                jtNome.setText((String)jtableProduto.getValueAt(linha, 1));
                jtValorCusto.setText((String)jtableProduto.getValueAt(linha, 2));
                jtQuantidade.setText((String)jtableProduto.getValueAt(linha, 3));
                jtFornecedor.setText((String)jtableProduto.getValueAt(linha, 4));
                jtPeso.setText((String)jtableProduto.getValueAt(linha, 7));
                
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Você não selecionou nenhuma linha! ");
            }
        } /*catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao deletar! " + e.getMessage());
        }*/
    
    private void confirmarAlteracao(){
        try {
            ProdutoVO pVO = new ProdutoVO();
            
            pVO.setId(Long.parseLong(jtCodigo.getText()));
            pVO.setNome(jtNome.getText());
            pVO.setValorCusto(Double.parseDouble(jtValorCusto.getText()));
            pVO.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
            pVO.setFornecedor(jtFornecedor.getText());
            pVO.setPeso(Double.parseDouble(jtPeso.getText()));
            
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();
            
            ps.alterarProduto(pVO);
            
            JOptionPane.showMessageDialog(this, "Produto Alterado com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro! "+e.getMessage());
        }
    }
    
    private void filtrar(){
        try {
            if (jtPesquisa.getText().isEmpty()){
                preencherTabela();
            } else {
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                String pesquisa = (String) jcbPesquisa.getSelectedItem();
                String query;
                
                if(pesquisa.equals("Código")){
                    query = "where id = "+jtPesquisa.getText();
                }else if (pesquisa.equals("Nome")){
                    query = "where nome like '%"+jtPesquisa.getText() + "%'";
                }else if (pesquisa.equals("Valor Custo")){
                    query = "where valorCusto like '%"+jtPesquisa.getText() + "%'";
                }else if (pesquisa.equals("Quantidade")){
                    query = "where quantidade = "+jtPesquisa.getText();
                }else if (pesquisa.equals("Fornecedor")){
                    query = "where fornecedor like '%"+jtPesquisa.getText() + "%'";
                }else if (pesquisa.equals("Categoria")){
                    query = "where categoria like '%"+jtPesquisa.getText() + "%'";
                }else{
                    query = "where peso like '%"+jtPesquisa.getText() + "%'";
                }
                
                ArrayList<ProdutoVO> prod = new ArrayList<>();
                prod = ps.filtrar(query);
                
                for (int i = 0; i < prod.size(); i++){
                    dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getId()),
                    String.valueOf(prod.get(i).getNome()),
                    String.valueOf(prod.get(i).getValorCusto()),
                    String.valueOf(prod.get(i).getQuantidade()),
                    String.valueOf(prod.get(i).getFornecedor()),
                    String.valueOf(prod.get(i).getData()),
                    String.valueOf(prod.get(i).getCategoria()),
                    String.valueOf(prod.get(i).getPeso())
                        
                        
                });
                    jtableProduto.setModel(dtm);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }
    }
    

    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
           linhas para zero no default table model */        
        dtm.setNumRows(0);
    }//fecha limparTabela

    private void jbPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbPreencherActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbConfirmarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
    }
    }//GEN-LAST:event_jbConfirmarKeyPressed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        alterar();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbModificarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        alterar();
    }
    }//GEN-LAST:event_jbModificarKeyPressed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbPreencher;
    private javax.swing.JComboBox jcbPesquisa;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlValor;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtFornecedor;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPeso;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValorCusto;
    private javax.swing.JTable jtableProduto;
    // End of variables declaration//GEN-END:variables

    
    
}
