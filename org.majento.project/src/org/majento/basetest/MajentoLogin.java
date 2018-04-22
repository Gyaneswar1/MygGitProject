package org.majento.basetest;

import org.majento.genericlibray.Base;
import org.majento.pom.MajentoElementsLogin;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.Parameter;

public class MajentoLogin extends Base {
private static final String String = null;
public void logintomajento(String username,String password) {
	MajentoElementsLogin majentopageref=PageFactory.initElements(driver, MajentoElementsLogin.class);
	majentopageref.loginbtn.click();
	majentopageref.logintextbox.sendKeys(username);
	majentopageref.clickconti.click();
	majentopageref.pswtextbox.sendKeys(password);
	majentopageref.clicklogin.click();
	
}
public String invalidpasswordtext() {
	MajentoElementsLogin majentopageref=PageFactory.initElements(driver, MajentoElementsLogin.class);
	majentopageref.invalidpswtext.getText();
	return String;
	
}
public void m1() {
	
}
}
