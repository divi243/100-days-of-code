import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void Login() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr284714");
	  
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("bYdAjez");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
      Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).getText(),"New Customer");
  }
  
  @Test 
  public void NewCustomer() {
	  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")).getText(), "Add New Customer");
driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("_dasd");
 Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/label")).getText(), "Special characters are not allowed");
//  Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/label")).getText(),"Address Field must not be blank");
 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("this is address");
 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("kochi");
 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")).click();

 
  }
  @Test
  public void submitAlert() {
	  boolean present =false;
	     if(driver.switchTo().alert() != null) {
	    	 present = true;
	     }
	     else {
	    	 present =false;
	    	 
	     }
	     Assert.assertEquals(present, true);
	     
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/V2/");
	//  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
