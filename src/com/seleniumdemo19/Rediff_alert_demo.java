package com.seleniumdemo19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_alert_demo {

WebDriver driver;	
@BeforeTest
public void launch_browser(){
	//System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	//driver=new ChromeDriver();
	System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe"); 

	
	 driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@Test

public void rediff_alert_handling() throws Exception{
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(3000);
	Alert al=driver.switchTo().alert();
	String str=al.getText();
	System.out.println(str);
	Assert.assertEquals(str, "Please enter a valid user name");
	System.out.println("test passed");
	Thread.sleep(3000);
	al.accept();
	//al.dismiss(); // cancel 
	driver.findElement(By.id("login1")).sendKeys("pravin");
	
	
}

//@Test(priority=2) 
//
//public void registration(){
//	System.out.println(" registration done ");
//	
//}

@AfterTest
public void close_browser(){
	//driver.quit();
}

}
