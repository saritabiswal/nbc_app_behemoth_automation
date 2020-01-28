package com.nbcd.pages;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.nbcd.GenericLib.DatabaseFunction;
import com.nbcd.GenericLib.Extent_Reports;
import com.nbcd.GenericLib.Utilities;
import com.nbcd.GenericLib.Synchronization;
public class OTTMorePage {
	public WebDriver driver;
	String sql;
	DatabaseFunction db = new DatabaseFunction();
	public List<String> lstObject, 
	lstTestData,
	elementsText;
	static String screenshotExtension;
	String sqlQry,
	BrandName;
	WebElement Myprofile,FAQ,Settings,Contactus,About,ValidateFAQ,ValidateContactus,Validateabout,Validateprivacypolicy,Validatedonotselllink,Validatetermsofuse,Activationcodeelement,bravodefaultfocus,defaultfocus,activefocus;
	List<WebElement> MoreButton, Bravotitle,CNBCtitle,Etitle,MSNBCtitle,NBCtitle,Oxygentitle,Syfytitle,Telemundotitle,Universalkidstitle,Universotitle,USAtitle,Bravoimage,CNBCimage,Eimage,MSNBCimage,NBCimage,Telemundoimage,Oxygenimage,Syfyimage,Universalkidsimage,Universoimage,USAimage;
	public OTTMorePage(WebDriver driver) throws Exception {
		try {
			this.driver = driver;
			lstTestData = db.getTestDataObject("Select * from TDOTTNetworks", "Input");
			lstObject = db.getTestDataObject("Select * from OROTTMorePage", "ObjectRepository");
		} catch (Exception e) {
			Extent_Reports.executionLog("INFO", "Driver did not initialize", driver);
		}
	}

	/*
	 * Method will Validate all the steps in RTP-4042
	 */
	public void OTTMorePageRTP4771Vizio() throws Exception {
	
		try {
			driver.get(lstTestData.get(0));
		Synchronization.waitForPageLoad(driver);
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		Networkspage.OTTLaunch();
		OTTMorePage Morepage = new OTTMorePage(driver);
		Morepage.NavigatetoMore();
		Morepage.VerifyMorepage();
		
			
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Shows menu option should be Clicked"
					+ "\n" + Extent_Reports.logActual + "Shows menu option is not Clicked", driver);
		}
	}
	public void OTTMorePageRTP4771XboxoneApp() throws Exception {
		try {
		driver.get(lstTestData.get(5));
		Synchronization.waitForPageLoad(driver);
		Synchronization.waitForPageLoad(driver);
		Synchronization.waitForPageLoad(driver);
		OTTNetworksPage Networkspage = new OTTNetworksPage(driver);
		Networkspage.OTTLaunch();
		OTTMorePage Morepage = new OTTMorePage(driver);
		Morepage.NavigatetoMore();
		Morepage.VerifyMorepage();
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Shows menu option should be Clicked"
					+ "\n" + Extent_Reports.logActual + "Shows menu option is not Clicked", driver);
		}
	}
	public void NavigatetoMore() throws Exception {
			try {
				MoreButton = Utilities.returnElements(driver, lstObject.get(2), lstObject.get(1));
				MoreButton.get(4).click();
			Synchronization.waitForPageLoad(driver);
			Myprofile = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
if(Myprofile.isDisplayed())
{
			Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "More Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "More page is displayed", driver);
			}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "More Page should be displayed"
		+ "\n" + Extent_Reports.logActual + "More page is displayed", driver);
	}
			} catch (Exception e) {
				Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "More Page should be displayed"
						+ "\n" + Extent_Reports.logActual + "More Page is not displayed", driver);
			}
		}
	
	public void VerifyMorepage() throws Exception {
		try {
			Myprofile = Utilities.returnElement(driver, lstObject.get(5), lstObject.get(4));
			Settings = Utilities.returnElement(driver, lstObject.get(8), lstObject.get(7));
			FAQ = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
			Contactus = Utilities.returnElement(driver, lstObject.get(14), lstObject.get(13));
			About = Utilities.returnElement(driver, lstObject.get(17), lstObject.get(16));
if(Myprofile.isDisplayed()&&Settings.isDisplayed()&&FAQ.isDisplayed())
{	Actions action = new Actions(driver);
Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "My Pofile,Settings,Faq buttons should be displayed"
		+ "\n" + Extent_Reports.logActual + "My Pofile,Settings,Faq buttons are displayed", driver);

action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();

		if(Contactus.isDisplayed()&&About.isDisplayed())
{
		Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Contactus,About buttons should be displayed"
				+ "\n" + Extent_Reports.logActual + "Contactus,About buttons are displayed", driver);
		}
}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "My Pofile,Settings,Faq,Contactus,About buttons should be displayed"
			+ "\n" + Extent_Reports.logActual + "My Pofile,Settings,Faq,Contactus,About buttons are not displayed", driver);
}
FAQ = Utilities.returnElement(driver, lstObject.get(11), lstObject.get(10));
FAQ.click();
Synchronization.waitForPageLoad(driver);
ValidateFAQ = Utilities.returnElement(driver, lstObject.get(20), lstObject.get(19));
if(ValidateFAQ.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Faq page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Faq page is displayed", driver);
	
	}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Faq page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Faq page is not displayed", driver);
	}

