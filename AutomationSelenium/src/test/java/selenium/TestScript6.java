package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		String sourcecode = driver.getPageSource();
		String pageid = driver.getWindowHandle();
		WebElement Login = driver.findElement(By.tagName("button"));
		Login.click();
		Thread.sleep(3000);
		String pagetitle = driver.getTitle();
		String pageURL = driver.getCurrentUrl();
		System.out.println("The page tilte is:" + pagetitle);
		System.out.println("The page URL is:" + pageURL);
		System.out.println("The login page id is:" + pageid);
		System.out.println("The login page sourcecode is:" + sourcecode);
		driver.quit();
	}}
