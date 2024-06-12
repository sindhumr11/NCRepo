package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript7 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		String browserid = driver.getWindowHandle();
		
		WebElement Login = driver.findElement(By.tagName("button"));
		
		Login.click();
		
		Thread.sleep(3000);
		
		WebElement Help = driver.findElement(By.xpath(""));

		Help.click();
		
		Set<String>browserids = driver.getWindowHandles();
		
		System.out.println("The login page browserid is:" + browserid);

		System.out.println("The login page browserid is:" + browserids);
		
		driver.quit();
	}
}
