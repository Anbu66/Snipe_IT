package testCases;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclassmethods.base;
import pageObjects.createAssetUI;
import pageObjects.homeUI;
import pageObjects.loginUI;
import util.getdatafromexcelsheet;

public class createAsset extends base {

	// static WebDriver driver;

	@BeforeSuite
	public void browserLaunch() {
		launchbrowser();
		System.out.println("end of beforesuite");
	}

	
	@DataProvider
	public Object[][] dataFromExcel() throws FileNotFoundException, InvalidFormatException, IOException {
		Object[][] data = getdatafromexcelsheet.getdata("DataForAsset");
		return data;
	}

	@Test(dataProvider = "dataFromExcel")
	public void createAssetTC(String company, String model, String status, String serial, String assetname,
			String purchasedate, String supplier, String ordernum, String purchasecost, String warrenty, String notes,
			String defloc) throws AWTException, InterruptedException {
		System.out.println("In Test");
		loginUI login = new loginUI();
		login.getDemoButton().click();
		login.getLaunchDemo().click();
		getTitleofpage();
		moveToWindow("Snipe-IT Asset Management Demo");
		login.getTxtUsername().sendKeys("admin");
		login.getTxtPassword().sendKeys("password");
		login.getClkLoginbtn().click();

		homeUI home = new homeUI();
		home.getBtnCreateNew().click();
		home.getBtnAsset().click();

		createAssetUI ca = new createAssetUI();
		ca.getDdModel().click();
		ca.getDdSearch().sendKeys(model);
		Thread.sleep(3000);
		pressEnter();

		ca.getDdCompany().click();
		ca.getDdSearch().sendKeys(company);
		Thread.sleep(3000);
		pressEnter();

		ca.getDdStatus().click();
		ca.getDdSearch().sendKeys(status);
		Thread.sleep(3000);
		pressEnter();

		ca.getDdCheckout().click();
		ca.getDdSearch().sendKeys("a");
		Thread.sleep(3000);
		pressEnter();

		ca.getDdSupplier().click();
		ca.getDdSearch().sendKeys(supplier);
		Thread.sleep(3000);
		pressEnter();

		ca.getDdDefaultLoc().click();
		ca.getDdSearch().sendKeys(defloc);
		Thread.sleep(3000);
		pressEnter();

		ca.getTxtSerial().sendKeys(serial);
		ca.getTxtAssetName().sendKeys(assetname);
		ca.getTxtOrdernum().sendKeys(ordernum);
		ca.getTxtPurchaseCost().sendKeys(purchasecost);
		ca.getTxtWarranty().sendKeys(warrenty);
		ca.getTxtNotes().sendKeys(notes);
		ca.getdPurchaseDate().sendKeys(purchasedate);
		// ca.getBtnSave().click();
	}
	
	/*
	 * @AfterSuite public void closebrowser() { quitbrowser(); }
	 */

}