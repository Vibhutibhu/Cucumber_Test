package stepDEfinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	PageObject po;
	public static WebDriver driver;

	@Given("^Navigate to Home page$")
	public void homepage() // throws Throwable
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		po = new PageObject(driver);
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 
	public void entersunamepwd(String uname, String pwd) {	 
	po.signin.click();	 
	po.username.sendKeys(uname);	
	po.password.sendKeys(pwd);
	//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	po.login.click();
	driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	}

	@Then("^user logged in successfully$")
	public void userloggin() // throws Throwable

	{
		System.out.println("User login successfully");
	}

	/*@When("^Larry searches below products in search box:$")
	public void searchproducts(DataTable dt) {
		List<String> product = dt.asList(String.class);
		for (String s : product) {
			driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("//a[@href='fetchcat.htm']")).click();
		}
		// List<DataTable<String,string>>
		// throw new cucumber.api.PendingException();
	}
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 
	public void entersunamepwd(String uname, String pwd) {
	 
	po.signin.click();
	 
	po.username.sendKeys(uname);
	 
	po.password.sendKeys(pwd);
	 
	po.login.click();
	}


	@Then("^product should be added in the cart if available$")
	public void productadd() {
		// throw new cucumber.api.PendingException();
	}*/

}
