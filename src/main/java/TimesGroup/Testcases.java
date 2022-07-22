package TimesGroup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testcases   {

	public WebDriver driver;


	@BeforeTest	
	public void driver()
	{
			// initializing and starting the firefox browser
			System.setProperty("webdriver.gecko.driver", "/Users/umairsayed/Documents/SELENIUM/geckodriver");
			driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.get("https://thesportstak.com/");

	}


	@Test
public void open_change_theme() throws InterruptedException { //change language 1
		Objects o=new Objects(driver);

		o.navclicklang(); //change language
		o.clicktobuzz();  //click on buzz
		o.navclick(); //change theme 
		o.clickonhome();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,1100)");
        Thread.sleep(2000);

		o.clickonstory(); //clicl on story
		Thread.sleep(4000);
		o.clickonnextstory();
	
	}
	
	
	

	
	@AfterTest
	public void teardown() {

		//driver.close();

	}
	
	
}
