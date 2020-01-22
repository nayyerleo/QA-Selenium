package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	
		
		Actions hover= new Actions(driver);
		
		driver.manage().window().maximize();
		
		hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		
		Thread.sleep(5000);
		
		hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[4]/span"))).click().build().perform();
		
		
		
	}

}
