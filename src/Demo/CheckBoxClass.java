package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
//		driver.findElement(By.id("vfb-6-0")).click();		
	    driver.findElement(By.cssSelector("#vfb-6-1"))
	    		.click();

	}
	

}
