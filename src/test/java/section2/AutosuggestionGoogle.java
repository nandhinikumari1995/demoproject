package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionGoogle {
	
		public static void main(String[] args) throws InterruptedException {
	
		 WebDriverManager.chromedriver().setup();
			
		    WebDriver driver = new ChromeDriver();
		
		    driver.get("https://www.amazon.com/");
		    
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia");
		    Thread.sleep(1000);
		    
		    List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div/div/div[1]/div"));
		    
		    boolean flag = false;
		    for(WebElement ele : list) {
		    	
		    	String text = ele.getText();
		    	if(text.contains("nokia phone")) {
		    	    flag = true;
		    	    ele.click();
		    	    break;
		    	}
		    }
		    Thread.sleep(3000);

		    if(flag) {
		    	System.out.println("suggestion present in list");
		    }else {
		    	System.out.println("suggestion not present in list");
		    }
		    driver.quit();		    
		    
	}
}

