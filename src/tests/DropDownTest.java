package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.DropDownLoc;
import values.DropDownVal;

public class DropDownTest extends Config {
	DropDownLoc loc=new DropDownLoc();
	DropDownVal value=new DropDownVal();
	@Test
    public void test2(){
		dropdownusingValue(loc.monthloc,value.monthval);
		dropdownusingValue(loc.dayloc,value.dayval);
		dropdownusingValue(loc.yearloc,value.yearval); 

		//WebElement selectelements=driver.findElement(By.xpath(loc));
		//Select dropdown=new Select (selectelements);
		//dropdown.selectByVisibleText(val);
	}

}
