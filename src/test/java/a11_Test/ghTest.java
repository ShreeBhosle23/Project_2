package a11_Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ghTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void m1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test
	public void m2() throws InterruptedException
	{
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		fname.sendKeys("abc");
		
		WebElement srname=driver.findElement(By.xpath("//input[@id='Surname']']"));
		srname.sendKeys("xyz");
		
		WebElement mob=driver.findElement(By.xpath("//input[@id='Mobile']"));
		mob.sendKeys("1234567899");
		
		WebElement usrname=driver.findElement(By.xpath("//input[@id='Username']"));
		usrname.sendKeys("@tto");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
		pass.sendKeys("abc@123");
		
		WebElement cnfpass=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		cnfpass.sendKeys("abc@123");
		
		Thread.sleep(3000);
		
		WebElement subBtn=driver.findElement(By.xpath("//input[@id='submit']"));
		subBtn.click();
		
	}
	
	
	
	
	
}
