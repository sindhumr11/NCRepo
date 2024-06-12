package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScript9 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com",Keys.TAB);
		Thread.sleep(2000);
		String text = Email.getText();
		System.out.println("The Email field text is " + text);
		String value = Email.getAttribute("Name");
		System.out.println("The Email field name is " + value);
		String tagname = Email.getTagName();
		System.out.println("The Email field tag name is " + tagname);

		driver.quit();
	}
}
