package UdemySel.Mvn;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class practice_login {
ExtentReports ex;
static ExtentTest test;

	@BeforeTest
	public  void extendrep() {

		String path = (System.getProperty("user.dir") + "/index.html");
		System.out.println(path);
		ExtentSparkReporter rep = new ExtentSparkReporter(path);

		rep.config().setReportName("Testing Reports");
		rep.config().setDocumentTitle("Umair");

		ExtentReports ex = new ExtentReports();
		ex.attachReporter(rep);
		

	}

	@Test
	public void demo1() {
		
		ExtentTest t =	ex.createTest("first");
		t.log(Status.INFO, "testing1");

	
		System.out.println("this is in demo 1 method");
		//t.addScreenCaptureFromBase64String(path);   to take screenshot
		ex.flush();
	}

	@Test
	public void addn() {

		ExtentTest t2 =ex.createTest("second case");
		t2.log(Status.INFO,"second case");
		int i = 0;
		
		System.out.println("second test");
		//Assert.assertEquals(i, 2);

		ex.flush();

	}

}
