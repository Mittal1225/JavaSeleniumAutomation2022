package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		
		//if you run this it will give java.lang.IllegalStateException
		

		WebDriverManager.chromedriver().setup();
		
		
		//System.setProperty("webdriver.chrome.driver","/Users/drmga/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		driver.getCurrentUrl();
		
		String title = driver.getTitle();
		

		System.out.println("page title is : " + title);
		
		
		//checkpoint/verification Point
		
		if(title.equals("google")){
			System.out.println("correct");
			
	    }else
		
		System.out.println("incorrect");
		
			
		System.out.println(driver.getCurrentUrl());
		
		
		if(driver.getCurrentUrl().contains("google")) {
			System.out.println("url is correct");
		}
		 
	}

}
