package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("saisindu37@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1919199144821");
		driver.findElement(By.id("loginbutton")).click();
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_RY\"]")).sendKeys("Hi");
        
        
		
        		
        		
	}

}
