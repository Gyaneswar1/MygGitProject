package org.majento.basetest;

import org.majento.pom.MajentoElementHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class MajentoHome extends MajentoLogin {
	public void clickorder() throws InterruptedException {
		MajentoElementHome h=PageFactory.initElements(driver, MajentoElementHome.class);
		h.order.click();
		Thread.sleep(5000);
		h.yoursoders.click();
		Thread.sleep(5000);
	}
public String gettextofyoursorder() {
	MajentoElementHome h=PageFactory.initElements(driver, MajentoElementHome.class);
	return h.yourodertext.getText();

}
}
