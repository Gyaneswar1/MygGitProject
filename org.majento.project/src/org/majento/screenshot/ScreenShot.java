package org.majento.screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.majento.genericlibray.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot {

	public static void takeascreenshot(WebDriver driver,String screenshotname) {
	try {
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File scr=efw.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("./ScreenShot/"+screenshotname+".png"));
	} catch (Exception e) {
		System.out.println("exception while taking screenshot"+e.getMessage());
	}
	}
}
