package com.lightningauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CasePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/RaveeshBackup/SeleniumProject/geckodriver.exe");
		
	//	 System.setProperty("webdriver.chrome.driver", "C:/RaveeshBackup/SeleniumProject/chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	//	 WebDriver driver = new ChromeDriver();
		
		driver.get("https://dellservices--sit4.lightning.force.com/lightning/page/home");
		
		WebElement continu = driver.findElement(By.id("save"));
		
		continu.click();
		
		WebElement globalsearch = driver.findElement(By.id("154:0;p"));
		
		globalsearch.sendKeys("H8C0075");
		
	}

}
