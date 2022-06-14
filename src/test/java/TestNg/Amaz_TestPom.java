package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_Object.Amaz_LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amaz_TestPom {
	
	@Test
	public void VerifyTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Amaz_LoginPom login=PageFactory.initElements(driver, Amaz_LoginPom.class);
		
		login.getSearchbox().sendKeys("Samsung Mobiles");
		login.getSearchBtn().click();
		
		
	}

}
