/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/* lala
 */
public class Conversao {
  
    /* Esse método é responsável por substituir a
       vírgula por ponto, caso o usuári digite errado. */ 
    public static String converterVirgulaPonto(String c){
        return c.replaceAll(",", ".");
    }
    
    //Coloca todas Strings em caixa baixa
    public static String converterTudoMin(String c){
        return c.toLowerCase();
    }
    
    //Coloca todas Strings em caixa alta
    public static String converterTudoMai(String c){
        return c.toUpperCase();
    }
    
    /* Método que verifica se o usuário digitou apenas
       letras maiúsculas ou minúsculas. 
       No mínimo 2 e no máximo 50 caracteres. */
    public static boolean verificarTexto(String c){
        return c.matches("^[a-zA-ZáÁéÉíÍóÓúÚçÇãÃõÕ ]{2,50}$");
    }
    
    /* Método que verifica se o usuário digitou apenas
       número de 0 a 9 com no mínimo 1 e no máximo 6 dígitos. */
    public static boolean verificarNumeros(String c){
        return c.matches("^[0-9]{1,6}$");
    }    
}//fecha classe
