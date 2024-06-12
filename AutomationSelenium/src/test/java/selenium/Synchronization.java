package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws Exception {

		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		// driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button"))));
		 
				
	}

}
