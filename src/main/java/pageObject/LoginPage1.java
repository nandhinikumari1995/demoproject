package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
private WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement usernameTB;
	
	@FindBy(name = "password")
	private WebElement passwordTB;
	
	@FindBy(css = "button[type='submit']")
	private WebElement loginbtn;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public DashboardPage loginToVtiger(String username,String password) {
		
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		
		loginbtn.click();
		return new DashboardPage(driver);
	}

}
