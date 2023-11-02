package com.addlogin;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginpageLocators loginPageLocators;
	
		//String strUsername, strPassword;
		
		public LoginPageActions() {
			this.loginPageLocators = new LoginpageLocators();
			PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
		}
		
		public void setUserName(String strUsername) {
			loginPageLocators.username.sendKeys(strUsername);
		}
		public void setPassword(String strPassword) {
			loginPageLocators.password.sendKeys(strPassword);
		}
		public void clickLogin() {
			loginPageLocators.login.click();
		}
			public void start(String strUsername, String strPassWord) {
			setUserName(strUsername);
			setPassword(strPassWord);
		}
	
	}
