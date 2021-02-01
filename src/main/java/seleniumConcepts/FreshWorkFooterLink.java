package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorkFooterLink {

	static WebDriver driver;
	
	public static List<String> getFreshWorkFooterLinkstext(By locator) {
		
		List<String> footlinkstexts = new ArrayList<>();
		
		List<WebElement> fresh_footer_link = driver.findElements(locator);
		System.out.println(fresh_footer_link.size());
		
		for(WebElement e: fresh_footer_link) {
			String text = e.getText();
			System.out.println(text);
			
			footlinkstexts.add(text);
		}
		
		return footlinkstexts; 
	}
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footer_link = By.xpath("//div[@class='footer-main']/div/div//li");
		
		//List
		
		List<String> foots_links  =getFreshWorkFooterLinkstext(footer_link);
		System.out.println(foots_links);
		
	}

}
