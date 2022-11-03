package com.codemind.project.selenium;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();  
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        //getWindowHandle()
      // String windowId = driver.getWindowHandle(); //return id of single window browser
      // System.out.println(windowId); // CDwindow-8E3CCD2CA098D098DF52C18280DBA57A
        
       driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).clear(); // open another browser window (called child window)
        
       //getWindowHandles()
       Set<String> windowID = driver.getWindowHandles(); // returns ID's of all browser windows
       
        
       Iterator <String> it= windowID.iterator();
       String parentID=it.next();
       String ChildID=it.next();
       System.out.println("parent windowID:" + parentID);
       System.out.println("Child windowID:" + ChildID);
	}

}
