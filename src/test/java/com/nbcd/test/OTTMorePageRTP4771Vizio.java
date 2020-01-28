package com.nbcd.test;

import org.testng.annotations.Test;

import com.nbcd.GenericLib.GetWebDriverInstance;
import com.nbcd.pages.OTTMorePage;
import com.nbcd.pages.OTTNetworksPage;

public class OTTMorePageRTP4771Vizio extends GetWebDriverInstance
{	
	@Test
	 public void NetworksPageRTP4088() throws Exception 
	 {

		OTTMorePage objHP = new OTTMorePage(driver);
		
		objHP.OTTMorePageRTP4771Vizio();
		
	 }
} 