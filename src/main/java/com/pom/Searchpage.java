package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
public WebDriver driver;

	
	@FindBy(xpath = "//div[text()='t-shirt']")
	private WebElement T_shirt;
	
	@FindBy(xpath ="//img[@alt='#BetterBasics To Cart']")
	private WebElement white_tees;
	
	@FindBy(xpath ="//img[@alt='polo neck regular t-shirt']")
	private WebElement polo_neck;
	
	@FindBy(id ="size_32432171")
	private WebElement size;
	
	@FindBy(xpath="//div[@data-pgn='Add to Cart']")
	private WebElement add_to_cart;
	
	public Searchpage(WebDriver driv) {
		driver = driv;
		PageFactory.initElements(driver, this);
		
}


	public WebElement getSearch() {
		return T_shirt;
		}


   public WebElement getWhite_tees() {
		return white_tees;
	}


public WebElement getPolo_neck() {
	return polo_neck;
}


public WebElement getSize() {
	return size;
}


public WebElement getAdd_to_cart() {
	return add_to_cart;
}


	


	
	
		

}
