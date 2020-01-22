package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_creation {
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement search;
	
	WebDriver driver;
	
	@FindBy(id="pass")
	
	WebElement searchiconoption;
	@FindBy(xpath="//*[@id=\"loginbutton\"]")
	WebElement Login;
	
	public Login_creation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void emailfield(String emailid) {
		search.sendKeys(emailid);
	}
	
	public void passwordfield(String password) {
		search.sendKeys(password);
	}
	
	public void clicklogin() {
		Login.click();
	}
}
