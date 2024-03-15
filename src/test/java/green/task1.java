package green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
	     
     
		//WebDriver d = new ChromeDriver();
		  WebDriver d = new EdgeDriver();
		  d.get("https://facebook.com");
		  d.manage().window().maximize();
		
		  
	boolean logo  =	 d.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	
	if (logo==true) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
		
		 
		 
			
		
		 
		  
		  

	}

	
}
