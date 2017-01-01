package com.hackathon.onpar;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class StationExcelReader {

	private ArrayList<Station> stationList;
	private Station tempStation;
	
	public StationExcelReader()	{
		stationList = new ArrayList<Station>();
		tempStation = new Station();
	}
	
	public ArrayList<Station> start(InputStream file)	{
	
	try {
		
	    POIFSFileSystem fs = new POIFSFileSystem(file);
	    HSSFWorkbook wb = new HSSFWorkbook(fs);
	    HSSFSheet sheet = wb.getSheetAt(0);
	    HSSFRow row;
	    HSSFCell cell;

	    int rows; // No of rows
	    rows = sheet.getPhysicalNumberOfRows();

	    int cols = 0; // No of columns
	    int tmp = 0;

	    // This trick ensures that we get the data properly even if it doesn't start from first few rows
	    for(int i = 0; i < 10 || i < rows; i++) {
	        row = sheet.getRow(i);
	        if(row != null) {
	            tmp = sheet.getRow(i).getPhysicalNumberOfCells();
	            if(tmp > cols) cols = tmp;
	        }
	    }
	    
	    
	    for(int r = 0; r < rows; r++) {
	        row = sheet.getRow(r);
	        if(row != null) {
	            for(int c = 0; c < cols; c++) {
	                cell = row.getCell((short)c);
	                if(cell != null) {
	                    switch (c)	{
	                    case 0:	tempStation.setName(cell.getStringCellValue()); break;
	                    case 1:	tempStation.setTotal((int)cell.getNumericCellValue()); break;
	                    case 2: tempStation.setPublic((int)cell.getNumericCellValue()); break;
	                    case 3:	tempStation.setReserved((int)cell.getNumericCellValue()); break;
	                    }
	                }
	            }
	            tempStation.setID(""+r);
	            tempStation.setFreeAvailable(tempStation.getPublic());
                tempStation.setReservedAvailable(tempStation.getReserved());
            	stationList.add(new Station(tempStation.getID(),tempStation.getName(),tempStation.getTotal(),
            			tempStation.getReserved(), tempStation.getPublic()));
	        }
	    }
	    
	    wb.close();
	    fs.close();
	} catch(Exception ioe) {
	    ioe.printStackTrace();
	}
	return stationList;
	}
}
