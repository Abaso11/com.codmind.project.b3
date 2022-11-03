package com.codemind.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("tis is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("log inn");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("log out");
  }

}
