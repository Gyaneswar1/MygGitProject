package org.majento.genericlibray;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Base {
	public static WebDriver driver;
	@Parameters("browser")
	public void startbrowser(String Browser,String url) {
		if(Browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else {
			if(Browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				driver=new ChromeDriver();
			}
		
		}
		driver.get(url);
		
	}
	public void MouseHoverAndClick(WebElement elementtohover,WebElement elementtoclick) {
		Actions action=new Actions(driver);
		action.moveToElement(elementtohover).click(elementtoclick).build().perform();
	}
	public void MouseHover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void windowhandles(int windowtoswitchno) {
		String parrentwindow=driver.getWindowHandle();
		//driver.findElement(By.xpath(enterthexpath)).click();
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<>(allwindows);
		driver.switchTo().window(tabs.get(windowtoswitchno));
	}
	public void readexcelsheet(String pathname) throws FileNotFoundException {
		File fs=new File(pathname);
		FileInputStream fs1=new FileInputStream(fs);
		WorkbookFactory wb=new WorkbookFactory();
	}
	public void uploadingfile(String enterthefilepath) throws Exception{
		Robot robot=new Robot();
		StringSelection stringselection=new StringSelection(enterthefilepath);
		ClipboardOwner owner = null;
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,owner);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void webelement(String enterxpath) {
		driver.findElement(By.xpath(enterxpath));
	}
}

	



