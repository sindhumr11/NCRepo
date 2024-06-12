package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEx9 {

	@Test
	public void testMethod() {

		int a = 10;
		int b = 10;

		Assert.assertEquals(a == b, false, "both are same");
		System.out.println("Hello");
		System.out.println("bye");

	}
}
