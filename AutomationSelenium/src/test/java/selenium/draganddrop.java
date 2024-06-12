package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable");Thread.sleep(5000);
		
		driver.switchTo().frame(0);	Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("//p[contains(text(), 'Drag me to my target')]"));

		WebElement target = driver.findElement(By.xpath("//p[contains(text(), 'Drop here')]"));
		
		action.clickAndHold(source).perform();
		
		action.moveToElement(target).release().perform();Thread.sleep(5000);

		//action.dragAndDrop(source, target).perform();

		driver.switchTo().defaultContent();	Thread.sleep(5000);

		driver.quit();
	}}
