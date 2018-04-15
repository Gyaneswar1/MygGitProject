package org.majento.tests;

import org.majento.basetest.MajentoHome;
import org.majento.pom.MajentoElementHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Script2 extends MajentoHome{
	@Test
	public void verifyorderpage() throws InterruptedException {
		startbrowser("firefox","https://amazon.in");
		logintomajento("b.gyaneswar91@gmail.com", "gyana@7682968092");
		clickorder();
		String expected="Your Orders";
		String actual=gettextofyoursorder();
		if(expected.equals(actual)) {
			System.out.println("textscript is pass"+actual);
		}else {
			System.out.println("textscript is fail");
		}
		driver.close();
	}
	
}
