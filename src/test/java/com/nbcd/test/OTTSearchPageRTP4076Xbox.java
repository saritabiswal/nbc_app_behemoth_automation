package com.nbcd.test;

import org.testng.annotations.Test;

import com.nbcd.GenericLib.GetWebDriverInstance;
import com.nbcd.pages.OTTSearchPage;

public class OTTSearchPageRTP4076Xbox extends GetWebDriverInstance
{	
	@Test
	 public void NetworksPageRTP4088() throws Exception 
	 {

		OTTSearchPage objHP = new OTTSearchPage(driver);
		
		objHP.OTTSearchPageRTP4076xbox();
		
	 }
} 