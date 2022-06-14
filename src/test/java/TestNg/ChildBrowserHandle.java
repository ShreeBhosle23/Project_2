package TestNg;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserHandle {

	@Test
	public void TestBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement ClickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		String parentwindID=driver.getWindowHandle();
		System.out.println(parentwindID);
		
		ClickHere.click();
		
		Set<String> setlist=driver.getWindowHandles();
		System.out.println(setlist);
		
		Iterator<String> it= setlist.iterator();
		
		while(it.hasNext()) 
		{
			String childwindID=it.next();
			if(!parentwindID.equalsIgnoreCase(childwindID)) 
			{
				driver.switchTo().window(childwindID);
				Thread.sleep(2000);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("test");
				Thread.sleep(3000);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parentwindID);
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
