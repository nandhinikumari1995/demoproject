package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	
	public static void main(String[] args)throws InterruptedException{

	 
        WebDriverManager.chromedriver().setup();
	
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://www.amazon.com");
	
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Umbrella");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='oxd-button-medium oxd-button--main orangehrm-login-button']")).sendKeys();
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    String result=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();

	    System.out.println(result);
	
	    Thread.sleep(3000);
	    
	    
	
	    if(result.contains("results for ")) {
		   System.out.println("test passed");
	    }
	    else {
		   System.out.println("test failed");
	   }
	
	     driver.quit();
	
	}
}
