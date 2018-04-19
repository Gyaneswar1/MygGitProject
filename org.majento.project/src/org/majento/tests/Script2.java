package org.majento.tests;

import static org.testng.Assert.assertEquals;

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
		String excepted="Your Orders";
		String actual=gettextofyoursorder();
		assertEquals(excepted,actual );	
		System.out.println("test script is pass"+actual);
	}
}
