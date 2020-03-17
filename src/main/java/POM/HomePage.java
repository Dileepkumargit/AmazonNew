package POM;
import static StepDefination.Hooks.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage {
	public String Brand;
	
	public void searchforproducts() throws AWTException, InterruptedException {
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		String searchingfor = "shirts";
		driver.findElement(By.xpath("//div/input[@class='desktop-searchBar']")).sendKeys(searchingfor);
		System.out.println("user search for :: "+ searchingfor);
		driver.findElement(By.xpath("//div/input[@class='desktop-searchBar']")).sendKeys(Keys.ENTER);
	}
	public void selectgender() throws AWTException {
		
		driver.findElement(By.xpath("//ul[@class='gender-list']//li//label[contains(text(),'Men')]")).click();
	}
	public void selectBrand() {
		List<WebElement> allBrands = driver.findElements(By.xpath("//ul[@class='brand-list']//li"));
		Random random = new Random();
		int listofBrands = random.nextInt(allBrands.size());
		System.out.println("user Select :: "+listofBrands);
		Brand = allBrands.get(listofBrands).getText();
		System.out.println("User Seclect :: "+Brand);
		allBrands.get(listofBrands).click();
	}

}
