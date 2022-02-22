

package modelo;

import java.util.ArrayList;

public class Pessoa {

    String nome;
    private int idade;
    private double salario;
    private ArrayList hobby;    
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public ArrayList getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList hobby) {
        this.hobby = hobby;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        
    }

    public Pessoa() {
        hobby = new ArrayList();
        
    }
  
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String x) {
        
        this.nome = x;
    }

    /**
     *
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     *
     * @param idade2
     */
    public void setIdade(int idade2) {
        // idade2 = idade2;
        this.idade = idade2;
    }

    /**
     *
     * @return telefone
     */
    public double getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     * 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * @return 
    @Override
    public String toString() {
        return "Pessoa{" + "\nnome=" + nome + "\nidade=" + idade + "\nsalário=" + salario;
    }
    */
    @Override
    public String toString() {
        return "Informações:" + "\nnome: " + nome + "\nidade: " + idade + "\nsalario: " + salario + "\nhobby: " + hobby + "\nsexo: " + sexo;
    }
}
  

