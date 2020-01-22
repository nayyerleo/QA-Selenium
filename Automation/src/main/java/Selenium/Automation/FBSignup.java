package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"u_0_f\"]")).sendKeys("Mola");
		driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("Jutt");
		driver.findElement(By.xpath("//*[@id=\"u_0_k\"]")).sendKeys("molajutt@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("molajutt@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("molajutttt1234");

		Select month= new Select(driver.findElement(By.id("month")));		
	    Select day= new Select(driver.findElement(By.id("day")));
	    Select year= new Select(driver.findElement(By.id("year")));
	       
	       
	       month.selectByVisibleText("Jul");
	       day.selectByVisibleText("8");
	       year.selectByVisibleText("1982");
	       
	       
	    driver.findElement(By.xpath("//*[@id=\"u_0_s\"]/span[2]/label")).click();
	    driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).click();		
		
		

	}

}
