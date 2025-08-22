package cmdLineArgs;

import org.testng.annotations.Test;

public class ReaddataFromCmdLine
{
	@Test
	public void readData()
	{
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		
		String USERNAME=System.getProperty("userName");
		System.out.println(USERNAME);
		
		String PASSWORD=System.getProperty("password");
		System.out.println(PASSWORD);
	}
}
