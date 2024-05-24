package section1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebayshop {
	
 public static void main(String[] args) throws InterruptedException {
	  
	 WebDriverManager.chromedriver().setup();
		
	    ChromeDriver driver = new ChromeDriver();
	
	    driver.get("https://www.ebay.com");
	    
	    
	    driver.findElement(By.xpath("//button['gh-sch-prom']")).click();
	    driver.findElement(By.xpath("//a[text()='Cell phones & accessories']")).click();
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

       Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--from']")).sendKeys("30");
       //Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--to']")).sendKeys("50");

        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='x-overlay-aspect__label'])[25]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='radio field__control rbx x-refine__single-select-radio'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='x-overlay-footer__apply']")).click();
        Thread.sleep(3000);
	    String result=driver.findElement(By.xpath("//span[@class='b-pageheader__text']")).getText();
       // Thread.sleep(3000);
        System.out.println(result);
       
        
        if(result.contains(" Cell Phones & Smartphones " )) 
        		{
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}
	
		driver.quit();	
	    
 }
}