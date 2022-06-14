package a13_AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugg_3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("software");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		Thread.sleep(2000);
		
		System.out.println(list.get(2).getText());
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getText().equals("software testing"))
			{
				list.get(i).click();
			}
		}
	}

}
