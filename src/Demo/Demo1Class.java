package Demo;

import org.testng.annotations.Test;

public class Demo1Class {
	
	@Test(priority = 2)
	public void TestCase1() {
		System.out.println("Hello");
	}
	@Test(priority = 1)
	public void TestCase2() {
		System.out.println("Hello 1");
	}
	@Test(priority = 0)
	public void TestCase3() {
		System.out.println("Hello 2");
	}
	
	

}
