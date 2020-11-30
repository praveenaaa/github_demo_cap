package testng_practice_1_aug_2018;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	private static WebDriver driver;
	 
	  @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "lalitha", "password123" }, { "admin", "password456" }};
	 
	  }
	 
	  // Here we are calling the Data Provider object with its Name
	 
	  @Test(dataProvider = "Authentication")
	 
	  public void test(String sUsername, String sPassword) {
	 
		  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

			//Create Browser object
			driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://localhost:8083/TestMeApp");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.linkText("SignIn")).click();
			String str1=  driver.getTitle();
			System.out.println(str1);
			//Assert.assertEquals(str1,"Login" );

			driver.findElement(By.name("userName")).sendKeys(sUsername);
			driver.findElement(By.name("password")).sendKeys(sPassword);
			driver.findElement(By.name("Login")).click();
			String str2=  driver.getTitle();
			System.out.println(str2);
			//Assert.assertEquals(str2,"Home" );
			driver.quit();
	 
	     
	 
	     
	 
	  }
	 
}
