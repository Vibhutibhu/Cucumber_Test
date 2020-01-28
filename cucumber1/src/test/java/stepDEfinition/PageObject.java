package stepDEfinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;

	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

    @FindBy(linkText="SignIn")
	//@FindBy
	public WebElement signin;
	@FindBy(name = "userName")
	public WebElement username;
	@FindBy(name = "password")
	public WebElement password;
	@FindBy(name = "Login")
	public WebElement login;
	//@FindBy(By.name(""))
	//public WebElement 

}
