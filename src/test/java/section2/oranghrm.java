package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oranghrm {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
		    WebDriver driver = new ChromeDriver();
		
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(1000);
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		    Thread.sleep(3000);
		    List<WebElement> list = driver.findElements(By.xpath("//div[@class='oxd-layout-navigation']/div[2]/div/ul/li[1]"));
		    
		    boolean flag = false;
		    for(WebElement ele : list) {
		    	
		    	String text = ele.getText();
		    	if(text.contains("nokia phone")) {
		    	    flag = true;
		    	    ele.click();
		    	    break;
		    	}
		    }
		    Thread.sleep(3000);

		    if(flag) {
		    	System.out.println("suggestion present in list");
		    }else {
		    	System.out.println("suggestion not present in list");
		    }
		    driver.quit();		    
		    
	}

}
