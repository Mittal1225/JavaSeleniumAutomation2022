package SeleniumBasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsGuru99 {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		
		driver.findElement(By.xpath("//input[@id='no']")).click();
		
		WebElement resetbutton = driver.findElement(By.xpath("//input[@type='reset' and @value='Reset']"));
		
		resetbutton.click();
		
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		

		List<WebElement> elements = driver.findElements(By.name("name"));
		
		System.out.println("Number of Element:" + elements.size());
		
		for(int i = 0; i < elements.size();i++) {
			
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		}
	
	}
		
		
		
	}


