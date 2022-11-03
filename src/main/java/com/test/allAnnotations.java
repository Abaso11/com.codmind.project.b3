package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class allAnnotations {
	
	@BeforeMethod
	public void addmethod() {
		System.out.println("start ");
	}
	@Test
	public void run() {
		System.out.println("add test1");
	}
	
	@Test
	public void test2() {
		System.out.println("add test 2");
	}
	@AfterMethod
	public void logout() {
		System.out.println("end");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}