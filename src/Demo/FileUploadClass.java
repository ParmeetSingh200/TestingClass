package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;	
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FileUploadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://demo.guru99.com/test/upload/");  
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Parmeet Singh\\Downloads\\dummy_sample.pdf");
		driver.findElement((By.id("terms"))).click();
		driver.findElement((By.name("send"))).click();	
		driver.manage().window().maximize();
		driver.close();

	}	

}
