package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver" , "C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.nike.com");  
       Thread.sleep (10000);
      
       
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
       Thread.sleep (10000);
       driver.findElement(By.id("TypeaheadSearchInput")).sendKeys("shoes");
       
       Thread.sleep(10000);
       driver.findElement(By.linkText("MEN")).click();;
       
       Thread.sleep(10000);
       
       //How to close the browser
       driver.close();
       
       
       
    }
    
    
    
    
    
    
    
    
    
}
