package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class HandleAlert {
public static void acceptAlert(WebDriver driver)
{
	Alert alt = driver.switchTo().alert();
	alt.accept();
}
public static void dismissAlert(WebDriver driver)
{
	Alert alt = driver.switchTo().alert();
	alt.dismiss();
}
public static String getAlertText(WebDriver driver)
{
	Alert alt = driver.switchTo().alert();
	String text = alt.getText();
	return text;
	}
public static void enterTextToAlert(WebDriver driver, String text)
{
	Alert alt = driver.switchTo().alert();
	alt.sendKeys(text);
	}
}
