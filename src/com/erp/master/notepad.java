package com.erp.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class notepad {

	public static void main(String[] args) throws IOException 
	{
                masterlib SL=new masterlib();
				String Res=SL.openApp("http://webapp.qedgetech.com");
		         System.out.println(Res);
		         Res=SL.Admlgn("admin","master");
			     System.out.println(Res);
			     
			     
		   //Filepath
				String Fpath="D:\\bhavani\\erp\\src\\com\\erp\\testdata\\uom.txt";
		 //Creating text file for resuluts
				String Rpath="D:\\bhavani\\erp\\src\\com\\erp\\results\\uomres.txt";
				String SD;
		          FileReader Fr=new FileReader(Fpath);
		          BufferedReader Br=new BufferedReader(Fr);
		          String Sread=Br.readLine();
		          System.out.println(Sread);
		          
		          FileWriter Fw=new FileWriter(Rpath);
		          BufferedWriter Bw=new BufferedWriter(Fw);
		          Bw.write(Sread+"%%%"+"Results");
		          Bw.newLine();
		          
		          while((SD=Br.readLine())!=null) 
		          {
					System.out.println(SD);
					String SR[]=SD.split("###");
		                     String Uid=SR[0];
		                     System.out.println(Uid);
		                     String Udes=SR[1];
		                  System.out.println(Udes);
		               Res=SL.uom(Uid,Udes);
		                 System.out.println(Res);
		                 
		                 Bw.write(Uid+"$$$"+Udes+"&&&"+Res);
		                 Bw.newLine();
		                 
		          }
		          Bw.close();
		          Br.close();
			}

} 




