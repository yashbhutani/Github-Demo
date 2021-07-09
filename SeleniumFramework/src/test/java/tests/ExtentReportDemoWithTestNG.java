package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemoWithTestNG {
	ExtentReports extent;
	ExtentSparkReporter spark;
	WebDriver driver = null;
	ExtentTest test = null;

	@BeforeSuite
	public void setUp() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);
		test = extent.createTest("MyFirstTest");
	}

	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void test1() {
		//ExtentTest test = extent.createTest("MyFirstTest");
		
		test.log(Status.INFO, "Starting test case");

		driver.get("https://google.com");
		test.pass("Navigated to www.google.com");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys("extent reports");
		test.pass("entered text in searchbox");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(Keys.RETURN);
		test.pass("pressed keyboard enter key");

		test.addScreenCaptureFromPath("screenshot.png");
	}
		
		@AfterTest
		public void tearDowntest() {
			driver.close();
			driver.quit();
			System.out.println("Test completed successfully");
			
		}


	

	@AfterSuite
	public void tearDown() {

		extent.flush();

	}
}
