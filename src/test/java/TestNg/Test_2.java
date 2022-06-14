package TestNg;

import org.testng.annotations.Test;

public class Test_2 {
	
	@Test(priority=2,enabled=false)
	public void Tc_a() {
		System.out.println("TC_a");
	}
	@Test(priority=1)   // as priority 1 given to a, test case a will execute 1st
	public void Tc_b() {
		System.out.println("TC_b");
	}
	@Test(priority=3)     
	public void Tc_c() {
		System.out.println("TC_c");
	}
	@Test(priority=4,invocationCount=2)   // d will execute 2 times
	public void Tc_d() {
		System.out.println("TC_d");
	}
	@Test(dependsOnMethods="Tc_c")
	public void Tc_e() {
		System.out.println("TC_e");
	}
	@Test(dependsOnMethods="Tc_a")
	public void Tc_f() {
		System.out.println("TC_f");
	}
}
