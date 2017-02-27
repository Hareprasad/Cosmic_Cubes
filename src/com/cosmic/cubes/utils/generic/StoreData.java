package com.cosmic.cubes.utils.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreData {
public static void toExcel(String testdata, String sName, int rIndex, int cIndex){
	try{
		File f = new File("./test-data/"+testdata+".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("sName");
		Row r = st.getRow(rIndex);
		Cell c = r.getCell(cIndex);
		c.setCellValue("India Times");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	catch(Exception e)
	{
		
	}
}
}
