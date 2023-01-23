package listnersUse;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener 

{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("test case "+tcName +"  failed please have look again", true);
	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		String tcName= result.getName();
	
		Reporter.log("test case "+ tcName+" completed successfully", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		Reporter.log("test case skipped please retry", true);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("test case started to run", true);
	}

}
