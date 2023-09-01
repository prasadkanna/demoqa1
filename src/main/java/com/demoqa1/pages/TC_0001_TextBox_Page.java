package com.demoqa1.pages;

import com.demoqa1.base.BaseClass;

public class TC_0001_TextBox_Page extends BaseClass {
	
	
	public void click_TextBox() throws Exception {
		
		clickJS("clicktextbox_xpath");
		Thread.sleep(1000);
	}
	
	public void fil_TextBox_form(String fname, String email1, String cadd,
			String padd) throws Exception {
		
		clear("fullname_xpath");
		getElement("fullname_xpath").sendKeys(fname);
	
		clear("email_xpath");
		getElement("email_xpath").sendKeys(email1);
		
		clear("caddress_xpath");
		getElement("caddress_xpath").sendKeys(cadd);
		
		clear("paddress_xpath");
		getElement("paddress_xpath").sendKeys(padd);

		clickJS("submit_xpath");
		Thread.sleep(1000);
		
	
		iteratorgetText1("gettext_xpath");
		Thread.sleep(1000);
		
	}

}
