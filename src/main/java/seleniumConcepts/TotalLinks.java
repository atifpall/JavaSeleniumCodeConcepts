package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> linkLists = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links present: "+linkLists.size());
		
		for(int i=0; i<linkLists.size(); i++) {
			String linkText = linkLists.get(i).getText();
			
			if(!linkText.isEmpty()){
				System.out.println(i + ":-->" + linkText);
				String hrefVal = linkLists.get(i).getAttribute("href");
				System.out.println(hrefVal);
			
				}
			}
		
		driver.close();
	}

}
