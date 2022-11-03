package com.codemind.project.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsInSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));

		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();

		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();

		
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
