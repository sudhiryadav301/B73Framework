package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
 

public class DemoTest extends BaseTest
{
	@Test
	public void demoTest1() throws InterruptedException {
			String data = Excel.getData(XL_PATH,"sheet1",1,0);
			Reporter.log("test data:"+data,true);
			Reporter.log(driver.getTitle(),true);	
			 

	}
}
