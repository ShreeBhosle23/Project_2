package a11_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abc {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();  //setup method
		
		WebDriver driver=new ChromeDriver();
   // here we create ref.of WebDriver interface and object of ChromeDriver class
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ABC");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
		
		

	}

}
