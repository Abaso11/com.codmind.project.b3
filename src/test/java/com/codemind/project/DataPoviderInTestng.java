package com.codemind.project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPoviderInTestng {
	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@DataProvider(name = "myDataProvider")
	public String[][] dataProvider() {
		String array[][] = { { "user1", "password1" }, { "user2", "password2" }, { "user3", "password3" }, { "user4", "password4"}};
		return array;
		
	}

	@Test(dataProvider = "myDataProvider")
	public void verifyValidLogin(String userName, String password) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(successfullLoginMsg.getText(), "Login Successfully");
	}
	
	@AfterMethod
	public void logout() {
		
	}
	








}

