package com.nbcd.pages;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nbcd.GenericLib.DatabaseFunction;
import com.nbcd.GenericLib.Extent_Reports;
import com.nbcd.GenericLib.Utilities;
import com.nbcd.GenericLib.Synchronization;
public class OTTSearchPage {
	public WebDriver driver;
	String sql;
	DatabaseFunction db = new DatabaseFunction();
	public List<String> lstObject, 
	lstTestData,
	elementsText;
	static String screenshotExtension;
	String sqlQry,
	BrandName;
	WebElement Noresults,videoplayer,Creditconfirmation,skipbtn,submitbtn,signupbtnemail,inputpasswd,inputsignup,signupbtn,continuebtn,Activationcodeenter,Activationcodeelement,alphabetd,alphabete,alphabetj,alphabetf,clipbadge,episodeshowname,airdate,episodetitle,showtile,description,logo,USABrandlogo,alphabetu,alphabeti,alphabetl,alphabeto,Movietile,alphabetp,alphabets,alphabety,alphabetc,alphabeth,Showname,alphabeta,alphabetg,alphabett,searchbutton,Trendingshowshelf,Brandlogo,showpagevalidation,Topnav,searchactivebutton,spacebar,keyboardinput,keyboarddelete,keyboardclear,keyboardtoggle;
	List<WebElement> authterms,epsiode,clip,Trendingshows,brandlogos,Networkbutton, Bravotitle,CNBCtitle,Etitle,MSNBCtitle,NBCtitle,Oxygentitle,Syfytitle,Telemundotitle,Universalkidstitle,Universotitle,USAtitle,Bravoimage,CNBCimage,Eimage,MSNBCimage,NBCimage,Telemundoimage,Oxygenimage,Syfyimage,Universalkidsimage,Universoimage,USAimage;
	public OTTSearchPage(WebDriver driver) throws Exception {
		try {
			this.driver = driver;
			lstTestData = db.getTestDataObject("Select * from TDOTTSearch", "Input");
			lstObject = db.getTestDataObject("Select * from OROTTSearch", "ObjectRepository");
		} catch (Exception e) {
			Extent_Reports.executionLog("INFO", "Driver did not initialize", driver);
		}
	}

