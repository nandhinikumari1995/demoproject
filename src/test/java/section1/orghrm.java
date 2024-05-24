package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class orghrm {

public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	    driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][1]")).click();
	    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("will");
	    WebElement role=driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
	    role.click();
        role.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
        WebElement role1=driver.findElement(By.cssSelector("input[placeholder='Type for hints...']"));
        role1.sendKeys("Peter Mac Anderson");
        Thread.sleep(3000);
        role1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	    WebElement role2=driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
	    role2.click();
        role2.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ENTER);
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	    String result=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText();
        
	    System.out.println(result);
        
	    if(result.contains("No Records Found")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
	
		driver.quit();	
}
}



