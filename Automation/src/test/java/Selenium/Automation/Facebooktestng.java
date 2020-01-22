package Selenium.Automation;

import org.testng.annotations.Test;

import Facebook.Login_creation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Facebooktestng {
	WebDriver driver;
  @Test(priority=0)
  public void f() {
	  Login_creation  Jaggaaaaa=new Login_creation(driver);
	  Jaggaaaaa.emailfield("jaggajutt@gmail.com");
	  Jaggaaaaa.passwordfield("IamJugga");
	  Jaggaaaaa.clicklogin();
  }
  
  @Test(priority=1)
  public void Durability() throws InterruptedException {
	  Login_creation  Jaggaaaaa=new Login_creation(driver);
	  Jaggaaaaa.emailfield("jaggajutt@gmail.com");
	  Thread.sleep(6000);
  }
  
  @Parameters ({"Nayyer","Saad"})  
  @BeforeClass 
 
  
  public void beforeClass(String Nayyer,String Saad) {
	  
	  if(Saad.equalsIgnoreCase("Firefox")) {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\nayye\\Selenium\\Automation\\geckodriver.exe");
	  driver=new FirefoxDriver();
		driver.get(Nayyer);
		driver.manage().window().maximize();
		
		
	  }else if(Saad.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\nayye\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  driver=new ChromeDriver();
			driver.get(Nayyer);
			driver.manage().window().maximize();
			
	  }else {
		  System.out.println("Please check your browser settings");
	  }
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
