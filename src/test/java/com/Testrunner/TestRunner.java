package com.Testrunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features="D:\\selenium program\\LimeRoadProject\\src\\test\\java\\com\\feature\\Limeroad.feature",
glue = "com.stepdefinition",
monochrome = true,
plugin= {"pretty",
      	"html:Resources/limeroad.html",
		"json:Resources/limeroad.json"})
//		"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner extends BaseClass{
	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_lanuch() {
		driver=  browser_lanuch ("chrome");
		
	}

}
