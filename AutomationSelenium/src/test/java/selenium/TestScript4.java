package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login");
		
		List<WebElement> allinputs = driver.findElements(By.xpath("//input/parent::div"));
		
		int count = allinputs.size();
		
		System.out.println("All inputs tag count is " + count);	
		
		
		
		}
		
	}

