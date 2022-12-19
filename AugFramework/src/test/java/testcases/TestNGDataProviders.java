package testcases;

import org.testng.annotations.DataProvider;

import dataProviderFactory.DataProviderFactory;

public class TestNGDataProviders {
	
	@DataProvider(name="LoginData")
	public static Object[][] getDataFromSources()
	{
		
		System.out.println("LOG:INFO-Running Data Provider First to generate the data");
		
		int rows=DataProviderFactory.getExcel().getRows("Login");
		int column=DataProviderFactory.getExcel().getColumns("Login");
		
		System.out.println("Total Rows in Excel "+rows );
		
		
		Object[][]arr=new Object[rows-1][column];
	
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=DataProviderFactory.getExcel().getCellData("Login", i+1, j);
			}
					
		}
		System.out.println("LOG:INFO-Data Provider is Ready for usage");

		return arr;
	}
	
	
	@DataProvider(name="userDetails")
	public static Object[][] getDataFromSourcesUser()
	{
		
		System.out.println("LOG:INFO-Running Data Provider First to generate the data");
		
		int rows=DataProviderFactory.getExcel().getRows("Login");
		
		System.out.println("Total Rows in Excel "+rows );
		
		
		Object[][]arr=new Object[rows-1][2];
	
		for(int i=0;i<rows-1;i++)
		{
			arr[i][0]=DataProviderFactory.getExcel().getCellData("Login", i+1, 0);
			arr[i][1]=DataProviderFactory.getExcel().getCellData("Login", i+1, 1);
			
		}
		System.out.println("LOG:INFO-Data Provider is Ready for usage");

		return arr;
	}
	
	


}
