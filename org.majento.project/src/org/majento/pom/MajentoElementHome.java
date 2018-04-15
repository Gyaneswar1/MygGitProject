package org.majento.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MajentoElementHome {
	WebDriver driver;
	public MajentoElementHome(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//*[@id='nav-link-yourAccount']/span[2]")
	public WebElement order; //click to hello gyaneswar yourorder
	
	@FindBy(xpath="//h3[@class='a-spacing-none ya-card__heading--rich a-text-normal']")
	public WebElement yoursoders;   //click on the yours order btn
	
	@FindBy(xpath="//h1[@class='a-spacing-medium']")
	public WebElement yourodertext;
	}
