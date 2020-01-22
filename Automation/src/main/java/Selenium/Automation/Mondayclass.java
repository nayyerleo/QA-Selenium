package Selenium.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mondayclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		//How to refresh the browser
	       driver.navigate().refresh();
	     //How to drive backward in the browser
	       driver.navigate().back();
	     //How to drive forward in the browser
	       driver.navigate().forward();
	       //How to Maximize the browser
	       driver.manage().window().maximize();
	       //How to get the URL
	       String current=driver.getCurrentUrl();
	       System.out.println(current);
	       
	       //Thread.sleep (10000);
	      // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("capitaljunction@hotmail.com");
	       //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	       //driver.findElement(By.xpath("//input[@type='submit']")).click();
	       Thread.sleep(10000);
		
	       
	       //driver.findElement(By.tagName("a"));
	       List<WebElement> links=driver.findElements(By.tagName("a"));
	       System.out.println(links.size());
	       
	       //Use of Select Class
	       
	       Select Dropdownmonth= new Select(driver.findElement(By.id("month")));
	       Select Dropdownday= new Select(driver.findElement(By.id("day")));
	       Select Dropdownyear= new Select(driver.findElement(By.id("year")));
	       
	       
	       Dropdownmonth.selectByVisibleText("Jul");
	       Dropdownday.selectByVisibleText("8");
	       Dropdownyear.selectByVisibleText("1982");
	       
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input")).click();
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
}
	
	
	
	
}