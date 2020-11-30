package com.seleniumdemo199;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hdfc_netbanking_frame_demo99 {

	WebDriver driver;
	//public static void main(String[] args) throws Exception {
	@Test
	public void hdfc_frame() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
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
