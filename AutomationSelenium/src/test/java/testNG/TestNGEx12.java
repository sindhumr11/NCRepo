package testNG;

import org.testng.annotations.DataProvider;


public class TestNGEx12 {

	@DataProvider(name = "data")
	public Object[][] method1() {

		Object[][] testdata = new Object[2][2];
		testdata[0][0] = "admin@yourstore.com";
		testdata[0][1] = "admin";

		testdata[1][0] = "test@yourstore.com";
		testdata[1][1] = "test123";

		return testdata;

	}

}
