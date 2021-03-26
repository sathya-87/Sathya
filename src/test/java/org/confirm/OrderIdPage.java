package org.confirm;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderIdPage extends LibGlobal {
	public OrderIdPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	

}
