package org.login;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	
	
	
	
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="username")
		private WebElement txtusername;
		@FindBy(id="password")
		private WebElement txtpassword;
		@FindBy(id="login")
		private WebElement btnlogin;
		public WebElement getTxtusername() {
			return txtusername;
		}
		public WebElement getTxtpassword() {
			return txtpassword;
		}
		public WebElement getBtnlogin() {
			return btnlogin;
		}
		public void login(String UserName,String PassWord) {
			
			sendKey(txtusername, UserName);
			sendKey(txtpassword, PassWord);
			buttonClick(btnlogin);
		}
	}



