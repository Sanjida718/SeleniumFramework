package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.swfunctions;

public class Config extends swfunctions {
	@BeforeTest
	public void beforetestingstart(){
		///Users/SanjidaAfrin/Desktop/HWFrameWork/Drivers/chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "/Users/SanjidaAfrin/Documents/SeleniumFramework/Drivers/chromedriver");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
