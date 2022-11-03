package com.codemind.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class fluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		WebElement clickbutton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickbutton.click();
		
		FluentWait<WebDriver> fluntwait  = new FluentWait<WebDriver>(driver);
		
		fluntwait.withTimeout(Duration.ofSeconds(7));
		fluntwait.pollingEvery(Duration.ofSeconds(100));
		fluntwait.ignoring(TimeoutException.class);
		fluntwait.until(ExpectedConditions.alertIsPresent());
		
		
	}

}
