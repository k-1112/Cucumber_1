package com.addlogin;

import org.openqa.selenium.support.PageFactory;

public class HomepageActions {
	HomepageLocators homepagelocators = null;
	
	public HomepageActions(){
	this.homepagelocators = new HomepageLocators();
	PageFactory.initElements(HelperClass.getDriver(),homepagelocators);
}
	public String getVerifyText() {
		return homepagelocators.Dashnoard.getText();
}		
}

