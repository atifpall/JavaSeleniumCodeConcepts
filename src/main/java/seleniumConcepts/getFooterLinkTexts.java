package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getFooterLinkTexts {
	
	static WebDriver driver;
	
	public static List<String> getFooterTexts(By locator) {
		
		List<String> linkText = new ArrayList<>();
		
		List<WebElement> footer_links = driver.findElements(locator);
		System.out.println(footer_links.size());
		
		for(WebElement e: footer_links) {
			String text = e.getText();
			System.out.println(text);
			linkText.add(text);
		}
		return linkText;
		
	}
	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//By left_footer_links = By.xpath("//div[@class='EvHmz f6F9Be hRvfYe']//span[@id='fsl']/a");
		By left_footer_links = By.xpath("//div[@id='fbar']//span/a[@class='Fx4vi']");
		
		
		//calling using function
		List<String> getLinkText = getFooterTexts(left_footer_links);
		System.out.println(getLinkText);
		
	}

}
