package Page_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_pass;

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_pass() {
		return txt_pass;
	}

	

}
