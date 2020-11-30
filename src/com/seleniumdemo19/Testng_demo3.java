package com.seleniumdemo19;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo3 {
//STCM TEST CASE AM,AC,AT,AS 
	@BeforeTest
	public void launch_browser(){
		
		System.out.println(" i m in @BeforeTest");
	}
	
	@AfterTest
public void close_browser(){
		
		System.out.println(" i m in @AfterTest");
	}
	
	
	@org.testng.annotations.BeforeSuite
public void BeforeSuite(){
		
		System.out.println(" i m in @BeforeSuite");
	}
	
	@org.testng.annotations.AfterSuite
public void AfterSuite(){
		
		System.out.println(" i m in @AfterSuite");
	}
	
	@org.testng.annotations.BeforeClass
public void BeforeClass(){
		
		System.out.println(" i m in @BeforeClass");
	}
	@org.testng.annotations.AfterClass
public void AfterClass(){
		
		System.out.println(" i m in @AfterClass");
	}
	@org.testng.annotations.BeforeMethod
public void BeforeMethod(){
		
		System.out.println(" i m in 	@BeforeMethod");
	}
	@org.testng.annotations.AfterMethod 
public void AfterMethod (){
		
		System.out.println(" i m in @AfterMethod ");
	}
	@Test
public void Test1(){
		
		System.out.println(" i m in test1");
	}
	@Test
public void Test2(){
		
		System.out.println(" i m in test2");
	}
	@Test
	public void Test3(){
			
			System.out.println(" i m in test3");
		}
}
