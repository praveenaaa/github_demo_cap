package com.seleniumdemo19;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserTestingScript {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	
	if(browser.equalsIgnoreCase("firefox")){

		System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("chrome")){
	
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
	
	}
	else if(browser.equalsIgnoreCase("Edge")){
	
		 System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");

		
		 driver = new EdgeDriver();
	}
	else{

	throw new Exception("Incorrect Browser");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testParameterWithXML() throws InterruptedException{

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		int how_many_frame=driver.findElements(By.tagName("frame")).size();
		System.out.println(how_many_frame);
		//driver.switchTo().frame("footer");
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("444378");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("footer");
		driver.findElement(By.linkText("Terms and Conditions")).click();
		driver.close();
	}
	}

