package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.collections.Lists;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver; boolean present;
	
	 @BeforeTest
	  public void beforeTest() {  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\DeltaManiac\\chromedriver.exe");
		   driver = new ChromeDriver();
		  driver.get("https://guru99.com/");
	  }
 
	@Test (priority=0)
  public void testTitle() {
	WebElement title = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[1]/div/a/img"));
	Assert.assertEquals( title.getAttribute("src"), "https://www.guru99.com/images/logo/logo_v1.png");
	title = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[1]/div/a"));
	assertEquals(title.getAttribute("title"), "Guru99");
	
  }
	@Test (priority=1)
	public void testMenuBar()
	{   
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		WebElement menu = driver.findElement(By.id("menu-3688-particle"));
		int item=0;
		//WebElement menuBar = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/ul"));
		List<WebElement> menuList = menu.findElements(By.tagName("li"));
		System.out.println( menuList.size());
		for(WebElement list:menuList) {
	      System.out.print(""+list.getText()+"");
		  item++;
	  }
		Assert.assertEquals(item, 186);
	
	}
  
	@Test(dependsOnMethods= {"testMenuBar"})
	public void testMenuList() {
		WebElement menu = driver.findElement(By.id("menu-3688-particle"));
		if(menu != null) {
			present = true;
		}else {
			present =false;
		}
		 Assert.assertEquals(present, true);
	}
	
	@Test(dependsOnMethods = {"testMenuList"})
	public void checkText() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[1]/a/span/span"));
	    Assert.assertEquals(element.getText(), "Home"); 
	}
	
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
