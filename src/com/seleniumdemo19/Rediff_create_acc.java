package com.seleniumdemo19;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_create_acc {
WebDriver driver;
	@BeforeTest
	public void open_browser(){
		
	}
	@Test
	
	public void create_acc(){
		
		
	}
	
	
	@AfterTest
	public void close_browser(){
		driver.close();
		driver.quit();
	}
	
	
	
}
