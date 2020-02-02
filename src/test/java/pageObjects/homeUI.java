package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassmethods.base;

public class homeUI extends base {
	
	public homeUI() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement btnCreateNew;
	
	@FindBy(xpath="//a[@href='https://demo.snipeitapp.com/hardware/create']")
	private WebElement btnAsset;
	
	@FindBy(xpath="//a[@href='https://demo.snipeitapp.com/licenses/create']")
	private WebElement btnLicense;
	
	@FindBy(xpath="//a[@href='https://demo.snipeitapp.com/accessories/create']")
	private WebElement btnAccessory;
	
	@FindBy(xpath="//a[@href='https://demo.snipeitapp.com/consumables/create']")
	private WebElement btnConsumable;
	
	@FindBy(xpath="//a[@href='https://demo.snipeitapp.com/users/create']")
	private WebElement btnUser;

	public WebElement getBtnCreateNew() {
		return btnCreateNew;
	}

	public WebElement getBtnAsset() {
		return btnAsset;
	}

	public WebElement getBtnLicense() {
		return btnLicense;
	}

	public WebElement getBtnAccessory() {
		return btnAccessory;
	}

	public WebElement getBtnConsumable() {
		return btnConsumable;
	}

	public WebElement getBtnUser() {
		return btnUser;
	}

	
}
