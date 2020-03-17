package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
	
	public static WebDriver driver;
	@Before
	public void openbrpwser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilip\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void quitTheBrowser() {
		driver.close();
		driver.quit();
	}

}
