package com.nbcd.test;

import org.testng.annotations.Test;

import com.nbcd.GenericLib.GetWebDriverInstance;
import com.nbcd.pages.OTTNetworksPage;

public class OTTNetworksPageRTP4088Xboxoneapp extends GetWebDriverInstance
{	
	@Test
	 public void NetworksPageRTP4088() throws Exception 
	 {

		OTTNetworksPage objHP = new OTTNetworksPage(driver);
		
		objHP.OTTNetworksPageRTP4088Xboxoneapp();
		
	 }
} 