package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	

}
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		GoogleSearchPage.textbox_search(driver).sendKeys("Yash Bhutani");
		GoogleSearchPage.button_search(driver).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}