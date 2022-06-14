package a11_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement Textbox=driver.findElement(By.id("twotabsearchtextbox"));
	Textbox.sendKeys("Samsung new mobiles");
	
	WebElement Searchbtn=driver.findElement(By.id("nav-search-submit-button"));
	Searchbtn.click();
	Thread.sleep(2500);
	
	driver.close();
		
	

	}

}
