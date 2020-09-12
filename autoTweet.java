package Auto;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class autoTweet {
  WebDriver driver;
	@Test
  public void f() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 WebElement username = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[1]/label/div/div[2]/div/input"));
	  username.sendKeys("xyz"); //give your username
	WebElement password = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[2]/label/div/div[2]/div/input"));
	password.sendKeys("******"); // give your password
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[3]/div/div")).click();
	WebElement tweet = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div"));
	
	tweet.sendKeys("#100DaysOfCode #codeNewbies");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[4]/div/div/div[2]/div[3]")).click();
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DeltaManiac\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://twitter.com/home");
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
