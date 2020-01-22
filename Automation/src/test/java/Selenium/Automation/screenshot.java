package Selenium.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class screenshot {
	
	WebDriver driver;
	
	
	

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.nike.com");
		driver.manage().window().maximize();
		
		
		
  }

  
  @Test
  public void f() {
  }
  @AfterClass
  public void afterClass() throws InterruptedException, WebDriverException, IOException {
	  
	  //TakesScreenshot screenshot= (TakesScreenshot)driver;
	  TakesScreenshot source=(TakesScreenshot)driver;
	  
	 // FileHandler.copy(screenshot.getScreenshotAs(OutputType<X>.FILE), new Filehandler
	  FileHandler.copy(source.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\nayye\\Selenium\\Automation\\src\\test\\java\\screenshot.png"));
	
	  Thread.sleep(6000);
	  driver.close();
  }

}
