package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDrop {

	public static void selectByIndex(WebElement ddl, int index){
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	public static void selectByValue(WebElement ddl, String Value){
		Select sct = new Select(ddl);
		sct.selectByValue(Value);
	}
	public static void selectByVisibleText(WebElement ddl, String text){
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
	}
	public static boolean verifyDropDown(WebElement ddl){
		Select sct = new Select(ddl);
		boolean status = sct.isMultiple();
		return status;
	}
	public static void deselectByIndex(WebElement ddl, int index){
		Select sct = new Select(ddl);
		try{
			sct.deselectByIndex(index);
		}
		catch(Exception e)
		{
			System.out.println("invalid operations");
		}
	}
		public static void deselectByValue(WebElement ddl, String value){
			Select sct = new Select(ddl);
			try{
				sct.deselectByValue(value);
			}
			catch(Exception e)
			{
				System.out.println("invalid operations");
			}
	}
		public static void deselectByVisibleText(WebElement ddl, String text){
			Select sct = new Select(ddl);
			try{
				sct.deselectByVisibleText(text);
			}
			catch(Exception e)
			{
				System.out.println("invalid operations");
			}
	}
		public static void deselectAll(WebElement ddl){
			Select sct = new Select(ddl);
			try{
				sct.deselectAll();
			}
			catch(Exception e)
			{
				System.out.println("invalid operations");
			}
	}
}
