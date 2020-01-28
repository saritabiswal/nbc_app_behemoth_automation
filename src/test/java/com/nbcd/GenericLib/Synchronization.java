package com.nbcd.GenericLib;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronization
{
	static WebDriverWait wait;
	static WebElement elements;
    private enum  Property
    {
    	clickable, visible,display;
    }

	public static boolean  explicitWait(WebDriver driver,WebElement objectID,String objectProperty)
	{

		wait = new WebDriverWait(driver, 90);
		Property objProp = Property.valueOf(objectProperty.toLowerCase());
		switch(objProp)
		{
			case clickable:
				 elements = wait.until(ExpectedConditions.elementToBeClickable(objectID));
				 break;

			case visible:
				 elements = wait.until(ExpectedConditions.visibilityOf(objectID));
				 break;
			case display:
				 elements = wait.until(ExpectedConditions.visibilityOf(objectID));
				 break;
		}
		return elements != null;

	}
//================================================================================================================================
	public static void implicitWait(WebDriver driver,int Secs)
	{

			driver.manage().timeouts().implicitlyWait(Secs, TimeUnit.SECONDS);
	}

//================================================================================================================================
	public static boolean waitForPageLoad(WebDriver driver)
	{

		JavascriptExecutor je = (JavascriptExecutor) driver;
		int waitTime = 90 *1000;
		int counter =0;
		counter=0;
		Number ajaxCount=-1;
		boolean flag=false;
		do{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			counter +=1000;

			try
			{
				flag=((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");

				Thread.sleep(2000);
			} catch (Exception e) {

			}



		}while(flag==false && counter <waitTime);

		return false;


	}


	//Wait for Visibility,Wait for presence , wait for invisibility
		public static void waits(WebDriver driver,long timeout,By locator,String waitcondition) throws Exception
		{
			 wait = new WebDriverWait(driver, timeout);
			switch(waitcondition)
			{
			case "visible" :
				try
				{
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				}
				catch(Exception e)
				{
					throw new NoSuchElementException(String.format("The following element was not visible: %s ", locator));
				}
			break;

			case "invisible" :
				try
				{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
				}
				catch(Exception e)
				{
					throw new TimeoutException(String.format("The following element was Still visible: %s ", locator));
				}
			break;

			case "presence":
				try
				{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				}
				catch(Exception e)
				{
					throw new NoSuchElementException(String.format("The following element was not visible: %s ", locator));
				}

			break;
		}
		}
		/*
		 * Returns the Status true or false whether the element is displayed in the webpage or not
		 */
		public boolean isDisplayedStatus(By byLocator,WebDriver driver) {
			try {
				driver.findElement(byLocator).isDisplayed();
				return true;
			} catch (NoSuchElementException e) {
				return false;
			}
		}

		/*
		 * Returns true or false for the displayed status if we pass webelement
		 */
		public boolean isDisplayed_WebElement(WebDriver driver, WebElement element)
		{
			if(element.isDisplayed())
			{
				return true;
			}
			return false;
		}

	}
