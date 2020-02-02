package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassmethods.base;

public class createAssetUI extends base {

	public createAssetUI() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDdCompany() {
		return ddCompany;
	}

	public WebElement getTxtAssetTag() {
		return txtAssetTag;
	}

	public WebElement getDdModel() {
		return  ddModel;
	}

	public WebElement getTxtSerial() {
		return txtSerial;
	}

	

	public WebElement getDdSearch() {
		return ddSearch;
	}

	@FindBy(xpath = "(//span[@class='select2-selection__placeholder needsclick'])[1]")
	private WebElement ddCompany;

	@FindBy(xpath = "//input[@name='asset_tag']")
	private WebElement txtAssetTag;

	@FindBy(xpath = "//span[@id='select2-model_select_id-container']")
	private WebElement ddModel;

	@FindBy(xpath = "//input[@id='serial']")
	private WebElement txtSerial;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement ddSearch;

	@FindBy(xpath = "//span[@title='Select Status']")
	private WebElement ddStatus;

	public WebElement getDdStatus() {
		return ddStatus;
	}

	public WebElement getTxtAssetName() {
		return txtAssetName;
	}

	public WebElement getdPurchaseDate() {
		return dPurchaseDate;
	}

	public WebElement getDdSupplier() {
		return ddSupplier;
	}

	public WebElement getTxtOrdernum() {
		return txtOrdernum;
	}

	public WebElement getTxtPurchaseCost() {
		return txtPurchaseCost;
	}

	public WebElement getTxtWarranty() {
		return txtWarranty;
	}

	public WebElement getTxtNotes() {
		return txtNotes;
	}

	public WebElement getDdDefaultLoc() {
		return ddDefaultLoc;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	@FindBy(xpath = "//input[@id='name']")
	private WebElement txtAssetName;

	@FindBy(xpath = "//input[@id='purchase_date']")
	private WebElement dPurchaseDate;

	@FindBy(xpath = "//span[@id='select2-supplier_select-container']")
	private WebElement ddSupplier;

	@FindBy(xpath = "//input[@id='order_number']")
	private WebElement txtOrdernum;

	@FindBy(xpath = "//input[@id='purchase_cost']")
	private WebElement txtPurchaseCost;

	@FindBy(xpath = "//input[@id='warranty_months']")
	private WebElement txtWarranty;

	@FindBy(xpath = "//textarea[@id='notes']")
	private WebElement txtNotes;

	@FindBy(xpath = "//span[@id='select2-rtd_location_id_location_select-container']")
	private WebElement ddDefaultLoc;

	public WebElement getDdCheckout() {
		return ddCheckout;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement btnSave;
	
	@FindBy(xpath = "//span[@id='select2-assigned_user_select-container']")
	private WebElement ddCheckout;
}