	/*
	 * Method will Validate all the steps in RTP-4042
	 */
	public void OTTSearchPageRTP4076Vizio() throws Exception {
		try {
		driver.get(lstTestData.get(0));
		Synchronization.waitForPageLoad(driver);
		OTTSearchPage Searchpage = new OTTSearchPage(driver);
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);

		Searchpage.OTTLaunch();
		Searchpage.SelectSearchnavoption();
		Searchpage.VerifyTrendingnowshelf();
		Searchpage.searchresultshow();
		Searchpage.searchresultmovie();
		Searchpage.searchresultepisode();
		Searchpage.searchresultbrand();
		Searchpage.searchresultclip();
		Searchpage.Verifycreditconfirmation();
		Searchpage.beforeScreenshot();
		Networkspage.TVProviderloginvizio();
		Searchpage.Verifyauthplaybackvizio();
		Searchpage.Searchinvalidtext();
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Shows menu option should be Clicked"
					+ "\n" + Extent_Reports.logActual + "Shows menu option is not Clicked", driver);
		}
	}
	public void OTTSearchPageRTP4076xbox() throws Exception {
		try {
		driver.get(lstTestData.get(5));
		Synchronization.waitForPageLoad(driver);
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		OTTSearchPage Searchpage = new OTTSearchPage(driver);
		Searchpage.OTTLaunch();
		Searchpage.SelectSearchnavoption();
		Searchpage.beforeScreenshot();
		Searchpage.VerifyTrendingnowshelf();
		Searchpage.afterScreenshot();
		Searchpage.searchresultshowxbox();
		Searchpage.searchresultmoviexbox();
		Searchpage.searchresultepisodexbox();
		Searchpage.searchresultbrandxbox();
		Searchpage.searchresultclipxbox();
		Searchpage.Verifycreditconfirmationxbox();
		Searchpage.beforeScreenshot();
		Networkspage.TVProviderloginxboxsignedup();
		Searchpage.VerifyauthplaybackXBOX();
		Searchpage.Searchinvalidtextxbox();
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
		OTTSearchPage Networkspage = new OTTSearchPage(driver);
		Networkspage.beforeScreenshot();
		Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "App should be launched Successfully"
				+ "\n" + Extent_Reports.logActual + "App is launched Successfully", driver);
		Networkspage.afterScreenshot();	
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "App should be Launched Successfully"
					+ "\n" + Extent_Reports.logActual + "App is not Launched Successfully", driver);
		}
	}
	public void SelectSearchnavoption() throws Exception {
		try {
			searchbutton = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
			searchbutton.click();
		Synchronization.waitForPageLoad(driver);
		Synchronization.waitForPageLoad(driver);
		Synchronization.waits(driver, 40, By.cssSelector(lstObject.get(7)), "visible");
		OTTSearchPage Networkspage = new OTTSearchPage(driver);
		Networkspage.beforeScreenshot();
		Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Search Page should be displayed"
				+ "\n" + Extent_Reports.logActual + "Search Page is displayed", driver);
		Networkspage.afterScreenshot();

			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void VerifyTrendingnowshelf() throws Exception {
		try {
			Trendingshows = Utilities.returnElements(driver, lstObject.get(14), lstObject.get(13));
			Trendingshowshelf = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
         if(Trendingshowshelf.isDisplayed())
         {
        	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Trending Now shelf should be displayed with show tiles and show tiles should be poster images"
     				+ "\n" + Extent_Reports.logActual + "Trending Now Shelf is displayed with shows tiles" +Trendingshows.get(0).getAttribute("aria-label") + " " +Trendingshows.get(1).getAttribute("aria-label") + " " +Trendingshows.get(2).getAttribute("aria-label") + "And show tiles are poster images" , driver);
         }
         else
         {
        	 Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Trending Now shelf should be displayed with show tiles"
     				+ "\n" + Extent_Reports.logActual + "Trending Now shelf is not displayed with show tiles", driver); 
         }
			
        brandlogos = Utilities.returnElements(driver, lstObject.get(17), lstObject.get(16));

         if (brandlogos.get(0).getAttribute("src").contains("NBC")&&brandlogos.get(1).getAttribute("src").contains("NBC")&&brandlogos.get(2).getAttribute("src").contains("NBC"))
         {
        	 Extent_Reports.executionLog("INFO",Extent_Reports.logActual + "All shows are of NBC Brand in Trending now shelf", driver); 
         }
         else
         {
        	 Extent_Reports.executionLog("INFO",Extent_Reports.logActual + "Trending now shelf contains shows of multiple brands", driver); 

         }
         Actions action = new Actions(driver);
			action.sendKeys(Keys.DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			showpagevalidation = Utilities.returnElement(driver, lstObject.get(20), lstObject.get(19));
      if (showpagevalidation.isDisplayed())
       {
     	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Show Home page should be displayed"
	 		+ "\n" + Extent_Reports.logActual + "Show Home page is displayed", driver);
	   }
      else
     {
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Show Home page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Show Home page is not displayed", driver);
	}
driver.navigate().back();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
      Topnav = Utilities.returnElement(driver, lstObject.get(23), lstObject.get(22));
      searchactivebutton = Utilities.returnElement(driver, lstObject.get(26), lstObject.get(25));
      spacebar = Utilities.returnElement(driver, lstObject.get(29), lstObject.get(28));
      keyboardinput = Utilities.returnElement(driver, lstObject.get(32), lstObject.get(31));
      keyboarddelete = Utilities.returnElement(driver, lstObject.get(35), lstObject.get(34));
      keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
      keyboardtoggle = Utilities.returnElement(driver, lstObject.get(41), lstObject.get(40));
      if(Topnav.isDisplayed()&&searchactivebutton.isDisplayed()&&spacebar.isDisplayed()&&keyboardinput.isDisplayed()&&keyboarddelete.isDisplayed()&&keyboardclear.isDisplayed()&&keyboardtoggle.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Top Nav ,search active button ,search text,clear,space-bar,delete buttons should be displayed"
			+ "\n" + Extent_Reports.logActual + "Top Nav ,search active button ,search text,clear,space-bar,delete buttons is displayed", driver);
	}	
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Top Nav ,search active button ,search text,clear,space-bar,delete buttons should be displayed"
			+ "\n" + Extent_Reports.logActual + "Top Nav ,search active button ,search text,clear,space-bar,delete buttons is not displayed", driver);
	}	
	
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultshow() throws Exception {
		try {
			alphabeta = Utilities.returnElement(driver, lstObject.get(44), lstObject.get(43));
			alphabeta.click();
			alphabetg = Utilities.returnElement(driver, lstObject.get(47), lstObject.get(46));
			alphabetg.click();
			Synchronization.waitForPageLoad(driver);
			alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
			alphabett.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Showname = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
			clip = Utilities.returnElements(driver, lstObject.get(56), lstObject.get(55));
            epsiode = Utilities.returnElements(driver, lstObject.get(59), lstObject.get(58));
            if (Showname.isDisplayed()&& (clip.size() < epsiode.size()))
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Showtile should be displayed followed by Episodes, Clips in search results in Ratio 16*9"
        				+ "\n" + Extent_Reports.logActual + "Showtile is displayed followed by Episodes, Clips in search results in Ratio 16*9", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Showtile should be displayed followed by Episodes, Clips in search results in Ratio 16*9"
        				+ "\n" + Extent_Reports.logActual + "Showtile is displayed followed by Episodes, Clips in search results in Ratio 16*9", driver);
            }
			showtile = Utilities.returnElement(driver, lstObject.get(98), lstObject.get(97));
			description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
			Showname = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
            if(showtile.isDisplayed()&&description.isDisplayed()&&logo.isDisplayed()&&Showname.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Show tile,Show title,Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Show tile,Show title,Three line show description and Brand logo is displayed in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Show tile,Show title,Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Show tile,Show title,Three line show description and Brand logo is not displayed in search results", driver);
            }
            Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			showpagevalidation = Utilities.returnElement(driver, lstObject.get(20), lstObject.get(19));
		      if (showpagevalidation.isDisplayed())
		       {
		     	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Show Home page should be displayed"
			 		+ "\n" + Extent_Reports.logActual + "Show Home page is displayed", driver);
			   }
		      else
		     {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Show Home page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Show Home page is not displayed", driver);
			}
		     driver.navigate().back();
		    Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
            keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
            keyboardclear.click();
			Synchronization.waitForPageLoad(driver);
			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultshowxbox() throws Exception {
		try {
			alphabeta = Utilities.returnElement(driver, lstObject.get(44), lstObject.get(43));
			alphabeta.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.UP).build().perform();
			alphabetg = Utilities.returnElement(driver, lstObject.get(47), lstObject.get(46));
			alphabetg.click();
			Synchronization.waitForPageLoad(driver);
			alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
			alphabett.click();
			Synchronization.waitForPageLoad(driver);
			OTTSearchPage Searchpage = new OTTSearchPage(driver);
			Searchpage.beforeScreenshot();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Showname = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
			clip = Utilities.returnElements(driver, lstObject.get(56), lstObject.get(55));
            epsiode = Utilities.returnElements(driver, lstObject.get(59), lstObject.get(58));
            if (Showname.isDisplayed()&& (clip.size() < epsiode.size()))
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Showtile should be displayed followed by Episodes, Clips in search results in Ratio 16*9"
        				+ "\n" + Extent_Reports.logActual + "Showtile is displayed followed by Episodes, Clips in search results in Ratio 16*9", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Showtile should be displayed followed by Episodes, Clips in search results in Ratio 16*9"
        				+ "\n" + Extent_Reports.logActual + "Showtile is displayed followed by Episodes, Clips in search results in Ratio 16*9", driver);
            }
			showtile = Utilities.returnElement(driver, lstObject.get(98), lstObject.get(97));
			description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
			Showname = Utilities.returnElement(driver, lstObject.get(53), lstObject.get(52));
            if(showtile.isDisplayed()&&description.isDisplayed()&&logo.isDisplayed()&&Showname.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Show tile,Show title,Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Show tile,Show title,Three line show description and Brand logo is displayed in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Show tile,Show title,Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Show tile,Show title,Three line show description and Brand logo is not displayed in search results", driver);
            }
            action.sendKeys(Keys.DOWN).build().perform();
            action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			showpagevalidation = Utilities.returnElement(driver, lstObject.get(20), lstObject.get(19));
		      if (showpagevalidation.isDisplayed())
		       {
		     	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Show Home page should be displayed"
			 		+ "\n" + Extent_Reports.logActual + "Show Home page is displayed", driver);
			   }
		      else
		     {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Show Home page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Show Home page is not displayed", driver);
			}
		     driver.navigate().back();
		    Synchronization.waitForPageLoad(driver);
            driver.navigate().refresh();
            Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Searchpage.afterScreenshot();

		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultepisode() throws Exception {
		try {
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			alphabeti.click();
			alphabetl = Utilities.returnElement(driver, lstObject.get(83), lstObject.get(82));
			alphabetl.click();
			alphabeto = Utilities.returnElement(driver, lstObject.get(86), lstObject.get(85));
			alphabeto.click();
			alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
			alphabett.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
            epsiode = Utilities.returnElements(driver, lstObject.get(59), lstObject.get(58));
            if (epsiode.get(0).isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Episode tiles should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Episode tiles are displayed followed by Clips in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Episode tiles should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Episode tiles are not displayed followed by Clips in search results", driver);
            }
            description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
            episodeshowname = Utilities.returnElement(driver, lstObject.get(107), lstObject.get(106));
            airdate = Utilities.returnElement(driver, lstObject.get(110), lstObject.get(109));
            episodetitle = Utilities.returnElement(driver, lstObject.get(113), lstObject.get(112));
            if(description.isDisplayed()&&logo.isDisplayed()&&episodeshowname.isDisplayed()&&airdate.isDisplayed()&&episodetitle.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Airdate,Show title,Episode title, Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Airdate,Show title,Episode title,Three line show description and Brand logo is displayed in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Airdate,Show title,Episode title, Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Airdate,Show title,Episode title,Three line show description and Brand logo is not displayed in search results", driver);
            }
            
            
            keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
            keyboardclear.click();
			

			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultepisodexbox() throws Exception {
		try {
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			alphabeti.click();
			alphabetl = Utilities.returnElement(driver, lstObject.get(83), lstObject.get(82));
			alphabetl.click();
			alphabeto = Utilities.returnElement(driver, lstObject.get(86), lstObject.get(85));
			alphabeto.click();
			alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
			alphabett.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			OTTSearchPage Searchpage = new OTTSearchPage(driver);
			Searchpage.beforeScreenshot();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
            epsiode = Utilities.returnElements(driver, lstObject.get(59), lstObject.get(58));
            if (epsiode.get(0).isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Episode tiles should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Episode tiles are displayed followed by Clips in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Episode tiles should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Episode tiles are not displayed followed by Clips in search results", driver);
            }
            description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
            episodeshowname = Utilities.returnElement(driver, lstObject.get(107), lstObject.get(106));
            airdate = Utilities.returnElement(driver, lstObject.get(110), lstObject.get(109));
            episodetitle = Utilities.returnElement(driver, lstObject.get(113), lstObject.get(112));
            if(description.isDisplayed()&&logo.isDisplayed()&&episodeshowname.isDisplayed()&&airdate.isDisplayed()&&episodetitle.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Airdate,Show title,Episode title, Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Airdate,Show title,Episode title,Three line show description and Brand logo is displayed in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Airdate,Show title,Episode title, Three line show description and Brand logo should be displayed in search results"
        				+ "\n" + Extent_Reports.logActual + "Airdate,Show title,Episode title,Three line show description and Brand logo is not displayed in search results", driver);
            }    
            driver.navigate().refresh();
            Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Searchpage.afterScreenshot();
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultmovie() throws Exception {
		try {
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabety = Utilities.returnElement(driver, lstObject.get(68), lstObject.get(67));
			alphabety.click();
			alphabetc = Utilities.returnElement(driver, lstObject.get(71), lstObject.get(70));
			alphabetc.click();
			alphabeth = Utilities.returnElement(driver, lstObject.get(74), lstObject.get(73));
			alphabeth.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Movietile = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			clip = Utilities.returnElements(driver, lstObject.get(56), lstObject.get(55));
            epsiode = Utilities.returnElements(driver, lstObject.get(59), lstObject.get(58));
            if (Movietile.isDisplayed()&& clip.get(0).isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Movie tile should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Movie tile is displayed followed by Clips in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Movie tile should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Movie tile is not displayed followed by Clips in search results", driver);
            }
           
            description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
			Movietile = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			if(description.isDisplayed()&&logo.isDisplayed()&&Movietile.isDisplayed())
			{
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Movie tile,title,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Movie tile,title,description and brand logo are displayed", driver);
            }
            else
            {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Movie tile,title,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Movie tile,title,description and brand logo are not displayed", driver);
            }
            keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
            keyboardclear.click();
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultmoviexbox() throws Exception {
		try {
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabety = Utilities.returnElement(driver, lstObject.get(68), lstObject.get(67));
			alphabety.click();
			alphabetc = Utilities.returnElement(driver, lstObject.get(71), lstObject.get(70));
			alphabetc.click();
			alphabeth = Utilities.returnElement(driver, lstObject.get(74), lstObject.get(73));
			alphabeth.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			OTTSearchPage Searchpage = new OTTSearchPage(driver);
			Searchpage.beforeScreenshot();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Movietile = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			clip = Utilities.returnElements(driver, lstObject.get(56), lstObject.get(55));
            epsiode = Utilities.returnElements(driver, lstObject.get(59), lstObject.get(58));
            if (Movietile.isDisplayed()&& clip.get(0).isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Movie tile should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Movie tile is displayed followed by Clips in search results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Movie tile should be displayed followed by Clips in search results"
        				+ "\n" + Extent_Reports.logActual + "Movie tile is not displayed followed by Clips in search results", driver);
            }
           
            description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
			Movietile = Utilities.returnElement(driver, lstObject.get(77), lstObject.get(76));
			if(description.isDisplayed()&&logo.isDisplayed()&&Movietile.isDisplayed())
			{
				Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Movie tile,title,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Movie tile,title,description and brand logo are displayed", driver);
            }
            else
            {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Movie tile,title,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Movie tile,title,description and brand logo are not displayed", driver);
            }
		       driver.navigate().refresh();
	            Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Searchpage.afterScreenshot();
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultbrand() throws Exception {
		try {
			alphabetu = Utilities.returnElement(driver, lstObject.get(92), lstObject.get(91));
			alphabetu.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabeta = Utilities.returnElement(driver, lstObject.get(44), lstObject.get(43));
			alphabeta.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
            USABrandlogo = Utilities.returnElement(driver, lstObject.get(95), lstObject.get(94));
            if (USABrandlogo.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "USA Brand content should be displayed in search Results"
        				+ "\n" + Extent_Reports.logActual + "USA Brand Content is displayed in search Results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "USA Brand content should be displayed in search Results"
        				+ "\n" + Extent_Reports.logActual + "USA Brand Content is not displayed in search Results", driver);  
            	}
            keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
            keyboardclear.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
            
    		Trendingshows = Utilities.returnElements(driver, lstObject.get(14), lstObject.get(13));
			Trendingshowshelf = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
         if(Trendingshowshelf.isDisplayed())
         {
        	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Trending Now shelf should be displayed after clearing search term"
     				+ "\n" + Extent_Reports.logActual + "Trending Now Shelf is displayed after clearing search term" , driver);
         }
         else
         {
        	 Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Trending Now shelf should be displayed with show tiles"
     				+ "\n" + Extent_Reports.logActual + "Trending Now shelf is not displayed with show tiles", driver); 
         }
			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultbrandxbox() throws Exception {
		try {
			alphabetu = Utilities.returnElement(driver, lstObject.get(92), lstObject.get(91));
			alphabetu.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabeta = Utilities.returnElement(driver, lstObject.get(44), lstObject.get(43));
			alphabeta.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			OTTSearchPage Searchpage = new OTTSearchPage(driver);
			Searchpage.beforeScreenshot();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
            USABrandlogo = Utilities.returnElement(driver, lstObject.get(95), lstObject.get(94));
            if (USABrandlogo.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "USA Brand content should be displayed in search Results"
        				+ "\n" + Extent_Reports.logActual + "USA Brand Content is displayed in search Results", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "USA Brand content should be displayed in search Results"
        				+ "\n" + Extent_Reports.logActual + "USA Brand Content is not displayed in search Results", driver);  
            	}
            keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
            keyboardclear.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			 driver.navigate().refresh();
	            Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Searchpage.afterScreenshot();
    		Trendingshows = Utilities.returnElements(driver, lstObject.get(14), lstObject.get(13));
			Trendingshowshelf = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
         if(Trendingshowshelf.isDisplayed())
         {
        	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Trending Now shelf should be displayed after clearing search term"
     				+ "\n" + Extent_Reports.logActual + "Trending Now Shelf is displayed after clearing search term" , driver);
         }
         else
         {
        	 Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Trending Now shelf should be displayed with show tiles"
     				+ "\n" + Extent_Reports.logActual + "Trending Now shelf is not displayed with show tiles", driver); 
         }
			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void searchresultclip() throws Exception {
		try {
			alphabetc = Utilities.returnElement(driver, lstObject.get(71), lstObject.get(70));
			alphabetc.click();
			alphabetl = Utilities.returnElement(driver, lstObject.get(83), lstObject.get(82));
			alphabetl.click();
			alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			alphabeti.click();
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			
			description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
            airdate = Utilities.returnElement(driver, lstObject.get(110), lstObject.get(109));
            episodetitle = Utilities.returnElement(driver, lstObject.get(113), lstObject.get(112));
            episodeshowname = Utilities.returnElement(driver, lstObject.get(107), lstObject.get(106));
            clipbadge = Utilities.returnElement(driver, lstObject.get(116), lstObject.get(115));
            if (description.isDisplayed()&&logo.isDisplayed()&&airdate.isDisplayed()&&episodetitle.isDisplayed()&&episodeshowname.isDisplayed()&&clipbadge.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Clip tile,title,showname,clipbadge,airdate,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Clip tile,title,showname,clipbadge,airdate,description and brand logo are displayed", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Clip tile,title,showname,clipbadge,airdate,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Clip tile,title,showname,clipbadge,airdate,description and brand logo are not displayed", driver);
            	}
            keyboardclear = Utilities.returnElement(driver, lstObject.get(38), lstObject.get(37));
            keyboardclear.click();

			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
		}
	}
	public void searchresultclipxbox() throws Exception {
		try {
			alphabetc = Utilities.returnElement(driver, lstObject.get(71), lstObject.get(70));
			alphabetc.click();
			alphabetl = Utilities.returnElement(driver, lstObject.get(83), lstObject.get(82));
			alphabetl.click();
			alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			alphabeti.click();
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			OTTSearchPage Searchpage = new OTTSearchPage(driver);
			Searchpage.beforeScreenshot();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			description = Utilities.returnElement(driver, lstObject.get(101), lstObject.get(100));
			logo = Utilities.returnElement(driver, lstObject.get(104), lstObject.get(103));
            airdate = Utilities.returnElement(driver, lstObject.get(110), lstObject.get(109));
            episodetitle = Utilities.returnElement(driver, lstObject.get(113), lstObject.get(112));
            episodeshowname = Utilities.returnElement(driver, lstObject.get(107), lstObject.get(106));
            clipbadge = Utilities.returnElement(driver, lstObject.get(116), lstObject.get(115));
            if (description.isDisplayed()&&logo.isDisplayed()&&airdate.isDisplayed()&&episodetitle.isDisplayed()&&episodeshowname.isDisplayed()&&clipbadge.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Clip tile,title,showname,clipbadge,airdate,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Clip tile,title,showname,clipbadge,airdate,description and brand logo are displayed", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Clip tile,title,showname,clipbadge,airdate,description and brand logo should be displayed"
        				+ "\n" + Extent_Reports.logActual + "Clip tile,title,showname,clipbadge,airdate,description and brand logo are not displayed", driver);
            	}
            driver.navigate().refresh();
            Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Searchpage.afterScreenshot();
			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
		}
	}
	public void Verifycreditconfirmation() throws Exception {
		try {
			alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
			alphabett.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabetj = Utilities.returnElement(driver, lstObject.get(119), lstObject.get(118));
			alphabetj.click();
			alphabetf = Utilities.returnElement(driver, lstObject.get(122), lstObject.get(121));
			alphabetf.click();
			spacebar = Utilities.returnElement(driver, lstObject.get(29), lstObject.get(28));
			spacebar.click();
			alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
			alphabete.click();
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			alphabeti.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabeto = Utilities.returnElement(driver, lstObject.get(86), lstObject.get(85));
			alphabeto.click();
			alphabetd = Utilities.returnElement(driver, lstObject.get(128), lstObject.get(127));
			alphabetd.click();
			alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
			alphabete.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Activationcodeelement = Utilities.returnElement(driver, lstObject.get(131), lstObject.get(130));
            String Activationcode = Activationcodeelement.getText();
            Robot robot = new Robot();                          
    		robot.keyPress(KeyEvent.VK_CONTROL); 
    		robot.keyPress(KeyEvent.VK_T); 
    		robot.keyRelease(KeyEvent.VK_CONTROL); 
    		robot.keyRelease(KeyEvent.VK_T);        
    		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    		driver.switchTo().window(tabs.get(1)); 
    		driver.get(lstTestData.get(1));
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Activationcodeenter = Utilities.returnElement(driver, lstObject.get(134), lstObject.get(133));
			Activationcodeenter.sendKeys(Activationcode);
			continuebtn = Utilities.returnElement(driver, lstObject.get(137), lstObject.get(136));
			continuebtn.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			signupbtn = Utilities.returnElement(driver, lstObject.get(140), lstObject.get(139));
			signupbtn.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			signupbtnemail = Utilities.returnElement(driver, lstObject.get(143), lstObject.get(142));
			signupbtnemail.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Date today = new Date();
			long date = today.getTime();
			long day = date;
			inputsignup = Utilities.returnElement(driver, lstObject.get(146), lstObject.get(145));
			inputsignup.sendKeys("aswadhati.sai+"+day+"@gmail.com");
			inputpasswd = Utilities.returnElement(driver, lstObject.get(149), lstObject.get(148));
			inputpasswd.sendKeys("password");
			authterms = Utilities.returnElements(driver, lstObject.get(152), lstObject.get(151));
			authterms.get(0).click();
			authterms = Utilities.returnElements(driver, lstObject.get(152), lstObject.get(151));
			authterms.get(1).click();
			submitbtn = Utilities.returnElement(driver, lstObject.get(155), lstObject.get(154));
			submitbtn.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			skipbtn = Utilities.returnElement(driver, lstObject.get(158), lstObject.get(157));
			 if (skipbtn.isDisplayed())
	            {
	            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "User should be signed up successfully"
	    					+ "\n" + Extent_Reports.logActual + "User is signed up successfully", driver);
	            }
	            else
	            {
	            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "User should be signed up successfully"
	    					+ "\n" + Extent_Reports.logActual + "User is not signed up successfully", driver);
	            	}
		     skipbtn = Utilities.returnElement(driver, lstObject.get(158), lstObject.get(157));
			 skipbtn.click();
			Synchronization.waitForPageLoad(driver);
    		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
    		driver.switchTo().window(tab.get(0)); 
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
		    Creditconfirmation = Utilities.returnElement(driver, lstObject.get(161), lstObject.get(160));
            if (Creditconfirmation.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Credit Confirmation screen should be displayed"
    					+ "\n" + Extent_Reports.logActual + "Credit Confirmation screen is displayed", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Credit Confirmation screen should be displayed"
    					+ "\n" + Extent_Reports.logActual + "Credit Confirmation screen is displayed", driver);
            }
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	public void Verifycreditconfirmationxbox() throws Exception {
		try {
			alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
			alphabett.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabetj = Utilities.returnElement(driver, lstObject.get(119), lstObject.get(118));
			alphabetj.click();
			alphabetf = Utilities.returnElement(driver, lstObject.get(122), lstObject.get(121));
			alphabetf.click();
			spacebar = Utilities.returnElement(driver, lstObject.get(29), lstObject.get(28));
			spacebar.click();
			alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
			alphabete.click();
			alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
			alphabetp.click();
			alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
			alphabeti.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			alphabeto = Utilities.returnElement(driver, lstObject.get(86), lstObject.get(85));
			alphabeto.click();
			alphabetd = Utilities.returnElement(driver, lstObject.get(128), lstObject.get(127));
			alphabetd.click();
			alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
			alphabete.click();
			alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
			alphabets.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Activationcodeelement = Utilities.returnElement(driver, lstObject.get(131), lstObject.get(130));
            String Activationcode = Activationcodeelement.getText();
            Robot robot = new Robot();                          
    		robot.keyPress(KeyEvent.VK_CONTROL); 
    		robot.keyPress(KeyEvent.VK_T); 
    		robot.keyRelease(KeyEvent.VK_CONTROL); 
    		robot.keyRelease(KeyEvent.VK_T);        
    		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    		driver.switchTo().window(tabs.get(1)); 
    		driver.get(lstTestData.get(1));
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Activationcodeenter = Utilities.returnElement(driver, lstObject.get(134), lstObject.get(133));
			Activationcodeenter.sendKeys(Activationcode);
			continuebtn = Utilities.returnElement(driver, lstObject.get(137), lstObject.get(136));
			continuebtn.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			signupbtn = Utilities.returnElement(driver, lstObject.get(140), lstObject.get(139));
			signupbtn.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			signupbtnemail = Utilities.returnElement(driver, lstObject.get(143), lstObject.get(142));
			signupbtnemail.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Date today = new Date();
			long date = today.getTime();
			long day = date;
			inputsignup = Utilities.returnElement(driver, lstObject.get(146), lstObject.get(145));
			inputsignup.sendKeys("aswadhati.sai+"+day+"@gmail.com");
			inputpasswd = Utilities.returnElement(driver, lstObject.get(149), lstObject.get(148));
			inputpasswd.sendKeys("password");
			authterms = Utilities.returnElements(driver, lstObject.get(152), lstObject.get(151));
			authterms.get(0).click();
			authterms = Utilities.returnElements(driver, lstObject.get(152), lstObject.get(151));
			authterms.get(1).click();
			submitbtn = Utilities.returnElement(driver, lstObject.get(155), lstObject.get(154));
			submitbtn.click();
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			skipbtn = Utilities.returnElement(driver, lstObject.get(158), lstObject.get(157));
			 if (skipbtn.isDisplayed())
	            {
	            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "User should be signed up successfully"
	    					+ "\n" + Extent_Reports.logActual + "User is signed up successfully", driver);
	            }
	            else
	            {
	            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "User should be signed up successfully"
	    					+ "\n" + Extent_Reports.logActual + "User is not signed up successfully", driver);
	            	}
		     skipbtn = Utilities.returnElement(driver, lstObject.get(158), lstObject.get(157));
			 skipbtn.click();
			Synchronization.waitForPageLoad(driver);
    		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
    		driver.switchTo().window(tab.get(0)); 
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
			Synchronization.waitForPageLoad(driver);
		    Creditconfirmation = Utilities.returnElement(driver, lstObject.get(161), lstObject.get(160));
            if (Creditconfirmation.isDisplayed())
            {
            	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Credit Confirmation screen should be displayed"
    					+ "\n" + Extent_Reports.logActual + "Credit Confirmation screen is displayed", driver);
            }
            else
            {
            	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Credit Confirmation screen should be displayed"
    					+ "\n" + Extent_Reports.logActual + "Credit Confirmation screen is displayed", driver);
            }
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Search Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "Search Page is not displayed", driver);
		}
	}
	
	
		public void Verifyauthplaybackvizio() throws Exception {
			try {
				driver.get(lstTestData.get(0));
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				searchbutton = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
				searchbutton.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
				alphabett.click();
				alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				alphabets.click();
				alphabetj = Utilities.returnElement(driver, lstObject.get(119), lstObject.get(118));
				alphabetj.click();
				alphabetf = Utilities.returnElement(driver, lstObject.get(122), lstObject.get(121));
				alphabetf.click();
				spacebar = Utilities.returnElement(driver, lstObject.get(29), lstObject.get(28));
				spacebar.click();
				alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
				alphabete.click();
				alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
				alphabetp.click();
				alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
				alphabeti.click();
				alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				alphabets.click();
				alphabeto = Utilities.returnElement(driver, lstObject.get(86), lstObject.get(85));
				alphabeto.click();
				alphabetd = Utilities.returnElement(driver, lstObject.get(128), lstObject.get(127));
				alphabetd.click();
				alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
				alphabete.click();
				alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				alphabets.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Actions action = new Actions(driver);
				action.sendKeys(Keys.DOWN).build().perform();
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				videoplayer = Utilities.returnElement(driver, lstObject.get(164), lstObject.get(163));
                 if(videoplayer.isDisplayed())
                 {
                	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Video should play successfully"
     						+ "\n" + Extent_Reports.logActual + "Video is played successfully", driver); 
                 }
                 else
                 {
                	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Video should play successfully"
     						+ "\n" + Extent_Reports.logActual + "Video is not played successfully", driver);                	 
                 }
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
						+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
			}
		}
		public void VerifyauthplaybackXBOX() throws Exception {
			try {
				driver.get(lstTestData.get(5));
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				searchbutton = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
				searchbutton.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
				alphabett.click();
				alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				alphabets.click();
				alphabetj = Utilities.returnElement(driver, lstObject.get(119), lstObject.get(118));
				alphabetj.click();
				alphabetf = Utilities.returnElement(driver, lstObject.get(122), lstObject.get(121));
				alphabetf.click();
				spacebar = Utilities.returnElement(driver, lstObject.get(29), lstObject.get(28));
				spacebar.click();
				alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
				alphabete.click();
				alphabetp = Utilities.returnElement(driver, lstObject.get(62), lstObject.get(61));
				alphabetp.click();
				alphabeti = Utilities.returnElement(driver, lstObject.get(80), lstObject.get(79));
				alphabeti.click();
				alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				alphabets.click();
				alphabeto = Utilities.returnElement(driver, lstObject.get(86), lstObject.get(85));
				alphabeto.click();
				alphabetd = Utilities.returnElement(driver, lstObject.get(128), lstObject.get(127));
				alphabetd.click();
				alphabete = Utilities.returnElement(driver, lstObject.get(125), lstObject.get(124));
				alphabete.click();
				alphabets = Utilities.returnElement(driver, lstObject.get(65), lstObject.get(64));
				alphabets.click();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Actions action = new Actions(driver);
				action.sendKeys(Keys.DOWN).build().perform();
				action.sendKeys(Keys.ENTER).build().perform();
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				Synchronization.waitForPageLoad(driver);
				videoplayer = Utilities.returnElement(driver, lstObject.get(164), lstObject.get(163));
                 if(videoplayer.isDisplayed())
                 {
                	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Video should play successfully"
     						+ "\n" + Extent_Reports.logActual + "Video is played successfully", driver); 
                 }
                 else
                 {
                	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Video should play successfully"
     						+ "\n" + Extent_Reports.logActual + "Video is not played successfully", driver);                	 
                 }
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
						+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
			}
		}
			public void Searchinvalidtext() throws Exception {
				try {
					driver.get(lstTestData.get(0));
					driver.navigate().refresh();
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Actions action = new Actions(driver);
					action.sendKeys(Keys.UP).build().perform();
					Synchronization.waitForPageLoad(driver);
					searchbutton = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
					searchbutton.click();
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Noresults = Utilities.returnElement(driver, lstObject.get(167), lstObject.get(166));
					Trendingshowshelf = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				    keyboardinput = Utilities.returnElement(driver, lstObject.get(32), lstObject.get(31));
					if(Noresults.isDisplayed()&&Trendingshowshelf.isDisplayed()&&keyboardinput.getAttribute("value").equals(lstTestData.get(6)))
	                 {
	                	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Line1,Line2,Line3 and Trending now shelves should be displayed and entered value should be displayed in search box"
	     						+ "\n" + Extent_Reports.logActual + "Line1,Line2,Line3 and Trending now shelves are displayed and entered value is displayed in search box", driver); 
	                 }
	                 else
	                 {
	                	 Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Line1,Line2,Line3 and Trending now shelves should be displayed and entered value should be displayed in search box"
		     						+ "\n" + Extent_Reports.logActual + "Line1,Line2,Line3 and Trending now shelves are not displayed and entered value is not displayed in search box", driver); 
		                  }
				} catch (Exception e) {
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
							+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
				}
	}
	
			public void Searchinvalidtextxbox() throws Exception {
				try {
					driver.get(lstTestData.get(5));
					driver.navigate().refresh();
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Actions action = new Actions(driver);
					action.sendKeys(Keys.UP).build().perform();
					Synchronization.waitForPageLoad(driver);
					searchbutton = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
					searchbutton.click();
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					alphabett = Utilities.returnElement(driver, lstObject.get(50), lstObject.get(49));
					alphabett.click();
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Synchronization.waitForPageLoad(driver);
					Noresults = Utilities.returnElement(driver, lstObject.get(167), lstObject.get(166));
					Trendingshowshelf = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
				    keyboardinput = Utilities.returnElement(driver, lstObject.get(32), lstObject.get(31));
					if(Noresults.isDisplayed()&&Trendingshowshelf.isDisplayed()&&keyboardinput.getAttribute("value").equals(lstTestData.get(6)))
	                 {
	                	 Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Line1,Line2,Line3 and Trending now shelves should be displayed and entered value should be displayed in search box"
	     						+ "\n" + Extent_Reports.logActual + "Line1,Line2,Line3 and Trending now shelves are displayed and entered value is displayed in search box", driver); 
	                 }
	                 else
	                 {
	                	 Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Line1,Line2,Line3 and Trending now shelves should be displayed and entered value should be displayed in search box"
		     						+ "\n" + Extent_Reports.logActual + "Line1,Line2,Line3 and Trending now shelves are not displayed and entered value is not displayed in search box", driver); 
		                  }
				} catch (Exception e) {
					Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Networks Page should be displayed"
							+ "\n" + Extent_Reports.logActual + "Networks Page is not displayed", driver);
				}
	}
	
	
		}
	