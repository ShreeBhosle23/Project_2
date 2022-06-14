package a14_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destn = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, destn).build().perform(); 
		

	}

}
