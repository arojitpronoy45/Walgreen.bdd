package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import util.LoggerClass;


public class CommonAction {
	WebDriver driver;

	public static void click(WebElement element) {
		try {
			element.click();
			LoggerClass.log("Element has been clicked --> " + element);
		} catch (Exception e) {
			e.printStackTrace();
			LoggerClass.log("Element Not Found --> " + element);

		}
	}

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			LoggerClass.log(value + "Value has been passed into --> " + element);
		} catch (Exception e) {
			e.printStackTrace();
			LoggerClass.log("Element Not Found --> " + element);

		}
	}

	public static void scrollIntoView(JavascriptExecutor jsExecutor, WebElement element) {
		jsExecutor.executeScript("argument[0].scrollIntoView(true);", element);
	}
	
	
	public static void handleDropDownwithVal(String value, WebElement element) {
		Select sel = new Select(element); 
		sel.selectByValue(value);
	}
	public static void selectCheckBox (String value, WebElement element) {
		Select sel = new Select(element); 
		sel.selectByValue(value);
	}




	public static void pause(long sec) {
		try {
			Thread.sleep(sec * 1000);
			LoggerClass.log("Sleeping ... zZz " + sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
			LoggerClass.log("Sleep interrupted");

		}
	}
}