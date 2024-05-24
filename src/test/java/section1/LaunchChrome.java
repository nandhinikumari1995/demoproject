package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[]args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.do");
		driver.manage().window().maximize();
		
		By usernameLocation = By.id("email");
		WebElement usernameElement = driver.findElement(usernameLocation);
		usernameElement .sendKeys("smartnandhinim@gmail.com");
		
		By passwordLocation = By.name("pass");
		WebElement passwordElement = driver.findElement(passwordLocation);
	    passwordElement .sendKeys("janarthdev");
		
		By loginBtnLocation = By.id("loginbutton");
		WebElement loginBtnElement = driver.findElement(loginBtnLocation);
		
		loginBtnElement.click();
		
		Thread.sleep(10000);
		
		String title = driver.getTitle();
		System.out.println("title is :" + title);
		
		if(title.equals("Facebook")) {
			System.out.println("User Login succefully into facebook");
		}
		else {
			System.out.println("User Login failed");
		}
		driver.quit();	}
}
