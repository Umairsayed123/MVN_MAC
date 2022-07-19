package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Object_reposit {
	public WebDriver driver;
	public Properties p;

	public WebDriver Initialize() throws IOException {
		
		 p=new Properties();
		FileInputStream f=new FileInputStream("/Users/umairsayed/eclipse-workspace/Mvn/Resources/pro.properties");
		p.load(f);
		String browser=p.getProperty("browser");
		String d_loc=p.getProperty("fox_loc");
		String Ch_loc=p.getProperty("chrome_loc");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{

			// initializing and starting the chrome browser
			System.setProperty("webdriver.chrome.driver", Ch_loc);
			driver = new ChromeDriver();
		}
		else
		{

			// initializing and starting the firefox  browser
			System.setProperty("webdriver.gecko.driver", d_loc);
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
		
	}
	

	
	
}
