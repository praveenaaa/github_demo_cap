package com.seleniumdemo19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
 
public class HandleDropDrop {
  WebDriver driver;
	//public static void main(String[] args) throws InterruptedException {
		
 @Test
 
 public void drag_drop_jqueri() throws Exception{
		//System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe"); 

		// Instantiate a IEDriver class. 
		 driver=new InternetExplorerDriver();
		// Open webpage
		//System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		// driver = new FirefoxDriver();
		 
		// System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");

		// Start Edge Session
		// driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
 
		driver.switchTo().frame(0);
		
		// Add 5 seconds wait
		Thread.sleep(3000);
 
		// Create object of actions class
		Actions act=new Actions(driver);
 WebElement src= driver.findElement(By.id("draggable"));
 
 
 
 
 
 
 WebElement target= driver.findElement(By.id("droppable"));
		// find element which we need to drag
		//WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		// calling the method and x,y cordinates are random
		//act.dragAndDropBy(drag, 250, 150).build().perform();
		act.dragAndDrop(src, target).build().perform();
 
	}
 
}