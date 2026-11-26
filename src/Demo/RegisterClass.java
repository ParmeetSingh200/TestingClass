package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Parmeet");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.name("phone")).sendKeys("9878108023");
		driver.findElement(By.id("userName")).sendKeys("singh.parmeet200@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Adampur road,Bhogpur");
		driver.findElement(By.name("city")).sendKeys("Jalandhar");
		driver.findElement(By.name("state")).sendKeys("Punjab");
		driver.findElement(By.name("postalCode")).sendKeys("144201");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("email")).sendKeys("parmsingh");
		driver.findElement(By.name("password")).sendKeys("singh1234@");
		driver.findElement(By.name("confirmPassword")).sendKeys("singh1234@");
		driver.findElement(By.name("submit")).click();
		
		
		
		
		

		
		
		
 
		
	}

}
