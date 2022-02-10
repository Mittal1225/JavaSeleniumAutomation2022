package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	     /*
		 * ExplicitWait
		 * 
		 * 1) WebDriver wait extends Fluent wait 
		 * 2) Fluent wait
		 * 
		 *  Both are implementing wait interface
		 */
		
		/*
		 * WebDriverWait: is a class 
		 * it's a dynamic wait 
		 * it's a custom wait for specific webelement 
		 * not a global wait
		 * can be applied for non-webelement as well like title, url, alert
		 * 
		 */		
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://hubspot.com");
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.titleContains("Login"));
		 
		 System.out.println(driver.getTitle());
		 
		

	}

}
