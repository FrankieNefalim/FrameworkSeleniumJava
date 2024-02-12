package com.connectureacademy.core;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private WebDriver driver;
	
	public BaseTest(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebDriver chromeDriverConnection() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User.DESKTOP-RT4P2IR\\Documents\\Connecture\\com.connectureacademy\\src\\main\\resources\\chromedriver\\chromedriver.exe ");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement (By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputtext, By locator) {
		driver.findElement(locator).sendKeys(inputtext);
	}
	
	
	
	
	
}
