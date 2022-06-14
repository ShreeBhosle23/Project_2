package a13_AutoSuggestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugg_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.sendKeys("pulsar");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		Thread.sleep(3000);
		
		System.out.println(list.get(3).getText());
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getText().equals("pulsar 220"));
			{
				list.get(i).click();
			}
		}
		

	}

}
