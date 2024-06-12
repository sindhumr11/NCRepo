package testNG;

import org.testng.annotations.Test;

public class TestNGEx6 {

	@Test(priority = 1)
	public void Login() {
		System.out.println("Hello method1 ");
	}

	@Test(priority = 2)
	public void Dashboard() {
		System.out.println("Hello method2 ");
	}

	@Test(priority = 3)
	public void catalog() {
		System.out.println("Hello method3 ");
	}
}
