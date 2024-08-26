package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// Read Data from Property file..........
		
//		FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
//		Properties p = new Properties();
//		p.load(fis);
//		String Data = p.getProperty("un");
//		System.out.println(Data);
		
		//Read Data from Excel file..............
		FileInputStream fis = new FileInputStream("./TestData/Celebs.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("CelebsData");
		Row row = sh.getRow(2);
		Cell col = row.getCell(1);
		String data = col.getStringCellValue();
		System.out.println("Name fetch from Excel: "+data);
		
	}

}
