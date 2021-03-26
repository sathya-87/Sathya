package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;

import junit.framework.Assert;

public class LibGlobal {
	public static WebDriver driver;
	public static DataTable dataTable;

	public WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lap217\\Downloads\\eclipse\\CucumberTask7\\Driver\\chromedriver.exe");
        
		return driver = new ChromeDriver();

	}
	public  void clear(WebElement element) {
		element.clear();
}
	public  void assertEquls(String expected,String actual) {
		Assert.assertEquals(expected, actual);
	}
	public void close() {
	     driver.close();	
	}

	public void quit() {
	     driver.quit();	
	}

	public  void loadUrl(String url) {
		driver.get(url);
		maximize();
		implicitlyWait();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void sendKey(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void sendKeyEnter(WebElement element, String data) {
		element.sendKeys(data,Keys.ENTER);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}

	public static void selctbytext(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}

	public static void selectbyvalue(WebElement element, String data) {
		new Select(element).selectByValue(data);
	}

	public static void selectbyindex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public static List<String> getOptions(WebElement element, String data) {
		List<String> l = new ArrayList<String>();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement newOpt : options) {
			l.add(newOpt.getText());
		}
		return l;
	}

	public static void submit(WebElement element) {
		element.submit();
	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println("My Order Id Is " + attribute);
		return attribute;
	}
	public static String getText(WebElement element) {
		return element.getText();
	}

	public List<String> getOptions(WebElement element) {
		List<String> datas = new ArrayList<String>();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement data : options) {
			datas.add(data.getText());
		}
		return datas;
	}

	public void clickByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("agruments[0].click()", element);
	}

	public void orderIdCancel(WebElement e) {
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		String s = e.getAttribute("value");
		System.out.println(s);
		e.sendKeys(s);
	}




	public void confirmAlertAccept() {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void confirmAlertDismiss() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	

}


