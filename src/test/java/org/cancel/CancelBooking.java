package org.cancel;

import org.base.LibGlobal;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends LibGlobal {
	public CancelBooking() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@class='input_search']")
	private WebElement bookingOrderId;

	@FindBy(xpath = "//a[contains(text(),'Booked Itinerary')]")
	private WebElement bookedItinerary;

	@FindBy(name = "order_id_text")
	private WebElement orderIdText;

	@FindBy(id = "search_hotel_id")
	private WebElement searchHotelId;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement orderIdCheckBox;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelButton;
	
	@FindBy(id = "search_result_error")
	private WebElement cancelErrorMessage;
	
	public WebElement getGetOrderId() {
		return getOrderId;
	}
	@FindBy(id="order_no")
	private WebElement getOrderId;
	
	//@FindBy(xpath = "(//strong[text()='Cancel ']/parent::td/parent::tr//following-sibling::tr//child::td[3]//child::input[@type='button']")
	//private WebElement cancelButton;

	public WebElement getCancelErrorMessage() {
		return cancelErrorMessage;
	}

	public WebElement getBookingOrderId() {
		return bookingOrderId;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getOrderIdText() {
		return orderIdText;
	}

	public WebElement getSearchHotelId() {
		return searchHotelId;
	}

	public WebElement getOrderIdCheckBox() {
		return orderIdCheckBox;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void cancelBookingOrderId() {

		String orderId = getAttribute(getGetOrderId());
		System.out.println("order"+orderId);
		buttonClick(getBookedItinerary());
		sendKeyEnter(getOrderIdText(), orderId);
		buttonClick(getCancelButton());
		confirmAlertAccept();

	}
	
	public void verifyCancel() {
		
		String cancelMessage = getText(getCancelErrorMessage());
		Assert.assertEquals("The booking has been cancelled.", cancelMessage);
		System.out.println("Cancelled Successfully");
	}

	public void cancelExistingBookingId() {
		
		buttonClick(getBookedItinerary());
		buttonClick(getCancelButton());
		confirmAlertAccept();

	}


		
		
	
}

