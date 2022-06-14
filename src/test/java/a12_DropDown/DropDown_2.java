package a12_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country_drp = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select = new Select(country_drp);
		
		//String defaultValue = select.getFirstSelectedOption().getText();
		//System.out.println(defaultValue);
		
		select.selectByIndex(3);
		Thread.sleep(2000);
		
		select.selectByValue("ANTARCTICA");
		Thread.sleep(2000);
		
		select.selectByVisibleText("BAHAMAS");  //use only this method in organization
		Thread.sleep(2000);

		List<WebElement> list = select.getOptions();
		
		for(int i=0; i<list.size(); i++)
		{
		   String option = list.get(i).getText();
		   System.out.println(option);
		   
		   if(option.equals("CANADA"))
		   {
			   select.selectByVisibleText("CANADA");
		   }
		   else
		   {
			   System.out.println("There is no such option CANADA");
		   }
		}
		
		
	}

}
