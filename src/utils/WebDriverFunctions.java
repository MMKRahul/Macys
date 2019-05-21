package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverFunctions {
	
	protected WebDriver driver;
	// type
	 // by xpath, 
	 // by id
	 // by class
	 // by css
	
	// click
	 // by link
	 // tagname
	 // by xpatch
	
	// getText
	// radioButton
	// dropdown
	// iFrame
	// windows handle
	// switch
	// ---------------------------- EDIT BOX ----------------
	public void typeByXpath (String loc, String val){
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	public void typeByName (String loc, String val){
		driver.findElement(By.name(loc)).sendKeys(val);
	}
	// ----------------------- CLICK -------------------
	public void clickByXpath (String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	
	public void clickByLinkText(String val){
		driver.findElement(By.linkText(val));
	}
	// -------------- TIME
	public void currentTime() {
		// java code to get the current time
	}
	// implicit wait
	public void customSleep (int x) throws InterruptedException{
		Thread.sleep(x);
	}
	
	// ------------------ RadioButton

}

