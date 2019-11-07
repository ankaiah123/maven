package Tests;

import javax.xml.ws.LogicalMessage;

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



import PageObjects.LoginPage;
import TestBase.Baseclass;



//@Listeners(Tests.listen.class)	
public class Tc_1 extends Baseclass
{
	LoginPage lg;
	
	public Logger k;
	
	
	
	
	@BeforeClass
	public void r()
	{
		
		k=Logger.getLogger(Tc_1.class);
		//PropertyConfigurator.configure("Log4j.properties");
	}
	
	
	@BeforeMethod
	public void launch()
	{
		
	Setup("chrome");
		System.out.println("Maximize the Browser");
		
		//k.info("hello world");
	}
	@Test
	public void Tc1() throws Exception
	{
	//	test=extent.createTest("Tc1");
		lg=new LoginPage(driver);
		
		lg.SetUsername(username);
		Thread.sleep(2000);
		//screen(driver, "rajesh");
		lg.SetPassword(password);
		//Thread.sleep(4000);
		lg.SetLogin();
		
	}
	
/*	@Test
		public void salman() throws Exception
	{
		test=extent.createTest("salman");
		log=new LoginPage(driver);
		System.out.println("im added to this code");
		

		log.SetUsername("rakesh");
		Thread.sleep(2000);
		screen(driver, "rajesh");
		log.SetPassword(password);
		Thread.sleep(4000);
		log.SetLogin();
		

	}*/
	
	
	
}
