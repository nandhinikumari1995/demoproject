package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orange {
	
	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://www.orangehrm.com");
	
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//button[@class='oxd-button-medium oxd-button--main orangehrm-login-button']")).click();
	    driver.findElement(By.xpath("(//span[@class='oxd-text-oxd-text--span oxd-main-menu-item--name'])[3]")).click();
	    driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	    
	   // Thread.sleep(3000);
	    
	    String result=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']")).getText();
        System.out.println(result);
       
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        
        if(result.contains("Username ")) {
			System.out.println("test passed");
		}else {
			System.out.println("user login passed");
		}
	
		driver.quit();	
        
       
         
	}
}
