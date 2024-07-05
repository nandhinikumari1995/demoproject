package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import dataUtility.ExcelUtility;
import dataUtility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.DashboardPage;
import pageObject.LoginPage;

public class BaseTestClass {
	
	public PropertiesUtility propertyUtil = new PropertiesUtility();
	public ExcelUtility excelUtil= new ExcelUtility();
    
	public WebDriver driver;
	public DashboardPage dashboardPage;
	
	@BeforeClass(alwaysRun = true)
	
	public void launchBrowser() {
		System.out.println("--------browser launch--------");
//		//WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	    driver.get(propertyUtil.getDataFromProperty("url")); 
	}
	@BeforeMethod(alwaysRun = true)
	public void loginToApp() {
//		System.out.println("---------login to app---------");
//		LoginPage loginPage = new LoginPage(driver);
//	    dashboardPage = loginPage.loginToOrangeHrm
//	    		(propertyUtil.getDataFromProperty("username"),propertyUtil.getDataFromProperty("password"));
	  	}
	@AfterMethod(alwaysRun = true)
	public void logoutFromApp() {
//		System.out.println("logout from app");
//		dashboardPage.logout();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("close browser");
//		driver.quit();  
	}

}
