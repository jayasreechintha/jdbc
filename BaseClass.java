package org.jdbe_data;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	public static void EdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
	//method
		public static void maxwindow() {
			driver.manage().window().maximize();

		}
		public static void launchUrl(String url) {
			driver.get(url);
		}
		public static void browserclose() {
			driver.close();

		}
		public static void gettitle() {
			String title = driver.getTitle();
			System.out.println(title);

		}
		public static void quite() {
	       driver.quit();

		}
		public static void pageurl() {
			String currentUrl = driver.getCurrentUrl();
	         System.out.println(currentUrl);
		}
		public static void fillTextBox(WebElement element, String value) {
			element.sendKeys(value);

		}
		public static void btnclick(WebElement ele) {
			ele.click();

		}
		  public static void dropdown(WebElement element,String value) {
		    	Select s = new Select(element);
		    	s.selectByVisibleText(value);
			
			}
		  public static  void button(WebElement element) {
			  element.click();

		}

		  public static void moveto(WebElement element) {
			  Actions a = new Actions(driver);
					  a.moveToElement(element).perform();
			

		}
		  public static void GetCurrentDate() {
			Date d = new Date();
			System.out.println(d);
			

		}
		 public static  void sendvalues(WebElement element, String value) {
			 element.sendKeys(value);
			

		}
}
