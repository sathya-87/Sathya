package org.book;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Booking extends LibGlobal{

	
	


		public Booking() {
			
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(id="first_name")
		private WebElement txtFirstName;
		@FindBy(id="last_name")
		private WebElement txtPassWord;
		@FindBy(id="address")
		private WebElement txtAddress;
		@FindBy(id="cc_num")
		private WebElement txtCardNumber;
		@FindBy(id="cc_type")
		private WebElement dDnCardType;
		@FindBy(id="cc_exp_month")
		private WebElement dDnMonth;
		@FindBy(id="cc_exp_year")
		private WebElement dDnYear;
		@FindBy(id="cc_cvv")
		private WebElement txtCvv;
		@FindBy(id="book_now")
		private WebElement btnBook;
		@FindBy(id="order_no")
		private WebElement getOrderId;
		public WebElement getGetOrderId() {
			return getOrderId;
		}
		public void setGetOrderId(WebElement getOrderId) {
			this.getOrderId = getOrderId;
		}
		public WebElement getTxtFirstName() {
			return txtFirstName;
		}
		public WebElement getTxtPassWord() {
			return txtPassWord;
		}
		public WebElement getTxtAddress() {
			return txtAddress;
		}
		public WebElement getTxtCardNumber() {
			return txtCardNumber;
		}
		public WebElement getdDnCardType() {
			return dDnCardType;
		}
		public WebElement getdDnMonth() {
			return dDnMonth;
		}
		public WebElement getdDnYear() {
			return dDnYear;
		}
		public WebElement getTxtCvv() {
			return txtCvv;
		}
		public WebElement getBtnBook() {
			return btnBook;
		}
		
		
		
	public void bookHotel(String FirstName,String LastName,String Address,String CardNumber,String CardType,String CardMonth,String CardYear,String Cvv) {
		sendKey(txtFirstName, FirstName);
		sendKey(txtPassWord, LastName);
		sendKey(txtAddress, Address);
		sendKey(txtCardNumber, CardNumber);
		selctbytext(dDnCardType, CardType);
		selctbytext(dDnMonth, CardMonth);
		selctbytext(dDnYear, CardYear);
		sendKey(txtCvv, Cvv);
		buttonClick(btnBook);
		String s = getAttribute(getOrderId);
		System.out.println(s);
		WebElement txtbookcon=driver.findElement(By.xpath("//td[@class='login_title']"));
		String s1=getAttribute(txtbookcon);
		
//		Assert.assertEquals(s1, "Booking Confirmation");
		
	}
}
	
	
//	WebElement searchbookingid = driver.findElement(By.id("order_id_text"));
//	
//	sendKey(searchbookingid,);
//	WebElement gobutton = driver.findElement(By.id("search_hotel_id"));
//	buttonClick(gobutton);
//	}

