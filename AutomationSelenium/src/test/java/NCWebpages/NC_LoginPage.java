package NCWebpages;

import org.openqa.selenium.Beta;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmentable;
import org.openqa.selenium.remote.http.HttpClientName;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactoryFinder;

public class NC_LoginPage {

	@CacheLookup
	@FindAll({ @FindBy(name = "Email"), @FindBy(id = "Email") })
	WebElement email;

}
