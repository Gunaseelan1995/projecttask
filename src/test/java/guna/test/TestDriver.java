package guna.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\eclipse-workspace\\test1\\target\\driver\\chromedriver.exe");
		
	     
     
		//WebDriver d = new ChromeDriver();
		  WebDriver d = new ChromeDriver();
	
		  	
		 String url="https://facebook.com";
		 d.get(url);
//		 d.navigate().to(url);
		 
		 WebElement element= d.findElement(By.id("email"));
		 
		 
		 Actions as=new Actions(d);
		 as.sendKeys(element, "gunaseelan");
		 as.doubleClick(element).build().perform();
		 as.contextClick().perform();
		 
		 Robot jk=new  Robot();
		 
		 for(int i=0; i<3;i++) {
			 jk.keyPress(KeyEvent.VK_DOWN);
			 jk.keyRelease(KeyEvent.VK_DOWN);
		 }
		 jk.keyPress(KeyEvent.VK_ENTER);
		 jk.keyRelease(KeyEvent.VK_ENTER);
		 
		 jk.keyPress(KeyEvent. VK_TAB);
		 jk.keyRelease(KeyEvent.VK_TAB);
		 
		 jk.keyPress(KeyEvent.VK_CONTROL);
		 jk.keyPress(KeyEvent.VK_V);
		 
		 jk.keyRelease(KeyEvent.VK_CONTROL);
		 jk.keyRelease(KeyEvent.VK_V);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
