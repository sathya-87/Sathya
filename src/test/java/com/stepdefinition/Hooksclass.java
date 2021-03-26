package com.stepdefinition;

import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass  extends LibGlobal{
	@Before
	private void beforem() {
	    getDriver();
	    loadUrl("http://adactinhotelapp.com/index.php");
	    
	}
 @After
 public void afterm(Scenario s) {
     TakesScreenshot ts=(TakesScreenshot) driver;
     byte[] b=ts.getScreenshotAs(OutputType.BYTES);
     s.embed(b, "img/pass");
    quit();

}

}
