package com.codemind.project.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");
	       
        WebDriver driver = new ChromeDriver();  
        driver.get("https://demoqa.com/alerts");
        
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        		
      Alert alt =  driver.switchTo().alert();
       // alt.accept();
       // alt.dismiss();
       System.out.println(alt.getText());

	}

}
