package a15_ActionsKey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(email, Keys.SHIFT).sendKeys("abc").keyDown(email, Keys.SHIFT).build().perform();
		//we have to give same input of email to password
		
		//ctrl a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//ctrl c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		
		
		
		//ctrl v in password
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		

	}

}
