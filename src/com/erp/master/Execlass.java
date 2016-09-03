package com.erp.master;

import java.io.IOException;

public class Execlass
		{

			public static void main(String[] args) throws IOException 
			{

				masterlib SL=new masterlib();
				String Res=SL.openApp("http://webapp.qedgetech.com");
		         System.out.println(Res);
		         Res=SL.Admlgn("admin","master");
			     System.out.println(Res);
			     
      SL.suplierscreation("SIOH","IUI", "AMHH", "HYD", "INDIA", "ABCD", "1234","EMAIL", "MNO", "NOTRS");
			     
		SL.stockitems("ggg");
		SL.uom("98490", "ghfh");
		
		SL.logout();
		
		SL.closeapp();
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			}

		}

	


