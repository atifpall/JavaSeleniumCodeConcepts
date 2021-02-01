package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> links_list = driver.findElements(By.tagName("a")); 
		System.out.println(links_list.size());
		
		long start_time = System.currentTimeMillis();
		
		//1. sequential stream : //12204 ms 
		//links_list.stream().forEach(ele -> System.out.println(ele.getText())); 
		
		//2. parallel stream : //11147 ms 
		links_list.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("total time taken: " + (end_time - start_time));
		
		driver.quit();
		
		
		
		
		
		
	}

}
