package pentalifepro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepenta.loginfuntionlity;

public class loginfunationlity {
	WebDriver driver;
	loginfuntionlity lf;
	@Given("User has launched the browser and launched the applicationn")
	public void user_has_launched_the_browser_and_launched_the_applicationn() throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
				 driver.manage().window().maximize();
				 Thread.sleep(5000);
				  lf = new loginfuntionlity  (driver);
	    
	}

	@When("User enters valid email idd")
	public void user_enters_valid_email_idd() {
		lf.emailid();
	}

	@When("User enters valid passwordd")
	public void user_enters_valid_passwordd() {
		lf.password();
	}

	@When("User clicks on Login buttonn")
	public void user_clicks_on_login_buttonn() {
		lf.loginbutton();
	}

	@Then("User should be Loginedd")
	public void user_should_be_loginedd() {
		Assert.assertEquals(driver.getTitle(), "My Account");
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Given("User has launched the browser and launched the application")
	public void user_has_launched_the_browser_and_launched_the_application() throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
				 driver.manage().window().maximize();
				 Thread.sleep(5000);
				  lf = new loginfuntionlity  (driver);

	    
	}

	@When("User enters valid email id")
	public void user_enters_valid_email_id() {
		lf.emailid();
	    
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
		lf.password();
	   
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		lf.loginbutton();
	    
	}

	@Then("User should be Logined")
	public void user_should_be_logined() {
		Assert.assertEquals(driver.getTitle(), 
	}*/



}
