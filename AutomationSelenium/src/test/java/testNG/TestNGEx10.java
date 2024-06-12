package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGEx10 {

	@Test
	public void testMethod() {

		int a = 10;
		int b = 20;

		SoftAssert soft = new SoftAssert(); 
 		soft.assertEquals(a == b, true, "both are not same");
		System.out.println("Hello");
		System.out.println("bye");
		soft.assertAll();

	}
}
