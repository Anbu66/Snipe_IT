package baseclassmethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Complete\\Snipeitapp\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://snipeitapp.com/");

	}

	public void quitbrowser() {
		driver.quit();
	}

	public void getTitleofpage() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void moveToWindow(String winname) {
		String parent = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String listOfWin : allWin) {
			if (listOfWin.equals(winname));
				
			driver.switchTo().window(listOfWin);
		}
	}

	public void pressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
