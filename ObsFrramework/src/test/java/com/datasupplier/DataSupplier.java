package com.datasupplier;

import org.testng.annotations.DataProvider;

import com.utilities.ExcelUtils;

public class DataSupplier {
	ExcelUtils excelutils = new ExcelUtils();

	@DataProvider(name="clientupdate")
	public Object[][] dataSupplierClient()
	{
		Object[][] data=new Object[2][4];
		data[0][0]=excelutils.readStringData("MobileServiceDataProvider", 3, 2);
		data[0][1]=excelutils.readStringData("MobileServiceDataProvider", 4, 2);
		data[0][2]=excelutils.readStringData("MobileServiceDataProvider", 5, 2);
		data[0][3]=excelutils.readStringData("MobileServiceDataProvider", 6, 2);
		data[1][0]=excelutils.readStringData("MobileServiceDataProvider", 8, 2);
		data[1][1]=excelutils.readStringData("MobileServiceDataProvider", 9, 2);	
		data[1][2]=excelutils.readStringData("MobileServiceDataProvider", 10, 2);
        data[1][3]=excelutils.readStringData("MobileServiceDataProvider", 11, 2);
        
		return data;
			
	}
	
	@DataProvider(name="addclient")
	public Object[][] dataSupplierAddingClient()
	{
		Object[][] data=new Object[2][6];
		data[0][0]=excelutils.readStringData("MobileServiceDataProvider", 14, 2);
		data[0][1]=excelutils.readStringData("MobileServiceDataProvider", 15, 2);
		data[0][2]=excelutils.readStringData("MobileServiceDataProvider", 16, 2);
		data[0][3]=excelutils.readStringData("MobileServiceDataProvider", 17, 2);
		data[0][4]=excelutils.readStringData("MobileServiceDataProvider", 18, 2);
		data[0][5]=excelutils.readStringData("MobileServiceDataProvider", 19, 2);
		data[1][0]=excelutils.readStringData("MobileServiceDataProvider", 21, 2);
		data[1][1]=excelutils.readStringData("MobileServiceDataProvider", 22, 2);	
		data[1][2]=excelutils.readStringData("MobileServiceDataProvider", 23, 2);
        data[1][3]=excelutils.readStringData("MobileServiceDataProvider", 24, 2);
        data[1][4]=excelutils.readStringData("MobileServiceDataProvider", 25, 2);
        data[1][5]=excelutils.readStringData("MobileServiceDataProvider", 26, 2);
		return data;
			
	}

}
