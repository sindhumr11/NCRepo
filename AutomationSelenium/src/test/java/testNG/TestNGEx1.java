package testNG;

import org.testng.annotations.Test;

public class TestNGEx1 {

	@Test(groups = "Smoke")
	public void method1() {
		System.out.println("Hello TestNG ");
	}

}
