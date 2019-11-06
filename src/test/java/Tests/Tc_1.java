package Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageObjects.LoginPage;
import TestBase.Baseclass;

@Listeners(Tests.listen.class)	
public class Tc_1 extends Baseclass
{
	LoginPage log;
	
	public Logger k;
	
	
	
	@BeforeTest
	public void ExtentReport()
	{
		extent_report();
		end();
	}
	@BeforeClass
	public void r()
	{
		
		k=Logger.getLogger(Tc_1.class);
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	
	@BeforeMethod
	public void launch()
	{
		
	Setup("chrome");
		System.out.println("Maximize the Browser");
		
		k.info("hello world");
	}
	@Test
	public void Tc1() throws Exception
	{
		test=extent.createTest("Tc1");
		log=new LoginPage(driver);
		
		log.SetUsername(username);
		//Thread.sleep(2000);
		//screen(driver, "rajesh");
		log.SetPassword(password);
		//Thread.sleep(4000);
		log.SetLogin();
		
	}
	@Test
	
	public void salman() throws Exception
	{
		test=extent.createTest("salman");
		log=new LoginPage(driver);
		System.out.println("im added to this code");
		Assert.assertEquals(12, 13);

		/*log.SetUsername("rakesh");
		Thread.sleep(2000);
		screen(driver, "rajesh");
		log.SetPassword(password);
		Thread.sleep(4000);
		log.SetLogin();
*/		

	}
	
	
	
}
