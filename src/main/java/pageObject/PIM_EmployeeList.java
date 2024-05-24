package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_EmployeeList {
	
	@FindBy(xpath ="//label[text()='Employee Name']/../../div[2]/div/div/input")
	private WebElement employeeNameTb;
	
	@FindBy(xpath="//span[text()='Odis  Adalwin']")
	private WebElement employeNameSuggestion;

	@FindBy(xpath="//label[text()='Employee Id']/../../div[2]/input")
	private WebElement employeeIDTb;

	@FindBy(xpath="//label[text()='Employment Status']/../../div[2]/div/div/div[2]")
	private WebElement employementStatusTb;
	
	@FindBy(xpath="//span[text()='Freelance']")
	private WebElement employementSuggestionTb;
	
	@FindBy(xpath="//label[text()='Include']/../../div[2]/div/div/div[2]/i")
	private WebElement includeTb;
	
	@FindBy(xpath="//span[text()='Current Employees Only']")
	private WebElement includeSuggestionTb;
	
	@FindBy(xpath="//label[text()='Supervisor Name']/../../div[2]/div/div/input")
	private WebElement supervisorNameTb;
	
	@FindBy(xpath="//span[text()='Cecil  Bonaparte']")
	private WebElement supervisorNameSuggestion;
	
	@FindBy(xpath="//label[text()='Job Title']/../../div[2]")
	private WebElement jobtitleTb;
	
	@FindBy(xpath="//span[text()='Account Assistant']")
	private WebElement jobtitleSuggestion;
	
	@FindBy(xpath="//label[text()='Sub Unit']/../../div[2]")
	private WebElement subunit;
	
	@FindBy(xpath="//span[text()='Administration']")
	private WebElement subunitSuggestionTb;
	
	@FindBy(css="button[type='submit']")
	private WebElement searchTb;
	
	@FindBy(xpath="//span[text()='No Records Found']")
	private WebElement printmsg;
	
	
	public PIM_EmployeeList(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	public void typeEmployeeName(String empName) {
	  employeeNameTb.sendKeys(empName);
	  employeNameSuggestion.click();
	}
	public void typeEmployeeid(String empid) {
		 employeeIDTb.sendKeys(empid);
		  	 
	}
	public void employementStatus() {
		//employementStatusTb.sendKeys(empstatus);
		employementStatusTb.click();
		employementSuggestionTb.click();
		
	}
	public void include() {
		includeTb.click();
		includeSuggestionTb.click();
	}
	public void supervisorNameTb(String supname) {
		supervisorNameTb.sendKeys(supname);
		supervisorNameSuggestion.click();
	}
	public void jobtitleTb() {
		jobtitleTb.click();
		jobtitleSuggestion.click();
	}
	public void subunit() {
		subunit.click();
		subunitSuggestionTb.click();
	}
	
	public void searchTb() {
		searchTb.click();
	}
	public String getprintMsg() {
		return printmsg.getText();
	}
	
}
