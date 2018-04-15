package org.majento.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MajentoElementOrders {
	WebDriver driver;
	public MajentoElementOrders(WebDriver ldriver) {
		this.driver=ldriver;
	}
	@FindBy(xpath="//a[@id='View-Return/Refund-Status_2']")
    public WebElement viewreturnrefund;
	
	@FindBy(xpath="//span[@class='a-text-bold']")
	public WebElement returnreceivedprocessingtxtt;
}
