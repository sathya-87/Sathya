package com.stepdefinition;

import org.base.LibGlobal;
import org.book.Booking;
import org.cancel.CancelBooking;
import org.login.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.search.SearchPage;
import org.select.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends LibGlobal {
	
	LoginPage lp;
	SearchPage sp;
	Booking bo;
	SelectHotel se;
	CancelBooking cs;
	
	@Given("user Should Login With Login Credentials {string} and {string}")
	public void user_Should_Login_With_Login_Credentials_and(String string, String string2) {
		getDriver();
		loadUrl("http://adactinhotelapp.com/index.php");
		maximize();
		lp = new LoginPage();
		lp.login(string, string2);
	   	}

	@When("User Should Enter The Booking Details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Should_Enter_The_Booking_Details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   sp = new SearchPage();
	   sp.searchhotelPage(string, string2, string3, string4, string5, string6, string7, string8);
	   sp.getBtnSubmit();
	}

	@When("User Should Select the hotel Page")
	public void user_Should_Select_the_hotel_Page() {
		se = new SelectHotel();
		buttonClick(se.getBtnClick());
		buttonClick(se.getBtnContinue());
	 }

	 @When("User Should Enter Personal and Payment Details and User Should Get A Order Id {string},{string},{string},{string},{string},{string},{string},{string}")
	 public void user_Should_Enter_Personal_and_Payment_Details_and_User_Should_Get_A_Order_Id(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   	bo = new Booking();
		bo.bookHotel(string, string2, string3, string4, string5, string6, string7, string8);
		bo.getBtnBook();
		bo.getGetOrderId();
	}

	@When("User Should Enter The Search button")
	public void user_Should_Enter_The_Search_button() {
		
	}

	@When("User Should Navigate To cancel Booking")
	public void user_Should_Navigate_To_cancel_Booking() {
		cs=new CancelBooking();
		cs.cancelBookingOrderId();
    }

	@When("User Should Search The Booking Id {string}")
	public void user_Should_Search_The_Booking_Id(String string) {
		
   }

	@When("User Select the Booking Id and Cancel button")
	public void user_Select_the_Booking_Id_and_Cancel_button() {
	   
	}

	@When("User Should Verify Sucessfully Cancel the Booking")
	public void user_Should_Verify_Sucessfully_Cancel_the_Booking() {
      	cs=new CancelBooking();		
		cs.verifyCancel();
	}

	@When("User Should Click The Cancel Booking Button")
	public void user_Should_Click_The_Cancel_Booking_Button() {
		cs=new CancelBooking();
    	cs.cancelExistingBookingId();
    }

	@Then("User Should Sucessfully Done The Cancel Booking")
	public void user_Should_Sucessfully_Done_The_Cancel_Booking() {
		cs=new CancelBooking();
		cs.cancelBookingOrderId();
	}

    @When("User Should Enter The Booking Details {string},{string},{string},{string},{string}")
	public void user_Should_Enter_The_Booking_Details(String string, String string2, String string3, String string4, String string5) {
	   	sp=new SearchPage();
		sp.selecthotel(string, string2, string3, string4, string5);
		sp.getBtnSubmit();
	}
	
	@Then("User Enter The Search Button")
	public void user_Enter_The_Search_Button() {
 
	}
	
	@When("User Should Enter The Booking Detail {string}")
	public void user_Should_Enter_The_Booking_Detail(String string) {
		sp= new SearchPage();
		sp.searchButton(string);
	}
	
	@Then("User  Should Enter The Search Button")
	public void user_Should_Enter_The_Search_Button() {
		sp= new SearchPage();
		sp.getBtnSubmit();
    }
	
	@When("User should select the Book now button without entering any credential")
	public void user_should_select_the_Book_now_button_without_entering_any_credential() {
		bo=new Booking();
		buttonClick(bo.getBtnBook());
    }
	
	@When("User Should Navigate To cancel Booking and cancel oredr Id")
	public void user_Should_Navigate_To_cancel_Booking_and_cancel_oredr_Id() {
		cs= new CancelBooking();
		cs.cancelExistingBookingId();
   }
	
   @Then("Verify the cancellation")
	public void verify_the_cancellation() {
        cs= new CancelBooking();
        cs.verifyCancel();
	}
   
}
