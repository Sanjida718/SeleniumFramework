package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Config;
import locators.IframeLoc;
import values.Iframeval;

public class IframeTest extends Config {
	
	IframeLoc loc=new IframeLoc();
	Iframeval val=new Iframeval();
	@Test
	public void iframesize(){
		
		//WebElement rr=driver.findElement(By.xpath(loc.Iframeloc));
		//System.out.println(rr.getSize());
		List<WebElement> pg= driver.findElements(By.tagName("a"));
		for(int i=0;i<pg.size();i++)
		{
			System.out.println("pg");
		}

	
	}


		
	
	}
	
	

	