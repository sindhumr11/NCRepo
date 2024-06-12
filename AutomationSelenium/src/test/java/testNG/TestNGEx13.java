package testNG;

import org.testng.annotations.Test;

public class TestNGEx13 {

	
	@Test(dataProvider = "NCLoginTestdata", dataProviderClass = TestNGEx12.class)
	public void ncLogin2(String email, String password) {

		System.out.println(email);
		System.out.println(password);
	}

}
