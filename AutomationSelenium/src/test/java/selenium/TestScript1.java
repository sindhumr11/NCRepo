package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Open NC login page in opened browser.
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		// Maximize the browser.
		driver.manage().window().maximize();
		
		//wait for 5sec
		Thread.sleep(5000);
		
		// Close the NC/entire browser.
		driver.quit();
	}

}
