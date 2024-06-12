package cucumberStepDefinitions;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DataHandlingApproachw2 {
	public static WebDriver driver;
	@Given("open Chrome Browser")
	public void open_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("open appilication login page")
	public void open_appilication_login_page() {
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@When("enter valid Email data")
	public void enter_valid_email_data(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps();
		String Id = data.get(0).get("Email"); System.out.println("Entered email is :" + Id);
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();email.sendKeys(Id);
	}
	@When("enter valid Password data")
	public void enter_valid_password_data(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps();
		String pw = data.get(0).get("Password"); System.out.println("entered password is :" + pw);
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();pws.sendKeys(pw);  
	}
	@When("click on Login")
	public void click_on_login() throws InterruptedException {
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();Thread.sleep(3000);
	}
	@Then("verify login is success or not")
	public void verify_login_is_success_or_not() {
		WebElement db = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		if (db.isDisplayed()) {	System.out.println("Login is success");	}
		driver.quit();	}}
