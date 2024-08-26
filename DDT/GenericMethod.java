package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericMethod {

	public void UpdateDataIntoExcel(String Sheet,int row,int cell,String updatevalue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/Celebs.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(Sheet).getRow(row).getCell(cell).setCellValue(updatevalue);
		FileOutputStream fos = new FileOutputStream("./TestData/Celebs.xlsx");
		wb.write(fos);
		wb.close();	
	}

}
