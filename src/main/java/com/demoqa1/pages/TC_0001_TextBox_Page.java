package com.demoqa1.pages;

import com.demoqa1.base.BaseClass;

public class TC_0001_TextBox_Page extends BaseClass {
	
	
	public void click_TextBox() {
		
		clickJS("clicktextbox_xpath");
	}
	
	public void fil_TextBox_form(String fname, String email, String cadd,
			String padd) throws Exception {
		
		getElement("fullname_xpath").sendKeys(fname);
		getElement("email").sendKeys(email);
		getElement("caddress_xpath").sendKeys(cadd);
		getElement("paddress_xpath").sendKeys(padd);
		Thread.sleep(2000);
		clickJS("submit_xpath");
	}

}
