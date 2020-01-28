package com.nbcd.GenericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



//=========================================================CLASS & METHODS =============================================================================================
public class GetWebDriverInstance extends Extent_Reports {
	public static String env;
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	
	private static String  genericPath=System.getProperty("user.dir").concat("/src/test/resources/DriverExecutable/");
	protected WebDriver driver;
	public static  String USERNAME="" ;
	public static  String AUTOMATE_KEY="" ;
	public static  String URL="" ;
	DesiredCapabilities caps ;
	@SuppressWarnings("deprecation")
	@BeforeClass
	
	@Parameters(value={"environment","browser","version","os","osversion"})
	public   void getBrowser(String environment,String browser,String version,String os,String osversion) throws MalformedURLException 
	{
		
		env = environment;
		driver = null;
		Properties prop = new Properties();
		try 
		{

			InputStream input = new FileInputStream("data.properties");
			// load a properties file
			prop.load(input);

		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		

		switch (environment.toUpperCase()) 
		{
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", genericPath+"geckodriver.exe");
			/*DesiredCapabilities caps1 = new DesiredCapabilities();
				    caps1.setCapability("browser",environment);
				    caps1.setCapability("marionnette", true);*/

			driver = drivers.get("Firefox");
			if (driver == null) 
			{
				driver = new FirefoxDriver();
				
			}
			break;
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) 
			{
				System.setProperty("webdriver.ie.driver", genericPath+"IEDriverServer.exe");

				driver = new InternetExplorerDriver();
				drivers.put("IE", driver);
			}
			break;
		case "CHROME":
			driver = drivers.get("Chrome");
			if (driver == null) 
			{
				System.out.println(genericPath);
				System.setProperty("webdriver.chrome.driver",genericPath+"chromedriver.exe");
				ChromeOptions options = new ChromeOptions(); 
				options.addArguments("disable-infobars"); 
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("start-maximized");
				LoggingPreferences logPrefs = new LoggingPreferences();
		        logPrefs.enable(LogType.BROWSER, Level.ALL);
		        options.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				}
			break;
			
			case "REMOTE":
				try{
					USERNAME =prop.getProperty("username");
					AUTOMATE_KEY = prop.getProperty("accessKey");;
					URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
					DesiredCapabilities caps = new DesiredCapabilities();
					if(browser.compareToIgnoreCase("TRUE")==0)
					{
						 	caps.setCapability("os_version", osversion);
							caps.setCapability("device", os);
							caps.setCapability("real_mobile", browser );
							caps.setCapability("browserstack.selenium_version", "3.5.2");
							caps.setCapability("browserstack.debug", "true");	
								
					}
					else
					{
						    caps.setCapability("browser",browser);
						    caps.setCapability("browser_version", version);
						    caps.setCapability("os", os);
						    caps.setCapability("os_version",osversion);
						    caps.setCapability("resolution","1024x768");
						 //  caps.setCapability("browserstack.local",true);
						    //System.out.println("local");
						   
					}
				    		driver = new RemoteWebDriver(new URL(URL), caps);
						    driver.get(URL); 
						    driver.manage().window().fullscreen();
						    driver.manage().deleteAllCookies();
				}
				catch(Exception exc)
				{
					System.out.println(exc.getMessage());
				}
				break;
			
			case "GRID":
				try{
			 		String Node = "http://10.75.146.56:4444/wd/hub";
			 		
			 		DesiredCapabilities caps = DesiredCapabilities.chrome();
				    driver = new RemoteWebDriver(new URL(Node), caps);
				    driver.manage().window().maximize();
				    driver.manage().deleteAllCookies();
				}
				catch(Exception exc)
				{
					System.out.println(exc.getMessage());
				}
		 break;
		case "HEADLESS":
			driver = new HtmlUnitDriver();
			break;
		case "OPERA":	
			driver = new OperaDriver();
			break;

		case "SAFARI":
			driver = new SafariDriver();
			break;
		case "IPHONE":
		case "ANDROIDPHONE":
		case "ANDROIDTAB":
		case "IPAD":
			System.out.println("environment");
			if(osversion.indexOf(".")==-1)
			{
				osversion=osversion+".0";
			}
			try{
				
					final String USERNAME =prop.getProperty("username");
					final String AUTOMATE_KEY = prop.getProperty("accessKey");;
					URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
					caps = new DesiredCapabilities();			
			        caps.setCapability("os_version", osversion);
					caps.setCapability("device", os);
					caps.setCapability("real_mobile", browser );
					caps.setCapability("browserstack.selenium_version", "3.11.0");
					caps.setCapability("browserstack.debug", "true");	
					//caps.setCapability("browserstack.local", "true");
				//caps.setCapability("browserstack.localIdentifier", "Test123");
					int i=0;
					/*if(i <1)
					{
						Local bsLocal =new Local();
					    HashMap<String,String> bsLocalArgs =new HashMap<String,String>();
					    bsLocalArgs.put("key", "E3uH2ruuZdf9auyrrBQC");    
					    bsLocal.start(bsLocalArgs);	    
					    bsLocalArgs.put("forcelocal","true");
					    i=1;
					}
*/				   
					driver = new RemoteWebDriver(new URL(URL), caps);
		
						    
			}			
			catch(Exception e)
			{
				System.out.println("Browserstack instance creation ---exception " +e.getMessage());
				
			}

			break;


		}
		//return driver;
	}
	
	
	@AfterMethod(alwaysRun = true)
	public  void closeAllDriver() 
	{

		try
		{
			driver.quit();
		}
		catch(WebDriverException exc)
		{
			System.out.println("WebDriver Exception in CloseAllDriver " +exc.getMessage());
		}

	}



}
