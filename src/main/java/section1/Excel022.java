package section1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel022 {

	public static void main(String[] args) throws Exception {

		DataFormatter df = new DataFormatter();

		FileInputStream fis = new FileInputStream("./Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sh = book.getSheet("Sheet2");

		int lastRowValue = sh.getLastRowNum(); // To fetch the row number

		for (int i = 0; i < lastRowValue; i++) {

			// we use getLastCellNum() to get the last cell of that particular row
			int lastcellValue = sh.getRow(i).getLastCellNum();

			for (int j = 0; j < lastcellValue; j++) {

				String formattedData = df.formatCellValue(sh.getRow(i).getCell(j));

				System.out.print(formattedData + " ");
			}
			System.out.println();
		}
	}
}
