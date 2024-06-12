package testNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGEx2 {
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("Hello BeforeSuiteMethod");	}
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("Hello BeforeClassMethod");	}
	@BeforeTest
	public void beforetestMethod() {
		System.out.println("Hello BeforeTestMethod");	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hello BeforeMethod");	}
	@Test(groups = "Regression")
	public void testMethod() {
		System.out.println("Hello TestMethod");	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Hello AfterMethod");	}
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("Hello AfterClassMethod");	}
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("Hello AfterTestMethod");	}
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("Hello AfterSuiteMethod");	}
}
