package TestNg;

import org.testng.annotations.Test;

public class Prty_1 {
	
	// By default, cases execute alphabetically as per their name 
	
	@Test(priority=3)
	public void Tc_a() {
		System.out.println("TC_a");
	}
	@Test(priority=1)   // as priority 1 given to a, test case a will execute 1st
	public void Tc_b() {
		System.out.println("TC_b");
	}
	@Test(priority=4,enabled=false)    // c will not execute
	public void Tc_c() {
		System.out.println("TC_c");
	}
	@Test(priority=2)
	public void Tc_d() {
		System.out.println("TC_d");
	}

}
