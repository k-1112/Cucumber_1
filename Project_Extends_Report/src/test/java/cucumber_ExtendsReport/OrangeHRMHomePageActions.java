package cucumber_ExtendsReport;

import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomePageActions {
OrangeHRMHomePageLocators homePageLocators = null;
 
	
	public  OrangeHRMHomePageActions() {  //constructor
		this.homePageLocators = new OrangeHRMHomePageLocators();
		PageFactory.initElements(BaseClass.getDriver(),homePageLocators);
	}
	public String getVerifyText() {
		return homePageLocators.nextPage.getText();
	}
 
}