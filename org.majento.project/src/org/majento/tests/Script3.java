package org.majento.tests;

import static org.testng.Assert.assertEquals;

import org.majento.basetest.MajentoHome;
import org.majento.basetest.MajentoLogin;
import org.majento.basetest.majentoOrder;
import org.majento.genericlibray.Base;
import org.majento.pom.MajentoElementOrders;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Script3 extends majentoOrder{
	@Test
public void verifyreturnreceived() throws InterruptedException {
     
	startbrowser("firefox","https://amazon.in");
	logintomajento("b.gyaneswar91@gmail.com", "gyana@7682968092");
		clickorder();
	clickviewreturnrefundstatus();
	String ActualResult=gettextpfreturnreceivedprocessingrefund();
	String exceptedResult="Return received. Processing your refund.";
assertEquals(exceptedResult,ActualResult );
System.out.println("the test script is pass"+ActualResult);
}
}