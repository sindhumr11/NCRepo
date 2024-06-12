package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class doubleclick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		action.moveToElement(driver.findElement(By.tagName("strong"))).perform();
		action.doubleClick().perform();
		WebElement Login = driver.findElement(By.tagName("button"));
		Login.click();Thread.sleep(5000);
		driver.quit();
	}

}
