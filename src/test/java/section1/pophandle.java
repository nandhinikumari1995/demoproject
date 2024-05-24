package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pophandle {
	public static void main(String[] args) {
		    
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	    driver.findElement(By.id("datepicker")).click();
	    String year="2022";
	    String month="October";
	    String day="30";
	    
	    while(true) {
	    	String calyear=driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
	    	if(!calyear.equals(year)) {
	    		driver.findElement(By.xpath("//span[text()='Prev']")).click();
	    	}else {
	    		break;
	    	}
	   	
	    }
	    while(true) {
	    	String calMonth=driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
	    	if(!calMonth.equals(month)) {
	    		driver.findElement(By.xpath("//span[text()='Prev']")).click();
	    	}else {
	    		break;
	    	}
	}
	    String dayXpath="//a[@data-date='"+day+"']";
	    driver.findElement(By.xpath(dayXpath)).click();
	   
	   	}
}