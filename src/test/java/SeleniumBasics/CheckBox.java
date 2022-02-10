package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement option1 = driver.findElement(By.xpath("//input[@value='Option 1']"));
		
		WebElement option2 = driver.findElement(By.xpath("//input[@value='Option 2']"));
		
		WebElement option3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
		
		option1. click();
		option2. click();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		
		//check whether the checkbox is selected or not
		
		
		if(checkbox1.isSelected()) {
			System.out.println("checkbox 1 is toggled on");
		}else {
			System.out.println("checkbox 1 is toggled off");
		}

	}

}
