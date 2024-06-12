package testNG;

import org.testng.annotations.Test;

public class TestNGEx8 {

	@Test(invocationCount = 10000, invocationTimeOut = 100)
	public void testMethod() {
		System.out.println("IT Industry ");
	}

}
