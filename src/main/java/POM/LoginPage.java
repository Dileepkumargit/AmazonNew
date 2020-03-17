package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static StepDefination.Hooks.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class LoginPage {
	
	public void clickOnLoginButton() {
		 Actions Action = new Actions(driver);
		 WebElement A1 = driver.findElement(By.xpath("//div[@class='desktop-user']"));
		 Action.moveToElement(A1).perform();
		 driver.findElement(By.xpath("//div//a[contains(text(),'log in')]")).click();
	}
	public void enterTheUsernameandPassword() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		String username = "thupatidileep@gmail.com";
		String password = "dileep335";
		driver.findElement(By.xpath("//div//input[@type='email']")).sendKeys(username);
		System.out.println("User enter the username ::"+ username);
		driver.findElement(By.xpath("//div//input[@type='password']")).sendKeys(password);
		System.out.println("User enter the password :: "+password);
		driver.findElement(By.xpath("//div//button[@class='login-login-button']")).click();
	}

}
