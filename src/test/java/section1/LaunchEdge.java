package section1;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdge {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		 
		driver.get("https://www.amazon.com/");
	}

}
