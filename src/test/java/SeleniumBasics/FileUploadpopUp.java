package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopUp {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//file upload popup by browsing
		//type='file' should be there
		
		
		WebElement chooseFile = driver.findElement(By.name("upfile']"));
		
		chooseFile.sendKeys("/Users/naveenautomationlabs/Documents/POM_July.png");
		
		
		
		
		
		
		
		
		
		

	}

}
