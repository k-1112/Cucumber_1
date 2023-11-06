package com.log4j2;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogger {
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;
	
	public static void main(String[] args) {
		log = LogManager.getLogger(TestLogger.class);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Implicit wait applied for 10 seconds");
		driver.get("https://www.myntra.com/");
		log.info("Logged into Myntra");
		
		try {
			boolean text= driver.findElement(By.xpath("//a[contains(text(),'Womens')]")).isDisplayed();
		}
		catch(Exception k) {
			System.out.println(k.getMessage());
			log.error("Exception occured", new Exception("Element not found"));
			
		}
		finally {
			driver.quit();
			log.info("Quiting the driver");
		}
	}

}
