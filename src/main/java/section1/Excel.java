package section1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		DataFormatter df = new DataFormatter();
		// Fetch the path of File
		FileInputStream fis = new FileInputStream("Path");
		// It will convert your file into Object
		Workbook book = WorkbookFactory.create(fis);
		// To Fetch the SheetName
		Sheet sh = book.getSheet("SheetName");
		// To the Fetch the RowNumber
		Row ro = sh.getRow(0);
		// To fetch the Cell
		Cell ce = ro.getCell(0);

		// Fetch value for that perticular cell
		String data = ce.getStringCellValue();

	}

}
