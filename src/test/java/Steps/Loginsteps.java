package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.base;
import pages.loginPage;

public class Loginsteps {
	WebDriver driver;
	
	base Base;
	loginPage LoginPage;
	
	
	@BeforeAll
	public static void featurestarts()
	{
		System.out.println("The feature has started execution");
		
	}
	
	@AfterAll
	public static void featureends()
	{
		System.out.println("The feature has completed execution");
	}
	
@Given("I open the browser")
public void i_open_the_browser() {
    // Write code here that turns the phrase above into concrete actions
   Base= new base();
}

@Then("I enter the Url")
public void i_enter_the_url() {
    // Write code here that turns the phrase above into concrete actions
   Base= new base();
}

@Then("I click on Login Link")
public void i_click_on_login_link() {
    // Write code here that turns the phrase above into concrete actions
  loginPage.login_Link.click();
}

@Then("I enter the email as {string}")
public void i_enter_the_email_as(String emailid) {
    // Write code here that turns the phrase above into concrete actions
 loginPage.email_Field.sendKeys(emailid);
  
}

@Then("I click on continue button")
public void i_click_on_continue_button() {
    // Write code here that turns the phrase above into concrete actions
	loginPage.continue_button.click();
}

@Then("I wait for the otp")
public void i_wait_for_the_otp() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
  Thread.sleep(30000);
}

@Then("I  click on submit button")
public void i_click_on_submit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	loginPage.submit_button.click();
}

@Then("I go to my account link and my profile")
public void i_go_to_my_account_link_and_my_profile() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.xpath("//span[@class='anch myacc_2']")).click();
	Thread.sleep(2000);
	loginPage.goToProfile();
}

@Then("check my profile")
public void check_my_profile() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	System.out.println(loginPage.getProfileEmail());
	Assert.assertEquals(toString(),loginPage.getProfileEmail());

}

}

