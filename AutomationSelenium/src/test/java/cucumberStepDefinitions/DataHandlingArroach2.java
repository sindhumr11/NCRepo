package cucumberStepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DataHandlingArroach2 {
	public static WebDriver driver;
	@Given("open chrome browser in window")
	public void open_chrome_browser_in_window() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("open NC login page with valid URL")
	public void open_nc_login_page_with_valid_URL() {
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@When("enter  {string} data into email field")
	public void enter_data_into_email_field(String Id) {
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys(Id);
	}
	@When("enter {string} data into password field")
	public void enter_data_into_password_field(String pwd) {
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();
		pws.sendKeys(pwd);
	}
	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();
		Thread.sleep(3000);
	}
	@Then("verify application is successfully login or not")
	public void verify_application_is_successfully_login_or_not() {
		WebElement db = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		if (db.isDisplayed()) {
			System.out.println("Login is success");		}
		driver.quit();	}
}
