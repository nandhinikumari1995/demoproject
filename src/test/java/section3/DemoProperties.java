package section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoProperties {
	

	public static void main(String[] args) throws IOException {
		//step:1
		FileInputStream fis = new FileInputStream("C:\\Users\\vinot\\eclipse-workspace\\AutomationStudy\\src\\test\\resources\\Data Storage\\  data.properties");
		//step:2
		Properties pobj = new Properties();
		pobj.load(fis);
		//step:3
		String browser = pobj.getProperty("Browser");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		String url = pobj.getProperty("url");
		
		System.out.println(browser + "\n" + username + "\n" + password +"\n" + url );
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("edge")) {
	       driver = new EdgeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		//driver.quit();

			
			
		}
}
