package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
	    WebElement fname = driver.findElement(By.name("FirstName"));
		
	    WebElement lname = driver.findElement(By.name("LastName"));
		
	    WebElement submit = driver.findElement(By.id("Form_submitForm_action_request"));
		
		fname.sendKeys("Mitttal");
	    lname.sendKeys("Gadhiya");
	    submit.click();
	   
	   
	   
		
	}

}
