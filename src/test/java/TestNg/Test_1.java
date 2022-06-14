package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_1 {
	
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

}
