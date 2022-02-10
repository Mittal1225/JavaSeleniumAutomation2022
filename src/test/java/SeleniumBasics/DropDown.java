package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement drpcountry = driver.findElement(By.name("country"));
		
		//select class is coming from selenium.
		//For dropdown we use select class, only when there is an HTML tag given 
		
		//For each dropdown field you need to create a new select class
		
	     Select select = new Select(drpcountry);  
	     
	     select.selectByValue("UNITED STATES");
	     
	     select.selectByVisibleText("INDIA");
	    
	     //index will start from 0 like array. So, it will select 9th option from dropdown
	     
	     select.selectByIndex(8);
		
		
		
		
		
	}

}
