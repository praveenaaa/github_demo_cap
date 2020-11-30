package testng_practice_1_aug_2018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Google_multiple_parallel_session {
//	public static WebDriver driver;
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("https://www.google.com/");
            //find user name text box and fill it
            driver.findElement(By.name("q")).sendKeys("selenium");
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("https://www.google.com/");
        //find user name text box and fill it
        driver.findElement(By.name("q")).sendKeys("java");
        
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
        WebDriver     driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("https://www.google.com/");
        //find user name text box and fill it
        driver.findElement(By.name("q")).sendKeys("python");
        
        }        
}

