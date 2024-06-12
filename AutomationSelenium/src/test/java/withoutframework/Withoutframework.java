package withoutframework;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutframework {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement Email = driver.findElement(By.id("Email"));
		WebElement Pwd = driver.findElement(By.name("Password"));
		WebElement Login = driver.findElement(By.tagName("button"));

		if (Email.isDisplayed()) {
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
		Pwd.clear();
		Pwd.sendKeys("admin");
		Login.click();
		Thread.sleep(3000);
			
		
		}else {
			System.out.println("Login Page not loaded");
		}
		
		

		
		
		
		
	}

}
