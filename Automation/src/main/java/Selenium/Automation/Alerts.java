package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		
				
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();	
		
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button")).click();	
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("Ok");
		driver.switchTo().alert().accept();
		
		
		

	}

}
