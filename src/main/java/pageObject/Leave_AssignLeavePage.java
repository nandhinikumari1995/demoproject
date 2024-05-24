package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave_AssignLeavePage {
	
	@FindBy(css = "input[placeholder='Type for hints...']")
	private WebElement employeeNameTb;
	
	@FindBy(xpath = "//div[@role='option']/span" )
	private WebElement employeeNameSuggestion;
		
	@FindBy(css = "i.oxd-select-text--arrow")
	private WebElement leaveTypeDD;
	
	@FindBy(xpath = "//span[text()='CAN - Personal']")
	 private WebElement leaveOption;
	
	@FindBy(xpath = "// label[text()='From Date']/../following-sibling::div//input" )
	private WebElement fromDateCalender;
	
	@FindBy(xpath = "//div[@class='oxd-calender-date -- selected --today']" )
	private WebElement todaysDate ;
	
	@FindBy(xpath = "//textarea")
	private WebElement commentsTb ;
	
	@FindBy(css = "button[type='submit']")
	private WebElement assignBtn ;
	
	@FindBy(xpath = "//p[contains(@class, 'oxd-text--card-title')]")
	private WebElement confirmMsg ;
	
	@FindBy(xpath  = "//p[contains(@class, 'oxd-text--card-title')]/../folling-sibiling::div/p")
	private WebElement detailMsg ;
	
	@FindBy(xpath = " //button[text()='Ok ']")
	private WebElement confirmLeaveAssignmentOKBtn;

		public Leave_AssignLeavePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void typeEmployeeName(String empName) {
	  employeeNameTb.sendKeys(empName);
	  employeeNameSuggestion.click();
	}
	public void selectLeaveType() {
		 leaveTypeDD.click();
		 leaveOption.click();
	}
	public void selectFromDate() {
		fromDateCalender .click();
		todaysDate.click();
	}
	public void typeComments(String comments) {
		commentsTb.sendKeys(comments);
	}
	public void clickOnAssignBtn() {
		assignBtn.click();
	}
	public String getConfirmMsg() {
		return confirmMsg.getText();
	}
	public String getDetailMsg() {
		return detailMsg.getText();
	}
	public void clickOnConfirmLeaveAssignmentOkBtn() {
		confirmLeaveAssignmentOKBtn.click();	
	}
}
