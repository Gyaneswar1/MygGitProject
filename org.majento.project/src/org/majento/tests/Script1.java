package org.majento.tests;



import static org.testng.Assert.assertEquals;

import org.majento.basetest.MajentoLogin;
import org.majento.genericlibray.Base;
import org.majento.pom.MajentoElementsLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Script1 extends MajentoLogin {
	
@Test(priority=1)
public void verifyloginofmajento() {
	startbrowser("firefox","https://amazon.in");
	logintomajento("b.gyaneswar91@gmail.com", "gyana@7682968092");
String excepted="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
String actualresult=driver.getTitle();
assertEquals(excepted,actualresult );
System.out.println("test script is pass"+actualresult);
driver.close();
}

@Test(priority=2)
public void verifyloginofmajentoinvalid() {
	startbrowser("firefox","https://amazon.in");
	MajentoLogin majentologinref=new MajentoLogin();
	majentologinref.logintomajento("b.gyaneswar91@gmail.com", "gyana@7682");
	MajentoElementsLogin majentopageref=PageFactory.initElements(driver, MajentoElementsLogin.class);
	String excepted="Your password is incorrect";
	String actual=majentopageref.invalidpswtext.getText();
	assertEquals(excepted,actual );
	System.out.println("test script is pass"+actual);
}
}