package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		ExtentTest test1 = extent.createTest("MyFirstTest");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");

		driver.get("https://google.com");
		test1.pass("Navigated to www.google.com");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys("extent reports");
		test1.pass("entered text in searchbox");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(Keys.RETURN);
		test1.pass("pressed keyboard enter key");

		driver.close();
		driver.quit();
		test1.pass("close the browser");

		test1.info("test completed");

		ExtentTest test2 = extent.createTest("MySecondTest");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting test case");

		driver.get("https://google.com");
		test2.pass("Navigated to www.google.com");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys("extent reports");
		test2.pass("entered text in searchbox");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(Keys.RETURN);
		test2.fail("pressed keyboard enter key");

		driver.close();
		driver.quit();
		test2.pass("close the browser");

		test2.info("test completed");
		extent.flush();
	}
}