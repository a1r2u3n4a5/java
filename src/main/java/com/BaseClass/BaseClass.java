package com.BaseClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static WebDriver driver;


	public static  WebDriver browser_lanuch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static  WebDriver url(String url) {
		driver.get(url);
		return driver;
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void dropdown(WebElement element, String type,String value) {
		 Select s = new Select(element);
		 if(type.equalsIgnoreCase("value")) {
			 s.selectByValue(value);
		 }
		 else if(type.equalsIgnoreCase("index")) {
			 int in = Integer.parseInt(value);
			 s.selectByIndex(in);
		 }
		 else if(type.equalsIgnoreCase("visibletext")) {
			 s.selectByVisibleText(value);
		 }

	}


public static void alert(String option,String value) {
	if(option.equalsIgnoreCase("accept") ) {
		driver.switchTo().alert().accept();
	}
	else if (option.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
	}
	else if ( option.equalsIgnoreCase("gettext")) {
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}
	else if ( option.equalsIgnoreCase("sendKeys")) {
		driver.switchTo().alert().sendKeys(value);
	}

}
public static void javascript(int x,int y) {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(x,y)");
    js.executeScript("window.scrollBy(x,-y");
}

}
