package helperAttributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fireflink.NinzaCrmGenericUtility.FileUtility;

public class DataProvider_ {
	
@Test(dataProvider="dp")
public void dataProviderEg(int id,String name)
{
System.out.println("id is -->"+id+" and "+"name is  -->"+name);	
}
	
	
@DataProvider(name="dp")
public Object[][] getdata()
{
	Object[][] data =new Object[4][2];
	data[0][0]=1;
	data[0][1]="abc";
	data[1][0]=1;
	data[1][1]="abc";
	data[2][0]=1;
	data[2][1]="abc";
	data[3][0]=1;
	data[3][1]="abc";
	return data;
}


@DataProvider(name="dpXl")
public Object[][] getdata_()
{
	FileUtility fu=new FileUtility();
	Object[][] data1 =new Object[4][2];
	data1[0][0]=1;
	data1[0][1]="abc";
	data1[1][0]=2;
	data1[1][1]="abc";
	data1[2][0]=3;
	data1[2][1]="abc";
	data1[3][0]=4;
	data1[3][1]="abc";
	return data1;
}


}