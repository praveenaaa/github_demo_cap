package com.seleniumdemo19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHotelBooking
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("file:///D:/BDD/BDD%20certf/hotelBooking/hotelBooking/hotelbooking.html");
        driver.get("file:///D:/capgemini%20docs/selenium_cap_code/hotel_booking_solution/hotelBookingSolution/hotelBooking/hotelbooking.html");
		String title=driver.getTitle();
		System.out.println("The page title is :" + title);

		/******* For blank First Name *******/
		driver.findElement(By.name("txtFN")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();

		/******* For valid First Name *******/
		driver.findElement(By.name("txtFN")).sendKeys("Neelima");
		/******* For blank Last Name *******/

		driver.findElement(By.xpath("//*[@id='txtLastName']")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();

		/******* For valid Last Name *******/
		driver.findElement(By.xpath("//*[@id='txtLastName']")).sendKeys("Padmawar");


		/******* For blank Email Id *******/
		driver.findElement(By.name("Email")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For invalid Email ID *******/
		driver.findElement(By.name("Email")).sendKeys("a.com");								
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For valid Email ID *******/
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("neel.padmawar@gmail.com");	

		/******* For blank MobileNo *******/
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For invalid Mobile No *********/ 
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("7896");	
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For valid Mobile No *******/
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).clear();
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("7897897890");	

		/******* For blank city  *******/
		Select drpCity = new Select(driver.findElement(By.name("city")));
		drpCity.selectByVisibleText("Select City");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For selecting city  *******/
		drpCity.selectByVisibleText("Pune");


		/******* For blank State  *******/
		Select drpState = new Select(driver.findElement(By.name("state")));
		drpState.selectByVisibleText("Select State");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For selecting State  *******/
		drpState.selectByVisibleText("Maharashtra");


		/******* For blank CardHolderName ******/
		driver.findElement(By.id("txtCardholderName")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For valid CardHolderName *******/
		driver.findElement(By.id("txtCardholderName")).sendKeys("Neelima Padmawar");

		/***** For blank DebitCardNo *******/
		driver.findElement(By.id("txtDebit")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For valid DebitCardNo *******/
		driver.findElement(By.id("txtDebit")).sendKeys("6789678978906789");

		/***** For blank CVV *******/
		driver.findElement(By.name("cvv")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/******* For valid CVV *******/
		driver.findElement(By.name("cvv")).sendKeys("890");

		/***** For blank Expiry Month  *****/
		driver.findElement(By.id("txtMonth")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/***** For valid Expiry Month  *****/
		driver.findElement(By.id("txtMonth")).sendKeys("5");

		/***** For blank Expiry Year  *****/
		driver.findElement(By.id("txtYear")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();	
		alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		//callAlert();
		
		/***** For valid Expiry Year  *****/
		driver.findElement(By.id("txtYear")).sendKeys("2020");

		//entered all valid data. Now its time to navigate to next page
		driver.findElement(By.id("btnPayment")).click();
		driver.navigate().to("file:///D:/BDD/BDD%20certf/hotelBooking/hotelBooking/success.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	driver.close();


	}
	/*
	public static void callAlert()
	{
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);		
		driver.switchTo().alert().accept();

	}
	*/

}
