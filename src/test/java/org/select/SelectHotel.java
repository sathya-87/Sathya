package org.select;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {

	
	
		public SelectHotel() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="radiobutton_0")
		private WebElement btnClick;
		@FindBy(id="continue")
		private WebElement btnContinue;
		public WebElement getBtnClick() {
			return btnClick;
		}
		public WebElement getBtnContinue() {
			return btnContinue;
		}
		

	}


