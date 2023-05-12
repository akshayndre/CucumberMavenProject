package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.nopcommercepage.object.Adminpage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination1 extends Baseclass{

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver","F:\\Automation Software\\eclipse-java-2023-03-R-win32-x86_64\\eclipse\\software\\chromedriver_win32\\chromedriver.exe");
      //  driver=new ChromeDriver();
		//ad = new Adminpage(driver);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver();
		ad = new Adminpage(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) throws Exception {
			   driver.get(url);
			   Thread.sleep(2000);
			   
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
		
	    
	}

	@When("User enter email as {string} and password {string}")
	public void user_enter_email_as_and_password(String email, String password) throws Exception {
		ad.setusername(email);
		ad.setpassword(password);
	  Thread.sleep(2000);

	}

	@When("User Click on Login button")
	public void user_click_on_login_button() throws Exception {
		ad.clicklogin();
  	  Thread.sleep(2000);
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertEquals(title,driver.getTitle());
		  
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}

	
}
