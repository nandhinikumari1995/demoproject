package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	
	 public static void main(String[] args)throws InterruptedException{
		 
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("virat");
			driver.findElement(By.xpath("//input[contain(@name,'btnK')][1]")).click();
			String result=driver.findElement(By.xpath("//div[@id='result-stats']")).getText();

			System.out.println(result);			 
            Thread.sleep(3000);
			
		/*	if(result.contains("virat for search google")) {
				System.out.println("result");
			}
			else {
				System.out.println("test failed");
			}
			
			driver.quit();*/
			
			
	 }				
}
			
			


	


