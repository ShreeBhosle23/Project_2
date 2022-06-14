package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_Object.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_Pom {
	
	@Test
	public void TC1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		LoginPom login = PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("ABC");
		login.getTxt_pass().sendKeys("123123");
		
	}
	
	
	
}
