package com.demoqa1.testcases;

import org.testng.annotations.Test;

import com.demoqa1.pages.TC_0001_TextBox_Page;

public class TC_0001_TextBox_Test {
	
	@Test(groups = {"smoke","regression","sanity","functional"})
	public void click_TextBox() {
		
		TC_0001_TextBox_Page tb = new TC_0001_TextBox_Page();
		tb.click_TextBox();
		
	}

}
