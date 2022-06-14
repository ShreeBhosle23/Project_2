package a11_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Tc_001 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.1.1");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		//driver.close();   // close current browser
		//driver.quit();    // all open browser due ---Automation close --while parallel testing

		// diff. between get and navigate method
		    //get----> hit webpage--->wait until all element load
		//navigate---> hit webpage--->doesn't wait to load--->back,forward,refresh 
	
	}

}
