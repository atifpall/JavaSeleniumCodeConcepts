package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsGenericMethod {
	static WebDriver driver;
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		
		By links = By.tagName("a");
		By images= By.tagName("img");
		
		
		
		int totalLinks =getElements(links).size();
		int totalImages=getElements(images).size();
		
		System.out.println(totalLinks);
		System.out.println(totalImages);
		
		driver.close();
		
		
	}

}
