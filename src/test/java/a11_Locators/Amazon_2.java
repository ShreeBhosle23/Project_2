package a11_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement SearchBox=driver.findElement(By.name("field-keywords"));
		SearchBox.sendKeys("Sparx Sandles");
		
		WebElement SearchBtn=driver.findElement(By.id("nav-search-submit-button"));
		SearchBtn.click();
		Thread.sleep(2500);
				
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		driver.close();
		
		
		
		
		
	

	}

}
