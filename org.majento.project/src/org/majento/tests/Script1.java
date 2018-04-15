package org.majento.tests;



import org.majento.basetest.MajentoLogin;
import org.majento.genericlibray.Base;
import org.majento.pom.MajentoElementsLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Script1 extends Base {
	
@Test(priority=1)
public void verifyloginofmajento() {
	startbrowser("firefox","https://amazon.in");
MajentoLogin majentologinref=new MajentoLogin();
majentologinref.logintomajento("b.gyaneswar91@gmail.com", "gyana@7682968092");
String excepted="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
String actualresult=driver.getTitle();
System.out.println(actualresult);
System.out.println(actualresult);
if(excepted.equals(actualresult)) {
	System.out.println("test script pass" + actualresult);
}else {
	System.out.println("test script fail");
}
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
	if(excepted.equals(actual)) {
		System.out.println("test script pass "+actual);
	}else {
		System.out.println("test script fail");
	}
	driver.close();
	driver.close();
}
}