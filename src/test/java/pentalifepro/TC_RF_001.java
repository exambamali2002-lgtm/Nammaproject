package pentalifepro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepenta.Registrationpage;

public class TC_RF_001 {
	public static WebDriver driver;
	Registrationpage rp;
	
	@Given("User has opened the browser and launched the applicationn")
	public void user_has_opened_the_browser_and_launched_the_applicationn() {
		driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 
	     rp = new Registrationpage(driver);
		
	    
	}

	@When("User enters valid First namee")
	public void user_enters_valid_first_namee() {
		rp.firstname();
	    
	}

	@When("User enters valid Last namee")
	public void user_enters_valid_last_namee() {
		rp.lastname();
	    
	}

	@When("User enters valid Email IDD")
	public void user_enters_valid_email_idd() {
		rp.Email();

	    
	}

	@When("User enters valid Telephonee")
	public void user_enters_valid_telephonee() {
		rp.Telephone();
	    
	}

	@When("User enters valid Passwordd")
	public void user_enters_valid_passwordd() {
		rp.Password();
	    
	}

	@When("User enters valid Confirm Passwordd")
	public void user_enters_valid_confirm_passwordd() {
		rp.ConfirmPassword();
	    
	}

	@When("User clicks on radion button noo")
	public void user_clicks_on_radion_button_noo() {
		rp.radiobutton();
	    
	}

	@When("User clicks on privacy policy checkboxx")
	public void user_clicks_on_privacy_policy_checkboxx() {
		rp.checkbox();
	     
	}

	@When("User cliks on continue buttonn")
	public void user_cliks_on_continue_buttonn() {
		rp.continuebutton();
		
	    
	}

	@Then("User should be Registeredd")
	public void user_should_be_registeredd() {
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
		
	    
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Given("User has opened the browser and launched the application")
	public void user_has_opened_the_browser_and_launched_the_application() {
		driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 
				  rp = new Registrationpage(driver);
	}
	    

	@When("User enters valid First name")
	public void user_enters_valid_first_name() {
		rp.firstname();
	}

	@When("User enters valid Last name")
	public void user_enters_valid_last_name() {
	    rp.lastname();
	}

	@When("User enters valid Email ID")
	public void user_enters_valid_email_id() {
		rp.Email();
	}

	@When("User enters valid Telephone")
	public void user_enters_valid_telephone() {
	    rp.Telephone();
	}

	@When("User enters valid Password")
	public void user_enters_valid_password() {
	    rp.Password();
	}

	@When("User enters valid Confirm Password")
	public void user_enters_valid_confirm_password() {
		rp.ConfirmPassword();
	}

	@When("User clicks on radion button no")
	public void user_clicks_on_radion_button_no() {
		rp.radiobutton();
	    
	}

	@When("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
		rp.checkbox();
	    
	}

	@When("User cliks on continue button")
	public void user_cliks_on_continue_button() {
		rp.continuebutton();
	}

	@Then("User should be Registered")
	public void user_should_be_registered() {
		
		 Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
	 }


	
	    
	}*/




