package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Baseclass;

public class LoginPage extends Baseclass
{
	Baseclass b=new Baseclass();
	WebDriver driver;
	@FindBy(name="txtUserName")
	WebElement UserName;
	@FindBy(name="txtPassword")
	WebElement Password;
	@FindBy(name="Submit")
	WebElement Login;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void SetUsername(String UN)
	{
		UserName.sendKeys(UN);
	}
	public void SetPassword(String PW)
	{
		Password.sendKeys(PW);
	}
	public void SetLogin()
	{
		Login.click();
	}
	public void VerifyHomepage(String title)
	{
		if(driver.getTitle().equals(title))
		{
			System.out.println("Homepage"+title);
		}
		else
		{
			System.out.println("homepage"+title);
			return;
		}
	}

}
