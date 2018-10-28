package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class swfunctions {
	public WebDriver driver;
	public void typeByXpath (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);
		
	}
	public void typeByCss (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);
	}
	public void typeByid (String locator, String values){
		driver.findElement(By.xpath(locator)).sendKeys(values);
	}
	public void clickByXpath (String locators){
		driver.findElement(By.xpath(locators)).click();
	}

		

}
