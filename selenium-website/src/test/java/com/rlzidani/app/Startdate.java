package com.rlzidani.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Startdate {
	WebDriver driver;
public void invokeBrower() {
    try {
	System.setProperty("webdriver.chrome.driver", "/home/edureka/chromedriver");
	driver = new ChromeDriver();
	((Options) driver.manage()).deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("https://www.edureka.co");
	
    } catch (Exception e)  {
	   e.printStackTrace();
}	
}    
public void searchCourse() {

	driver.findElement(By.className("v-button")).click();
	driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
	driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
	driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");

}
public static void main(String[] args) {
	
	Startdate myobj = new Startdate();
    myobj.invokeBrower();
    
}

	
}

    

       


	

	
