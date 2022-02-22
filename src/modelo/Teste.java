/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**

 */
public class Teste {
    
    private String nome;
    private String senha;
    private String estadocivil;
    private String observacao;
    private int valor;
    private int qtd;
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Dados\n" + "\nNome:" + nome + "\nSenha:" + senha + "\nEstado Civil:" + estadocivil + "\nObservacao:" + observacao + "\nValor:" + valor + "\nQuantidade:" + qtd;
    }

}//fecha classe
