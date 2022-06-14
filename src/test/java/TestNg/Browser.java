package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	WebDriver driver;
	
	@BeforeMethod
	public void BM() {
        WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Tc1() {
		System.out.println("TC_001");
	}
	@Test
	public void Tc2() {
		System.out.println("TC_002 ");
	}
	@Test
	public void Tc3() {
		System.out.println("TC_003 ");
	}
	@Test
	public void Tc4() {
		System.out.println("TC_004 ");
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}

}
