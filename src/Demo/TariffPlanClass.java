package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TariffPlanClass {
	
	@Test
	public void TariffPlanPositive() {
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/telecom/addtariffplans.php");
		driver.findElement(By.id("rental1")).sendKeys("456888");
		driver.findElement(By.id("local_minutes")).sendKeys("45");
		driver.findElement(By.id("inter_minutes")).sendKeys("25");
		driver.findElement(By.id("sms_pack")).sendKeys("20");
		driver.findElement(By.id("minutes_charges")).sendKeys("500");
		driver.findElement(By.id("inter_charges")).sendKeys("400");
		driver.findElement(By.id("sms_charges")).sendKeys("300");
		
		driver.findElement(By.name("submit")).click();
		
	}
	
	@Test
	public void TariffPlanNegative() {
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/telecom/addtariffplans.php");
		driver.findElement(By.id("rental1")).sendKeys("hddjdjd");
		driver.findElement(By.id("local_minutes")).sendKeys("jdjd");
		driver.findElement(By.id("inter_minutes")).sendKeys("jjs");
		driver.findElement(By.id("sms_pack")).sendKeys("dkkdsk");
		driver.findElement(By.id("minutes_charges")).sendKeys("dkkd");
		driver.findElement(By.id("inter_charges")).sendKeys("dkdk");
		driver.findElement(By.id("sms_charges")).sendKeys("djjgjg");
		
		driver.findElement(By.name("submit")).click();
		
	}
	
	
	@Test
	public void TariffPlanBlank() {
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/telecom/addtariffplans.php");
		driver.findElement(By.id("rental1")).sendKeys("");
		driver.findElement(By.id("local_minutes")).sendKeys("");
		driver.findElement(By.id("inter_minutes")).sendKeys("");
		driver.findElement(By.id("sms_pack")).sendKeys("");
		driver.findElement(By.id("minutes_charges")).sendKeys("");
		driver.findElement(By.id("inter_charges")).sendKeys("");
		driver.findElement(By.id("sms_charges")).sendKeys("");
		
		driver.findElement(By.name("submit")).click();
		
	}
	
	@Test
	public void TariffPlanReset() {
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/telecom/addtariffplans.php");
		driver.findElement(By.id("rental1")).sendKeys("456888");
		driver.findElement(By.id("local_minutes")).sendKeys("45");
		driver.findElement(By.id("inter_minutes")).sendKeys("25");
		driver.findElement(By.id("sms_pack")).sendKeys("20");
		driver.findElement(By.id("minutes_charges")).sendKeys("500");
		driver.findElement(By.id("inter_charges")).sendKeys("400");
		driver.findElement(By.id("sms_charges")).sendKeys("300");
		
		driver.findElement(By.cssSelector("#main > div > form > div > div.\\36 u\\$ > ul > li:nth-child(2) > input")).click();
		
	}
	
	


}
