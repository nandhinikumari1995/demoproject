package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amz {
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
		    ChromeDriver driver = new ChromeDriver();
		
		    driver.get("https://www.amazon.in/");
		    
		    driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")).click();
		    driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")).click();
		    driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		    //Thread.sleep(3000);
		    driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']")).click();
		    //Thread.sleep(3000);
		    driver.findElement(By.xpath("(//div[@class='b-carousel__seeall'])[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("(//span[@class='x-overlay-aspect__label'])[7]")).click();
		    Thread.sleep(3000);
	        driver.findElement(By.xpath("(//span[@class='cbx x-refine__multi-select-cbx'])[1]")).click();

	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//span[@class='x-overlay-aspect__label'])[23]")).click();

		
	}

}
