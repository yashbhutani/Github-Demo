
package tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class QA2 {

	  private WebDriver driver;
	  //private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @SuppressWarnings("deprecation")
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    //driver = new FirefoxDriver();
	    //baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testQA2() throws Exception {
	    driver.get("https://integration-talentcentral-2a.eu.shl.zone/integrationtools/widgettestHarness");
	    driver.findElement(By.linkText("Integration Config Search")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("talentsoft");
	    driver.findElement(By.xpath("//form[@id='searchForm']/div[2]/div/div/div/ul/li[25]/a/label")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.xpath("//form[@id='searchForm']/div/div/div/div/ul/li[4]/a/label")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    driver.findElement(By.xpath("//form[@id='searchForm']/div/div[2]/div/div/ul/li[4]/a/label")).click();
	    driver.findElement(By.id("searchButton")).click();
	    driver.findElement(By.linkText("v3.0 (Promoted)")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Test Updated')])[2]")).click();
	    driver.findElement(By.id("Scalars.AuthenticationPassword")).click();
	    driver.findElement(By.id("Scalars.AuthenticationPassword")).clear();
	    driver.findElement(By.id("Scalars.AuthenticationPassword")).sendKeys("password");
	    driver.findElement(By.id("configSections")).click();
	    driver.findElement(By.id("PanelHeader_CandidateContainer")).click();
	    driver.findElement(By.id("show-add-to-CandidateContainer")).click();
	    driver.findElement(By.id("add-to-CandidateContainer")).click();
	    driver.findElement(By.id("SubmitButton")).click();
	    driver.findElement(By.id("SubmitRequest")).click();
	    driver.findElement(By.linkText("https://integration-talentcentral-2a.eu.shl.zone/Integration/ce/749628d991684cdc9982e41572c22641/?rid=3595964")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
	    driver.findElement(By.xpath("//div[@id='dpn-widget-container-box']/div[2]/div/div/div/div/label")).click();
	    driver.findElement(By.xpath("//div[@id='dpn-widget-container-box']/div[2]/div/div[2]/div/div/label")).click();
	    driver.findElement(By.id("btnAgree")).click();
	    driver.findElement(By.xpath("//div[@id='wrapper']/div/div[2]/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//div[@id='wrapper']/div/div[2]/div/div[2]/div[5]/div/button")).click();
	    driver.findElement(By.xpath("//div[@id='wrapper']/div/div[2]/div/div/div/div[4]/div[2]/fieldset/div/div[3]/label/span[2]")).click();
	    driver.findElement(By.id("next-to-veteran")).click();
	    driver.findElement(By.xpath("//div[@id='wrapper']/div/div[2]/div/div/div[2]/div[3]/div[2]/div/fieldset/div[4]/label/span[2]")).click();
	    driver.findElement(By.id("veteran-save")).click();
	    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div/div[2]/div/div/label")).click();
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.xpath("//div[@id='main']/div/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div[2]/button")).click();
	    driver.findElement(By.id("btn-start-assessment")).click();
	    driver.findElement(By.id("takeAssessment")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204197']/div[3]/a/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204198']/div[3]/a[3]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204199']/div[3]/a[2]/div/label/div/span[2]")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204200']/div[3]/a/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204201']/div[3]/a[3]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204202']/div[3]/a[2]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204203']/div[3]/a/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204204']/div[3]/a[3]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204205']/div[3]/a[2]/div/label/div/span[2]")).click();
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204206']/div[3]/a/div/label")).click();
	    driver.findElement(By.xpath("//div[@id='main_content']/div/div[3]/div[2]/div/div/div")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204207']/div[3]/a[2]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204208']/div[3]/a[3]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204209']/div[3]/a/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204210']/div[3]/a[2]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.linkText("Neither")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204211']/div[3]/a[3]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204212']/div[3]/a/div/label/div/span[2]")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204213']/div[3]/a[2]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div")).click();
	    driver.findElement(By.xpath("//div[@id='qgroup_simple_204214']/div[3]/a[3]/div/label")).click();
	    driver.findElement(By.xpath("//button[@id='btnNext']/div/i")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
	    driver.findElement(By.linkText("TCI Timeline")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

