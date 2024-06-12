package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TestScript2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Open NC login page in opened browser.
		driver.get("https://admin-demo.nopcommerce.com/login");
		// Maximize the browser.
		driver.manage().window().maximize();
		//clear the data in Email field
		driver.findElement(By.id("Email")).clear();
		//enter the valid data in Email field
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		//clear the data in password field
		driver.findElement(By.name("Password")).clear();
		//enter the valid data in password field
		driver.findElement(By.name("Password")).sendKeys("admin");
		//click on login button
		driver.findElement(By.tagName("button")).click();
		//wait for 5sec
		Thread.sleep(5000);
		// Close the NC/entire browser.
		driver.quit();
	}
}
