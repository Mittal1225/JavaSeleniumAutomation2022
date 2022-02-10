package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) {
		
		
		//Alert is called javascript popup. you wont bea ble to see in HTML DOM while inspect. So, it's called javascript
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver will come to alert
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		
		if(text.equals("Please enter a valid user name")) {
			
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		alert.accept();
		
		
		//driver will go to the default screen
		
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
