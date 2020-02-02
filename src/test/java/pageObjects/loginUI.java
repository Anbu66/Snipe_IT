package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassmethods.base;

public class loginUI extends base {
	
	//public static WebDriver driver;
	
	public loginUI() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@href='https://snipeitapp.com/demo']")
	private WebElement demoButton;

	@FindBy (xpath="//a[@href='https://demo.snipeitapp.com']")
	private WebElement launchDemo;

	@FindBy (xpath="//input[@name='username']")
	private WebElement txtUsername;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement txtPassword;
	
	@FindBy (xpath="//button[text()='Login']")
	private WebElement clkLoginbtn;

	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getDemoButton() {
		return demoButton;
	}

	public WebElement getLaunchDemo() {
		return launchDemo;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getClkLoginbtn() {
		return clkLoginbtn;
	}
	}
