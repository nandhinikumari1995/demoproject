package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay {
  
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();

	ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.ebay.com");
	//driver.findElement(By.cssSelector("input[class=\"gh-tb ui-autocomplete-input\"']")).sendKeys("menswatchs");

	driver.findElement(By.cssSelector("input[class='gh-tb ui-autocomplete-input']")).sendKeys("menswatchs");
	driver.findElement(By.cssSelector("input[id='gh-btn']")).click();
	String searchMsg = driver.findElement(By.cssSelector("h1[class='srp-controls_count-heading']")).getText();
    System.out.println(searchMsg);
	//Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println("title is"+title);
	
	if(title.contentEquals("menswatchs for sale ebay")) {
		System.out.println("user login successfully into shopingEbay");
	}else {
		System.out.println("user login failed");
	}
	
	driver.quit();
	
	
	}
	
	

}
