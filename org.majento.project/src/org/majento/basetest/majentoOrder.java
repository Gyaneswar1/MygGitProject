package org.majento.basetest;

import org.majento.pom.MajentoElementOrders;
import org.openqa.selenium.support.PageFactory;

public class majentoOrder extends MajentoHome {
public void clickviewreturnrefundstatus() {
	MajentoElementOrders orders=PageFactory.initElements(driver, MajentoElementOrders.class);
	orders.viewreturnrefund.click();
}
public String gettextpfreturnreceivedprocessingrefund() {
	MajentoElementOrders orders=PageFactory.initElements(driver, MajentoElementOrders.class);
	return orders.returnreceivedprocessingtxtt.getText();	
}
}
