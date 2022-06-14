package Page_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Amaz_LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(how=How.XPATH,using="//input[@id='nav-search-submit-button']")
	private WebElement searchBtn;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	
}
