package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoClass1 {
	
	public WebDriver driver;
	String url = "https://www.facebook.com/";
	String url1 = "https://demo.guru99.com/";
	
	@BeforeMethod
	public void OpenBrowser() {
		
        driver = new ChromeDriver();
		
        
        
		
	}

	 @Test
	 public void Open(){
		 
		 driver.get(url);
//		 driver.findElement(By.name("email")).sendKeys("PArmeet");
		 
		 
		  
	 }
	 
	 @Test
	 public void Open1(){
		 
		 driver.get(url1);
//		 driver.findElement(By.name("email")).sendKeys("PArmeet");
		 
		 
		  
	 }
	 @AfterMethod
	 public void CloseBrowser() {
		 driver.close();
	 }
}
