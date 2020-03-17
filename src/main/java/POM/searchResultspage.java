package POM;
import static StepDefination.Hooks.driver;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class searchResultspage {
	public String selectedIteam;
	public String selectedSize;
	public void selectediteam() {
		List<WebElement> allResuts = driver.findElements(By.xpath("//li[@class='product-base']"));
		Random random = new Random();
		int listofresults = random.nextInt(allResuts.size());
		System.out.println("user Select :: "+listofresults);
		 selectedIteam = allResuts.get(listofresults).getText();
		System.out.println("User Seclect :: "+selectedIteam);
		allResuts.get(listofresults).click();
	}
	
	public void selectSize() {
		
		List<WebElement> sizelist = driver.findElements(By.xpath("//div[@class='size-buttons-tipAndBtnContainer']"));
		System.out.println(sizelist.size());
		Random randm = new Random();
		int listofsizes = randm.nextInt(sizelist.size());
		System.out.println("List of sizes are :: "+listofsizes);
		System.out.println("Available sizes are :: "+ sizelist.toString());
		selectedSize = sizelist.get(listofsizes).getText();
		System.out.println("User Seclect :: "+selectedSize);
		sizelist.get(listofsizes).click();
	}
	public void clickOnAddToBagbutton() {
		
		driver.findElement(By.xpath("//div[contains(text(),'ADD TO BAG')]")).click();
	}
	public void clickOnGotoBag() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']")).click();
	}
	public void verifyTheProductDeatils() {
		String productName = driver.findElement(By.xpath("//div[@class='itemContainer-base-brand']")).getText();
		System.out.println(productName);
		
	}
	public void windowshandle() {
		Set handles = driver.getWindowHandles();
	    handles.size();
	    System.out.println("Handles");
	    for (String handle1 : driver.getWindowHandles()) {
	    	 
        	System.out.println(handle1);
        	
        	driver.switchTo().window(handle1);
        
        	}
	    for (String handle2 : driver.getWindowHandles()) {
	    	 
        	System.out.println(handle2);
        	
        	driver.switchTo().window(handle2);
        
        	}
	}
	
	public void logoutfromwebsite() {
		driver.navigate().back();
		driver.findElement(By.xpath("//span[@class='desktop-userTitle'][contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//div[@class='desktop-accInfoSection'][contains(text(),'Logout')]")).click();
	}

}
