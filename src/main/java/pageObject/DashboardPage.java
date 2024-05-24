package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="///a[text()='Products']")
	private WebElement PIMLink;
	
	@FindBy(css="img[title='Create Product...']")
	private WebElement logoutDropdown;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutlink;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public PIM_EmployeeList navigateToPIMPage() {
		PIMLink.click();
		return new PIM_EmployeeList(driver); 
	}
	
	public void logout() {
		logoutDropdown.click();
		logoutlink.click();
	}

}


