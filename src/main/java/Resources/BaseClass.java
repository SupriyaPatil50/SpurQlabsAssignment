package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver DriverInitialization() throws IOException {
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\NP\\eclipse-workspace\\SpurQlabsAssignment\\src\\main\\java\\Resources\\Data.properties");
		prop.load(file);
		
		String BrowserName=prop.getProperty("browser");
		if (BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\NP\\Desktop\\Selenium\\chromedriver_win32\\CHROMEDRIVER.EXE");


			// Create new object of ChromeDriver
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(BrowserName.equals("Firefox"))
		{
			// Firefox driver code
		}
		else
		{
			//here give ie code
		}
		
		return driver;
		}
	}
