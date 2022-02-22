package Curs12;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfTextExample {
	
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * File file = new File("ATX-038702213.pdf");
		 * 
		 * PDDocument document = PDDocument.load(file);
		 * 
		 * PDFTextStripper pdfStripper = new PDFTextStripper();
		 * 
		 * String text = pdfStripper.getText(document); System.out.println(text);
		 * 
		 * document.close();
		 */
		
		System.out.println(readLineFromPdf("ATX-038702213.pdf", "Sem", "RL"));
		
		
	}
	
	public static String readLineFromPdf(String path, String inceput, String finish) {
		
		String returnString = "";
		
		try {
			PDDocument document = PDDocument.load(new File(path));
			
			//PDFTextStripperByArea pdfStrip =  new PDFTextStripperByArea();
			//pdfStrip.setSortByPosition(true);
			
			PDFTextStripper pdfStripper = new PDFTextStripper();
			String allText = pdfStripper.getText(document);
			String strStart = inceput;
			String strEnd = finish;
			
			int startIndex =  allText.indexOf(strStart);
			int endIndex = allText.indexOf(strEnd);
			
			returnString = allText.substring(startIndex, endIndex) + strEnd;
			
			document.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			returnString = "Nu a functionat!";
		//	e.printStackTrace();
		}

		return returnString;
	}
	

}
