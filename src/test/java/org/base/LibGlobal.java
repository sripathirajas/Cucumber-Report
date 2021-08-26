package org.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
public static WebDriver driver;
	
	public static WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
	}
	
	
	public static void loadUrl(String data) {
		driver.get(data);
	}
	
	
	
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void typeInput(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public static void closeAllBrowser() {
		driver.quit();
	}
	
	public static String geTAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	
	
	

}
