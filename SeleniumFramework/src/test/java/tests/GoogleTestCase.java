package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleTestCase {
	
	private static WebDriver driver = null;
	

	public static void main(String[] args) { 
	
		GoogleTestCase();
	}

	public static void GoogleTestCase() {
	
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		searchPageObj.setTextSearchBox("yash bhutani");
		searchPageObj.clickSearchButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,1000)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,-500)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//searchPageObj.sendkeys(Keys.F5);
		
		driver.close();
		driver.quit();
	}


}