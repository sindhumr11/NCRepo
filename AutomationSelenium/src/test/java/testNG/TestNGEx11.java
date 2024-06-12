package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGEx11 {
	@Parameters({ "email", "password" })
	@Test
	public void ncLogin(String un, String pws) {

		System.out.println(un);
		System.out.println(pws);
	}
}
