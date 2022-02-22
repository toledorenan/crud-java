 /*
 * @author ReNan / LeaNdr0
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;


public class ProdutoDAO {
    
    public ArrayList<ProdutoVO> buscarProdutos() throws SQLException{
     
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from produto";
            
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> prod = new ArrayList<>();
            
            while (rs.next()){
                ProdutoVO p = new ProdutoVO();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                p.setValorCusto(rs.getDouble("valorCusto"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setFornecedor(rs.getString("fornecedor"));                
                p.setData(rs.getString("data"));
                p.setCategoria(rs.getString("categoria"));
                p.setPeso(rs.getDouble("peso"));
                
                
                prod.add(p);
            }//fecha while
            return prod;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar os produtos! "+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        
    }
    
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        
        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            
	   //get current date time with Date()
            
            //String que receberá instrução SQL
            String sql;
            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL 
            USAR ASPAS SIMPLES PARA ESCAPE DO TIPO STRING*/
            sql = "insert into produto"
                    +"(nome,valorCusto,quantidade,fornecedor,data,categoria,peso)"
                    +"values ('"
                    +pVO.getNome()+"',"
                    +""+pVO.getValorCusto()+","
                    +""+pVO.getQuantidade()+","
                    +"'"+pVO.getFornecedor()+"',"
                    +"'"+LocalDate.now()+"',"
                    +"'"+pVO.getCategoria()+"',"
                    +""+pVO.getPeso()+")";

            //Executando o sql
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
                stat.close();
        }//fecha finally
    }//fecha método
    
    
    public void deletarProduto(long id) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;
            /* Montando uma String que delete um regristo através de um código(idProduto)
            enviado pelo usuário */
            sql = "delete from produto where id="+id;

            //Executando o sql
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar produto! "+se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

     public void alterarProduto(ProdutoVO pVO) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;
            /* Montando uma String que delete um regristo através de um código(idProduto)
            enviado pelo usuário */
            sql = "update produto set "
                    + "nome='"+pVO.getNome()+"',"
                    + "valorcusto="+pVO.getValorCusto()+","
                    + "peso="+pVO.getPeso()+","
                    + "quantidade="+pVO.getQuantidade()+" "
                    + "where id="+ pVO.getId() + "";
                    

            //Executando o sql
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar o produto! "+se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public ArrayList<ProdutoVO> filtrar(String query) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
         Statement stat = con.createStatement();
         
         try {
             String sql;
             sql = "select * from produto "+query;
             
             ResultSet rs = stat.executeQuery(sql);
             ArrayList<ProdutoVO> prod = new ArrayList<>();
             
             while(rs.next()){
                 ProdutoVO pVO = new ProdutoVO();
                 pVO.setId(rs.getLong("id"));
                 pVO.setNome(rs.getString("nome"));
                 pVO.setValorCusto(rs.getDouble("valorCusto"));
                 pVO.setQuantidade(rs.getInt("quantidade"));
                 pVO.setFornecedor(rs.getString("fornecedor"));
                 pVO.setData(rs.getString("data"));
                 pVO.setCategoria(rs.getString("categoria"));
                 pVO.setPeso(rs.getDouble("peso"));
                 prod.add(pVO);
             }
             return prod;
             
         } catch (Exception se) {
             throw new SQLException("Erro ao buscar dados do banco!"+se.getMessage());
         } finally {
             stat.close();
             con.close();
         }
         
     }     
    
    
}//fecha classe
