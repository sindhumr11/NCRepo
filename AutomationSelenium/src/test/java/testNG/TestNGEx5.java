package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEx5 {

	@Test(groups = "Smoke")
	public void method1() {
		Assert.fail();
		System.out.println("Hello method1 ");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void method2() {
		System.out.println("Hello method2 ");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void method3() {
		System.out.println("Hello method3 ");
	}
}
