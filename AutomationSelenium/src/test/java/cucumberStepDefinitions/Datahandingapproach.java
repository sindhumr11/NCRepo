package cucumberStepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Datahandingapproach {
	public static WebDriver driver;

	@Given("open chrome browser")
	public void open_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("open NC login page with valid url")
	public void open_nc_login_page_with_valid_url() {
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@When("enter valid email data {string} into email field")
	public void enter_valid_email_data_into_email_field(String Id) {
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys(Id);
	}
	@When("enter valid password data {string} into password field")
	public void enter_valid_password_data_into_password_field(String pwd) {
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();
		pws.sendKeys(pwd);
	}
	@When("click on login button to do login")
	public void click_on_login_button_to_do_login() {
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();
	}
	@Then("verify login success or not")
	public void verify_login_success_or_not() {
		System.out.println("Login is success");
		driver.quit();
	}}
