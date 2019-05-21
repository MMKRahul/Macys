package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.MacysLocators;
import values.MacysValues;


public class MacysEmailPass extends Config{
	
	MacysLocators 	fbl = new MacysLocators();
	MacysValues			fbv = new MacysValues();

	@Test // test annotion - without this annotation, you can't execute any tes
	public void testFacebookEmailPass(){

		// Enter firstName
		driver.findElement(By.xpath(fbl.email)).sendKeys(fbv.emailVal);
		// Enter lastName
		driver.findElement(By.xpath(fbl.pass)).sendKeys(fbv.passVal);
	}

}
