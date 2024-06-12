package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGEx3 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@Test(groups = "Smoke")
	public void ncLogin() throws InterruptedException {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
