package cucumberStepDefinitions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DataHandlingApproach3 {
	public static WebDriver driver;
	@Given("open ChromeBrowser")
	public void open_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("open login page")
	public void open_login_page() {
		driver.get("https://admin-demo.nopcommerce.com/login");

	}
	@When("enter  Email data in email field")
	public void enter_email_data_in_email_field(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		String Id = data.get(0).get(0); System.out.println("Entered email is :" + Id);
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();email.sendKeys(Id);
	}
	@When("enter Password data in password field")
	public void enter_password_data_in_password_field(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		String pw = data.get(0).get(0); System.out.println("entered password is :" + pw);
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();pws.sendKeys(pw);
	}
	@When("click on LoginButton")
	public void click_on_login_button() throws InterruptedException {
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();Thread.sleep(3000);
	}
	@Then("verify application login is success or not")
	public void verify_application_login_is_success_or_not() {
		WebElement db = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		if (db.isDisplayed()) {	System.out.println("Login is success");	}
		driver.quit();	}}
