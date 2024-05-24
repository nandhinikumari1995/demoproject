package section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignLeaveTest {
	public static void main(String[] args) {
       // PropertiesUtility propertyUtil = new PropertiesUtility();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	    driver.findElement(By.cssSelector("button[title='Assign Leave']")).click();
	    driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("paul");
	    driver.findElement(By.xpath("//div[@role='option']/span")).click();
	   
	    driver.findElement(By.cssSelector("i.oxd-select-text--arrow")).click();
	    driver.findElement(By.xpath("//span[text()='CAN - Personal']")).click();
	    driver.findElement(By.xpath("//label[text()='From Date']/../following-sibling::div//input")).click();
	   
	    driver.findElement(By.xpath("//div[@class='oxd-calender-date -- selected --today']")).click();
	    driver.findElement(By.xpath("//textarea")).sendKeys("My Own Leave");
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	    String confirmMsg=driver.findElement(By.xpath("//p[contains(@class, 'oxd-text--card-title')]")).getText();
        System.out.println(confirmMsg);
	}

}
