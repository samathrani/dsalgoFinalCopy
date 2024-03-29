package ds_Algo;
	
	import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDsAlgo {

  private String testId;
  private String sheetName;

  public ExcelDsAlgo(String testId, String sheetName) { 
      this.testId = testId;
          this.sheetName = sheetName;
          }
  public String GetUserName() {        
    String excelpath = System.getProperty("user.dir")+"/TestData/DsAlgoExcel.xlsx";
    File newfile = new File(excelpath);
      FileInputStream readexcel = null;
    try {
      readexcel = new FileInputStream(newfile);
    } catch (FileNotFoundException e) {
      
      e.printStackTrace();
    }
      XSSFWorkbook algoexcel = null;
    try {
      algoexcel = new XSSFWorkbook(readexcel);
    } catch (IOException e) {
      
      e.printStackTrace();
    }
      XSSFSheet algosheet = algoexcel.getSheet(this.sheetName);
    
    int rowcount = algosheet.getLastRowNum();
   
    for(int rownum=1; rownum<=rowcount;rownum++) {
     Row selectedRow =algosheet.getRow(rownum);
     //System.out.println("Rowdata :"+selectedRow.getCell(0).getStringCellValue()+this.testId);
     if(this.testId.equals(selectedRow.getCell(0).getStringCellValue()))
     {
       return selectedRow.getCell(1).getStringCellValue();
     }
     
    }
    return "";
    }
  
  public String GetPassword() {        
	    String excelpath = System.getProperty("user.dir")+"/TestData/DsAlgoExcel.xlsx";
	    File newfile = new File(excelpath);
	      FileInputStream readexcel = null;
	    try {
	      readexcel = new FileInputStream(newfile);
	    } catch (FileNotFoundException e) {
	      
	      e.printStackTrace();
	    }
	      XSSFWorkbook algoexcel = null;
	    try {
	      algoexcel = new XSSFWorkbook(readexcel);
	    } catch (IOException e) {
	      
	      e.printStackTrace();
	    }
	      XSSFSheet algosheet = algoexcel.getSheet(this.sheetName);
	    
	    int rowcount = algosheet.getLastRowNum();
	   
	    for(int rownum=1; rownum<=rowcount;rownum++) {
	     Row selectedRow =algosheet.getRow(rownum);
	    // System.out.println("Rowdata :"+selectedRow.getCell(0).getStringCellValue()+this.testId);
	     if(this.testId.equals(selectedRow.getCell(0).getStringCellValue()))
	     {
	       
	       return selectedRow.getCell(2).getStringCellValue();
	     }
	     
	    }
	    return "";
	    }
	  
  
}
