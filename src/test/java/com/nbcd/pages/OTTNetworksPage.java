package com.nbcd.pages;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.nbcd.GenericLib.DatabaseFunction;
import com.nbcd.GenericLib.Extent_Reports;
import com.nbcd.GenericLib.Utilities;
import com.nbcd.GenericLib.Synchronization;
public class OTTNetworksPage {
	public WebDriver driver;
	String sql;
	DatabaseFunction db = new DatabaseFunction();
	public List<String> lstObject, 
	lstTestData,
	elementsText;
	static String screenshotExtension;
	String sqlQry,
	BrandName;
	WebElement mvpdlogo,Brandlogo,Success,nothanks,username,paswd,signin,optimimbtn,continuebtn,Activationcodeenter,Activationcodeinput,Activationcodeelement,bravodefaultfocus,defaultfocus,activefocus;
	List<WebElement> Morebutton,title,Networkbutton, Bravotitle,CNBCtitle,Etitle,MSNBCtitle,NBCtitle,Oxygentitle,Syfytitle,Telemundotitle,Universalkidstitle,Universotitle,USAtitle,Bravoimage,CNBCimage,Eimage,MSNBCimage,NBCimage,Telemundoimage,Oxygenimage,Syfyimage,Universalkidsimage,Universoimage,USAimage;
	public OTTNetworksPage(WebDriver driver) throws Exception {
		try {
			this.driver = driver;
			lstTestData = db.getTestDataObject("Select * from TDOTTNetworks", "Input");
			lstObject = db.getTestDataObject("Select * from OROTTNetworks", "ObjectRepository");
		} catch (Exception e) {
			Extent_Reports.executionLog("INFO", "Driver did not initialize", driver);
		}
	}

