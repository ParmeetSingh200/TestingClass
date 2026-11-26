package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClassNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys("45333");
		driver.findElement(By.name("lastName")).sendKeys("262626");
		driver.findElement(By.name("phone")).sendKeys("abdddj");
        driver.findElement(By.id("userName")).sendKeys("singh.parmeet@l.jkcom");
		driver.findElement(By.name("address1")).sendKeys("788222222");
		driver.findElement(By.name("city")).sendKeys("555555");
		driver.findElement(By.name("state")).sendKeys("55555");
		driver.findElement(By.name("postalCode")).sendKeys("nmdafjaj");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("email")).sendKeys("64474747");
		driver.findElement(By.name("password")).sendKeys("singh1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("singh1234");
		driver.findElement(By.name("submit")).click();

	}	

}
