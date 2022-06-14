package a11_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_Xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		// xpath -----> absolute xpath
		
		email.sendKeys("abc");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]")); // Relative Xpath
		pass.sendKeys("123456");

		WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']")); // Relative Xpath by attributes
	    loginBtn.click();
		
		
		//WebElement frgtpass=driver.findElement(By.xpath("//a[text()='Forgotten password?']")); // Relative Xpath by text
	   //frgtpass.click();
		
	    
	    
	                                    
	    
	}
	

}
