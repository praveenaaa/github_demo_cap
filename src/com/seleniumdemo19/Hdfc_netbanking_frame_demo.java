package com.seleniumdemo19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hdfc_netbanking_frame_demo {
	WebDriver driver;
	//public static void main(String[] args) throws Exception {
	@Test
	public void hdfc_frame() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("444378");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("footer");
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("login_page");

		driver.findElement(By.xpath("//*[@alt='continue']")).click();
		//driver.findElement(By.xpath("//img[@alt='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("fldPassword")).sendKeys("abcd");

	}

}