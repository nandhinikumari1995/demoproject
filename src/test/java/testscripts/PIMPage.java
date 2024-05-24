package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataUtility.ExcelUtility;
import dataUtility.PropertiesUtility;
import genericUtility.BaseTestClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.DashboardPage;
import pageObject.Leave_AssignLeavePage;
import pageObject.LoginPage;
import pageObject.PIM_EmployeeList;

public class PIMPage extends BaseTestClass {
	 
	@Test(groups= {"Regression"})
	public void testPIMPage() {
		
		PIM_EmployeeList pimpage = dashboardPage.navigateToPIMPage();
	    pimpage.typeEmployeeName(excelUtil.getDataFromExcel("Sheet1", 4, 2));
	    
	    pimpage.typeEmployeeid(excelUtil.getDataFromExcel("Sheet1", 4, 3));
	   
	    pimpage.employementStatus();
	    
	    pimpage.include();
	    
	    pimpage.supervisorNameTb(excelUtil.getDataFromExcel("Sheet1", 4, 4));
	    
	    pimpage.jobtitleTb();
	    
	     
	    pimpage.subunit();
	    
	    pimpage.searchTb();

	    String printMsg =  pimpage.getprintMsg();
        System.out.println(printMsg);
        
}

}