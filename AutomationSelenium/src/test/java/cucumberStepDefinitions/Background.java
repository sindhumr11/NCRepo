package cucumberStepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	public static WebDriver driver;

	@Given("open Chrome Browser in new window")
	public void open_chrome_browser_in_new_window() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("open NC login page in open window")
	public void open_nc_login_page_in_open_window() {
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@When("enter valid email into email field")
	public void enter_valid_email_into_email_field() {
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();email.sendKeys("admin@yourstore.com"); 
	}
	@When("enter valid password into password field")
	public void enter_valid_password_into_password_field() {
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();pws.sendKeys("admin");
	}
	@When("click on Login of the NC")
	public void click_on_login_of_the_nc() throws InterruptedException {
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();Thread.sleep(3000);
	}
	@Then("verify login is success")
	public void verify_login_is_success() {
		WebElement db = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		if (db.isDisplayed()) {	System.out.println("Login is success");	}
		driver.quit();
	}
	@When("enter Email data")
	public void enter_email_data(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps();
		String Id = data.get(0).get("Email"); System.out.println("Entered email is :" + Id);
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();email.sendKeys(Id); 
	}
	@When("enter Password data")
	public void enter_password_data(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps();
		String pw = data.get(0).get("Password"); System.out.println("entered password is :" + pw);
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();pws.sendKeys(pw);  
	}
	@When("click on Loginbutton")
	public void click_on_loginbutton() throws InterruptedException {
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();Thread.sleep(3000); 
	}
	@Then("verify login is successful")
	public void verify_login_is_successful() {
		WebElement db = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		if (db.isDisplayed()) {	System.out.println("Login is success");	}
		driver.quit();	}}