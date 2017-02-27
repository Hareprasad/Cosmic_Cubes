package com.cosmic.cubes.test.regression;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cosmic.cubes.ui.LoginPage;
import com.cosmic.cubes.utils.project.specific.CreateDriver;

public class TestLoginSC_01 {
WebDriver driver;
LoginPage login;
@BeforeMethod
public void setup(){
	driver = CreateDriver.getDriver();
	login = new LoginPage(driver);
}
@Test
public void TestInvalidLoginTC_05(){
	login.waitForLoginPage();
	login.getUserNameTextBox().sendKeys("admin");
	login.getPasswordTestbox().sendKeys("jhgfhghl");
	login.getLoginButton().click();
	String actualerrmsg = login.getErrorMessage().getText();
	String expectederrmsg = "Username or Password is invalid. Please try again.";
	Assert.assertEquals(actualerrmsg, expectederrmsg);
	}
@AfterMethod
public void breakDown(){
	driver.close();
}
}