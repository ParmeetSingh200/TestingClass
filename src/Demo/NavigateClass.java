package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.facebook.com/home.php");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();    ,       /m                  
//		driver.quit();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");  
		Select sel = new Select(driver.findElement(By.name("country")));
		sel.selectByVisibleText("ANDORRA");
//		sel.selectByIndex(1);
//        sel.selectByValue("ARMENIA");		
		

	}

}
