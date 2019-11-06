package TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import TestUtilities.readConfig;

public class Baseclass
{
readConfig rc=new readConfig();


	
    public String url=rc.geturl();
    public String username=rc.getusername();
    public String password=rc.getpassword();
    
    public static WebDriver driver;
    public WebDriverWait wait;
    public static  Actions act;
    
public Logger k;
	
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentHtmlReporter html;
    
     // Current System Date and time is assigned to objDate
  
   
    
    public void Setup(String br)
    {
    	if(br.equals("chrome"))
    	{
    	System.setProperty("webdriver.chrome.driver",rc.getpath());
    	driver=new ChromeDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get(url);
    	
    	
    }
    
   
    
   public void VerifyHomepage(String title) 
   
   {
	   if(driver.getTitle().equals(title))
	   {
		   System.out.println("homepage"+title);
	   }
   }
    
   public void movetomouseover(WebElement element)
   {
   	Actions act=new Actions(driver);
   	try {
   		Thread.sleep(2000);
   	} catch (InterruptedException e) {
   		
   		e.printStackTrace();
   	}
   	act.moveToElement(element).build().perform();
   	
   }
   public void lickonmouseover(WebElement element)
   {
   	act.moveToElement(element).click().perform();
   }
   public void Switchtoelement()
   {
   	driver.switchTo().frame("rightMenu");
   }
   public void Switchtodefaultelement()
   {
   	driver.switchTo().defaultContent();
   }
   public void dropdowncommands(WebElement aaaa,String str)
   {
   	Select ss=new Select(aaaa);
   	ss.selectByIndex(2);
   }
   
  
	public static String screen(WebDriver driver,String screenname)
	{
		String timestamp=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		System.out.println(timestamp);
		String Location= "D:\\Selenium\\Maven1\\screenShot\\"+screenname+"_"+timestamp+".jpg";
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(src, new File(Location));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Location;
		
	}
	public void extent_report()
	{
		html=new ExtentHtmlReporter("D:\\Selenium\\Maven1\\test-output\\myReport.html");
		html.config().setDocumentTitle("Automation report");
		html.config().setReportName("ankaiah");
		html.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(html);
		extent.setSystemInfo("Hostname", "Ankaiah");
		extent.setSystemInfo("testerName", "Anand");
		
	}
	
	public void end()
	{
		extent.flush();
	}
	
	
	
}