	/*
	 * Method will Validate all the steps in RTP-4042
	 */
	public void OTTNetworksPageRTP4088VizioApp() throws Exception {
	
		try {
			driver.get(lstTestData.get(0));
		Synchronization.waitForPageLoad(driver);
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		Networkspage.OTTLaunch();
		Networkspage.Selectnetworksnavoption();
		Networkspage.defaultfocus();
		Networkspage.Bravodefaultfocus();
		Networkspage.CNBCfocus();
		Networkspage.Efocus();
		Networkspage.MSNBCfocus();
		Networkspage.NBCfocus();
		Networkspage.Oxygenfocus();
		Networkspage.SYFYfocus();
		Networkspage.Telemundofocus();
		Networkspage.Universalkidsfocus();
		Networkspage.Universofocus();
		Networkspage.USAfocus();
		Networkspage.verifyalphabeticalorder();
		Networkspage.TVProviderloginvizio();
		Networkspage.BravobrandpageValidationvizio();
		Networkspage.cnbcbrandpageValidation();
		Networkspage.EbrandpageValidation();
		Networkspage.msnbcbrandpageValidation();
		Networkspage.nbcbrandpageValidation();
		Networkspage.oxygenbrandpageValidation();
		Networkspage.syfybrandpageValidation();
		Networkspage.telemundobrandpageValidation();
		Networkspage.ukidsbrandpageValidation();
		Networkspage.universobrandpageValidation();
		Networkspage.usabrandpageValidation();
		
			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Shows menu option should be Clicked"
					+ "\n" + Extent_Reports.logActual + "Shows menu option is not Clicked", driver);
		}
	}
	public void OTTNetworksPageRTP4088Xboxoneapp() throws Exception {
		try {
		driver.get(lstTestData.get(5));
		Synchronization.waitForPageLoad(driver);
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		Networkspage.OTTLaunch();
		Networkspage.Selectnetworksnavoption();
		Networkspage.defaultfocus();
		Networkspage.Bravodefaultfocus();
		Networkspage.CNBCfocus();
		Networkspage.Efocus();
		Networkspage.MSNBCfocus();
		Networkspage.NBCfocus();
		Networkspage.Oxygenfocus();
		Networkspage.SYFYfocus();
		Networkspage.Telemundofocus();
		Networkspage.Universalkidsfocus();
		Networkspage.Universofocus();
		Networkspage.USAfocus();
		Networkspage.verifyalphabeticalorder();
		Networkspage.TVProviderloginxbox();
		Networkspage.BravobrandpageValidationxbox();
		Networkspage.cnbcbrandpageValidation();
		Networkspage.EbrandpageValidation();
		Networkspage.msnbcbrandpageValidation();
		Networkspage.nbcbrandpageValidation();
		Networkspage.oxygenbrandpageValidation();
		Networkspage.syfybrandpageValidation();
		Networkspage.telemundobrandpageValidation();
		Networkspage.ukidsbrandpageValidation();
		Networkspage.universobrandpageValidation();
		Networkspage.usabrandpageValidation();
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Shows menu option should be Clicked"
					+ "\n" + Extent_Reports.logActual + "Shows menu option is not Clicked", driver);
		}
	}
	public void beforeScreenshot() throws Exception {
	String url = driver.getCurrentUrl();
	if (url.contains(lstTestData.get(4)))
	{
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	   // Synchronization.waitForPageLoad(driver);
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	//	Synchronization.waitForPageLoad(driver);
		 robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		//	Synchronization.waitForPageLoad(driver);
			 robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
		//		Synchronization.waitForPageLoad(driver);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Synchronization.waitForPageLoad(driver);
	}
	else
	{
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	}
	public void afterScreenshot() throws Exception {
		String url = driver.getCurrentUrl();
		if (url.contains(lstTestData.get(4)))
			{
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	//    Synchronization.waitForPageLoad(driver);
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	//	Synchronization.waitForPageLoad(driver);
		 robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
	//		Synchronization.waitForPageLoad(driver);
			 robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ADD);
				robot.keyRelease(KeyEvent.VK_ADD);
				robot.keyRelease(KeyEvent.VK_CONTROL);
		//		Synchronization.waitForPageLoad(driver);
				 robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_ADD);
					robot.keyRelease(KeyEvent.VK_ADD);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					Synchronization.waitForPageLoad(driver);
	}
		else
		{
			Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		}
	public void OTTLaunch() throws Exception {
		try {
		Synchronization.waitForPageLoad(driver);
		Synchronization.waitForPageLoad(driver);
		Synchronization.waitForPageLoad(driver);
		Synchronization.waits(driver, 40, By.cssSelector(lstObject.get(1)), "visible");
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		Networkspage.beforeScreenshot();
		Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "App should be launched Successfully"
				+ "\n" + Extent_Reports.logActual + "App is launched Successfully", driver);
		Networkspage.afterScreenshot();	
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "App should be Launched Successfully"
					+ "\n" + Extent_Reports.logActual + "App is not Launched Successfully", driver);
		}
	}
	public void Selectnetworksnavoption() throws Exception {
		try {
			Networkbutton = Utilities.returnElements(driver, lstObject.get(5), lstObject.get(4));
			Networkbutton.get(3).click();
		Synchronization.waitForPageLoad(driver);
		Synchronization.waitForPageLoad(driver);
		Synchronization.waits(driver, 40, By.cssSelector(lstObject.get(7)), "visible");
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		Networkspage.beforeScreenshot();
		Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Networks Page should be displayed"
				+ "\n" + Extent_Reports.logActual + "Networks Page is displayed", driver);
		Networkspage.afterScreenshot();

			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
		}
	}
	public void defaultfocus() throws Exception {
		try {
			defaultfocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
			if (defaultfocus.isDisplayed())
			{
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
			Networkspage.beforeScreenshot();
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "First Brand should be displayed as default focus"
						+ "\n" + Extent_Reports.logActual + "First Brand is displayed as default focus", driver);
				Networkspage.afterScreenshot();
			}
			else
			{
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
				Networkspage.beforeScreenshot();
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "First Brand should be displayed as default focus"
						+ "\n" + Extent_Reports.logActual + "First Brand is not displayed as default focus", driver);
				Networkspage.afterScreenshot();
			}

			
		} catch (Exception e) {
			OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
			Networkspage.beforeScreenshot();
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "First Brand should be displayed as default focus"
					+ "\n" + Extent_Reports.logActual + "First Brand is not displayed as default focus", driver);
			Networkspage.afterScreenshot();
		}
	}
		public void Bravodefaultfocus() throws Exception {
			try {
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
				Networkspage.beforeScreenshot();
				bravodefaultfocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Bravoimage = Utilities.returnElements(driver, lstObject.get(14), lstObject.get(13));
				Bravotitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (bravodefaultfocus.isDisplayed()&&Bravoimage.get(0).isDisplayed()&&Bravotitle.get(0).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "Bravo Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Bravo Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "Bravo Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}

				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Bravo Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "Bravo Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
	}
		public void CNBCfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				CNBCimage = Utilities.returnElements(driver, lstObject.get(17), lstObject.get(16));
				CNBCtitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&CNBCimage.get(0).isDisplayed()&&CNBCtitle.get(1).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "CNBC Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "CNBC Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "CNBC Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "CNBC Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Bravoimage = Utilities.returnElements(driver, lstObject.get(14), lstObject.get(13));
                if (Bravoimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Bravo Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Bravo Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Bravo Brand tile is not displayed with static image", driver);
           
                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "CNBC Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "CNBC Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
	}
		public void Efocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Eimage = Utilities.returnElements(driver, lstObject.get(20), lstObject.get(19));
				Etitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&Eimage.get(0).isDisplayed()&&Etitle.get(2).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "E Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "E Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "E Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "E Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				CNBCimage = Utilities.returnElements(driver, lstObject.get(17), lstObject.get(16));
                if (CNBCimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "CNBC Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "CNBC Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "CNBC Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "CNBC Brand tile is not displayed with static image", driver); 
                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "E Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "E Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void MSNBCfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				MSNBCimage = Utilities.returnElements(driver, lstObject.get(23), lstObject.get(22));
				MSNBCtitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&MSNBCimage.get(0).isDisplayed()&&MSNBCtitle.get(3).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "MSNBC Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "MSNBC Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "MSNBC Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "MSNBC Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Eimage = Utilities.returnElements(driver, lstObject.get(20), lstObject.get(19));
                if (Eimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "E Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "E Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "E Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "CNBC Brand tile is not displayed with static image", driver); 
                }
				
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "MSNBC Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "MSNBC Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void NBCfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				NBCimage = Utilities.returnElements(driver, lstObject.get(26), lstObject.get(25));
				NBCtitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&NBCimage.get(0).isDisplayed()&&NBCtitle.get(4).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "NBC Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "NBC Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "NBC Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "NBC Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				MSNBCimage = Utilities.returnElements(driver, lstObject.get(23), lstObject.get(22));
				 if (MSNBCimage.get(1).isDisplayed())
	                {
	                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "MSNBC Brand tile should be displayed with static image"
								+ "\n" + Extent_Reports.logActual + "MSNBC Brand tile is displayed with static image", driver);
	                }
	                else
	                {
	                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "MSNBC Brand tile should be displayed with static image"
								+ "\n" + Extent_Reports.logActual + "MSNBC Brand tile is not displayed with static image", driver); 
	                }
				
			} catch (Exception e) {
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
				Networkspage.beforeScreenshot();
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "NBC Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "NBC Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				Networkspage.afterScreenshot();
			}
			}
		public void Oxygenfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Oxygenimage = Utilities.returnElements(driver, lstObject.get(29), lstObject.get(28));
				Oxygentitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&Oxygenimage.get(0).isDisplayed()&&Oxygentitle.get(5).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Oxygen Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "Oxygen Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Oxygen Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "Oxygen Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				NBCimage = Utilities.returnElements(driver, lstObject.get(26), lstObject.get(25));
				 if (NBCimage.get(1).isDisplayed())
	                {
	                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "NBC Brand tile should be displayed with static image"
								+ "\n" + Extent_Reports.logActual + "NBC Brand tile is displayed with static image", driver);
	                }
	                else
	                {
	                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "NBC Brand tile should be displayed with static image"
								+ "\n" + Extent_Reports.logActual + "NBC Brand tile is not displayed with static image", driver); 
	                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Oxygen Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "Oxygen Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void SYFYfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Syfyimage = Utilities.returnElements(driver, lstObject.get(32), lstObject.get(31));
				Syfytitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&Syfyimage.get(0).isDisplayed()&&Syfytitle.get(6).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "SYFY Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "SYFY Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "SYFY Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "SYFY Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Oxygenimage = Utilities.returnElements(driver, lstObject.get(29), lstObject.get(28));
				if (Oxygenimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Oxygen Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Oxygen Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Oxygen Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Oxygen Brand tile is not displayed with static image", driver); 
                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "SYFY Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "SYFY Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void Telemundofocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Telemundoimage = Utilities.returnElements(driver, lstObject.get(35), lstObject.get(34));
				Telemundotitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&Telemundoimage.get(0).isDisplayed()&&Telemundotitle.get(7).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Telemundo Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "Telemundo Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Telemundo Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "Telemundo Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Syfyimage = Utilities.returnElements(driver, lstObject.get(32), lstObject.get(31));
				if (Syfyimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "SYFY Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "SYFY Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "SYFY Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "SYFY Brand tile is not displayed with static image", driver); 
                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Telemundo Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "Telemundo Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void Universalkidsfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Universalkidsimage = Utilities.returnElements(driver, lstObject.get(38), lstObject.get(37));
				Universalkidstitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&Universalkidsimage.get(0).isDisplayed()&&Universalkidstitle.get(8).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universalkids Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "Universalkids Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Universalkids Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "Universalkids Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Telemundoimage = Utilities.returnElements(driver, lstObject.get(35), lstObject.get(34));
				if (Telemundoimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Telemundo Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Telemundo Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Telemundo Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Telemundo Brand tile is not displayed with static image", driver); 
                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Universalkids Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "Universalkids Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void Universofocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				Universoimage = Utilities.returnElements(driver, lstObject.get(41), lstObject.get(40));
				Universotitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&Universoimage.get(0).isDisplayed()&&Universotitle.get(9).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universo Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "Universo Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Universo Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "Universo Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Universalkidsimage = Utilities.returnElements(driver, lstObject.get(38), lstObject.get(37));
				if (Universalkidsimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universalkids Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Universalkids Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Universalkids Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Universalkids Brand tile is not displayed with static image", driver); 
                }
				
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Universo Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "Universo Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void USAfocus() throws Exception {
			try {
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.RIGHT).build().perform();
				Synchronization.waitForPageLoad(driver);
				activefocus = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				USAimage = Utilities.returnElements(driver, lstObject.get(44), lstObject.get(43));
				USAtitle = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
				if (activefocus.isDisplayed()&&USAimage.get(0).isDisplayed()&&USAtitle.get(10).isDisplayed())
				{
					Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "USA Brand tile should be displayed as in focus with Brand image in ratio 16x9 and brand name"
							+ "\n" + Extent_Reports.logActual + "USA Brand tile is displayed as in focus with Brand image in ratio 16x9 and brand name", driver);
				}
				else
				{
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "USA Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
							+ "\n" + Extent_Reports.logActual + "USA Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
				}
				Universoimage = Utilities.returnElements(driver, lstObject.get(41), lstObject.get(40));
				if (Universoimage.get(1).isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universo Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Universo Brand tile is displayed with static image", driver);
                }
                else
                {
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Universo Brand tile should be displayed with static image"
							+ "\n" + Extent_Reports.logActual + "Universo Brand tile is not displayed with static image", driver); 
                }
				
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "USA Brand should be displayed as in focus with Brand image in ratio 16x9  and brand name"
						+ "\n" + Extent_Reports.logActual + "USA Brand is not displayed as in focus with Brand image in ratio 16x9  and brand name", driver);
			}
			}
		public void verifyalphabeticalorder() throws Exception {
			try {
		    title = Utilities.returnElements(driver, lstObject.get(47), lstObject.get(46));
			String Bravotitle = title.get(0).getText();
			String CNBCtitle =title.get(1).getText();
			String Etitle =title.get(2).getText();
			String MSNBCtitle =title.get(3).getText();
			String NBCtitle =title.get(4).getText();
			String Oxygentitle =title.get(5).getText();
			String Syfytitle =title.get(6).getText();
			String Telemundotitle =title.get(7).getText();
			String Universalkidstitle =title.get(8).getText();
			String Universotitle =title.get(9).getText();
			String USAtitle =title.get(10).getText();
			String[] a = { Bravotitle, CNBCtitle, Etitle, MSNBCtitle,NBCtitle,Oxygentitle,Syfytitle,Telemundotitle,Universalkidstitle,Universotitle,USAtitle };
			Arrays.sort(a);
			Extent_Reports.executionLog("PASS",
						Extent_Reports.logExpected + "All brands should be displayed in Alphabetical Order"
								+ Extent_Reports.logActual + "All Brands are displayed in Alphabetical Order"
								,driver);
			
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "All brands should be displayed in Alphabetical Order"
						+ "\n" + Extent_Reports.logActual + "All Brands are not displayed in Alphabetical Order", driver);
			}
		}
		public void TVProviderloginvizio() throws Exception {
			try {
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
				Networkspage.afterScreenshot();
				Synchronization.waitForPageLoad(driver);
				driver.get(lstTestData.get(0));
				Synchronization.waitForPageLoad(driver);
				driver.navigate().refresh();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Morebutton = Utilities.returnElements(driver, lstObject.get(5), lstObject.get(4));
				Morebutton.get(4).click();
				Synchronization.waitForPageLoad(driver);
		        Actions action = new Actions(driver);
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.DOWN).build().perform();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Activationcodeelement = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
                String Activationcode = Activationcodeelement.getText();
				driver.get(lstTestData.get(1));
				Synchronization.waitForPageLoad(driver);
				Activationcodeenter = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
				Activationcodeenter.sendKeys(Activationcode);
				continuebtn = Utilities.returnElement(driver, lstObject.get(56), lstObject.get(55));
				continuebtn.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				optimimbtn = Utilities.returnElement(driver, lstObject.get(59), lstObject.get(58));
				optimimbtn.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				username = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
				username.sendKeys(lstTestData.get(2));
				paswd = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				paswd.sendKeys(lstTestData.get(3));
				signin = Utilities.returnElement(driver, lstObject.get(68), lstObject.get(67));
				signin.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				nothanks = Utilities.returnElement(driver, lstObject.get(71), lstObject.get(70));
				nothanks.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Success = Utilities.returnElement(driver, lstObject.get(74), lstObject.get(73));
                if(Success.isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "TV Provider sign in should be successfull"
    						+ "\n" + Extent_Reports.logActual + "TV Provider sign in is successfull", driver);
                }
                else{
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "TV Provider sign in should be successfull"
    						+ "\n" + Extent_Reports.logActual + "TV Provider sign in is successfull", driver);
			}
			}
			catch (Exception e) {
				System.out.print(e);
					}
}
		public void TVProviderloginxbox() throws Exception {
			try {
			
				Synchronization.waitForPageLoad(driver);
				driver.get(lstTestData.get(5));
		        Actions action = new Actions(driver);
		        driver.navigate().refresh();
			    Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.UP).build().perform();
				Morebutton = Utilities.returnElements(driver, lstObject.get(5), lstObject.get(4));
				Morebutton.get(4).click();
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.DOWN).build().perform();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Activationcodeelement = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
                String Activationcode = Activationcodeelement.getText();
				driver.get(lstTestData.get(1));
				Synchronization.waitForPageLoad(driver);
				Activationcodeenter = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
				Activationcodeenter.sendKeys(Activationcode);
				continuebtn = Utilities.returnElement(driver, lstObject.get(56), lstObject.get(55));
				continuebtn.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				optimimbtn = Utilities.returnElement(driver, lstObject.get(59), lstObject.get(58));
				optimimbtn.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				username = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
				username.sendKeys(lstTestData.get(2));
				paswd = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				paswd.sendKeys(lstTestData.get(3));
				signin = Utilities.returnElement(driver, lstObject.get(68), lstObject.get(67));
				signin.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				nothanks = Utilities.returnElement(driver, lstObject.get(71), lstObject.get(70));
				nothanks.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Success = Utilities.returnElement(driver, lstObject.get(74), lstObject.get(73));
                if(Success.isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "TV Provider sign in should be successfull"
    						+ "\n" + Extent_Reports.logActual + "TV Provider sign in is successfull", driver);
                }
                else{
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "TV Provider sign in should be successfull"
    						+ "\n" + Extent_Reports.logActual + "TV Provider sign in is successfull", driver);
			}
			}
			catch (Exception e) {
					}
}
		public void TVProviderloginxboxsignedup() throws Exception {
			try {
			
				Synchronization.waitForPageLoad(driver);
				driver.get(lstTestData.get(5));
				afterScreenshot();
		        Actions action = new Actions(driver);
		        driver.navigate().refresh();
			    Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Morebutton = Utilities.returnElements(driver, lstObject.get(5), lstObject.get(4));
				Morebutton.get(4).click();
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.DOWN).build().perform();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Activationcodeelement = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
                String Activationcode = Activationcodeelement.getText();
				driver.get(lstTestData.get(1));
				Synchronization.waitForPageLoad(driver);
				Activationcodeenter = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
				Activationcodeenter.sendKeys(Activationcode);
				continuebtn = Utilities.returnElement(driver, lstObject.get(56), lstObject.get(55));
				continuebtn.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				optimimbtn = Utilities.returnElement(driver, lstObject.get(59), lstObject.get(58));
				optimimbtn.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				username = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
				username.sendKeys(lstTestData.get(2));
				paswd = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				paswd.sendKeys(lstTestData.get(3));
				signin = Utilities.returnElement(driver, lstObject.get(68), lstObject.get(67));
				signin.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Success = Utilities.returnElement(driver, lstObject.get(74), lstObject.get(73));
                if(Success.isDisplayed())
                {
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "TV Provider sign in should be successfull"
    						+ "\n" + Extent_Reports.logActual + "TV Provider sign in is successfull", driver);
                }
                else{
                	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "TV Provider sign in should be successfull"
    						+ "\n" + Extent_Reports.logActual + "TV Provider sign in is successfull", driver);
			}
			}
			catch (Exception e) {
					}
}
		public void BravobrandpageValidationvizio() throws Exception {
			try {
				driver.get(lstTestData.get(0));
				Synchronization.waitForPageLoad(driver);
		        Actions action = new Actions(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Networkbutton = Utilities.returnElements(driver, lstObject.get(5), lstObject.get(4));
				Networkbutton.get(3).click();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
        		Networkspage.beforeScreenshot();
				Synchronization.waitForPageLoad(driver);
				Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
				mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
                if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
                {
    				
               	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
    						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
			}
                else{
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
    						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
    		
                	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
		
					}
}
		public void BravobrandpageValidationxbox() throws Exception {
			try {
				driver.get(lstTestData.get(5));
				Synchronization.waitForPageLoad(driver);
		        Actions action = new Actions(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Networkbutton = Utilities.returnElements(driver, lstObject.get(5), lstObject.get(4));
				Networkbutton.get(3).click();
				Synchronization.waitForPageLoad(driver);
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
        		Networkspage.beforeScreenshot();
				Synchronization.waitForPageLoad(driver);
				Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
				mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
                if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
                {
    				
               	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
    						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
			}
                else{
                	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
    						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
    		
                	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Bravo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
		
					}
}
		public void cnbcbrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
			action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "CNBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Bravo BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver); 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "CNBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "CNBC BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "CNBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
						+ "\n" + Extent_Reports.logActual + "CNBC BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
	 		
					}
}
		public void EbrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "E BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "E BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "E BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "E BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "E BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "E BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void msnbcbrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "MSNBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "MSNBC BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "MSNBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "MSNBC BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "MSNBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "MSNBC BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void nbcbrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "NBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "NBC BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver); 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "NBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "NBC BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "NBC BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "NBC BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void oxygenbrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Oxygen BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Oxygen BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Oxygen BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Oxygen BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Oxygen BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Oxygen BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void syfybrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "SYFY BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "SYFY BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "SYFY BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "SYFY BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "SYFY BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "SYFY BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void telemundobrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Telemundo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Telemundo BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Telemundo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Telemundo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Telemundo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Telemundo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void ukidsbrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universal Kids BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Universal Kids BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universal Kids BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Universal Kids BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universal Kids BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Universal Kids BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void universobrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Universo BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Universo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Universo BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "Universo BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		public void usabrandpageValidation() throws Exception {
			try {
			Synchronization.waitForPageLoad(driver);
			driver.navigate().back();
			Synchronization.waitForPageLoad(driver);
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.RIGHT).build().perform();
			Synchronization.waitForPageLoad(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Brandlogo = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			mvpdlogo = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			 if(Brandlogo.isDisplayed()&&mvpdlogo.isDisplayed())
             {
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "USA BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "USA BrandLanding Page is displayed and TV provider logo and Brand Logo is displayed ", driver);
 			
			}
             else{
             	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "USA BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
             			+ "\n" + Extent_Reports.logActual + "USA BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
             	}
                }
			catch (Exception e) {
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "USA BrandLanding Page should be displayed and TV provider logo and Brand Logo should be displayed "
 						+ "\n" + Extent_Reports.logActual + "USA BrandLanding Page is displayed and TV provider logo and Brand Logo is not displayed ", driver);
 		
					}
}
		}
	