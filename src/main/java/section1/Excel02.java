package section1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet2");
		
		Row ro = sh.createRow(3);
		
		Cell ce = ro.createCell(3);
		
		ce.setCellValue("Data");
		
		FileOutputStream fos = new FileOutputStream("./Book1.xlsx");
		
		book.write(fos);
		
		fos.flush();
		
		System.out.println("pass");

	}

}
