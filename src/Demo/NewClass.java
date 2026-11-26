package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");  
//		driver.findElement(By.linkText("SIGN-ON")).click();   
//	    driver.findElement(By.partialLinkText("SUPP")).click();
		driver.findElement(By.xpath("//body[@link='#000099']/div[@style='margin-left:20px;']/table[@border='0']/tbody/tr/td[@valign='top']/table[@border='0']/tbody/tr/td/table[@border='0']/tbody/tr/td/table[@width='492']/tbody/tr/td/form[@method='post']/table[@cellpadding='2']/tbody/tr[2]/td[2]/input[1]")).sendKeys("PArmeet");
		driver.findElement(By.xpath("//body[@link='#000099']/div[@style='margin-left:20px;']/table[@border='0']/tbody/tr/td[@valign='top']/table[@border='0']/tbody/tr/td/table[@border='0']/tbody/tr/td/table[@width='492']/tbody/tr/td/form[@method='post']/table[@cellpadding='2']/tbody/tr[3]/td[2]/input[1]")).sendKeys("Singh");
		driver.findElement(By.xpath("//body[@link='#000099']/div[@style='margin-left:20px;']/table[@border='0']/tbody/tr/td[@valign='top']/table[@border='0']/tbody/tr/td/table[@border='0']/tbody/tr/td/table[@width='492']/tbody/tr/td/form[@method='post']/table[@cellpadding='2']/tbody/tr[4]/td[2]/input[1]")).sendKeys("9878108023");
//		driver.close();
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		  

	}

}
