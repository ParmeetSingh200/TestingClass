package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        // Locate the target element
        WebElement element = driver.findElement(
            By.cssSelector("body > main > p > span")
        );

        // Perform right-click
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
     
        driver.findElement(By.cssSelector("body > ul > li.context-menu-item.context-menu-icon.context-menu-icon-copy")).click();

        
	}

}
