package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScript3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
		WebElement Pwd = driver.findElement(By.name("Password"));
		Pwd.clear();
		Pwd.sendKeys("admin");
		WebElement Login = driver.findElement(By.tagName("button"));
		Login.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
