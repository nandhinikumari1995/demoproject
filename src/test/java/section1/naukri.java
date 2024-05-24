package section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukri {
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");
		driver.findElement(By.cssSelector("span[title='Fresher']")).click();
		String mainID=driver.getWindowHandle();
		Set<String>allId=driver.getWindowHandles();
		
		for(String id : allId) {
			if(!mainID.equals(id)) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.cssSelector("span[title='Sales Jobs']")).click();
		
		driver.switchTo().window(mainID);
		String searchmsg= driver.findElement(By.xpath("//div[@class='h1-wrapper']")).getText();
		System.out.println(searchmsg);
		driver.quit();

}
}