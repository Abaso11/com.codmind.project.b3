package com.codemind.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableverification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/buttons.html");

		driver.manage().window().maximize();
		// is displayed
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_one']")).isDisplayed());

        // is Enabled
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_one']")).isEnabled());

		System.out.println(driver.findElement(By.xpath("//button[@id='btn_four']")).isEnabled());
		
		//driver.findElement(By.xpath("//button[@id='btn_one']")).click();
		
        // 	getAccessibleName
		
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_one']")).getAccessibleName());
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_four']")).getAccessibleName());
		
		//getAttribute
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_two']")).getAttribute("type"));
		
		//get Css Value
		
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_two']")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_one']")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.xpath("//h2[@id='content']")).getCssValue("color"));
	}

}
