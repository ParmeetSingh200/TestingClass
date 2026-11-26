	 package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Parmeet");
//		
	ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
 
//		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;

//		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, 0)");
		
//		driver.findElement(By.id("_R_c9l6neappb6amH1_")).sendKeys("Parmeet");
//		driver.findElement(By.id("_R_cdl6neappb6amH1_")).sendKeys("Parmeet1234");
//		driver.findElement(By.id("_R_cdl6neappb6amH1_")).sendKeys("Parmeet1234");
//       driver.findElement(By.cssSelector("#login_form > div > div.x1n2onr6.x1ja2u2z.x9f619.x78zum5.xdt5ytf.x2lah0s.x193iq5w.xz9dl7a > div > div.x9f619.x1n2onr6.x1ja2u2z.x78zum5.xdt5ytf.x2lah0s.x193iq5w.x6s0dn4.xz9dl7a.x1k70j0n.xzueoph.xzboxd6.x14l7nz5 > div > div > div")).click();
//          

	}
 
}
