package com.codemind.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));

		user.sendKeys("aba_Patil");

		Thread.sleep(5000);

		user.clear();
		System.out.println(user.isDisplayed());
		System.out.println(user.isEnabled());

	}

}
