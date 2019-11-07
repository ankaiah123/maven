package Tests;



import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import TestBase.Baseclass;

public class listen extends Baseclass implements ITestListener {

	
			
	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	}
	public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
			
		if (result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case success"+result.getName());
		}
	}
	public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test case Failed"+result.getMethod().getMethodName());
			test.log(Status.FAIL, "Test case Failes" + result.getThrowable());
			
			String Location= screen(driver, result.getName());
			try {
				test.addScreenCaptureFromPath(Location);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
		if (result.getStatus() == ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case Skipped"+result.getName());
		}
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	}
	public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
	}
	public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	}
	}

