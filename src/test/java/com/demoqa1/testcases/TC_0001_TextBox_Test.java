package com.demoqa1.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.demoqa1.pages.TC_0001_TextBox_Page;
import com.demoqa1.utilities.Utility;

public class TC_0001_TextBox_Test {
	
	@Test(priority = 1, groups = {"smoke","regression","sanity","functional"})
	public void click_TextBox() {
		
		TC_0001_TextBox_Page tb = new TC_0001_TextBox_Page();
		tb.click_TextBox();
		
	}
	
	@Test(priority = 2, dataProviderClass=Utility.class, dataProvider = "demoQAdata", groups = {"smoke","regression","sanity","functional"})
	public void fil_TextBox_form(Hashtable<String, String> data) throws Exception {
		
		TC_0001_TextBox_Page tb = new TC_0001_TextBox_Page();
		tb.fil_TextBox_form(data.get("fname"), data.get("email"),
				data.get("cadd"), data.get("padd"));
		
	}

}
