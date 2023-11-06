package cucumber_ExtendsReport;

import org.openqa.selenium.support.PageFactory;



public class LoginPageActions {
	LoginPageLocator loginPageLocators = null;
	String strUserName, strPassword;
	
	public LoginPageActions() {  //constructor
		this.loginPageLocators = new LoginPageLocator();
		PageFactory.initElements(BaseClass.getDriver(),loginPageLocators);
	}
	
	//set username in textbox
	public void setUserName(String strUsername) {
		loginPageLocators.userName.sendKeys(strUsername);
	}
	
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String strUsername, String strPassWord) {
		this.setUserName(strUsername);
		this.setPassword(strPassWord);
	}
}
