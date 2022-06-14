package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {

	@BeforeSuite
	public void BS() {
		System.out.println("BS");
	}
	@BeforeClass
	public void BC(){
		System.out.println("BC");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BT");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("BM");
	}
	
	@Test
	public void Tc1() {
		System.out.println("TC_001");
	}
	@Test
	public void Tc2() {
		System.out.println("TC_002 ");
	}
	@Test
	public void Tc3() {
		System.out.println("TC_003 ");
	}
	@Test
	public void Tc4() {
		System.out.println("TC_004 ");
	}
	@AfterMethod
	public void AM() {
		System.out.println("AM");
	}
	@AfterTest
	public void AT() {
		System.out.println("AT");
	}
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}
}
