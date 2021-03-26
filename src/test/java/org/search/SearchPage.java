package org.search;

import org.base.LibGlobal;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage extends LibGlobal {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRooms;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	@FindBy(id="child_room")
	private WebElement dDnChildRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnhotels() {
		return dDnhotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}
	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}
	public void searchhotelPage(String Location,String Hotels,String Roomtype,String NoOfRooms,String CheckIndate,
							String CheckOutDate,String AdultsPerRoom,String ChildrensPerRoom) {
		
		
		selctbytext(dDnLocation, Location);
		selctbytext(dDnhotels, Hotels);
		selctbytext(dDnRoomType, Roomtype);
		selctbytext(dDnNoOfRooms, NoOfRooms);
		clear(txtCheckInDate);
		sendKey(txtCheckInDate, CheckIndate);
		clear(txtCheckOutDate);
		sendKey(txtCheckOutDate, CheckOutDate);
		selctbytext(dDnAdultRoom, AdultsPerRoom);
		selctbytext(dDnChildRoom, ChildrensPerRoom);
		buttonClick(btnSubmit);
		}
	public void selecthotel(String Location,String NoOfRooms,String CheckIndate,String CheckOutDate,String AdultsPerRoom) {
		selctbytext(dDnLocation, Location);
		selctbytext(dDnNoOfRooms, NoOfRooms);
		clear(txtCheckInDate);
		sendKey(txtCheckInDate, CheckIndate);
		clear(txtCheckOutDate);
		sendKey(txtCheckOutDate, CheckOutDate);
		selctbytext(dDnAdultRoom, AdultsPerRoom);
		buttonClick(btnSubmit);
		
	}
	public void searchButton(String Location ) {
		
		buttonClick(btnSubmit);
		WebElement error = driver.findElement(By.id("location_span"));
		String text = error.getText();
		System.out.println(text);
		assertEquls("Please Select a Location", text);
		
	}
	
	
}
