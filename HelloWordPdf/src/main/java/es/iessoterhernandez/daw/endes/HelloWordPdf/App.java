package es.iessoterhernandez.daw.endes.HelloWordPdf;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App 
{
    public static void main( String[] args )
    {
    	//Inicializar el documento
        Document document = new Document();
        
        try {
        	String path = new File(".").getCanonicalPath();
        	String HelloWorld = path + "/HelloWorld.pdf";
        	
        	PdfWriter.getInstance(document, new FileOutputStream(new File(HelloWorld)));
        	
        	document.open();        
        	
        	Paragraph paragraphHello = new Paragraph();
        	paragraphHello.add("Hello world");
        	document.add(paragraphHello);
        	document.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}
