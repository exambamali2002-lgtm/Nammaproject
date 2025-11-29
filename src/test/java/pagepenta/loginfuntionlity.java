package pagepenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginfuntionlity {
	WebDriver driver;
	public loginfuntionlity(WebDriver driver)
	
	{
		this.driver=driver;
	}
	By eid=By.id("input-email");
	By pass=By.id("input-password");
	By log=By.xpath("//input[@value='Login']");


public void emailid() 
{
	driver.findElement(eid).sendKeys("divyaa__123@gmail.com");
}
public void password()
{
	driver.findElement(pass).sendKeys("divya@1233");
}
public void loginbutton()
{
	driver.findElement(log).click();
}




	
}
