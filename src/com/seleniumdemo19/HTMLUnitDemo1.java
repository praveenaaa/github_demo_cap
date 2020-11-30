package com.seleniumdemo19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HTMLUnitDemo1 {
 public  WebDriver driver;
	//public static void main(String[] args) throws Exception {
 
 @Test
 
 public void headlessbrowser() throws Exception{
		// TODO Auto-generated method stub
		// Declaring and initialising the HtmlUnitWebDriver
		//HtmlUnitDriver driver=new HtmlUnitDriver();
		/*ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		//options.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			 	driver=new ChromeDriver(options);*/
			System.out.println("browser launched ");
			FirefoxOptions options1=new FirefoxOptions();
			options1.setHeadless(true);
			System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
			 driver = new FirefoxDriver(options1);
	 
				// open google.com webpage
				driver.get("http://google.com");
		 
				System.out.println("Title of the page is -> " + driver.getTitle());
		 
				// find the search edit box on the google page
				WebElement searchBox = driver.findElement(By.name("q"));
		 
				// type in Selenium
				searchBox.sendKeys("Selenium");
		 Thread.sleep(2000);
				// find the search button
				WebElement button = driver.findElement(By.name("btnK"));
		 
				// Click the button
				button.click();
		 
				System.out.println("Title of the page is -> " + driver.getTitle());

	}
}
