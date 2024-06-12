package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript8 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com",Keys.TAB);
		WebElement Pwd = driver.findElement(By.name("Password"));
		Pwd.clear();
		Pwd.sendKeys("admin");
		WebElement Login = driver.findElement(By.tagName("button"));
		Login.click();
		Thread.sleep(2000);
		String text = Login.getText();
		System.out.println("The login button text is " + text);
//		String value = Login.getAttribute("tagName");
//		System.out.println("The login button text is " + value);
//		String tagname = Login.getTagName();
//		System.out.println(" The login button text is " + tagname);
		
		driver.quit();
	}
}
