package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.foundit.in/");
		driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\vinot\\Downloads\\CV_2022120819063899%20(1).pdf");

	}

}
