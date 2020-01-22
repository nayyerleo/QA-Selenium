package Selenium.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TrialClasstestNG {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }


  @Test
  public void afterClassTest() {
	  driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("new balance men shoes 574");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

  }

  
}