driver.navigate().back();
driver.navigate().refresh();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Actions action = new Actions(driver);
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.ENTER).build().perform();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
ValidateContactus = Utilities.returnElement(driver, lstObject.get(23), lstObject.get(22));
if(ValidateContactus.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Contact us page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Contact us page is displayed", driver);
	
	}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Contact us page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Contact us page is not displayed", driver);
	}
driver.navigate().back();
driver.navigate().refresh();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.RIGHT).build().perform();
action.sendKeys(Keys.ENTER).build().perform();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Validateabout = Utilities.returnElement(driver, lstObject.get(26), lstObject.get(25));
if(Validateabout.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "About page should be displayed"
			+ "\n" + Extent_Reports.logActual + "About page is displayed", driver);
	
	}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "About page should be displayed"
			+ "\n" + Extent_Reports.logActual + "About page is not displayed", driver);
	}
action.sendKeys(Keys.ENTER).build().perform();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Validateprivacypolicy = Utilities.returnElement(driver, lstObject.get(29), lstObject.get(28));
if(Validateprivacypolicy.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Privacy policy page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Privacy policy page is displayed", driver);
	
	}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Privacy policy page should be displayed"
			+ "\n" + Extent_Reports.logActual + "Privacy policy page is not displayed", driver);
	}
driver.navigate().back();
driver.navigate().refresh();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
action.sendKeys(Keys.DOWN).build().perform();
action.sendKeys(Keys.ENTER).build().perform();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Validatedonotselllink = Utilities.returnElement(driver, lstObject.get(32), lstObject.get(31));
if(Validatedonotselllink.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Donot sell my personal information page should be displayed with link"
			+ "\n" + Extent_Reports.logActual + "Donot sell my personal information page is displayed with link", driver);

}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Donot sell my personal information page should be displayed with link"
			+ "\n" + Extent_Reports.logActual + "Donot sell my personal information page is displayed with link", driver);
	
}
driver.navigate().back();
action.sendKeys(Keys.DOWN).build().perform();
action.sendKeys(Keys.DOWN).build().perform();
action.sendKeys(Keys.ENTER).build().perform();
Synchronization.waitForPageLoad(driver);
Synchronization.waitForPageLoad(driver);
Validatetermsofuse = Utilities.returnElement(driver, lstObject.get(35), lstObject.get(34));
if(Validatetermsofuse.isDisplayed())
{
	Extent_Reports.executionLog("PASS", Extent_Reports.logExpected + "Terms of Use page should be displayed with link"
			+ "\n" + Extent_Reports.logActual + "Terms of use page is displayed with link", driver);

}
else
{
	Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "Terms of use page should be displayed with link"
			+ "\n" + Extent_Reports.logActual + "Terms of use page is not displayed with link", driver);
	
}
		} catch (Exception e) {
			Extent_Reports.executionLog("FAIL", Extent_Reports.logExpected + "More Page should be displayed"
					+ "\n" + Extent_Reports.logActual + "More Page is not displayed", driver);
		}
	}



}
	