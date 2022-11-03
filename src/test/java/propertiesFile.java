import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.asynchttpclient.handler.resumable.PropertiesBasedResumableProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class propertiesFile {
	static WebDriver driver;
	public static String getstring(String key) throws IOException {
		Properties p = new Properties();
		File file = new File("src/test/resources/prop.properties");
		FileInputStream fis = new FileInputStream(file);
		p.load(fis);
		return p.getProperty(key);
		
		}
		
			
		
       @Test
       public void launchbrowser() throws IOException {
    	   System.setProperty("webdriver.chrome.driver",propertiesFile.getstring("chromepath"));
  		 driver = new ChromeDriver();
  		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		 driver.get("url");
  		 driver.manage().window().maximize();
  		 /*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
  		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
  		 driver.findElement(By.xpath("//button[@type='submit']")).click();
  		 String Actualresult = "OrangeHRM";
  		 String Expectdresult = "OrangeHRM";
  		 Assert.assertEquals(Actualresult, Expectdresult);*/

       }
		
	}


