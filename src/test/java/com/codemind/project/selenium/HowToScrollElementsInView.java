package com.codemind.project.selenium;

import java.sql.DriverPropertyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToScrollElementsInView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

		// Scroll element in the view

		WebElement element = driver.findElement(By.xpath("//a[@class='view-all-comp']"));
		

		// javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

		// scroll till end of the page
		WebElement element1 = driver.findElement(By.xpath("//img[@loading='lazy'][1]"));
		 javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element1);

		//scroll vertically
		javascriptExecutor.executeScript("window.scrollBy(0,1500)", " ");

		// Thread.sleep(1800);

		javascriptExecutor.executeScript("window.scrollBy(0,-1000)", "");

		// scroll horizontally

		javascriptExecutor.executeScript("window.scrollBy(1500,0)", " ");

		 Thread.sleep(18000);

		javascriptExecutor.executeScript("window.scrollBy(-1500,0)", "");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://myntra.com/");

		System.out.println(driver.getTitle());
		
	

	}

}
