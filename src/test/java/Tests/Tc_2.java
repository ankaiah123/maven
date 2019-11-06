package Tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Log;


public class Tc_2 
{
	
	

public static void main(String[] args)
{
		
		
	PropertyConfigurator.configure("Log4j.properties");
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        Log.info("Browser1 Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Log.info("Implicit1 wait given");
	      
	 
	        // Load application
	        driver.get("https://www.google.co.in/");
	        Log.info("Url 1opened");
	      
	 
	        // type Selenium
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        Log.info("keyword1  type");           
	    }
		
	
	
	
	

		
	}
	

