package dataDrivenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       XSSFWorkbook ExcelWBook = null;
       XSSFSheet  ExcelWSheet ;
//       XSSFRow Roll;
//       XSSFCell  Cell ;
       
      // create an object of file class to open file
       File excelFile=new File("C:\\Users\\yadav\\OneDrive\\Documents\\TestData.xlsx");
       FileInputStream inputStream  =null ;
       
       // create an object of fileInput to read data from file
       try {
    	   inputStream = new FileInputStream(excelFile);
       }catch(FileNotFoundException e) {
    	   
    	   e.printStackTrace();     
       }
       
       // Excel -> workbook -> Sheet-> row-> cell
       
       //Create object of  XSSFworkbook to handle xlsx file 
       
       try {
		ExcelWBook = new  XSSFWorkbook(inputStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        
       // to acess workbook sheet 
       ExcelWSheet =ExcelWBook.getSheetAt(0);
       
      //   get total row count 
       int ttlRows = ExcelWSheet.getLastRowNum()+1;
       
       
       // get total no. of cells  in a rows  
       int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
       
       
       
       for( int currentRow = 0; currentRow<ttlRows; currentRow++) {
    	   for(int currentCell =0 ; currentCell<ttlCells ;  currentCell++) {
    		   System.out.println(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
    		   System.out.print(" ");
    	   }
    	   System.out.println();
       }
	}

}
