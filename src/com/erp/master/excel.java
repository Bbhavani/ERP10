package com.erp.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel 
{
   
	public static void main(String[] args) throws IOException 
	{

		masterlib SL=new masterlib();
		String Res=SL.openApp("http://webapp.qedgetech.com");
         System.out.println(Res);
         Res=SL.Admlgn("admin","master");
	     System.out.println(Res);
	     
	    /* FileInputStream Fis=new FileInputStream("D:\\bhavani\\erp\\src\\com\\erp\\testdata\\Uom.xlsx");
		  
		  //Creating Workbook
		  
		    XSSFWorkbook WB=new XSSFWorkbook(Fis);
		    //Worksheet
		    XSSFSheet WS=WB.getSheet("UomData");
		    int Rc=WS.getLastRowNum();
		    System.out.println(Rc);
		    
		    
		        for (int i = 1; i <=Rc; i++)
		        {
		        	XSSFRow WR=WS.getRow(i);
		    	    XSSFCell WC=WR.getCell(0);
		    	    XSSFCell WC1=WR.getCell(1);
		    	    XSSFCell WC2=WR.createCell(2);
		    	    String Uid=WC.getStringCellValue();
		    	    System.out.println(Uid);
		    	    String Udes=WC1.getStringCellValue();
		    	    System.out.println(Udes);
		    	    Res=SL.uom(Uid,Udes);
		             System.out.println(Res);
		             WC2.setCellValue(Res);
		        }		
		    
		    FileOutputStream Fos=new FileOutputStream("D:\\bhavani\\erp\\src\\com\\erp\\results\\Uomres.xlsx");
		    WB.write(Fos);
		    WB.close();*/
		    
		   
		
	
	     FileInputStream Fis=new FileInputStream("D:\\bhavani\\erp\\src\\com\\erp\\testdata\\catname.xlsx");
		  
		  //Creating Workbook
		  
		    XSSFWorkbook WB=new XSSFWorkbook(Fis);
		    //Worksheet
		    XSSFSheet WS=WB.getSheet("catdata");
		    int Rc=WS.getLastRowNum();
		    
		    for (int i = 1; i <=Rc; i++) 
		        {
		        	XSSFRow WR=WS.getRow(i);
		    	    XSSFCell WC=WR.getCell(0);
		    	    XSSFCell WC1=WR.createCell(1);
		    	    String catname=WC.getStringCellValue();
		    	     Res=SL.stockitems(catname);
		             System.out.println(Res);
		             WC1.setCellValue(Res);
		        }		
		    
		    FileOutputStream Fos=new FileOutputStream("D:\\bhavani\\erp\\src\\com\\erp\\results\\Catres.xlsx");
		    WB.write(Fos);
		    WB.close();
		    
		   
		}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
