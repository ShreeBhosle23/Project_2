package a11_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();      
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ABC");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("123");
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();
		Thread.sleep(2500);
		
		
	}

}
