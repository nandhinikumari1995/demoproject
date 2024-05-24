package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		String result=driver.getTitle();
		System.out.println(result);
		Thread.sleep(0);
		if(result.contains("Username or password is invalid. Please try again.")) {
			System.out.println("test passed");
		}else {
			System.out.println("user login failed");
		}
	
		driver.quit();	
		
		}
}
