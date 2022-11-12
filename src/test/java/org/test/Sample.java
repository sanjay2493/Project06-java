package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium.java\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebElement textuser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		textuser.sendKeys("9585110159");
		WebElement texpass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		texpass.sendKeys("S@njay12345678");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnlogin.click();
		
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
