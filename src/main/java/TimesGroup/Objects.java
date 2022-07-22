package TimesGroup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objects {

	public WebDriver driver;

	public Objects(WebDriver driver) {
		this.driver=driver;
//		driver.findElement(By.partialLinkText(null))
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "path[d=\'M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z\']")
	WebElement navbtn;

	@FindBy(css = "a[href='https://hindi.thesportstak.com/?theme=true\']")
	WebElement lang;

	@FindBy(partialLinkText = "भाषा बदलें")
	WebElement hindi;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/a[2]/div/span")
	WebElement buzz;
	
	@FindBy(xpath="/html/body/div/div/div[3]/a[1]/div/span")
	WebElement home;

	@FindBy(xpath="//*[text()='Theme']")
	WebElement Th;
	
	@FindBy(xpath="//*[text()='10 unheard facts about Rishabh Pant!']")
	WebElement story1;
	
	
	@FindBy(xpath="/html/body/amp-story/div[2]/button")
	WebElement nextbtn;
	
	public void navclick() {
		navbtn.click();
		Th.click();
		
	}
	public void navclicklang() {

		navbtn.click();
		lang.click();
		navbtn.click();
		hindi.click();

	}

	public void clicktobuzz() {
		buzz.click();

	}
	
	public void clickonhome() {
		home.click();
	}
	
	public void clickonstory() {
		story1.click();
	}
	
	public void clickonnextstory() {
		nextbtn.click();
	}

}
