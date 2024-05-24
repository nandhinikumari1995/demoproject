package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootHandling {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://shop.polymer-project.org/");
			WebElement shopApp=driver.findElement(By.xpath("//shop-app"));
			SearchContext shopAppSR=shopApp.getShadowRoot();
			shopAppSR.findElement(By.cssSelector("a[href='/list/mens_tshirts']")).click(); 
			//shopAppSR.findElement(By.cssSelector("iron-selected shop-tabs-overlay-static-above")).click();
	}

}
