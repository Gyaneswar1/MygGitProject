package org.majento.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MajentoElementsLogin {
	WebDriver driver;
	public MajentoElementsLogin(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public WebElement loginbtn; //click to signinbtn
	

@FindBy(xpath="//input[@id='ap_email']")
	public WebElement logintextbox; //send usernametextbox xpath

@FindBy(xpath="//span[@id='continue']")
public WebElement clickconti;   //click to continuebtn


@FindBy(xpath="//input[@id='ap_password']")
public WebElement pswtextbox; // send pswtextbox xpath

@FindBy(id="signInSubmit")
public WebElement clicklogin; //click on signin btn

@FindBy(xpath="//span[@class='a-list-item']")
public WebElement invalidpswtext;

}
