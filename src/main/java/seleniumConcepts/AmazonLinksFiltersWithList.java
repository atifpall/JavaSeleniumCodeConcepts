package seleniumConcepts;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinksFiltersWithList {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		By links = By.tagName("a");
	
		
//		List<WebElement> links_list = driver.findElements(By.tagName("a")); 
//		
//		List<String> amazon_link_filter = 
//				
//				links_list.stream()
//				.filter(ele -> !ele.getText().isEmpty())
//				.filter(ele -> ele.getText().contains("Flipkart"))
//				.map(ele -> ele.getText().trim())
//				.collect(Collectors.toList());
//		
//		amazon_link_filter.stream().forEach(ele -> System.out.println(ele));
//		
//		driver.quit();
		
		
		List<String> final_filtered_list = getFilteredList(links, "Amazon");
		for(String e: final_filtered_list) {
			System.out.println(e);
		}
		
		
		
	}
	
	public static List<String> getFilteredList(By locator, String value) {
		
		List<WebElement> links_list = driver.findElements(locator); 
		
		List<String> filtered_list = 
				
				links_list.stream()
				.filter(ele -> !ele.getText().isEmpty())
				.filter(ele -> ele.getText().contains(value))
				.map(ele -> ele.getText().trim())
				.collect(Collectors.toList());
		
		return filtered_list;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
