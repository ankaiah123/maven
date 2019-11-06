package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Baseclass;

public class AddEmployee extends Baseclass
{
Actions act;
	
	@FindBy(xpath="//span[contains(text(),'PIM')]")
    WebElement pim;
	@FindBy(linkText="Add Employee")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id='txtEmpLastName']")
	WebElement txtEmpLastName;
	@FindBy(name="txtEmpFirstName")
	WebElement txtEmpFirstName;
	@FindBy(name="photofile")
	WebElement photofile;
	@FindBy(id="btnEdit")
	WebElement save;
	
public AddEmployee(WebDriver driver1)
{
	PageFactory.initElements(driver1, this);
	this.driver=driver1;
	
}

public void setpim()
{
movetomouseover(pim);


}
public void setaddemp()
{
	movetomouseover(AddEmployee);
	AddEmployee.click();
	
}
public void frame()
{
	Switchtoelement();
}
public void SetLName(String lname)
{
	txtEmpLastName.sendKeys(lname);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
public void SetFName(String FName)
{
	txtEmpFirstName.sendKeys(FName);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

}

public void setphotofile(String file)
{
	
	photofile.sendKeys(file);
}
public void setSave()
{
	save.click();
}
}
