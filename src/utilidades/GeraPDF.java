/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.itextpdf.text.PageSize;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import modelo.Teste;

/**
 * @author Thiago Cury
 * @since 26/04/2014
 * @version 1.0
 */
public class GeraPDF {

    private static String nomePDF = "nomePadrao";

    public static String getNomePDF() {
        return nomePDF;
    }

    public static void setNomePDF(String nomePDF) {
        GeraPDF.nomePDF = nomePDF;
    }

    /* Esse método recebe um objeto do tipo "Teste" criado na classe modelo.
       Podemos converter para um objeto genérico chamado Object, ou até mesmo um
       ArrayList com dados provenientes do banco de dados. */
    public static void gerarPDF(Teste t) throws Exception {

        Document document = null;

        try {
            
            document = new com.itextpdf.text.Document(PageSize.A4, 72, 72, 72, 72);
            PdfWriter.getInstance(document, new FileOutputStream("pdfGerado/"+nomePDF+".pdf"));

            //Abrindo documento PDF para inserir dados
            document.open();

            //Inserindo um novo parágrafo no PDF
            document.add(new Paragraph(t.toString()));
            
        } catch (Exception e) {
            throw new Exception("Erro ao gerar PDF! " + e.getMessage());
        } finally{
            //Fechando PDF
            document.close();
        }//fecha finally
    }//fecha método

}//fecha classe
