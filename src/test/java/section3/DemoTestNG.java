package section3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("browser launch");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("login to app");
	}
	@Test
	public void a() {
		System.out.println("Test a");
	}
	@Test
	public void b() {
		System.out.println("Test b");
	}
	@Test
	public void c() {
		System.out.println("Test c");
	}
	@AfterMethod
	public void logoutFromApp() {
		System.out.println("logout from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
}
