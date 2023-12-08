package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends base {
	
	static WebDriver driver;
	
	@FindBy(xpath="//span[@class='anch poplogin_main poplogin R12_61']")
	public static WebElement login_Link;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement email_Field;
	
	@FindBy(xpath="//div[@class='B14_white comm-btn btn-login-continue btn-login-cont-otp']")
	public static WebElement continue_button;
	
	@FindBy(xpath = "//div[@id='verfiedbtn']")
	public static WebElement submit_button;
	
	@FindBy(xpath = "//span[@class='anch myacc_2']")
	public static WebElement my_Account;
	
	@FindBy(xpath = "(//a[text()='My Profile'])[1]")
	public static WebElement my_Profile;
	
	@FindBy(xpath = "//*[@id='profile1']/div/div[3]/div[1]/div/span")
	public static WebElement profile_Email;
	
	
	
	
	

	public static void goToProfile() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(my_Account);
		Thread.sleep(2000);
		action.moveToElement(my_Profile);
		action.click().build().perform();
	}
	public static String getProfileEmail() {
		return profile_Email.getText();
	}
	
	

	public loginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}
	
	
	

}



