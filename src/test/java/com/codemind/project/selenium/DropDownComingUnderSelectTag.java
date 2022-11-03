package com.codemind.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownComingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		WebElement flight =  driver.findElement(By.linkText("Flights"));
		flight.click();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		
	WebElement dropdown =	driver.findElement(By.xpath("//select[@name='fromPort']"));
		
	dropdown.click();
	
	Select select = new Select(dropdown);
	
	select.selectByIndex(4);
	Thread.sleep(5000);
	
	select.selectByValue("Zurich");
	
	Thread.sleep(5000);
	
	select.selectByVisibleText("London");
	
	driver.close();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	}