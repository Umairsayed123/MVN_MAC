package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test_cases extends Object_reposit {

	@BeforeTest
	public void initialize() throws IOException {

		driver = Initialize();

	}

	@Test
public void gettingwebsite() {
		
		driver.get(p.getProperty("url"));
		System.out.println("testing");

	}
	
	
	
	@AfterTest
	public void teardown() {

		driver.close();

	}

}
