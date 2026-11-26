package Demo; 		

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();  
	        driver.get("https://demo.guru99.com/test/drag_drop.html");

//	        driver.switchTo().frame(0);

//	        WebElement source = driver.findElement(By.id("credit2"));
//	        WebElement target = driver.findElement(By.id("bank"));
//
//	        Actions actions = new Actions(driver);
//	        actions.dragAndDrop(source, target).perform();
//	        
	        WebElement source1 = driver.findElement(By.cssSelector("#fourth > a"));
	        WebElement target1 = driver.findElement(By.id("amt7"));

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(source1, target1).perform();
	        
	        

	}

}
