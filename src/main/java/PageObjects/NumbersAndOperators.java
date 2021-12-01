package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NumbersAndOperators {
	public WebDriver driver;
	By minus= By.xpath("//span[contains(text(),'–')]");
	By plus= By.xpath("//span[contains(text(),'+')]");
	By div= By.xpath("(//span[contains(text(),'/')])[2]");
	By multi= By.xpath("//span[contains(text(),'×')]");
	By openbracket= By.xpath("//span[contains(text(),'(')]");
	By closebracket= By.xpath("//span[contains(text(),')')]");
	By no0= By.xpath("//span[@onclick='r(0)']");
	By no1= By.xpath("//span[@onclick='r(1)']");
	By no2= By.xpath("//span[contains(text(),'2')]");
	By no3= By.xpath("//span[contains(text(),'3')]");
	By no4= By.xpath("//span[contains(text(),'4')]");
	By no5= By.xpath("//span[contains(text(),'5')]");
	By no6= By.xpath("//span[contains(text(),'6')]");
	By no7= By.xpath("//span[contains(text(),'7')]");
	By no8= By.xpath("//span[contains(text(),'8')]");
	By no9= By.xpath("//span[contains(text(),'9')]");
	
	
	public NumbersAndOperators(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public WebElement openbraces()
	{
		return driver.findElement(openbracket);
	}
	public WebElement closebraces()
	{
		return driver.findElement(closebracket);
	}
	public WebElement multioper()
	{
		return driver.findElement(multi);
	}
	
	public WebElement Additionoper()
	{
		return driver.findElement(plus);
	}	
	public WebElement Divisionoper()
	{
		return driver.findElement(div);
	}	
	public WebElement Substractopera()
	{
		return driver.findElement(minus);
	}
	public WebElement getno1()
	{
		return driver.findElement(no1);
	}	
	public WebElement getno2()
	{
		return driver.findElement(no2);
	}	
	public WebElement getno3()
	{
		return driver.findElement(no3);
	}	
	public WebElement getno4()
	{
		return driver.findElement(no4);
	}	
	public WebElement getno5()
	{
		return driver.findElement(no5);
	}	
	public WebElement getno6()
	{
		return driver.findElement(no6);
	}	
	public WebElement getno7()
	{
		return driver.findElement(no7);
	}	
	public WebElement getno8()
	{
		return driver.findElement(no8);
	}	
	public WebElement getno9()
	{
		return driver.findElement(no9);
	}	
	public WebElement getno0()
	{
		return driver.findElement(no0);
	}	

}
