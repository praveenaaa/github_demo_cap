package com.seleniumdemo19;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo2 {

	@BeforeTest
	public void Launch_browser(){
		System.out.println(" launching browser");
	}
	
	@AfterTest
public void close_browser(){
		System.out.println(" close browser");
	}
	@Test
public void facebook(){
		System.out.println(" open fb");
		Assert.assertEquals(5, 5);
	}
	@Test
public void google(){
		System.out.println(" search in google");
	}
	@Test(priority=2)
	public void gmail(){
		System.out.println(" gmail login ");
		}
	
}
