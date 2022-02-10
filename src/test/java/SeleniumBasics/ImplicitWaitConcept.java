package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/");

		// This is called static wait bcz it's going to wait whether element is visile
		// or not

		Thread.sleep(2000); // 2000 means 2 sec

		/*
		 * implicit wait is called dynamic wait. it's going to wait only if element is
		 * not found. if element is found in 2 seconds
		 * rest 8 sec. will be ignored. if it waits for 10 sec and
		 * still element is not visible then will throw an exception (No such element exception)
		 * 
		 * implicit wait - is only for WebElemet
		 * it's a global wait - so, it will be applied for all the webelements by default
		 * Not applicable for non-webelements like title, alert, url
		 * 
		 * drawback is - if we have 5 elements on same page and if it waits for one element it doesnt need to wait for other elements
		 */

		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		
		 driver.findElement(By.id("username")).sendKeys("text@gmail.com");
         
		 //you can override implicit wait. So, now it's going to wait 5 sec for all elemets
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		
		 driver.findElement(By.id("password")).sendKeys("text123");
         
	     //you can nullify implicit wait.
		 
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 
		 
		 
	}

}
