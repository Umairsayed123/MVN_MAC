package TimesGroup;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class Story {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/umairsayed/Documents/SELENIUM/geckodriver");
		WebDriver driver = new FirefoxDriver();

		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	driver.get("https://thesportstak.com/");

	//JavascriptExecutor js = (JavascriptExecutor) driver;
    //js.executeScript("javascript:window.scrollBy(0,1100)");
    //Thread.sleep(2000);
	 //driver.findElement(By.xpath("//*[text()='10 unheard facts about Rishabh Pant!']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("/html/body/amp-story/div[2]/button")).click();

	//driver.findElement(By.cssSelector(".lpfnf.pa.svg-el.lpfnf-a")).click();
	
	
	//System.out.println(driver.findElement(By.className("pagtg.pa.pagtg-a")).getText());
	
	
	
	List<WebElement> links = driver.findElements(By.tagName("a"));

	SoftAssert a = new SoftAssert();

	for (WebElement link : links)

	{

		String url = link.getAttribute("href");

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		conn.setRequestMethod("HEAD");

		conn.connect();

		int respCode = conn.getResponseCode();

		System.out.println("response code is "+respCode +", for url " +url);

		a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

	}

	
	
	
	}
	
	
	
	

}
