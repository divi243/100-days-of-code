package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\DeltaManiac\\chromedriver.exe");
		   driver = new ChromeDriver();
		  driver.get("http://Shop.DemoQA.com");
	  }
 
	@Test (priority=0)
  public void testTitle() {
	String actual = driver.getTitle();
	System.out.println(actual);
	int length =driver.getTitle().length();
	System.out.println(length);
	
  }
	@Test (priority=1)
	public void testURL()
	{
		  String url =  driver.getCurrentUrl();
		  assertEquals(url, "https://www.shop.demoqa.com");
		  driver.getPageSource();
		  System.out.println(driver.getPageSource().length());
	}

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
