package SeleniumBasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {
	
	
     
	public static void main(String[] args) {
    	
		 /* all images - img
	    all links - a
	    all input fields - input
	    all buttons - button
	  */
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
	  
	
	   driver.get("https://www.amazon.com/");
	   
	   
	   // get total number of links on the page:
	   // get the text of each link:
	   // ignore the blank text:
	   
	   //when there is no items found it will give an empty list
	   
	   
	   List<WebElement> linklist  = driver.findElements(By.tagName("a"));
	
	   System.out.println("total links =" + linklist.size());
	   
	   for(int i = 0; i < linklist.size();i++) {
		   
		  String text = linklist.get(i).getText();
		  
		  
		  if (!text.isEmpty()) {
				System.out.println(i + "-->" + text);

	   }
	
	}

	}
}