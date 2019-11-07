package Tests ;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.AddEmployee;
import PageObjects.LoginPage;
import TestBase.Baseclass;


public class Tc_2 extends Baseclass
{
	
	AddEmployee a;
LoginPage lg;
	
	public Logger k;
	
	
	
	
	@BeforeClass
	public void r()
	{
		
		k=Logger.getLogger(Tc_2.class);
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
	public void f() throws InterruptedException
	{
        lg=new LoginPage(driver);
		
		lg.SetUsername(username);
		Thread.sleep(2000);
		//screen(driver, "rajesh");
		lg.SetPassword(password);
		//Thread.sleep(4000);
		lg.SetLogin();
		a=new AddEmployee(driver);
		VerifyHomepage("OrangeHRM");
		a=new AddEmployee(driver);

		a.setpim();
		a.setaddemp();
		a.frame();
	    a.SetLName(lastname);
		a.SetFName(firstname);

		//a.setphotofile(photo);
		a.setSave();
		
	}
	
	
 }
		
	
	
	
	

		
	
	

