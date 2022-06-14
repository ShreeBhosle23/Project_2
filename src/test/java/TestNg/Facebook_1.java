package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void BM() {
        WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	          //C:\Users\Lenovo\eclipse-workspace\Project_2
	@Test
	public void Tc1() {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ABC");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("123");
	}
	@Test
	public void Tc2() {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("xyz");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("456");
	}
	@Test
	public void Tc3() {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("pqr");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("789");
	}
	@Test
	public void Tc4() {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("uvw");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("654");
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}

}
