package s6;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class writetofile {
    public static void main(String[] args){
        Document document=new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Puskesmas.pdf"));
            document.open();
            document.add(new Paragraph("Welcome to My Program"));

            document.close();
            writer.close();
        }
        catch (DocumentException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
