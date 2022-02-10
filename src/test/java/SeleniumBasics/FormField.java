package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormField {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/login.html");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		email.sendKeys("mittal@gmail.com");
		
		email.clear();
		
		pwd.sendKeys("1234");
		
		submit.click();
		
		driver.close();
		

	}

}
