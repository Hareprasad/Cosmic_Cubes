package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver){
	this.driver =driver;
}
public void waitForLoginPage(){
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".whiteBoxWithLogoTable")));
	}
public WebElement getUserNameTextBox(){
	return driver.findElement(By.id("username"));
}
public WebElement getPasswordTestbox(){
	return driver.findElement(By.name("pwd"));
}
public WebElement getLoginButton(){
	return driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]"));
	}
public WebElement getDivisionHeaderText(){
	return driver.findElement(By.id("headerContainer"));
	}
public WebElement getErrorMessage(){
	return driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
}
}
