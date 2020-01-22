package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Expedia.com");
		driver.manage().window().maximize();
		//Departing
		driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/div[3]/table/tbody/tr[2]/td[6]/button")).click();
		
		//Returning
		driver.findElement(By.id("package-returning-hp-package")).click();
		driver.findElement(By.xpath("//button[@data-day='13']")).click();
		
		
		
		
		
		
		

	}

}
