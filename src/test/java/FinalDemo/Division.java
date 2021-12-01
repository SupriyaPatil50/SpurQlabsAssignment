package FinalDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.NumbersAndOperators;
import Resources.BaseClass;

public class Division extends BaseClass {
	
	public WebDriver driver;
	@Test
	public void ArithmeticOperationsDiv() throws IOException, InterruptedException 
	   {

	driver=DriverInitialization();
	driver.get(" https://www.calculator.net/");

	NumbersAndOperators obj = new NumbersAndOperators(driver);
	Thread.sleep(5000);
	obj.getno4().click();
	obj.getno0().click();
	obj.getno0().click();
	obj.getno0().click();
	obj.Divisionoper().click();
	obj.getno2().click();
	obj.getno0().click();
	obj.getno0().click();
	
	WebElement CalculatorTextBox = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	String result = CalculatorTextBox.getText();
	Assert.assertEquals(result," 20");
}
}
