package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.TestNGEx15.class)
public class TestNGEx14 {
	WebDriver driver;

	@Test
	public void faceBook() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void googleApp() throws InterruptedException {
		Assert.fail();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(dependsOnMethods = "googleApp")
	public void linkedInApp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
