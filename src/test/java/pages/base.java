package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class base {
	public static WebDriver driver;


@BeforeTest
    public static void openBrowser() {
	
     driver = new ChromeDriver();
		driver.get("https://www.firstcry.com");
}
@AfterTest
    public static void closeBrowser() {
		driver.close();
    }

}
