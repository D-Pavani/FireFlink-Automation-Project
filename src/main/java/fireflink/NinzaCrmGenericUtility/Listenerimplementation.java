package fireflink.NinzaCrmGenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import fireflink.NinzaCrm.ObjectRepository.NinzaCRMBaseClass;


public class Listenerimplementation implements ITestListener
{
	ExtentReports reporter;
	ExtentTest test;
	
	@Override
	
	public void onTestStart(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution Started");
		//ITestListener.super.onTestStart(result);

	
		test =reporter.createTest(methodName);
	
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution Passed");
		//ITestListener.super.onTestSuccess(result);	
		
		
//		Logging the pass status into external reports
		test.log(Status.PASS, methodName+"is passed");
	}

	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
	
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+" Execution Failed");
		//ITestListener.super.onTestFailure(result);
		//Capturing the ScreeenShot
		
		JavaUtility j=new JavaUtility();
		WebDriverUtility w=new WebDriverUtility();

		
		String screenshotname=methodName+j.getSysDate();
		
		try 
		{
		String path=w.captureScreenShot(NinzaCRMBaseClass.sdriver, screenshotname);
//		Attaching the Scereen Shot into the External file
		test.addScreenCaptureFromPath(path);
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Logging the exception into external reports
		test.log(Status.WARNING, result.getThrowable());
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution Skipped");
		//ITestListener.super.onTestSkipped(result);
		
		test.log(Status.SKIP, methodName+"is Skipped");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	
	
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Started");
		//ITestListener.super.onStart(context);
		
		
		ExtentSparkReporter ex=new ExtentSparkReporter(".\\ExtentReports\\Extent-Report"+new JavaUtility().getSysDate()+".html");
		ex.config().setDocumentTitle("Ninza Crm Automation Report");
		ex.config().setTheme(Theme.DARK);
		ex.config().setReportName("Web Automation Execution Report");
		
		
		reporter=new ExtentReports();
		reporter.attachReporter(ex);
		reporter.setSystemInfo("Base Browser", "Chrome");
		reporter.setSystemInfo("Base Paltform", "Windows");
		reporter.setSystemInfo("Base URL", "TestEnv");
		reporter.setSystemInfo("Reporter Name", "Pavani");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Execution completed");
		//ITestListener.super.onFinish(context);
		
//		throwing to report
		reporter.flush();
	}
	
	

}
