package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com/slide/");
		
		Actions hover= new Actions(driver); 

		
		
		driver.switchTo().frame(0);
		
		
		
		Thread.sleep(5000);
		//WebElement drag=driver.findElement(By.id("draggable"));
		//WebElement dropped=driver.findElement(By.id("droppable"));
		
		//hover.dragAndDrop(drag, dropped).build().perform();
		
		hover.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[11]/a"))source, x200, yOffset)
		
		Thread.sleep(2000);
		

		
		
	}

}
