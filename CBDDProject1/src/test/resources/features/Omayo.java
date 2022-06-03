package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayo {
	WebDriver driver;
	@Given("^I navigate to application url$")
	public void I_navigate_to_application_url()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/");
	}
	
	
	
	  @When("^I click on My Account menu$")
	  public void i_click_on_my_account_menu() {
	  
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  
	  
	  }
	  
	  @When("^I click on Login option$") public void i_click_on_login_option() 
	  {
	  driver.findElement(By.linkText("Login")).click();
	  }
	  
	  @Then("^Login option should display$") public void
	  login_option_should_display() {
	  driver.findElement(By.id("input-email")).isDisplayed();
	  
	  }
	  
	  
	  @And("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	  public void i_enter_username_as_and_password_as(String username, String
	  password) { driver.findElement(By.id("input-email")).sendKeys(username);
	  driver.findElement(By.id("input-password")).sendKeys(password); }
	  
	  @And("^I click on Login button$") public void i_click_on_login_button() {
	  driver.findElement(By.xpath("//input[@type='submit']")).click(); }
	  
	  @Then("^user should be able to login based on \"([^\"]*)\" login status$")
	  
	  public void
	  user_should_be_able_to_login_based_on_expected_login_status(String
	  expectedResult) { String actualResult = null;
	  if(!driver.findElement(By.linkText("Edit your account information")).
	  isDisplayed()) { actualResult="failure"; } Assert.assertEquals(actualResult,
	  expectedResult); }
	  
	  
	  
	 
}


